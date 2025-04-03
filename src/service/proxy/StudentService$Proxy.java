package service.proxy;

import entity.Student;
import service.Database;
import service.StudentService;
import util.FileUtil;

public class StudentService$Proxy extends StudentService {

    private final StudentService service;

    public StudentService$Proxy(StudentService service) {
        this.service = service;
    }

    public Student register() {
        Student student = this.service.register();
        FileUtil.writeObjectToFile(Database.HUMAN_WRAPPER);

        return student;
    }
}
