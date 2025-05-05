/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelibraryonlinedesktop1.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author dimit
 */
public class Game {
    private long idGame;
    private String title;
    private Platform platform;
    private VideoGameGenre videoGameGenre;
    private Date datePurchase;
    private int playHours;
    private GameStatus state;
    private String picture;
    private User user;
    private List<Success> successes;
    private List<Progression> progressions;
    private List<Commentary> commentaries;

    // Getters et Setters

    public long getIdGame() {
        return idGame;
    }

    public void setIdGame(long idGame) {
        this.idGame = idGame;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public VideoGameGenre getVideoGameGenre() {
        return videoGameGenre;
    }

    public void setVideoGameGenre(VideoGameGenre videoGameGenre) {
        this.videoGameGenre = videoGameGenre;
    }

    public Date getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(Date datePurchase) {
        this.datePurchase = datePurchase;
    }

    public int getPlayHours() {
        return playHours;
    }

    public void setPlayHours(int playHours) {
        this.playHours = playHours;
    }

    public GameStatus getState() {
        return state;
    }

    public void setState(GameStatus state) {
        this.state = state;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Success> getSuccesses() {
        return successes;
    }

    public void setSuccesses(List<Success> successes) {
        this.successes = successes;
    }

    public List<Progression> getProgressions() {
        return progressions;
    }

    public void setProgressions(List<Progression> progressions) {
        this.progressions = progressions;
    }

    public List<Commentary> getCommentaries() {
        return commentaries;
    }

    public void setCommentaries(List<Commentary> commentaries) {
        this.commentaries = commentaries;
    }
    
}
