package com.khelo.entity;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CommunityData {
	@DBRef
	private String communityId;
	private int status;
	private String playerDetails;

}
