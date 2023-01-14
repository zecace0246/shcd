package com.kyoogles.app.shcd.coco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kyoogles.app.shcd.coco.domain.CostcoBringVO;
import com.kyoogles.app.shcd.coco.service.StoreProdService;
import com.kyoogles.app.shcd.common.domain.PageDTO;
import com.kyoogles.app.shcd.common.domain.PageVO;

@Controller
@RequestMapping("/co")
public class StoreProdController {
	@Autowired
	private StoreProdService spService;

	@RequestMapping(value = "/prodList", method = RequestMethod.GET)
	  public String selectProdList(PageVO pageVO, CostcoBringVO cbVO,Model model) {

		System.out.println(" 상품 목록 페이지 들어 옴.");
		int total = spService.selectProdListTotalCount(cbVO);

		List<CostcoBringVO> prodList = spService.selectProdList(pageVO, cbVO);

		model.addAttribute("prodList", prodList);
		model.addAttribute("pageMaker", new PageDTO(pageVO, total));

	    return "/coco/StoreProdList";
	}


	@RequestMapping(value = "/popup01", method = RequestMethod.GET)
	  public String getPopup01(PageVO pageVO, CostcoBringVO cbVO,Model model) {

		System.out.println(" pop prod code :::>> "+ cbVO.getProdCode() );
		System.out.println(" pop store Price:::>> "+ cbVO.getStorePrice() );

		model.addAttribute("prodCode", cbVO.getProdCode());
		model.addAttribute("storePrice", cbVO.getStorePrice());

	    return "/coco/popup01";
	}

}
