package com.marciobruno.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marciobruno.dslist.dto.GameListDTO;
import com.marciobruno.dslist.dto.GameMinDTO;
import com.marciobruno.dslist.entities.GameList;
import com.marciobruno.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
		
	//@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List <GameList> result = gameListRepository.findAll();
		return  result.stream().map(x -> new GameListDTO(x)).toList();		
	}
}
