<%@tag import="java.util.Locale"%>
<%@tag import="java.text.DateFormat"%>
<%@tag import="java.util.Date"%>
<%@attribute name="lang" required="true" type="java.lang.String" %>
<%@attribute name="country" required="true" type="java.lang.String" %>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%
Date date = new Date();
Locale locale = new Locale(lang,country);
DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locale);
String formattedDate= df.format(date);
%>
<h2>Today is <%=formattedDate %></h2>