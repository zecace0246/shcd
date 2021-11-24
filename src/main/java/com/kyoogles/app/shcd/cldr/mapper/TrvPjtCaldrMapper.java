package com.kyoogles.app.shcd.cldr.mapper;

import com.kyoogles.app.shcd.cldr.domain.PntDateVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TrvPjtCaldrMapper {
  int getTotMlgPnt();

  int insertPntData(PntDateVO paramPntDateVO);

  int insertPntAcru(PntDateVO paramPntDateVO);
}
