package com.adrar.sitespring.controller;

import com.adrar.sitespring.entity.Game;
import com.adrar.sitespring.service.ConsoleService;
import com.adrar.sitespring.service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class GameController {

    private GameService gameService;
    private ConsoleService consoleService;

    @GetMapping("/games")
    public String showGames(Model model) {
        List<Game> games = gameService.getAllGames();
        model.addAttribute("games", games);
        return "showAllGames";
    }
    @GetMapping("/game/add")
    public String addGame(Model model)
    {

        model.addAttribute("game", new Game());
        model.addAttribute("consoles", consoleService.findAllConsoles());
        return "addGame";
    }

    @PostMapping("/game")
    public String saveGame(@ModelAttribute("game") Game game) {
        gameService.addGame(game);
        return "redirect:/games";
    }
}
