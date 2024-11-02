package ua.edu.ucu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import ua.edu.ucu.model.AppUser;
import ua.edu.ucu.repository.UserRepository;

import java.util.List;

@Service
public class AppUserService {
    private UserRepository userRepository;

    @Autowired
    public AppUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<AppUser> getUsers(){
        return userRepository.findAll();
    }
    @PostMapping("/app_user")
    public AppUser createUser(AppUser user){
        return userRepository.save(user);
    }
    public AppUser getUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }

}
