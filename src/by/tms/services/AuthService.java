package by.tms.services;

import by.tms.User;
import by.tms.action.UserAction;

public class AuthService {

    public void auth(String login, String password){
        for (User user : User.users) {
         if(user.getLogin().equals(login))
             if(user.getPassword().equals(password))
                 UserAction.currentUser = user;
             if (UserAction.currentUser==null)
                 break;
        }
    }

    public void authCheck(String login, String password) {
        for (User user : User.users) {
            if(user.getLogin().equals(login))
                if(user.getPassword().equals(password)) {
                continue;
                }
            else
                break;
        }
    }
}
