<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript">
function check(){
	var str = document.getElementById('subject');
	var str2 = document.getElementById('content');

	if(str.value == '' || str.value == null){
	alert('제목을 입력하세요');
	return false;
	}
	if(str2.value == '' || str.value == null){
		alert('내용을 입력하세요');
	return false;
	} 
	return save();
};
function save(){
	var str3 = document.getElementById('writer');
	str3.submit(); 
}
</script>
	<title>write</title>
</head>
<body>
<form id="writer" action="/write.do" method="post">
		<table border="1">
			<tr>
				<td width='50px' align='center'>제목</td>
				<td width='450px'><input type='text' size='70' maxlength="40"
					id="subject" name='subject' /></td>
			</tr>
			<tr>
				<td colspan="2"><textarea cols='70' rows='20' id="content"
						name='content'></textarea></td>
			</tr>
		</table>
	</form>
	<input name="write" type="button" value="저장"
		onclick="javascript:check();" />
	<input name="list" type="button" value="목록보기" class="inputb"
		onclick="javascript:location.href='/list.do';" />
</body>
</html>
