package edu.frostburg.itec442.ecommerce.service;

import edu.frostburg.itec442.ecommerce.model.User;
import edu.frostburg.itec442.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    /**
     * Save user
     * @param user
     * @return
     */
    public User save(User user){
        return userRepository.save(user);
    }

    /**
     * Get all users
     * @return
     */
    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
