package br.com.jpbueno.apitdd.services.impl;

import br.com.jpbueno.apitdd.domain.User;
import br.com.jpbueno.apitdd.repositories.UserRepository;
import br.com.jpbueno.apitdd.services.UserService;
import br.com.jpbueno.apitdd.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
