<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/tlds/csajsp-taglib-adv.tld" prefix="myTag" %>
<%@ page isELIgnored="false" %>


<html>
<body>
	<H2>A Very Important List</H2>
	<ul>	
		<myTag:for count="<%=(int)(Math.random()*10)%>">
			<li> Holla Bondiaz
		</myTag:for>
	</ul>
	<br>
	<H2>Some Coin Flips</H2>
	<UL>
		<myTag:for count="<%=(int)(Math.random()*10)%>">
			<LI>${coin.flip}
		</myTag:for>
	</UL>
</body>
</html>
