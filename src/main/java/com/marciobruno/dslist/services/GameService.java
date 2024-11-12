package com.marciobruno.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marciobruno.dslist.dto.GameDTO;
import com.marciobruno.dslist.dto.GameMinDTO;
import com.marciobruno.dslist.entities.Game;
import com.marciobruno.dslist.repositories.GameRepository;

import jakarta.transaction.Transactional;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	//@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return  new GameDTO(result);
	}
	
	//@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List <Game> result = gameRepository.findAll();
		return  result.stream().map(x -> new GameMinDTO(x)).toList();		
	}
}
