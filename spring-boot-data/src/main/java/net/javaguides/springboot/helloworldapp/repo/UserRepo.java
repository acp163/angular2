package net.javaguides.springboot.helloworldapp.repo;

import net.javaguides.springboot.helloworldapp.bean.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Admin on 10/11/2020.
 */
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

   User findByUsername(String username);

}
