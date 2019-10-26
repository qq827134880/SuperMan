package com.neu.controller;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neu.entity.RespBean;
import com.neu.entity.User;
import com.neu.service.UserService;
import com.neu.util.Md5Utils;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userSerivce;
	
	@RequestMapping("check")
	public List<User> getCheck(@RequestBody Map<String, Object>params){
		return userSerivce.getByDL(params);
	}
	
	@RequestMapping("updatePassword")
	public int updatePassword(HttpSession session,String password,String newPassword) {
		User user = (User)session.getAttribute("user");
		
		password = Md5Utils.md5(password);
		
		if(!user.getPassword().equals(password)) {
			return -1;
		}
		int n =  userSerivce.updatePasswird(user.getId(), Md5Utils.md5(newPassword));
		
		if(n ==1) {
			user.setPassword(Md5Utils.md5(newPassword));
		}
		 return n;
	}
	
	@RequestMapping("invalidate")
	public int invalidate(HttpSession session) {
		session.invalidate();
		return 1;
	}
	
	@RequestMapping("login")
	public RespBean login(String username,String password,String code,HttpSession session) {
		String sessionCode =  (String)session.getAttribute("code");
		if(!sessionCode.equalsIgnoreCase(code)) {
			RespBean respBean = new RespBean("error", "验证码错误！");
			return respBean;
		}
		
		password = Md5Utils.md5(password);
		User user = userSerivce.login(username, password);
		
		if(user == null) {
			RespBean respBean = new RespBean("error", "用户名或密码错误！");
			return respBean;
		}
		session.setAttribute("user", user);
		return new RespBean("success", "登录成功！",user);
	}
	
	@RequestMapping("code")
	public void getCode(HttpServletResponse response,HttpSession session) throws IOException {
		//创建图片，设置图片大小和类型
		BufferedImage buffImg = new BufferedImage(50, 30, BufferedImage.TYPE_INT_RGB);
		//得到画布
		Graphics g = buffImg.getGraphics();
		//创建字体
		Font font = new Font("宋体", Font.BOLD, 16);
		//为画布设置字体
		g.setFont(font);
		
		String code = "";
		Random r = new Random();
		for(int i = 1;i <= 4;i++) {
			code += r.nextInt(10);
		}	
		session.setAttribute("code", code);
		System.out.println(session.getAttribute("code"));
		//向画布从写入字符串
		g.drawString(code,10,25);
		//设置响应类型为：图片
		response.setContentType("image/jpeg");
		
		ServletOutputStream stream = response.getOutputStream();
		//使用ImageIO工具类，把图片按照指定的格式写入到响应流中
		ImageIO.write(buffImg, "jpeg", stream);
		//关闭响应流
		stream.close();
	}
	
}
