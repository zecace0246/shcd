<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>최초가격수정</title>
<link rel="stylesheet" href="/shcd/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="/shcd/resources/css/calendar.css">

<style>
    body {
      min-height: 100vh;
      background: -webkit-gradient(linear, left bottom, right top, from(#92b5db), to(#1d466c));
      background: -webkit-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
      background: -moz-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
      background: -o-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
      background: linear-gradient(to top right, #92b5db 0%, #1d466c 100%);
    }

    .input-form {
      background: #fff;
      -webkit-border-radius: 10px;
      -moz-border-radius: 10px;
      border-radius: 10px;
      -webkit-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
      -moz-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
      box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15)
    }
  </style>

<script src='/shcd/resources/js/jquery-3.6.0.min.js' type="text/javascript"></script>
<script>
function doSave(){

	var pUrl = "./saveProd";

	$.ajax({
		type : 'post',
        url: pUrl,
        data : {
        	  prodCode : $('#prodCode').val()
        	, prodFirstPrice : $('#firstPrice').val()
        },
        success:function(data){

        	alert(data);

        	self.close();

        },
        error : function() {

        }
    });

	opener.goList();

    console.log(" 팝업2 Close 전 ");

	self.close();

}


</script>


</head>
<body>
<div class="container">
    <div class="input-form-backgroud row">
      <div class="input-form col-md-12 mx-auto">

        <form class="validation-form" novalidate>
          <div class="row">
            <div class="col-md-4 mb-3">
              상품코드 : <c:out value="${prodCode}"/>
              <input type="hidden" id="prodCode" value="<c:out value="${prodCode}"/>">
            </div>
            <div class="col-md-4 mb-3">
              최초가격 : <input type="text" class="form-control input-sm" id="firstPrice" value="<c:out value="${firstPrice}"/>" required>
            </div>
          </div>

          <div class="mb-4"></div>
          <button id="save" class="btn btn-primary" onclick="doSave();">확인</button>
          <button id="close" class="btn btn-warning" onclick="self.close();" >닫기</button>
        </form>
      </div>
    </div>

</div>

</body>
</html>