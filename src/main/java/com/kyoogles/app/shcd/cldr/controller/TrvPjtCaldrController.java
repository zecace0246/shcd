package com.kyoogles.app.shcd.cldr.controller;

import com.kyoogles.app.shcd.cldr.domain.PntDateVO;
import com.kyoogles.app.shcd.cldr.domain.RstPntVO;
import com.kyoogles.app.shcd.cldr.service.TrvPjtCaldrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ca")
public class TrvPjtCaldrController {
  @Autowired
  private TrvPjtCaldrService tpcService;

  @RequestMapping(value = "/calenderView", method = RequestMethod.GET)
  public String calenderView(Model model) {
    System.out.println("페이지 들어 옴.");
    int totMlgPnt = this.tpcService.getTotMlgPnt();
    model.addAttribute("totMlgPnt", Integer.valueOf(totMlgPnt));
    return "/ca/calenderView";
  }

  @RequestMapping(value = "/calenderDataInsert", method = RequestMethod.POST)
  @ResponseBody
  public ResponseEntity<String> calenderDataInsert(PntDateVO pdvo, RstPntVO rpvo) {
    boolean result = this.tpcService.insertPntData(pdvo);
    if (result) {
      boolean bool = this.tpcService.insertPntAcru(pdvo);
    }
    return result ? new ResponseEntity("success", HttpStatus.OK) : new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @RequestMapping(value = "/adjPointInsert", method = RequestMethod.POST)
  @ResponseBody
  public ResponseEntity<String> adjPointInsert(PntDateVO pdvo, RstPntVO rpvo) {
    boolean result = this.tpcService.insertPntAcru(pdvo);
    return result ? new ResponseEntity("success", HttpStatus.OK) : new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
  }

}