<%@page import="org.apache.commons.lang3.exception.ExceptionUtils"%>
<%@page import="org.springframework.http.MediaType"%>
<%@page import="com.venustech.ca.framework.common.mapper.JsonMapper"%>
<%@page import="com.venustech.ca.framework.common.model.ErrorTip"%>
<%@page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%
response.setStatus(500);
response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
ErrorTip tip = new ErrorTip(500,"Internal Server Error!");
Throwable rootThrowable = ExceptionUtils.getRootCause(exception);
tip.setDetail_(ExceptionUtils.getStackTrace(rootThrowable));
out.print(JsonMapper.toJsonString(tip));
%>

