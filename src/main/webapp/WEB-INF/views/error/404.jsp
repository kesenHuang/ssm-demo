<%@page import="org.springframework.http.MediaType"%>
<%@page import="com.venustech.ca.framework.common.mapper.JsonMapper"%>
<%@page import="com.venustech.ca.framework.common.model.ErrorTip"%>
<%@page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%
response.setStatus(404);
response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
ErrorTip tip = new ErrorTip(404,"not found uri!");
out.print(JsonMapper.toJsonString(tip));
%>

