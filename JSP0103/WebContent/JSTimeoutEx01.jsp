<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	count = 0;
	window.onload = function(){
		alert('5초후에 창이 자동으로 닫힙니다.');
		
		setInterval(function() {
			document.writeln(++count + "초!!!<br>");
		}, 1000);
		
		setTimeout(function() {
			window.close();
		}, 5000);
	}
</script>
<style type="text/css">

</style>
</head>
<body>

</body>
</html>