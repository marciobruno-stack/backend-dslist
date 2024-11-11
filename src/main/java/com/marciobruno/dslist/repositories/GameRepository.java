package com.marciobruno.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marciobruno.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	

}
