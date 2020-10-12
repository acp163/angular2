package net.javaguides.springboot.helloworldapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.helloworldapp.bean.Order;
import net.javaguides.springboot.helloworldapp.bean.User;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer>{

}
