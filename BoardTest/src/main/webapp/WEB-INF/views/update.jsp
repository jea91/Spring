<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>어려운 게시판</title>
</head> 
<body>
	<form action="/update.do" method="post">
	<input type="hidden" name="seq" value="${board_data.seq}" />
		<table border="1">
			<tr>	
				<td width='50px' align='center'>글번호</td>
				<td width='50px'>${board_data.seq}</td>
			</tr>
			<tr>
				<td width='50px' align='center'>제목</td>
				<td width='450px'><input type ="text" name="subject" size='70' maxlength="40"
						value="${board_data.subject}" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<textarea name="content" cols='70' rows='20'>${board_data.content}</textarea>
				</td>
			</tr>
		</table>
		<input type="submit" value="저장" /> 
		<input name="list" type="button" value="목록보기" class="inputb"
			onclick="javascript:location.href='/list.do';" />
	</form>
</body>
</html> 
