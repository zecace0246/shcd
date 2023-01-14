<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>코코마트 상품리스트</title>
<link rel="stylesheet" href="/shcd/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="/shcd/resources/css/calendar.css">
<link rel="stylesheet" href="/shcd/resources/css/jquery.modal.min.0.9.2.css">
<script src='/shcd/resources/js/jquery-3.6.0.min.js' type="text/javascript"></script>
<script src='/shcd/resources/js/jquery-modal.0.9.2.js' type="text/javascript"></script>

<script>

function doPopup(prodcd, sprice){

	var pUrl = "./popup01";
	var param = "?prodCode="+prodcd+"&storePrice="+sprice;
	var _width = '400';
    var _height = '200';

	//var popup = window.open(pUrl+param, '스토어가격수정', 'top=10px,left=200px,width=400px,height=200px');

    // 팝업을 가운데 위치시키기 위해 아래와 같이 값 구하기
    var _left = Math.ceil(( window.screen.width - _width )/2);
    var _top = Math.ceil(( window.screen.height - _height )/2);

    window.open(pUrl+param, '스토어가격수정', 'width='+ _width +', height='+ _height +', left=' + _left + ', top='+ _top );

}


</script>


</head>
<body>

<div class="col-12">
<!-- [ Search Bar ] start -->
  <div class="card">
      <div class="card-block">
          <div class="seacrh-header">
            <form id="searchForm">

            </form>
          </div>
      </div>
  </div>
<!-- [ Search Bar ] end -->

<!-- [ Main Content ] start -->
  <div class="row">
    <div class="col-sm-12">
      <div class="card">
        <div class="card-header">
          <h5>[ 상품목록 ] 최종 수정일 : <c:out value="${prodUpDT}" /></h5>
        </div>

        <div class="card-body">
          <div class="row float-right">
            <div class="col-sm-12 input-group mb-3 w-25">
              <!-- <button type="button" id="regBtn" class="btn waves-effect waves-light btn-secondary btn-icon btn-msg-send"> 등록</button> -->
            </div>
          </div>

          <div class="dt-responsive table-responsive">
            <table id="simpletable" class="table table-striped table-bordered nowrap">
              <thead>
                <tr>
                  <th class="text-center">No.</th>
                  <th class="text-center">상품이미지</th>
                  <th class="text-center">상품코드</th>
                  <th class="text-center">상품명</th>
                  <th class="text-center">판매여부</th>
                  <th class="text-center">최초가격</th>
                  <th class="text-center">현재가격</th>
                  <th class="text-center">가격변동</th>
                  <th class="text-center">스토어판매가격</th>
                </tr>
              </thead>
              <tbody>
                <c:choose>
                  <c:when test="${prodList ne null && fn:length(prodList) > 0}">

                    <c:set var="listStartNum" value="${pageMaker.total - (pageMaker.pageVO.amount * (pageMaker.pageVO.pageNum - 1)) +1 }" />

                    <c:forEach items="${prodList}" var="prod" varStatus="prodStatus">
                      <tr>
                        <td class="text-center"><c:out value="${listStartNum - prodStatus.count}" /></td>
                        <td class="text-center"><img src='https://www.costco.co.kr/<c:out value="${prod.prodImg01}" />'></td>
                        <td class="text-center"><c:out value="${prod.prodCode}" /></td>
                        <td class="text-center"><c:out value="${prod.prodNameKr}" /></td>
                        <td class="text-center"><c:out value="${prod.sellYn}" /></td>
                        <td class="text-center"><c:out value="${prod.prodFirstPrice}" /></td>
                        <td class="text-center"><c:out value="${prod.prodPrice}" /></td>
                        <td class="text-center"><c:out value="${prod.priceChangeYn}" /></td>
                        <td class="text-center"><fmt:formatNumber value="${prod.storePrice}" type="currency" /> <br>
                            <!-- <a id="popup01" href="#" onclick="doPopup('<c:out value="${prod.prodCode}" />', '<c:out value="${prod.storePrice}" />');"><c:out value="${prod.storePrice}" />스토어가격수정</a> -->
                            <button type="button" class="btn btn-primary" id="popup01" onclick="doPopup('<c:out value="${prod.prodCode}" />', '<c:out value="${prod.storePrice}" />');">스토어가격수정</button>
                        </td>
                      </tr>
                    </c:forEach>

                  </c:when>
                  <c:otherwise>
                    <tr>
                      <td class="text-center" colspan="8">게시물이 없습니다</td>
                    </tr>
                  </c:otherwise>
                </c:choose>

              </tbody>
            </table>
          </div>

          <!--
          <div class="row float-right">
            <div class="col-sm-12">
              <div class="dataTables_paginate paging_simple_numbers" id="dom-jqry_paginate">
                <ul class="pagination">
                  <c:if test="${pageMaker.prev}">
                    <li class="paginate_button page-item previous disabled" id="dom-jqry_previous">
                      <a href="${pageMaker.startPage -1}" aria-controls="dom-jqry" data-dt-idx="0" tabindex="0" class="page-link">Previous</a>
                    </li>
                  </c:if>
                  <c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
                    <li class="paginate_button page-item ${pageMaker.pageVO.pageNum == num ? 'active' : ''} ">
                      <a href="${num}" aria-controls="dom-jqry" data-dt-idx="1" tabindex="0" class="page-link">${num}</a>
                    </li>
                  </c:forEach>
                  <c:if test="${pageMaker.next}">
                    <li class="paginate_button page-item next" id="dom-jqry_next">
                      <a href="#" aria-controls="dom-jqry" data-dt-idx="3" tabindex="0" class="page-link">Next</a>
                    </li>
                  </c:if>
                </ul>
              </div>
            </div>
          </div>
           -->

        </div>
      </div>
    </div>
  </div>
  <!-- [ Main Content ] end -->
</div>


</body>
<script src="/shcd/resources/js/common.js"></script>
<script src="/shcd/resources/js/sweetalert.min.js"></script>
<script>

</script>

</html>