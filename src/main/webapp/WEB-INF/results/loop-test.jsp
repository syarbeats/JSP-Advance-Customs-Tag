<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/WEB-INF/tlds/csajsp-taglib-adv.tld" prefix="myTag" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ForEach Custom Tag</title>
	<LINK REL=STYLESHEET HREF="./css/JSP-Styles.css" TYPE="text/css">
</head>
<body>
	<H2>Some Java-Based Servers</H2>
	<UL>
		<myTag:forEach items="${servers}" var="server">
			<LI>${server}
		</myTag:forEach>
	</UL>
	<br>
	<H2>Recent World Records</H2>
	<TABLE BORDER=1>
		<myTag:forEach items="${records}" var="row">
			<TR>
				<myTag:forEach items="${row}" var="col">
					<TD>${col}</TD>
				</myTag:forEach>
			</TR>
		</myTag:forEach>
	</TABLE>
</body>
</html>