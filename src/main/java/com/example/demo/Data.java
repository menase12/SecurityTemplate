package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Data implements CommandLineRunner {
@Autowired
    UserRepository userRepository;
@Autowired
RoleRepository roleRepository;
    @Override
    public void run(String... strings) throws Exception {

        roleRepository.save ( new Role ( "USER" ) );
        roleRepository.save ( new Role ( "ADMIN" ) );
        Role adminRole = roleRepository.findByRole ( "ADMIN" );
        Role userRole = roleRepository.findByRole ( "USER" );

    }
}
