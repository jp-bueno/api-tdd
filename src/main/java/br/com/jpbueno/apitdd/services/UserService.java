package br.com.jpbueno.apitdd.services;

import br.com.jpbueno.apitdd.domain.User;

public interface UserService {

    User findById(Integer id);
}
