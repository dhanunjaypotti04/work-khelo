package com.khelo.entity;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReferralData {
	@DBRef
	private Player referredBy;
	private List<Map<String, RewardsData>> rewards;
	private Player your_referrals;

}
