package service;
import entity.Alma;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class AbstractEducationService implements EducationService {
    protected final ArrayList<Alma> list;

    protected AbstractEducationService(ArrayList<Alma> list) {
        this.list = list;
    }

    @Override
    public void showAll() {
        for(int i=0; i<list.size();i++) {
            System.out.println(i+ ". "+list.get(i));
        }
    }

    @Override
    public Alma search() {
        System.out.println("Enter the email you want to search");
        String email = new Scanner(System.in).nextLine();

        for(int i=0; i<list.size();i++) {
            Alma alma = list.get(i);

            if (alma.getEmail().equalsIgnoreCase(email)) {
                System.out.println(alma);
                return alma;
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
