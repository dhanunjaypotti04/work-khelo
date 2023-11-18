package com.khelo.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReferralData {
	private Player referredBy;
	private List rewards;
	private Player your_referrals;

}
