package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student extends Human {

    private Double scholarship;

    public Student(String name, String surname, Integer age, String email, Double scholarship) {
        super(name, surname, age, email);
        this.scholarship = scholarship;
    }

    public String toString() {
        return getName()+" "+getSurname()+"\n"+getAge()+"\n"+getEmail()+"\n"+getScholarship()+"\n";
    }

}
