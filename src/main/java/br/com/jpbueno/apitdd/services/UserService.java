package br.com.jpbueno.apitdd.services;

import br.com.jpbueno.apitdd.domain.User;
import br.com.jpbueno.apitdd.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO userDTO);
}
