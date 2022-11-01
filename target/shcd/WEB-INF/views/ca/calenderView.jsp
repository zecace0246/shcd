<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Travel Mileage Project</title>
<link rel="stylesheet" href="/shcd/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="/shcd/resources/css/calendar.css">
<script src='/shcd/resources/js/jquery-3.6.0.min.js' type="text/javascript"></script>

</head>

<body>
    <div class="calendar">
        <form id="mlgForm" name="mlgForm">
         <div class="row">
		    <div class="col-5">
		      <span>총Mileage:</span>
              <span id="curMileage">${totMlgPnt}</span>
		    </div>
		    <div class="col-4">
		      <input type="text" id="inputPoint" class="w-100" placeholder="추가Mileage">
		    </div>
		    <!-- <div class="col-1"></div> -->
		    <div class="col-3">
		      <button type="button" class="btn btn-primary btn-sm mb-1" id="pointPlus">+</button>
              <button type="button" class="btn btn-danger btn-sm mb-1" id="pointMinus">-</button>
		    </div>
		  </div>

        <div class="header">
            <div class="year-month"></div>
            <div class="nav">
                <button class="nav-btn go-prev">&lt;</button>
                <button class="nav-btn go-today">Today</button>
                <button class="nav-btn go-next">&gt;</button>
            </div>
        </div>
        <div class="main">
            <div class="days">
                <div class="day">일</div>
                <div class="day">월</div>
                <div class="day">화</div>
                <div class="day">수</div>
                <div class="day">목</div>
                <div class="day">금</div>
                <div class="day">토</div>
            </div>
            <div class="dates"></div>
        </div>
        </form>
    </div>
    <script src="/shcd/resources/js/calendar.js"></script>

</body>
<script src="/shcd/resources/js/common.js"></script>
<script src="/shcd/resources/js/sweetalert.min.js"></script>
<script>
$(document).ready(function() {
	var csrfTokenValue = '${_csrf.token}';

	var yyyyStr = date.getFullYear();
	var mmStr = date.getMonth() +1;
	var ddStr = date.getDate();

	//이전달
	$('.go-prev').on('click', function(e) {
        e.preventDefault();

        date.setMonth(date.getMonth() - 1);
        renderCalender();
    });

	//다음 달
	$('.go-next').on('click', function(e) {
        e.preventDefault();

        date.setMonth(date.getMonth() + 1);
        renderCalender();
    });

	// 성공 했을때 마일리지 +10
	$('.btn').on('click', function(e) {
        e.preventDefault();

        var bIdValStr = $(this).attr('id');

        if( bIdValStr != 'pointPlus' && bIdValStr != 'pointMinus' ){

	        var formData = {
	        		pntTitle: "TravelMileage",
	        		pntNo: "10" ,
	        		rstDt : bIdValStr.substring(4,12) //cal_20211115
	              };

	            console.log("저장 할 Data :: "+ JSON.stringify(formData) );

	            gfn_callServer('POST', '/shcd/ca/calenderDataInsert', true, formData, 'application/x-www-form-urlencoded; charset=UTF-8', 'text', callServerRegisterResult, 30000, csrfTokenValue);
        }

    });


	$('#pointPlus').on('click', function(e) {
        e.preventDefault();

        pointAdjustFn( 'plus' , $('#inputPoint').val() );

	});

	$('#pointMinus').on('click', function(e) {
        e.preventDefault();

        pointAdjustFn( 'minus' , $('#inputPoint').val() );

    });

});

//저장 페이지 이동
function callServerRegisterResult(data) {
  console.log(" 등록 완료 data value ::>> "+ JSON.stringify(data));

  if (data == 'success') {
    swal({
         title: 'SUCCESS',
         text: 'Mileage 등록 완료',
         icon: 'success',
         buttons: 'OK'
    }).then(function () {
    	location.href = '/shcd/ca/calenderView';
    	/*setTimeout(function(){
			location.reload();
		},3000);*/ // 1000밀리초 = 1초
    });
  }
}

function pointAdjustFn(tp, val){
	if(tp == 'minus'){
		val = -val;
	}

	console.log( " 22222  "+ tp + " :: " + val );

	$.ajax({
        type : "POST",
        url : "/shcd/ca/adjPointInsert",
        async : false,
        data : { pntTitle: "TravelMileage",
        	     pntNo : val
        	   },
        dataType : "json",
        success : function(xhr){
                    console.log(" 추가 포인트 등록 결과 값 ::>> "+ JSON.stringify(xhr));

                    location.href = '/shcd/ca/calenderView';
            }/*,
        error: function(xhr){
        	console.log("추가포인트등록Error :: "+JSON.stringify(xhr));
            return;
            }*/
        });

	location.href = '/shcd/ca/calenderView';

}

</script>

</html>