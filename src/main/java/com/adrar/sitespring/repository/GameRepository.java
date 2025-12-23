package com.adrar.sitespring.repository;

import com.adrar.sitespring.entity.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameRepository extends CrudRepository<Game, Integer> {
    Optional<Object> findByTitle(String title);
}
