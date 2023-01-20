package pl.migibud.testjs.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/users")
class UserController {

    private final static List<User> USERS = List.of(
            new User(1,"Piotr","Migaj",30),
            new User(2,"Anna","Migaj",28)
    );

    @GetMapping
    List<User> getUsers(){
        return USERS;
    }


}
