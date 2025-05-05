/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelibraryonlinedesktop1.model;

import java.util.Date;


/**
 *
 * @author dimit
 */
public class Commentary {
    private long idCommentary;
    private String commentary;
    private Date creationDate;
    private User user;
    private Game game;

    // Getters et Setters

    public long getIdCommentary() {
        return idCommentary;
    }

    public void setIdCommentary(long idCommentary) {
        this.idCommentary = idCommentary;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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
