<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var msg = "<ul>";
	for(key in location){
		msg += "<li>";
		msg += key + " : " + location[key];
		msg += "</li>";
	}
	msg += "<ul>";
	document.writeln(msg)
</script>
<style type="text/css">

</style>
</head>
<body>
	<button onclick="location.href='https://www.naver.com'" >네이버로 가기</button>
</body>
</html>