package com.khelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khelo.Service.SignupService;
import com.khelo.entity.Player;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/signup")
@AllArgsConstructor
public class Signup {
	
	@Autowired
	private SignupService signupService;

	@PostMapping
	public ResponseEntity<String> signup(@Valid @RequestBody Player player) {
		System.out.println(player.toString());
		signupService.addPlayer(player);
		return new ResponseEntity<>("Signin Successful",HttpStatus.CREATED);
	}
}
