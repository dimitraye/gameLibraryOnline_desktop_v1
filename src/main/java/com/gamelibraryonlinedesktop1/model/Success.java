/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelibraryonlinedesktop1.model;

/**
 *
 * @author dimit
 */
public class Success {

    private long idSuccess;
    private String description;
    private Boolean owned;
    private Game game;

    // Getters et Setters

    public long getIdSuccess() {
        return idSuccess;
    }

    public void setIdSuccess(long idSuccess) {
        this.idSuccess = idSuccess;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getOwned() {
        return owned;
    }

    public void setOwned(Boolean owned) {
        this.owned = owned;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}