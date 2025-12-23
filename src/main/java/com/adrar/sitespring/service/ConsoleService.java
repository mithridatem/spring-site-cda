package com.adrar.sitespring.service;

import com.adrar.sitespring.entity.Console;
import com.adrar.sitespring.repository.ConsoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ConsoleService {

    private ConsoleRepository consoleRepository;

    public Console addConsole(Console console) {
        if (consoleRepository.existsByName(console.getName()))
        {
            throw new RuntimeException("console already exists");
        }
        return consoleRepository.save(console);
    }

    public List<Console> findAllConsoles( )
    {
        return (List<Console>) consoleRepository.findAll();
    }
}
