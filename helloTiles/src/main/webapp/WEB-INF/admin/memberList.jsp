<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!-- ??jsp안에서 편하게 js사용하기? -->


	
	<table class = "table" border="1">
		<thead>
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>관리자여부</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="member">
			<tr>
				<td>${member.mid }</td>
				<td>${member.pass }</td>
				<td>${member.name }</td>
				<td>${member.phone }</td>
				<td>${member.respon }</td>
				
			</tr>		
			</c:forEach>


		</tbody>
	</table>
	
	
	<p><a href="main.do">메인으로 돌아가기</a></p>
</body>
</html>
<include page="../layout/footer.jsp"></include>