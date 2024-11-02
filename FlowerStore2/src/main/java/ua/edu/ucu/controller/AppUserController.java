package ua.edu.ucu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.edu.ucu.model.AppUser;
import ua.edu.ucu.service.AppUserService;
import java.util.List;

@RestController //ability to work by httpzators (get, post...)
@RequestMapping("/api/v1")//шлях до запиту
public class AppUserController {
    private AppUserService userService;

    @Autowired
    public AppUserController(AppUserService userService){
        this.userService = userService;
    }
    @GetMapping("/app_user")
    public List<AppUser> getUser(){
        return userService.getUsers();
    }
    @PostMapping("/app_user")
    public AppUser createUser(@RequestBody AppUser user){
        return userService.createUser(user);
    }

    @GetMapping("/app_user/email")
    public ResponseEntity<AppUser> getUserByEmail(@RequestParam String email) {
        AppUser userByEmail = userService.getUserByEmail(email);
        if (userByEmail!=null){
            return ResponseEntity.ok(userByEmail);
        }
        return ResponseEntity.notFound().build();
    }
}
