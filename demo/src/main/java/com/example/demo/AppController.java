package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.Query;
import java.util.List;
@Controller
public class AppController {
@Autowired
    UserRepository userRepository;
@GetMapping("")
    public String viewHomePage(){
    return "index";
}
@GetMapping("/register")
    public String showRegistrationForm(Model model){
    model.addAttribute("user", new User());
    return "signup_form";
}
@PostMapping("/process_register")
    public String processRegister(User user){
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    String encodedPassword = passwordEncoder.encode(user.getPassword());
    user.setPassword(encodedPassword);
    userRepository.save(user);
    return "process_register";
}
@GetMapping("/users")
    public String listUsers(Model model) {
    List<User> listUsers = userRepository.findAll();
    model.addAttribute("listUsers", listUsers);
    return "users";
}
}
