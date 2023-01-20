package pl.migibud.testjs.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

class User {

    private long id;
    private String firstName;
    private String lastName;
    private int age;

}
