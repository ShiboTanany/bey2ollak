package bey2ollaktask.demo.endpoint;

import bey2ollaktask.demo.entities.User;
import bey2ollaktask.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService  userService;

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public User loginUser(@RequestBody User user){
        return userService.loginUser(user);
    }
    @RequestMapping(path = "/signup", method = RequestMethod.POST)
    public void saveUser(@RequestBody User user){
         userService.saveUser(user);
    }
    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<User> getUserList(){

      return   userService.getAllUsers();
    }

}
