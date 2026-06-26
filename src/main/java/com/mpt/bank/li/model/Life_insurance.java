package com.mpt.bank.li.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Life_insurance {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "policyno")
		private int policyNo;
		private String custName;
		private double premium;
		private int ppt;
		private int pt;
		private String plan;
		public Life_insurance() {
			
		}
		public Life_insurance(int policyNo, String custName, double premium, int ppt, int pt, String plan) {
			
			this.policyNo = policyNo;
			this.custName = custName;
			this.premium = premium;
			this.ppt = ppt;
			this.pt = pt;
			this.plan = plan;
		}
		public int getPolicyNo() {
			return policyNo;
		}
		public void setPolicyNo(int policyNo) {
			this.policyNo = policyNo;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public double getPremium() {
			return premium;
		}
		public void setPremium(double premium) {
			this.premium = premium;
		}
		public int getPpt() {
			return ppt;
		}
		public void setPpt(int ppt) {
			this.ppt = ppt;
		}
		public int getPt() {
			return pt;
		}
		public void setPt(int pt) {
			this.pt = pt;
		}
		public String getPlan() {
			return plan;
		}
		public void setPlan(String plan) {
			this.plan = plan;
		}
		@Override
		public String toString() {
			return "Life_insurance [policyNo=" + policyNo + ", custName=" + custName + ", premium=" + premium + ", ppt="
					+ ppt + ", pt=" + pt + ", plan=" + plan + "]";
		}

		
}