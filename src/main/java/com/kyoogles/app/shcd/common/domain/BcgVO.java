package com.kyoogles.app.shcd.common.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BcgVO {


	private String bno;
	private String matId;
	private String respirationRate;
	private String heartRate;
	private String sleepMode;

	private String respirationRateMin;
	private String respirationRateMax;
	private String heartRateMin;
	private String heartRateMax;

	private String regDate;

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public String getMatId() {
		return matId;
	}

	public void setMatId(String matId) {
		this.matId = matId;
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

	public String getRespirationRateMin() {
		return respirationRateMin;
	}

	public void setRespirationRateMin(String respirationRateMin) {
		this.respirationRateMin = respirationRateMin;
	}

	public String getRespirationRateMax() {
		return respirationRateMax;
	}

	public void setRespirationRateMax(String respirationRateMax) {
		this.respirationRateMax = respirationRateMax;
	}

	public String getHeartRateMin() {
		return heartRateMin;
	}

	public void setHeartRateMin(String heartRateMin) {
		this.heartRateMin = heartRateMin;
	}

	public String getHeartRateMax() {
		return heartRateMax;
	}

	public void setHeartRateMax(String heartRateMax) {
		this.heartRateMax = heartRateMax;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}



}
