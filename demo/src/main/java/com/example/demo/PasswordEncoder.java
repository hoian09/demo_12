package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    public static  void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String resetPassword="12345";
        String encodePassword = encoder.encode(resetPassword);
        System.out.println(encodePassword);
    }
}
