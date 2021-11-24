package com.kyoogles.app.shcd.common.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageDTO {

  private int startPage;
  private int endPage;
  private boolean prev, next;

  private int total;
  private PageVO pageVO;

  public PageDTO(PageVO pageVO, int total) {

    this.pageVO = pageVO;
    this.total = total;

    this.endPage = (int) (Math.ceil(pageVO.getPageNum() / 10.0)) * 10;

    this.startPage = this.endPage - 9;

    int realEnd = (int) (Math.ceil((total * 1.0) / pageVO.getAmount()));

    if (realEnd < this.endPage) {
      this.endPage = realEnd;
    }

    this.prev = this.startPage > 1;

    this.next = this.endPage < realEnd;
  }

public int getStartPage() {
	return startPage;
}

public void setStartPage(int startPage) {
	this.startPage = startPage;
}

public int getEndPage() {
	return endPage;
}

public void setEndPage(int endPage) {
	this.endPage = endPage;
}

public boolean isPrev() {
	return prev;
}

public void setPrev(boolean prev) {
	this.prev = prev;
}

public boolean isNext() {
	return next;
}

public void setNext(boolean next) {
	this.next = next;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}

public PageVO getPageVO() {
	return pageVO;
}

public void setPageVO(PageVO pageVO) {
	this.pageVO = pageVO;
}



}

