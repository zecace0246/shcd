package com.kyoogles.app.shcd.cldr.service;

import com.kyoogles.app.shcd.cldr.domain.PntDateVO;

public interface TrvPjtCaldrService {
  int getTotMlgPnt();

  boolean insertPntData(PntDateVO paramPntDateVO);

  boolean insertPntAcru(PntDateVO paramPntDateVO);
}
