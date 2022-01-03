<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var max = 10, min = 2, count = 2;
	function addFile(){
		if(count==max){
			alert('최대 ' + max + "만 첨부 가능합니다.");
			return;
		}
		// 태그 추가
		++count;
	}
	function removeFile(){
		if(count==min){
			alert('최소 ' + min + "개는 첨부 해야합니다.");
			return;
		}
		// 태그 제거
		--count;
	}
</script>
<style type="text/css">

</style>
</head>
<body>
	<h2>첨부파일</h2>
	<button onclick="addFile()"> + </button>
	<button onclick="removeFile()"> - </button>
	<br /><hr />
	<div id="filebox">
		<div id="file1">
			파일 01 : <input type="file" name="file" />
		</div>
		<div id="file2">
			파일 02 : <input type="file" name="file" />
		</div>
	</div>
</body>
</html>