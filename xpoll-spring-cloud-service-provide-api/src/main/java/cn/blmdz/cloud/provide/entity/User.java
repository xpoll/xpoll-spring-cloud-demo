package cn.blmdz.cloud.provide.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Integer id;
	private String workNumber;
	private String workName;
	private String departmentCode;
	private String departmentName;
	private String companyCode;
	private String companyName;
}
