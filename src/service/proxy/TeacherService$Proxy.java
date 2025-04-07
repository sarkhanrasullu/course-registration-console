package service.proxy;

import annotations.Saveable;
import entity.Human;
import entity.Student;
import entity.Teacher;
import service.Database;
import service.StudentService;
import service.TeacherService;

import static service.proxy.ProxyUtil.save;

public class TeacherService$Proxy extends TeacherService {

    private final TeacherService service;

    public TeacherService$Proxy(TeacherService service) {
        this.service = service;
    }

    @Saveable
    @Override
    public Teacher register() {
        Teacher teacher = this.service.register();

        save("register", TeacherService.class);
        return teacher;
    }

    @Override
    public void showAll() {
        this.service.showAll();
        save("showAll", TeacherService.class);
    }

    @Override
    public Human search() {
        Human search = this.service.search();
        save("search", TeacherService.class);
        return search;
    }

    @Saveable
    @Override
    public void delete() {
        this.service.delete();
        save("delete", TeacherService.class);
    }

    @Override
    public int showMenu() {
        int i = this.service.showMenu();
        save("showMenu", TeacherService.class);
        return i;
    }

    @Saveable
    @Override
    public void addStudentsToTeacher() {
        this.service.addStudentsToTeacher();
        save("addStudentsToTeacher", TeacherService.class);
    }
}
