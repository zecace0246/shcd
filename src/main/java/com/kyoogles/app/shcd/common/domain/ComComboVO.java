package com.kyoogles.app.shcd.common.domain;

import lombok.Data;

@Data
public class ComComboVO {

	//Sex Combo
	private String sexCd;
	private String sexName;

	//Mat Combo
	private String matNo;
	private String matId;

	//Agency Combo
	private String agencyNo;
    private String agencyName;

    //Agency Group Combo
    private String groupSeq;
    private String groupName;

    //sleep_time Combo
    private String sleepTime;
    private String sleepTimeVal;

    //position_time Combo
    private String positionTime;
    private String positionTimeVal;
	public String getSexCd() {
		return sexCd;
	}
	public void setSexCd(String sexCd) {
		this.sexCd = sexCd;
	}
	public String getSexName() {
		return sexName;
	}
	public void setSexName(String sexName) {
		this.sexName = sexName;
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
	public String getAgencyNo() {
		return agencyNo;
	}
	public void setAgencyNo(String agencyNo) {
		this.agencyNo = agencyNo;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getGroupSeq() {
		return groupSeq;
	}
	public void setGroupSeq(String groupSeq) {
		this.groupSeq = groupSeq;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getSleepTime() {
		return sleepTime;
	}
	public void setSleepTime(String sleepTime) {
		this.sleepTime = sleepTime;
	}
	public String getSleepTimeVal() {
		return sleepTimeVal;
	}
	public void setSleepTimeVal(String sleepTimeVal) {
		this.sleepTimeVal = sleepTimeVal;
	}
	public String getPositionTime() {
		return positionTime;
	}
	public void setPositionTime(String positionTime) {
		this.positionTime = positionTime;
	}
	public String getPositionTimeVal() {
		return positionTimeVal;
	}
	public void setPositionTimeVal(String positionTimeVal) {
		this.positionTimeVal = positionTimeVal;
	}


}
