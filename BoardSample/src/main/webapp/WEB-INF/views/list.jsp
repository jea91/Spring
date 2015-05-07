<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8"%>
<html>
<head>
	<title>Board</title>
</head>
<body>
<h1>
	Hello Board!  
</h1>
 <br>
<table border="1"> <!-- 테이블 사이즈 -->
		<colgroup width="300">
			<col width="30" />
			<col width="100" />
			<col />
		</colgroup>
		<!-- for문 boardList 반복 -->
		<c:forEach var="row" items="${boardlist}">
			<tr>
				<td>${row.seq}</td>
				<td><a href="/view.do?seq=${row.seq}">${row.subject}</a></td> 
				<td>${row.content}</td>
			</tr>
		</c:forEach>
		
	</table>
	<br />
	<input name="write" type="button" value="새글쓰기" class="inputb" onclick="javascript:location.href='/writeForm.do';" />
	
</body>
</html>
