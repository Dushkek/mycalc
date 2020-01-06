package by.tms.services;

import by.tms.User;

public class RegService {

    public void createUser(User user){
        User.users.add(user);
    }

}
