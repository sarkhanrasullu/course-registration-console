package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Teacher extends Human {

    private Double salary;
    private final ArrayList<Student> students = new ArrayList<>();

    public Teacher(String name, String surname, Integer age, String email, Double salary) {
        super(name, surname, age, email);
        this.salary = salary;
    }

    public String toString() {
        String str = "name:"+getName()+"\n"+
                "surname:"+getSurname()+"\n"+
                "age:"+getAge()+"\n"+
                "email:"+getEmail()+"\n"+
                "salary:"+getSalary()+"\n";

        str += "Students: \n";

        ArrayList<Student> list = getStudents();
        for(int i=0; i<list.size();i++) {
            Student student = list.get(i);
            str += student.getName() + " " + student.getSurname() + "\n";
        }

        return str;
    }
}
