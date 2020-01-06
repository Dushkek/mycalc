package by.tms.action;

import by.tms.reader.Read;
import by.tms.reader.Reader;
import by.tms.validator.OperValidator;
import by.tms.writer.Write;
import by.tms.writer.Writer;

public class App {
    private Writer write = new Write();
    private Reader read = new Read();
    private UserAction userAction = new UserAction();

    public void run() {

        if (UserAction.currentUser == null) {
            read.read("Welcome");
        }

        String op;
        do {
            read.read("What do u want: register or authenticate? (reg||auth)");
            op = write.write();
            switch (op) {
                case "reg":
                    userAction.reg();
                    break;
                case "auth":
                    userAction.auth();
                    read.read("Hello " + UserAction.currentUser.getLogin());
                    break;
            }
        } while (OperValidator.validator(op));
    }
}
