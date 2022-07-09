package com.kyoogles.app.shcd.coco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kyoogles.app.shcd.coco.domain.CostcoBringVO;
import com.kyoogles.app.shcd.coco.mapper.StoreProdMapper;
import com.kyoogles.app.shcd.coco.service.StoreProdService;
import com.kyoogles.app.shcd.common.domain.PageVO;

@Service
public class StoreProdServiceImpl implements StoreProdService{

	@Autowired
	  private StoreProdMapper spMapper;

	@Override
	public List<CostcoBringVO> selectProdList(PageVO pageVO, CostcoBringVO cbVO) {
		return spMapper.selectProdList(pageVO, cbVO);
	}

	@Override
	public int selectProdListTotalCount(CostcoBringVO cbVO) {
		return spMapper.selectProdListTotalCount(cbVO);
	}


}
