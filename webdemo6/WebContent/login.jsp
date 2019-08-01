<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<table>
			<tr>
				<td>手机号：</td>
				<td>
					<input type="text" name="ph"><span id="info"></span>
				</td>
			</tr>
			<tr>
				<td>
					<input type="button" id="btn" value="提交">
				</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			var a = /\d{11}/;
			
			var b = $("ph");
			if(a.test(b)){
			$.post("AjaxServlet","ph",function(data){
				var data1 = data;
				var $info = $("#info");
				$info.text(data1).css('color','green');
			});
			
			}else{
				alter("错误！")
			}
		});
		
		
	});

	</script>
</body>
</html>


















