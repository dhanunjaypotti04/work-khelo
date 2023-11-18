package com.khelo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberData {
	private Player playerId;
	private int status;
	private String details;

}
