package Databese;

import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class User implements Cloneable, Comparable<User> {
    private int id, age;
    private String email, name;

    public User(int id, int age, String email, String name){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public int compareTo(User user){
        return id - user.id;
    }

    protected User clone() throws CloneNotSupportedException{
        return new User(id, age, name, email);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                age == user.age &&
                Objects.equals(email, user.email) &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, age, email, name);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
