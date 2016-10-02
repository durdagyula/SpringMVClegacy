package controller;

import model.NewUserRequest;
import model.User;
import service.UserManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import com.google.common.base.Strings;


/**
 * Created by durdagyula on 2016. 09. 19..
 */


@Controller
public class AdminController {

    private UserManager userManager;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String status(){
        return "admin/status";
    }

    @RequestMapping(value = "/get_balance", method = RequestMethod.GET)
    public String get_balance(){
        return "admin/get_balance";
    }

    @RequestMapping(value = "/new_user", method = RequestMethod.GET)
    public String new_user(){
        return "admin/new_user";
    }

    public String newUser(NewUserRequest newUserRequest){
        if(Strings.isNullOrEmpty(newUserRequest.getUsername())){
            return "admin/new_user";
        } else {
            userManager.addUser(new User(newUserRequest.getUsername(), newUserRequest.getCredit()));
            return "admin/status";
        }
    }
}
