package net.javaguides.springboot.helloworldapp.bean;

import javax.persistence.*;

/**
 * Created by Admin on 10/11/2020.
 */
@Entity
@Table(name="users_details")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    public String username;
    public String password;
}
