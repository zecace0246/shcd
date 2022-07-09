package com.kyoogles.app.shcd.coco.service;

import java.util.List;

import com.kyoogles.app.shcd.coco.domain.CostcoBringVO;
import com.kyoogles.app.shcd.common.domain.PageVO;

public interface StoreProdService {

	List<CostcoBringVO> selectProdList(PageVO pageVO, CostcoBringVO cbVO);

	int selectProdListTotalCount(CostcoBringVO cbVO);

}
