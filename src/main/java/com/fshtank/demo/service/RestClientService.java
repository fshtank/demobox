package com.fshtank.demo.service;

import com.fshtank.demo.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClientService {

    private final RestTemplate restTemplate;
    private final String baseUrl = "https://api.example.com"; // Replace with your API base URL

    @Autowired
    public RestClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // GET request to fetch a single user by ID
    public UserDTO getUserById(Long id) {
        try {
            String url = baseUrl + "/users/" + id;
            ResponseEntity<UserDTO> response = restTemplate.getForEntity(url, UserDTO.class);
            return response.getBody();
        } catch (RestClientException e) {
            throw new RuntimeException("Failed to fetch user with id: " + id, e);
        }
    }

    // GET request to fetch all users
    public UserDTO[] getAllUsers() {
        try {
            String url = baseUrl + "/users";
            ResponseEntity<UserDTO[]> response = restTemplate.getForEntity(url, UserDTO[].class);
            return response.getBody();
        } catch (RestClientException e) {
            throw new RuntimeException("Failed to fetch users", e);
        }
    }

    // POST request to create a new user
    public UserDTO createUser(UserDTO user) {
        try {
            String url = baseUrl + "/users";

            // Set headers
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            // Create request entity with headers and body
            HttpEntity<UserDTO> request = new HttpEntity<>(user, headers);

            ResponseEntity<UserDTO> response = restTemplate.postForEntity(url, request, UserDTO.class);
            return response.getBody();
        } catch (RestClientException e) {
            throw new RuntimeException("Failed to create user", e);
        }
    }

    // PUT request to update an existing user
    public UserDTO updateUser(Long id, UserDTO user) {
        try {
            String url = baseUrl + "/users/" + id;

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<UserDTO> request = new HttpEntity<>(user, headers);

            ResponseEntity<UserDTO> response = restTemplate.exchange(
                    url,
                    HttpMethod.PUT,
                    request,
                    UserDTO.class
            );
            return response.getBody();
        } catch (RestClientException e) {
            throw new RuntimeException("Failed to update user with id: " + id, e);
        }
    }

    // DELETE request to remove a user
    public void deleteUser(Long id) {
        try {
            String url = baseUrl + "/users/" + id;
            restTemplate.delete(url);
        } catch (RestClientException e) {
            throw new RuntimeException("Failed to delete user with id: " + id, e);
        }
    }
}