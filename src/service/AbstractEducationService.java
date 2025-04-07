package service;
import entity.Human;
import entity.HumanWrapper;
import util.FileUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AbstractEducationService implements EducationService {

    protected final List<Human> list;

    public AbstractEducationService(List<Human> list) {
        this.list = list;
    }

    @Override
    public void showAll() {
        for(int i=0; i<list.size();i++) {
            System.out.println(i+ ". "+list.get(i));
        }
    }

    @Override
    public Human search() {
        System.out.println("Enter the email you want to search");
        String email = new Scanner(System.in).nextLine();

        for(int i=0; i<list.size();i++) {
            Human human = list.get(i);

            if (human.getEmail().equalsIgnoreCase(email)) {
                System.out.println(human);
                return human;
            }
        }
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Who do you want to remove from the list?");
        showAll();
        int index = new Scanner(System.in).nextInt();
        list.remove(index);
        System.out.println("Deleted ✔ \n");
        FileUtil.writeObjectToFile(Database.HUMAN_WRAPPER);
    }

    @Override
    public int showMenu() {
        System.out.println("Please enter the operation:\n" +
                "1. Register\n"+
                "2. Delete\n"+
                "3. Search\n"+
                "4. Show all\n");

        return new Scanner(System.in).nextInt();
    }

}
