package ru.pharmaplus.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.pharmaplus.domain.User;

import java.util.ArrayList;

/**
 * @author ibraim
 */
@RestController
public class UserResource {

    @GetMapping("/users/{id}")
    public ResponseEntity getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setEmail("ibraim@mail.com");

        return ResponseEntity.ok(user);
    }

    @GetMapping("/users")
    public ResponseEntity getUsers() {
        return ResponseEntity.ok(new ArrayList<User>());
    }
}
