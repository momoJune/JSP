<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	count = 0;
	window.onload = function(){
		// 1초 ~ 10초를 출력하고 10초후에는 종료했다고 출력하는 스크립트 완성하시오!!! 
		// 크롬으로 확인하세요!!!
		// setInterval(함수, 시간(1/1000초단위)) : 지정 시간마다 함수를 실행
		// clearInterval(타이머 변수); : setInterval을 해제한다.
		var timer = setInterval(function() {
			document.writeln(++count + "초!!!<br>");
		}, 1000);
		
		// setTimeout(함수, 시간(1/1000초단위)) : 지정 시간후 함수를 1번만 실행
		// clearTimeout(타이머 변수); : setTimeout을 해제한다.
		setTimeout(function() {
			clearInterval(timer); // setInterval()을 취소한다.
			document.writeln("프로그램 종료!!!<br>");
		}, 10500);
	}
</script>
<style type="text/css">

</style>
</head>
<body>

</body>
</html>