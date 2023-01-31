package br.com.jpbueno.apitdd.resources;

import br.com.jpbueno.apitdd.domain.User;
import br.com.jpbueno.apitdd.domain.dto.UserDTO;
import br.com.jpbueno.apitdd.repositories.UserRepository;
import br.com.jpbueno.apitdd.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Integer id) {

        return ResponseEntity.ok().body(mapper.map(userService.findById(id), UserDTO.class));
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> userDTO = userService.findAll().stream().map(x -> mapper.map(x, UserDTO.class)).collect(Collectors.toList());

        return ResponseEntity.ok().body(userDTO);
    }
}
