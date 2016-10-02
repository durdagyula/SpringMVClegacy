package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserManager;
import model.User;
import java.util.List;

/**
 * Created by durdagyula on 2016. 09. 26..
 */
@Controller
public class AdminStatusController {
    @Autowired
    UserManager userManager;

    @ModelAttribute("userList") List<User> getUsers(){
        return userManager.getUsers();
    }

    @RequestMapping("admin/status")
    public String status(){
        return "status";
    }
}

