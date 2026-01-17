package com.medicare.medicare_backend.config;

import com.medicare.medicare_backend.entity.Role;
import com.medicare.medicare_backend.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initRoles(RoleRepository roleRepository) {
        return args -> {

            if (roleRepository.findByName("PATIENT").isEmpty()) {
                roleRepository.save(new Role("PATIENT"));
            }

            if (roleRepository.findByName("DOCTOR").isEmpty()) {
                roleRepository.save(new Role("DOCTOR"));
            }

            if (roleRepository.findByName("ADMIN").isEmpty()) {
                roleRepository.save(new Role("ADMIN"));
            }
        };
    }
}
