<%@tag import="com.tpddl.bts.utils.CommonConstants"%>
<%@tag import="java.util.ResourceBundle"%>
<%@tag import="java.text.NumberFormat,java.util.Locale"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="val" required="true" type="java.lang.Double"%>
<%
ResourceBundle rb = ResourceBundle.getBundle(CommonConstants.CONFIG_NAME);
Locale locale = new Locale(rb.getString("defaultlang")
		,rb.getString("defaultcountry"));
NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
String formattedCurrency = nf.format(val);
%>
<%=formattedCurrency%>