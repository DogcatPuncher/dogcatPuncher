package com.petcation.common.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class CommonVO {
	private int pageNum = 0;
	private int amount = 0;
	
	private String search = "";
	private String keyword = "";
	
	private String start_date = "";
	private String end_date = "";
	
	public CommonVO() {
		this(1, 10);
	}
	
	public CommonVO(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
}
