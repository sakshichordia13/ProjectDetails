package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Details")
public class Details {

	
	@Id
	@Column (name = "SERIAL_NO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SERIAL_SEQ")
	@SequenceGenerator(sequenceName = "serial_seq", allocationSize=1, name = "SERIAL_SEQ")
	private int serialNo;
	
	
	@Column (name = "WP_WL")
	private String wp_wl;
	
	private String projectTitle;
	
	private String projectDescription;
	
	private String branchName;
	
	private String libraries;
	
	private String sharedResources;
	
	private String web;
	
	private String sql;
	
	private String pay;
	
	private String utl;
	
	private String wfl;
	
	private String developmentTeam;
	
	private String adm;

	public Details() {
		super();
	}

	public Details(int serialNo, String wp_wl, String projectTitle, String projectDescription, String branchName,
			String libraries, String sharedResources, String web, String sql, String pay, String utl, String wfl,
			String developmentTeam, String adm) {
		super();
		this.serialNo = serialNo;
		this.wp_wl = wp_wl;
		this.projectTitle = projectTitle;
		this.projectDescription = projectDescription;
		this.branchName = branchName;
		this.libraries = libraries;
		this.sharedResources = sharedResources;
		this.web = web;
		this.sql = sql;
		this.pay = pay;
		this.utl = utl;
		this.wfl = wfl;
		this.developmentTeam = developmentTeam;
		this.adm = adm;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getWp_wl() {
		return wp_wl;
	}

	public void setWp_wl(String wp_wl) {
		this.wp_wl = wp_wl;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getLibraries() {
		return libraries;
	}

	public void setLibraries(String libraries) {
		this.libraries = libraries;
	}

	public String getSharedResources() {
		return sharedResources;
	}

	public void setSharedResources(String sharedResources) {
		this.sharedResources = sharedResources;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getUtl() {
		return utl;
	}

	public void setUtl(String utl) {
		this.utl = utl;
	}

	public String getWfl() {
		return wfl;
	}

	public void setWfl(String wfl) {
		this.wfl = wfl;
	}

	public String getDevelopmentTeam() {
		return developmentTeam;
	}

	public void setDevelopmentTeam(String developmentTeam) {
		this.developmentTeam = developmentTeam;
	}

	public String getAdm() {
		return adm;
	}

	public void setAdm(String adm) {
		this.adm = adm;
	}

	@Override
	public String toString() {
		return "Details [serialNo=" + serialNo + ", wp_wl=" + wp_wl + ", projectTitle=" + projectTitle
				+ ", projectDescription=" + projectDescription + ", branchName=" + branchName + ", libraries="
				+ libraries + ", sharedResources=" + sharedResources + ", web=" + web + ", sql=" + sql + ", pay=" + pay
				+ ", utl=" + utl + ", wfl=" + wfl + ", developmentTeam=" + developmentTeam + ", adm=" + adm + "]";
	}

	

	
	
	
}
