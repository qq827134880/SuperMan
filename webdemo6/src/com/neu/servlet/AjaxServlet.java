package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// 1. �����ַ���
		
		// 2. ��ȡ�û�����
		String ph = request.getParameter("ph");
		
		// 3. ����ҵ�����д���
		
		// ��Ӧǰ��˯һ��
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// 4. ��Ӧ��3�֣�ֱ����Ӧ������ת���������ض���
		// Java ����  ����ת��ΪJSON����    jsonlib jackson ......
		if("12345678911".equals(ph)) {
		response.getWriter().write("111");
		}else {
			response.getWriter().write("�û�������");
		}
	}

}