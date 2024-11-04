package org.studyeasy.SpringStarter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        return "index";
    }
    @GetMapping("/book")
    public String book(Model model){
        return "book";
    }
    @GetMapping("/buy")
    public String buy(Model model){
        return "buy";
    }
    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }
    @GetMapping("/smarthome")
    public String smarthome(Model model){
        return "smarthome";
    }
    
    }
    
   

