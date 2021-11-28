package io.weet.demo.models;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
public class UserModel {

    @Id
    public String id;
    public String name;
    private String email;
    private String password;
    private List<Allergen> allergens;

    public UserModel(String name, String email, String password, List<Allergen> allergens) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.allergens = allergens;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }  

    public String getPassword() {
        return password;
    }

    public List<Allergen> getAllergies(){
        return allergens;
    }

    public void setPassword(String pwd) {
        this.password = pwd;
    }

    public String toString() {
        return String.format(
                "User[id=%s, fullname='%s', email='%s']",
                id, name, email);
    }

}