package com.adrar.sitespring.controller;

import com.adrar.sitespring.entity.Console;
import com.adrar.sitespring.repository.ConsoleRepository;
import com.adrar.sitespring.service.ConsoleService;
import lombok.AllArgsConstructor;
import org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ConsoleController {

    private ConsoleService consoleService;

    @GetMapping("/consoles")
    public String showConsoles(Model model) {
        List<Console> consoles = (List<Console>) consoleService.findAllConsoles();
        model.addAttribute("consoles", consoles);
        return "showAllConsoles";
    }

    @GetMapping("/console/add")
    public String showConsole(Model model)
    {
        model.addAttribute("console", new Console());
        return "addConsole";
    }

    @PostMapping("/console")
    public String addConsole(@ModelAttribute("console") Console console, Model  model)
    {
        consoleService.addConsole(console);
        return "redirect:/consoles";
    }
}
