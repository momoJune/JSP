<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var timer1;
	var timer2;
	window.onload = function(){
		star1();
		star2();
	}
	// 별을 추가해주는 함수
	function star1(){
		var box = document.getElementById("box1");
		box.innerHTML = addStar(box.innerHTML);
		timer1 = setTimeout(star1, parseInt(Math.random()*1000));
		clearStar();
	}
	function star2(){
		var box = document.getElementById("box2");
		box.innerHTML = addStar(box.innerHTML);
		timer2 = setTimeout(star2, parseInt(Math.random()*1000));
		clearStar();
	}
	// 기존 내용에 별1개 추가해주는 함수
	function addStar(msg){
		msg+= "★";
		return msg;
	}
	// 두개의 내용물이 1개라도 80이 되면 종료해라!!!
	function clearStar(){
		var box1 = document.getElementById("box1");
		var box2 = document.getElementById("box2");
		if(box1.innerHTML.length>=40 || box2.innerHTML.length>=40){
			clearTimeout(timer1);
			clearTimeout(timer2);
			if(box1.innerHTML.length>=40){
				alert("1번마 승리!!!")
			}
			if(box2.innerHTML.length>=40){
				alert("2번마 승리!!!")
			}
		}
	}
</script>
<style type="text/css">
	#box1, #box2 { border-bottom: 1px solid gray;}
</style>
</head>
<body>
	<div id="box1">1번마 : </div>
	<div id="box2">2번마 : </div>
</body>
</html>