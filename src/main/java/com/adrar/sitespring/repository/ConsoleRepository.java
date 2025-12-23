package com.adrar.sitespring.repository;

import com.adrar.sitespring.entity.Console;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsoleRepository extends CrudRepository<Console, Integer> {
    public boolean existsByName(String name);
}
