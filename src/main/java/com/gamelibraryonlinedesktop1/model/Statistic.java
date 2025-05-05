/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelibraryonlinedesktop1.model;

/**
 *
 * @author dimit
 */
public class Statistic {
    private Long id;
    private int nbTotalGames;
    private int nbGamesNotStarted;
    private int nbGamesStarted;
    private int nbGamesFinished;
    private int nbGamesByPlateform;
    private int nbGamesByGenre;
    private User user;

    // Getters et Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNbTotalGames() {
        return nbTotalGames;
    }

    public void setNbTotalGames(int nbTotalGames) {
        this.nbTotalGames = nbTotalGames;
    }

    public int getNbGamesNotStarted() {
        return nbGamesNotStarted;
    }

    public void setNbGamesNotStarted(int nbGamesNotStarted) {
        this.nbGamesNotStarted = nbGamesNotStarted;
    }

    public int getNbGamesStarted() {
        return nbGamesStarted;
    }

    public void setNbGamesStarted(int nbGamesStarted) {
        this.nbGamesStarted = nbGamesStarted;
    }

    public int getNbGamesFinished() {
        return nbGamesFinished;
    }

    public void setNbGamesFinished(int nbGamesFinished) {
        this.nbGamesFinished = nbGamesFinished;
    }

    public int getNbGamesByPlateform() {
        return nbGamesByPlateform;
    }

    public void setNbGamesByPlateform(int nbGamesByPlateform) {
        this.nbGamesByPlateform = nbGamesByPlateform;
    }

    public int getNbGamesByGenre() {
        return nbGamesByGenre;
    }

    public void setNbGamesByGenre(int nbGamesByGenre) {
        this.nbGamesByGenre = nbGamesByGenre;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
