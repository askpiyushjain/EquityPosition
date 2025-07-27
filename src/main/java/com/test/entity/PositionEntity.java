package com.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "POSITION")
public class PositionEntity {

	@Id
	@Column(name ="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transactionID;
	
	@Column(name ="TRADE_ID")
	private String tradeId;
	
	@Column(name ="VERSION")
	private String version;
	
	@Column(name ="SECURITY_CODE")
	private String code;

	@Column(name ="QUANTITY")
	private Integer quantity;
	
	@Column(name ="OPERATION")
	private String operation;
	
	@Column(name ="TYPE")
	private String type;

	public Integer getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(Integer transactionID) {
		this.transactionID = transactionID;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
