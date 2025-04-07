package service.proxy;

import entity.Human;
import entity.Student;
import service.StudentService;

import static service.proxy.ProxyUtil.save;

public class StudentService$Proxy extends StudentService {

    private final StudentService service;

    public StudentService$Proxy(StudentService service) {
        this.service = service;
    }

    @Override
    public Student register() {
        Student student = this.service.register();
        save("register", StudentService.class);

        return student;
    }

    @Override
    public void showAll() {
        this.service.showAll();
        save("showAll", StudentService.class);
    }

    @Override
    public Human search() {
        Human search = this.service.search();
        save("search", StudentService.class);
        return search;
    }

    @Override
    public void delete() {
        this.service.delete();
        save("delete", StudentService.class);
    }

    @Override
    public int showMenu() {
        int i = this.service.showMenu();
        save("showMenu", StudentService.class);
        return i;
    }

}
