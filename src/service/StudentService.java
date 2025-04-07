package service;
import entity.Human;
import entity.Student;

import java.util.Scanner;

public class StudentService extends AbstractEducationService {

    private StudentService() {
        super(Database.HUMAN_WRAPPER.students);
    }

    private static StudentService instance;

    @Override
    public Student register() {
        System.out.println("Enter student's name");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Enter student's surname");
        String surname = new Scanner(System.in).nextLine();

        System.out.println("Enter student's age");
        int age = new Scanner(System.in).nextInt();

        System.out.println("Enter student's email");
        String email = new Scanner(System.in).nextLine();

        System.out.println("Enter scholarship");
        Double scholarship = new Scanner(System.in).nextDouble();

        Student student = new Student(name, surname, age, email, scholarship);

        list.add(student);

        return student;
    }

    public static StudentService instance(boolean isSave) {
        if(instance==null) {
            if(isSave) {
                instance = new StudentService$Proxy(new StudentService());
            }else {
                instance = new StudentService();
            }
        }

        return instance;
    }

    private static class StudentService$Proxy extends StudentService {

        private final StudentService service;

        public StudentService$Proxy(StudentService service) {
            this.service = service;
        }

        @Override
        public Student register() {
            Student student = this.service.register();
            Database.save();

            return student;
        }

        @Override
        public void showAll() {
            this.service.showAll();
        }

        @Override
        public Human search() {
            return this.service.search();
        }

        @Override
        public void delete() {
            this.service.delete();

            Database.save();
        }

        @Override
        public int showMenu() {
            return this.service.showMenu();
        }
    }

}