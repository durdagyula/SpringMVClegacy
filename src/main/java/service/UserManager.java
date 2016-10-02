package service;

import model.User;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by durdagyula on 2016. 09. 26..
 */
public class UserManager {
    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public List<User> getUsers(){
        return users;
    }
}

