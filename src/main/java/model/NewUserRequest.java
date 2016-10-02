package model;

import lombok.Data;

/**
 * Created by durdagyula on 2016. 09. 26..
 */
//TODO: @DATA annotation usage
@Data
public class NewUserRequest {

    private int credit;
    private String username;

    //GET
    public int getCredit() {
        return credit;
    }

    public String getUsername() {
        return username;
    }

    //SET
    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
