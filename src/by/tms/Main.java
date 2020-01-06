package by.tms;

import by.tms.action.App;
import by.tms.application.ConsoleApp;
import by.tms.application.ConsoleApplication;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        ConsoleApplication consoleApp=new ConsoleApp();
        while (true) {
            app.run();
            consoleApp.run();
        }
//        A a=new C();
//        a.run();
    }
}
