<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="inha.성적입력" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
<%
    // 성적입력 클래스 객체 생성
    성적입력 sjSystem = new 성적입력();
    
    // 처리 결과 텍스트 출력
    out.println("학점 조회 결과: " + sjSystem.학점조회실행());
%>
</body>
</html>