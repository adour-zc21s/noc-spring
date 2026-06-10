package com.adour.noc.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * @author {Open Class Programming}
 * Abdur Rahman Wahid - X-Sari
 * +62 813 8522 9903
 * Created 09/06/2026 - 8:37
 */
@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
