package com.marciobruno.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marciobruno.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	

}
