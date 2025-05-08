/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelibraryonlinedesktop1.service;

import com.gamelibraryonlinedesktop1.model.Commentary;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dimit
 */
public class CommentaryService {

    private List<Commentary> commentaryList;

    public CommentaryService() {
        this.commentaryList = new ArrayList<>();
    }

    // Create or Update
    public void save(Commentary commentary) {
        Optional<Commentary> existing = findById(commentary.getIdCommentary());
        existing.ifPresent(commentaryList::remove);
        commentaryList.add(commentary);
    }

    // Read
    public Optional<Commentary> findById(long id) {
        return commentaryList.stream().filter(c -> c.getIdCommentary() == id).findFirst();
    }

    public List<Commentary> findAll() {
        return new ArrayList<>(commentaryList);
    }

    // Delete
    public void delete(long id) {
        commentaryList.removeIf(c -> c.getIdCommentary() == id);
    }
}