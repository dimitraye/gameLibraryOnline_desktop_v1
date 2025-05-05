/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelibraryonlinedesktop1.model;

/**
 *
 * @author dimit
 */
public class Progression {
    private long idProgression;
    private String detailsProgression;
    private int percentageCompletion;
    private User user;
    private Game game;

    // Getters et Setters

    public long getIdProgression() {
        return idProgression;
    }

    public void setIdProgression(long idProgression) {
        this.idProgression = idProgression;
    }

    public String getDetailsProgression() {
        return detailsProgression;
    }

    public void setDetailsProgression(String detailsProgression) {
        this.detailsProgression = detailsProgression;
    }

    public int getPercentageCompletion() {
        return percentageCompletion;
    }

    public void setPercentageCompletion(int percentageCompletion) {
        this.percentageCompletion = percentageCompletion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
}
