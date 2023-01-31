package br.com.jpbueno.apitdd.services;

import br.com.jpbueno.apitdd.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
