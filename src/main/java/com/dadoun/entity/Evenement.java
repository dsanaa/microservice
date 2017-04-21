package com.dadoun.entity;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity

public class Evenement implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IDENTIFIANT;
	private Date DATEEXEC;
	public Long getIDENTIFIANT() {
		return IDENTIFIANT;
	}
	public void setIDENTIFIANT(Long iDENTIFIANT) {
		IDENTIFIANT = iDENTIFIANT;
	}
	public Date getDATEEXEC() {
		return DATEEXEC;
	}
	public void setDATEEXEC(Date dATEEXEC) {
		DATEEXEC = dATEEXEC;
	}
	public Evenement(Date dATEEXEC) {
		super();
		DATEEXEC = dATEEXEC;
	}
	public Evenement() {
		super();
	}
	
}
