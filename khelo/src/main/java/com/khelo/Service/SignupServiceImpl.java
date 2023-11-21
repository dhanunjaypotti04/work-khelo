package com.khelo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khelo.entity.Player;
import com.khelo.repository.PlayerRepository;

@Service
public class SignupServiceImpl implements SignupService {
	
	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public Player addPlayer(Player player) {
		System.out.println(player.toString());
		Player savedPlayer = playerRepository.save(player);
		return savedPlayer;
	}


}
