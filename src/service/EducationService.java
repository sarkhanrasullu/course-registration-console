package service;
import entity.Alma;
import java.util.Scanner;

public interface EducationService {
    Alma register();

    void showAll();

    Alma search();

    void delete();

    int showMenu();

    default void executeSelectedMenu(int selectedMenu) {
        switch (selectedMenu) {
            case 1-> register();
            case 2-> delete();
            case 3-> search();
            case 4-> showAll();
        }
    }

    default void chooseAndExecuteSelectedMenu() {
        int selectedMenu = showMenu();
        executeSelectedMenu(selectedMenu);
    }

    static EducationService chooseService() {
        System.out.println("Please enter the option:\n"+
                "1. Student\n"+
                "2. Teacher\n"+
                "3. Exit");

        int index = new Scanner(System.in).nextInt();
        if(index==1) {
            return new StudentService();
        } else if(index==2) {
            return new TeacherService();
        } else if(index==3) {
            System.out.println("Exited");
            System.exit(1);
        }
        return null;
    }
}
