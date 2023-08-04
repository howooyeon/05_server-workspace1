<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>스크립팅 원소</h1>
	
	<!-- html : 개발자 도구탭에 노출 -->
	<%-- jsp 주석 : 개발자 도구탭에 노출 안됨 --%>
	
	<%
		// 스크립틀릿 : 이 안에 일반적인 자바 코드 작성(변수 선언 및 초기화, 제어문)
		int sum = 0;
		for(int i = 1; i<=100; i++){
			sum += i;
		}
		
		System.out.println("덧셈끝! 결과 : " + sum);
	%>
	
	<p>
		화면으로 출력하고자 한다면 <br>
		스크립틀릿 이용해서 출력 가능
	</p>
	
</body>
</html>