package com.pivotrics.coupons.data;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "generatedCoupons")
public class GeneratedCoupons implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int gcId;
	private String issuerStore;
	private String customerPhoneNo;
	private String couponCode;
	private double discount;
	private boolean redeemed;

	public String getIssuerStore() {
		return issuerStore;
	}

	public void setIssuerStore(String issuerStore) {
		this.issuerStore = issuerStore;
	}

	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public boolean isRedeemed() {
		return redeemed;
	}

	public void setRedeemed(boolean redeemed) {
		this.redeemed = redeemed;
	}

	public int getGcId() {
		return gcId;
	}


	

}
