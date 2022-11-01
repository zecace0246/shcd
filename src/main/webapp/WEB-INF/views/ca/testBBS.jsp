<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>

<link rel="stylesheet" href="/shcd/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="/shcd/resources/css/calendar.css">
<script src='/shcd/resources/js/jquery-3.6.0.min.js' type="text/javascript"></script>
<script>
function ss_load(){
	console.log(" 페이지 로드 ..... ");
	alert(" 페이지 로드 ..... ");
}

function getLoadPage(val){

	alert(" 안드로이드에서 받음 값 ::>> "+ val);

	console.log(" 안드로이드에서 받음 값 ::>> "+ val);

	var strHtml = "<tr><td>126</td><td>"+val+"</td><td>강감찬</td><td>2022.11.01</td></tr>";

	alert(strHtml);

	$("#sht").html(strHtml) ;


}


</script>


</head>



<body onload="ss_load();">


<table class="table">
  <thead>
    <tr>
      <th>번호</th>
      <th>제목</th>
      <th>작성자</th>
      <th>날짜</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>123</td>
      <td>Android 테스트 페이지</td>
      <td>이순신</td>
      <td>2022.11.01</td>
    </tr>
    <tr>
      <td>124</td>
      <td>제목이 테스트라네</td>
      <td>이순신</td>
      <td>2022.11.01</td>
    </tr>
    <tr>
      <td>125</td>
      <td>제목이 테스트라는군요</td>
      <td>이순신</td>
      <td>2022.11.01</td>
    </tr>
    <div id="sht"></div>
  </tbody>
</table>

</body>
</html>