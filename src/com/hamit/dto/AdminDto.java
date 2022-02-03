
package com.hamit.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdminDto extends Common implements Serializable {
	private static final long serialVersionUID = -2971958637023501976L;

	private int adminId;
	private String adminName;
	private String adminSurname;
	private String adminPassword;
	private String adminEmail;

	public AdminDto(String adminName, String adminSurname, String adminPassword, String adminEmail) {
		super();
		this.adminName = adminName;
		this.adminSurname = adminSurname;
		this.adminPassword = adminPassword;
		this.adminEmail = adminEmail;
	}

}
