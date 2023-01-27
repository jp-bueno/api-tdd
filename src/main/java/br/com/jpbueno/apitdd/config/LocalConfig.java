package br.com.jpbueno.apitdd.config;

import br.com.jpbueno.apitdd.domain.User;
import br.com.jpbueno.apitdd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "João", "joao@pedro.com", "123");
        User u2 = new User(null, "Pedro", "pedro@joao.com", "124");

        repository.saveAll(List.of(u1,u2));
    }
}
