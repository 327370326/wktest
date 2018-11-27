<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<%
    request.getRequestDispatcher("/listCategory").forward(request, response);
%>
