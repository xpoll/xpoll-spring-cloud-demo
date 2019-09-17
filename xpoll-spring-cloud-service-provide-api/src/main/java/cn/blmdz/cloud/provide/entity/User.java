package cn.blmdz.cloud.provide.entity;

import lombok.Data;

@Data
public class User {
	private Long id;
	private String workNumber;
	private String workName;
	private String departmentCode;
	private String departmentName;
	private String companyCode;
	private String companyName;
}
