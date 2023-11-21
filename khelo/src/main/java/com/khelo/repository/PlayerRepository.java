package com.khelo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.khelo.entity.Player;

public interface PlayerRepository extends MongoRepository<Player, String>{

}
