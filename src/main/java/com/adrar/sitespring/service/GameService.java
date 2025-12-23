package com.adrar.sitespring.service;

import com.adrar.sitespring.entity.Game;
import com.adrar.sitespring.repository.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService {

    private GameRepository gameRepository;

    public Game addGame(Game game)
    {
        if (gameRepository.findByTitle(game.getTitle()).isPresent()) {
            throw new RuntimeException("Game already exists");
        }
        return gameRepository.save(game);
    }

    public List<Game> getAllGames()
    {
        return (List<Game>) gameRepository.findAll();
    }
}
