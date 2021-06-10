package com.tcs.inetrn21.ms.accountsmanagement.accountsmanagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="ACCOUNTENTITY")
@Entity
public class AccountEntity {
		@Id
		@GeneratedValue
		private Integer account_id;
		private String name;
		private String currency;
		private Integer available_balance;
		
		protected AccountEntity()
		{
			
		}

		public AccountEntity(Integer account_id, String name, String currency, Integer available_balance) {
			super();
			this.account_id = account_id;
			this.name = name;
			this.currency = currency;
			this.available_balance = available_balance;
		}

		public Integer getAccount_id() {
			return account_id;
		}

		public void setAccount_id(Integer account_id) {
			this.account_id = account_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCurrency() {
			return currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public Integer getAvailable_balance() {
			return available_balance;
		}

		public void setAvailable_balance(Integer available_balance) {
			this.available_balance = available_balance;
		}

		@Override
		public String toString() {
			return "AccountEntity [account_id=" + account_id + ", name=" + name + ", currency=" + currency
					+ ", available_balance=" + available_balance + "]";
		}
	
	}

