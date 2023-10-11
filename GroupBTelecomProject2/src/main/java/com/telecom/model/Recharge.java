package com.telecom.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import javax.persistence.CascadeType;


//import java.util.Calendar;
//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "Recharge_Plans")
public class Recharge {
	/*

	 * pack validity in days, total data in gb, total SMS, Amount, plan purchase
	 * date,Plan Expiry date

	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "recharge_id")
	private int rechargeId;
	@Column(name = "plan_name")
	private String planName;
	@Column(name = "validity_in_days")
	private int validityInDays;
	@Column(name = "total_data")
	private String totalData;
	@Column(name = "total_sms")
	private String totalSms;
	@Column(name = "amount")
	private double amount;
	@Column(name = "plan_purchase_date")
	private String purchaseDate;
	@Column(name = "plan_expiry_date")
	private String userPlanExpiryDate;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	@JsonBackReference
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(int rechargeId) {
		this.rechargeId = rechargeId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public int getValidityInDays() {
		return validityInDays;

	}

	public void setValidityInDays(int validityInDays) {
		this.validityInDays = validityInDays;

		// purchase date set
		Calendar cal = Calendar.getInstance();
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.purchaseDate = sdf.format(cal.getTime());

		// expiry date set
		Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.DAY_OF_MONTH, this.getValidityInDays());
		DateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		this.userPlanExpiryDate = sdf1.format(cal1.getTime());

	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public String getUserPlanExpiryDate() {
		return userPlanExpiryDate;
	}

	public String getTotalData() {
		return totalData;
	}

	public void setTotalData(String totalData) {
		this.totalData = totalData;
	}

	public String getTotalSms() {
		return totalSms;
	}

	public void setTotalSms(String totalSms) {
		this.totalSms = totalSms;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Recharge [rechargeId=" + rechargeId + ", planName=" + planName + ", validityInDays=" + validityInDays
				+ ", totalData=" + totalData + ", totalSms=" + totalSms + ", amount=" + amount + ", purchaseDate="
				+ purchaseDate + ", userPlanExpiryDate=" + userPlanExpiryDate + "]";
	}

}
