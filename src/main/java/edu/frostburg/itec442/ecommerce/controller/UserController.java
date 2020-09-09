package edu.frostburg.itec442.ecommerce.controller;

import edu.frostburg.itec442.ecommerce.model.User;
import edu.frostburg.itec442.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public String users(Model model){

        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "users";
    }
}
