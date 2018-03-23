<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/WEB-INF/tlds/csajsp-taglib-adv.tld" prefix="myTag" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<LINK REL=STYLESHEET HREF="./css/JSP-Styles.css" TYPE="text/css">
</head>
<body>
	<CENTER>
		<myTag:makeTableV2 rowItems="${customerList}" headerClass="COLORED" />
	</CENTER>
</body>
</html>