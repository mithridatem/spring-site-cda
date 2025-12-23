package com.adrar.sitespring.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;

@Entity
@Data
@Table(name="game")
public class Game {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="title", nullable = false, length = 50)
    private String title;

    @Column(name="description", nullable = false, length = 50)
    private String description;

    @Column(name="published_at")
    private Date publishedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "console_id")
    private Console console;
}
