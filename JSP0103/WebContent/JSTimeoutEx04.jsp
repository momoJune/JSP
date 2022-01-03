<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn1").onclick = function(){
			var child = window.open('','','width=100,height=150');
			child.moveTo(0,0);
			
			setInterval(function() {
				child.moveBy(10,10);
			}, 500)
		}
		document.getElementById("btn2").onclick = function(){
			var child = window.open('','','width=100,height=150');
			child.moveTo(0,0);
			
			setInterval(function() {
				child.resizeBy(10,10);
			}, 500)
		}
		document.getElementById("btn3").onclick = function(){
			// 해상도 구하기
			var h = screen.height;
			var w = screen.width;
			//alert(w + " : " + h);
			// 화면의 중앙 좌표 구하기
			var top = parseInt((h-150)/2);
			var left = parseInt((w-100)/2);
			//alert(left + " : " + top);
			// 윈도우 띄우고
			var child = window.open('','','width=100,height=150');
			// 화면 중앙으로 이동 
			child.moveTo(left,top);
			// 0.005초 마다
			setInterval(function() {
				child.resizeBy(10,10); // 크기를 10씩 늘리고
				child.moveBy(-5,-5); // 위치를 좌측 상단으로 -5씩 이동
			}, 50)
		}
	}
</script>

</head>
<body>
	<button id="btn1">윈도우 이동</button> <br />
	<button id="btn2">윈도우 크기변경</button> <br />
	<button id="btn3">가운데서 윈도우 커지기</button> <br />
</body>
</html>