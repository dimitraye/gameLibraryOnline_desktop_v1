/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelibraryonlinedesktop1.service;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gamelibraryonlinedesktop1.model.Progression;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
/**
 *
 * @author dimit
 */
public class ProgressionService {

    private static final String FILE_PATH = "progressions.json";  // Fichier JSON où les données seront stockées

    // Charger les données depuis le fichier JSON
    public List<Progression> loadFromJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(FILE_PATH), new TypeReference<List<Progression>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Sauvegarder les données dans un fichier JSON
    public void saveToJson(List<Progression> progressions) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(FILE_PATH), progressions);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Trouver une progression par ID
    public Optional<Progression> findById(long id) {
        List<Progression> progressions = loadFromJson();
        if (progressions != null) {
            return progressions.stream().filter(p -> p.getIdProgression() == id).findFirst();
        }
        return Optional.empty();
    }

    // Ajouter ou mettre à jour une progression
    public void save(Progression progression) {
        List<Progression> progressions = loadFromJson();
        if (progressions != null) {
            Optional<Progression> existingProgression = findById(progression.getIdProgression());
            if (existingProgression.isPresent()) {
                // Mettre à jour la progression
                progressions.remove(existingProgression.get());
                progressions.add(progression);
            } else {
                // Ajouter une nouvelle progression
                progressions.add(progression);
            }
            saveToJson(progressions);  // Sauvegarder les modifications
        }
    }

    // Supprimer une progression par ID
    public void delete(long id) {
        List<Progression> progressions = loadFromJson();
        if (progressions != null) {
            progressions.removeIf(p -> p.getIdProgression() == id);
            saveToJson(progressions);  // Sauvegarder les modifications
        }
    }

    // Récupérer toutes les progressions
    public List<Progression> findAll() {
        return loadFromJson();
    }
}