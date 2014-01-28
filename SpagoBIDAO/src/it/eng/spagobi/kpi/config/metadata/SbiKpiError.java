/* SpagoBI, the Open Source Business Intelligence suite

 * Copyright (C) 2012 Engineering Ingegneria Informatica S.p.A. - SpagoBI Competency Center
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0, without the "Incompatible With Secondary Licenses" notice. 
 * If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package it.eng.spagobi.kpi.config.metadata;

import it.eng.spagobi.commons.metadata.SbiHibernateModel;
import it.eng.spagobi.kpi.model.metadata.SbiKpiModelInst;

import java.util.Date;


/**
 * SbiKpiError generated by hbm2java
 */

public class SbiKpiError  extends SbiHibernateModel {


	// Fields    
	private Integer kpiErrorId;
	private SbiKpiModelInst sbiKpiModelInst;
	private String userMessage;
	private String fullMessage;     
	private String labelModInst;
	private String parameters;
	private Date tsDate;


	// Constructors

	/** default constructor */
	public SbiKpiError() {
	}

	/** minimal constructor */
	public SbiKpiError(Integer kpiErrorId, SbiKpiModelInst sbiKpiModelInst,
			String userMessage, Date tsDate, String errorClass) {
		super();
		this.kpiErrorId = kpiErrorId;
		this.sbiKpiModelInst = sbiKpiModelInst;
		this.userMessage = userMessage;
		this.tsDate = tsDate;
	} 

	/** full constructor */
	public SbiKpiError(Integer kpiErrorId, 
			SbiKpiModelInst sbiKpiModelInst,
			String userMessage, 
			String labelModInst,
			String parameters, 
			Date tsDate, 
			String fullmessage) {
		super();
		this.kpiErrorId = kpiErrorId;
		this.sbiKpiModelInst = sbiKpiModelInst;
		this.userMessage = userMessage;
		this.labelModInst = labelModInst;
		this.parameters = parameters;
		this.tsDate = tsDate;
		this.fullMessage = fullmessage;
	}

	public Integer getKpiErrorId() {
		return kpiErrorId;
	}

	public void setKpiErrorId(Integer kpiErrorId) {
		this.kpiErrorId = kpiErrorId;
	}

	public SbiKpiModelInst getSbiKpiModelInst() {
		return this.sbiKpiModelInst;
	}

	public void setSbiKpiModelInst(SbiKpiModelInst sbiKpiModelInst) {
		this.sbiKpiModelInst = sbiKpiModelInst;
	}

	public String getLabelModInst() {
		return labelModInst;
	}

	public void setLabelModInst(String labelModInst) {
		this.labelModInst = labelModInst;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public Date getTsDate() {
		return tsDate;
	}

	public void setTsDate(Date tsDate) {
		this.tsDate = tsDate;
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}

	public String getFullMessage() {
		return fullMessage;
	}

	public void setFullMessage(String fullMessage) {
		this.fullMessage = fullMessage;
	}

}
