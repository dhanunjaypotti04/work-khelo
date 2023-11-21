package com.khelo.entity;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
public class MemberData {
	@DBRef
	private Player playerId;
	private int status;
	private String details;

}
