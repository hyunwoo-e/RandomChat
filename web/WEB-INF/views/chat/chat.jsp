<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>채팅</title>
</head>
<body>
<input type="text" id="message" placeholder="메시지 내용"/>
<input type="button" id="sendBtn" value="보내기" />
<input type="button" id="exitBtn" value="나가기"/>
<div id="chat"></div>
</body>
<script type="text/javascript" src="<c:url value='/js/lib/jquery-3.2.1.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/js/lib/sockjs.min.js'/>" ></script>
<script type="text/javascript" src="<c:url value='/js/chat.js'/>"></script>
</html>