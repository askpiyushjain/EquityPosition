package com.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "POSITION")
public class PositionEntity {

	@Id
	@Column(name ="ID")
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
	
	
}
