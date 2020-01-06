package by.tms.action;

import by.tms.User;
import by.tms.reader.Read;
import by.tms.reader.Reader;
import by.tms.services.AuthService;
import by.tms.services.RegService;
import by.tms.writer.Write;
import by.tms.writer.Writer;

public class UserAction {
    public static User currentUser= null;
    private RegService regService = new RegService();
    private AuthService authService = new AuthService();
    private Writer write = new Write();
    private Reader read = new Read();

    void reg(){
        read.read("First of all doing a registration, please\n Enter a login: ");
        String s=write.write();
        read.read("Enter a password: ");
        String s1=write.write();
        User user = new User(s,s1);
        regService.createUser(user);
    }

    void auth(){
        read.read("Please enter a login: ");
        String s = write.write();
        read.read("Enter a password: ");
        String s1 = write.write();
        authService.auth(s,s1);
        authService.authCheck(s,s1);
    }
}
