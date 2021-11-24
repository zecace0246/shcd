package com.kyoogles.app.shcd.common.domain;

import java.util.Date;

import lombok.Data;

@Data
public class UserVO {

	private String userId;
	private String userName;

	private String matNo;
	private String matId;

	private String agencyName;
	private String groupName;
	private String respirationRate;
	private String heartRate;
	private String sleepMode;
	private String fallAlarm;
	private String snoreYn;
	private String apneaYn;
	private String positionYn;

	private String regDate;


	private String respirationRateMax;
	private String respirationRateMin;
	private String heartRateMax;
	private String heartRateMin;
	private String sleepModeMin;
	private String sleepModeMax;
	private String sleepGrade;

	private String positionTime;
	private String positionUpdate;
	private String positionCurrent;
	private String positionType;


	private String searchDateFrom;
	private String searchDateTo;
	private String agencyNo;
	private String groupSeq;
	private String searchUserName;
	private String searchUserId;
	private String searchType;

	private String sleepRem;
	private String sleepCnt1;
	private String sleepCnt2;
	private String sleepCnt3;
	private String sleepCnt4;
	private String snoreCnt;
	private String apneaCnt;
	private String totCnt;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMatNo() {
		return matNo;
	}
	public void setMatNo(String matNo) {
		this.matNo = matNo;
	}
	public String getMatId() {
		return matId;
	}
	public void setMatId(String matId) {
		this.matId = matId;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getRespirationRate() {
		return respirationRate;
	}
	public void setRespirationRate(String respirationRate) {
		this.respirationRate = respirationRate;
	}
	public String getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}
	public String getSleepMode() {
		return sleepMode;
	}
	public void setSleepMode(String sleepMode) {
		this.sleepMode = sleepMode;
	}
	public String getFallAlarm() {
		return fallAlarm;
	}
	public void setFallAlarm(String fallAlarm) {
		this.fallAlarm = fallAlarm;
	}
	public String getSnoreYn() {
		return snoreYn;
	}
	public void setSnoreYn(String snoreYn) {
		this.snoreYn = snoreYn;
	}
	public String getApneaYn() {
		return apneaYn;
	}
	public void setApneaYn(String apneaYn) {
		this.apneaYn = apneaYn;
	}
	public String getPositionYn() {
		return positionYn;
	}
	public void setPositionYn(String positionYn) {
		this.positionYn = positionYn;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getRespirationRateMax() {
		return respirationRateMax;
	}
	public void setRespirationRateMax(String respirationRateMax) {
		this.respirationRateMax = respirationRateMax;
	}
	public String getRespirationRateMin() {
		return respirationRateMin;
	}
	public void setRespirationRateMin(String respirationRateMin) {
		this.respirationRateMin = respirationRateMin;
	}
	public String getHeartRateMax() {
		return heartRateMax;
	}
	public void setHeartRateMax(String heartRateMax) {
		this.heartRateMax = heartRateMax;
	}
	public String getHeartRateMin() {
		return heartRateMin;
	}
	public void setHeartRateMin(String heartRateMin) {
		this.heartRateMin = heartRateMin;
	}
	public String getSleepModeMin() {
		return sleepModeMin;
	}
	public void setSleepModeMin(String sleepModeMin) {
		this.sleepModeMin = sleepModeMin;
	}
	public String getSleepModeMax() {
		return sleepModeMax;
	}
	public void setSleepModeMax(String sleepModeMax) {
		this.sleepModeMax = sleepModeMax;
	}
	public String getSleepGrade() {
		return sleepGrade;
	}
	public void setSleepGrade(String sleepGrade) {
		this.sleepGrade = sleepGrade;
	}
	public String getPositionTime() {
		return positionTime;
	}
	public void setPositionTime(String positionTime) {
		this.positionTime = positionTime;
	}
	public String getPositionUpdate() {
		return positionUpdate;
	}
	public void setPositionUpdate(String positionUpdate) {
		this.positionUpdate = positionUpdate;
	}
	public String getPositionCurrent() {
		return positionCurrent;
	}
	public void setPositionCurrent(String positionCurrent) {
		this.positionCurrent = positionCurrent;
	}
	public String getPositionType() {
		return positionType;
	}
	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}
	public String getSearchDateFrom() {
		return searchDateFrom;
	}
	public void setSearchDateFrom(String searchDateFrom) {
		this.searchDateFrom = searchDateFrom;
	}
	public String getSearchDateTo() {
		return searchDateTo;
	}
	public void setSearchDateTo(String searchDateTo) {
		this.searchDateTo = searchDateTo;
	}
	public String getAgencyNo() {
		return agencyNo;
	}
	public void setAgencyNo(String agencyNo) {
		this.agencyNo = agencyNo;
	}
	public String getGroupSeq() {
		return groupSeq;
	}
	public void setGroupSeq(String groupSeq) {
		this.groupSeq = groupSeq;
	}
	public String getSearchUserName() {
		return searchUserName;
	}
	public void setSearchUserName(String searchUserName) {
		this.searchUserName = searchUserName;
	}
	public String getSearchUserId() {
		return searchUserId;
	}
	public void setSearchUserId(String searchUserId) {
		this.searchUserId = searchUserId;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSleepRem() {
		return sleepRem;
	}
	public void setSleepRem(String sleepRem) {
		this.sleepRem = sleepRem;
	}
	public String getSleepCnt1() {
		return sleepCnt1;
	}
	public void setSleepCnt1(String sleepCnt1) {
		this.sleepCnt1 = sleepCnt1;
	}
	public String getSleepCnt2() {
		return sleepCnt2;
	}
	public void setSleepCnt2(String sleepCnt2) {
		this.sleepCnt2 = sleepCnt2;
	}
	public String getSleepCnt3() {
		return sleepCnt3;
	}
	public void setSleepCnt3(String sleepCnt3) {
		this.sleepCnt3 = sleepCnt3;
	}
	public String getSleepCnt4() {
		return sleepCnt4;
	}
	public void setSleepCnt4(String sleepCnt4) {
		this.sleepCnt4 = sleepCnt4;
	}
	public String getSnoreCnt() {
		return snoreCnt;
	}
	public void setSnoreCnt(String snoreCnt) {
		this.snoreCnt = snoreCnt;
	}
	public String getApneaCnt() {
		return apneaCnt;
	}
	public void setApneaCnt(String apneaCnt) {
		this.apneaCnt = apneaCnt;
	}
	public String getTotCnt() {
		return totCnt;
	}
	public void setTotCnt(String totCnt) {
		this.totCnt = totCnt;
	}


}
