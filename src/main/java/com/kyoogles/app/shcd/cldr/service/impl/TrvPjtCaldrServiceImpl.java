package com.kyoogles.app.shcd.cldr.service.impl;

import com.kyoogles.app.shcd.cldr.domain.PntDateVO;
import com.kyoogles.app.shcd.cldr.mapper.TrvPjtCaldrMapper;
import com.kyoogles.app.shcd.cldr.service.TrvPjtCaldrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TrvPjtCaldrServiceImpl implements TrvPjtCaldrService {
  @Autowired
  private TrvPjtCaldrMapper mapper;

  public int getTotMlgPnt() {
    return this.mapper.getTotMlgPnt();
  }

  @Transactional
  public boolean insertPntData(PntDateVO pdvo) {
    pdvo.setRegUserId("1");
    pdvo.setUpdUserId("1");
    int result = this.mapper.insertPntData(pdvo);
    return (result > 0);
  }

  @Transactional
  public boolean insertPntAcru(PntDateVO pdvo) {
    int result = this.mapper.insertPntAcru(pdvo);
    return (result > 0);
  }
}
