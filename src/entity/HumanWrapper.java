package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HumanWrapper implements Serializable {

    private static final long serialVersionUID = 1L;

    public List<Human> students = new ArrayList<>();
    public List<Human> teachers = new ArrayList<>();

    public List<Human> getStudentss() {
        return students;
    }

    public void setStudents(List<Human> students) {
        this.students = students;
    }

    public List<Human> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Human> teachers) {
        this.teachers = teachers;
    }
}
