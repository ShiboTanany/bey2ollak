package bey2ollaktask.demo.services;

import bey2ollaktask.demo.entities.User;
import bey2ollaktask.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository  userRepository;

    public void saveUser(User  user){
        userRepository.save(user);

    }
    public User loginUser(User user){
        return userRepository.findByUserNameAndPassword(user.getUserName(),user.getUserName());
    }

    public List<User> getAllUsers(){

        return userRepository.findAll();
    }

}
