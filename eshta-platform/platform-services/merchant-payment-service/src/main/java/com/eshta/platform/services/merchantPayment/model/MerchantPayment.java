package com.eshta.platform.services.merchantPayment.model;

import java.math.BigDecimal;

public class MerchantPayment {
	private Long id;
	private String desc;
	private BigDecimal amount;
	
	
	public MerchantPayment(){}

	public MerchantPayment(Long id, String desc, BigDecimal amount) {
		super();
		this.id = id;
		this.desc = desc;
		this.amount = amount;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
	
}
