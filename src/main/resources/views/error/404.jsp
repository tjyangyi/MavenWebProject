<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>404 Not Found</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="description" content="404 Not Found">
</head>
<body>
	<div>
		<div>
			<div>
				<div>404 Not Found</div>
				<div>您请求的页面未找到，请检查地址是否正确！</div>
			</div>
			<div>
				<a href="javascript:history.back()">◂返回上一页</a> <a href="login.do"
					style="margin-left: 20px;">◂返回登录页面</a>
			</div>
		</div>
	</div>
</body>
</html>
