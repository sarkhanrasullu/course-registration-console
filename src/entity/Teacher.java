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
        return getName()+" "+getSurname()+"\n"+getAge()+"\n"+getEmail()+"\n"+getStudents()+ "\n" +getSalary()+"\n";
    }
}
