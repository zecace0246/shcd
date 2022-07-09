package com.kyoogles.app.shcd.coco.mapper;

import java.util.List;

import com.kyoogles.app.shcd.coco.domain.CostcoBringVO;
import com.kyoogles.app.shcd.common.domain.PageVO;

public interface StoreProdMapper {

	public List<CostcoBringVO> selectProdList(PageVO pageVO, CostcoBringVO cbVO);

	public int selectProdListTotalCount(CostcoBringVO cbVO);

}
