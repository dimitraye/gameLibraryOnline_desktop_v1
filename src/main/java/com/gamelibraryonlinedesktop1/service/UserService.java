/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelibraryonlinedesktop1.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gamelibraryonlinedesktop1.model.User;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 *
 * @author dimit
 */
public class UserService {

    private static final String BASE_URL = "http://localhost:8080/api/users"; // Adapte selon ton backend
    private final ObjectMapper mapper = new ObjectMapper();

    public User save(User user) throws IOException {
        return sendRequest(BASE_URL, "POST", user, User.class);
    }

    public User update(User user) throws IOException {
        return sendRequest(BASE_URL + "/" + user.getIdUser(), "PUT", user, User.class);
    }

    public User findById(long id) throws IOException {
        return sendRequest(BASE_URL + "/" + id, "GET", null, User.class);
    }

    public List<User> findAll() throws IOException {
        return sendRequest(BASE_URL, "GET", null, new TypeReference<List<User>>() {});
    }

    public void delete(long id) throws IOException {
        sendRequest(BASE_URL + "/" + id, "DELETE", null, Void.class);
    }

    public User findByEmail(String email) throws IOException {
        return sendRequest(BASE_URL + "/email/" + email, "GET", null, User.class);
    }

    // Méthode générique pour envoyer des requêtes HTTP
    private <T> T sendRequest(String endpoint, String method, Object body, Class<T> responseType) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(endpoint).openConnection();
        connection.setRequestMethod(method);
        connection.setRequestProperty("Content-Type", "application/json");

        if (method.equals("POST") || method.equals("PUT")) {
            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream()) {
                mapper.writeValue(os, body);
            }
        }

        if (connection.getResponseCode() >= 400) {
            throw new IOException("Erreur HTTP : " + connection.getResponseCode());
        }

        if (responseType == Void.class) return null;

        try (InputStream is = connection.getInputStream()) {
            return mapper.readValue(is, responseType);
        }
    }

    // Overload pour les listes et génériques
    private <T> T sendRequest(String endpoint, String method, Object body, TypeReference<T> typeRef) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(endpoint).openConnection();
        connection.setRequestMethod(method);
        connection.setRequestProperty("Content-Type", "application/json");

        if (method.equals("POST") || method.equals("PUT")) {
            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream()) {
                mapper.writeValue(os, body);
            }
        }

        if (connection.getResponseCode() >= 400) {
            throw new IOException("Erreur HTTP : " + connection.getResponseCode());
        }

        try (InputStream is = connection.getInputStream()) {
            return mapper.readValue(is, typeRef);
        }
    }
}