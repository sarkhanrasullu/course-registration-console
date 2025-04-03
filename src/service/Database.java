package service;

import entity.Human;
import entity.HumanWrapper;
import util.FileUtil;

import java.util.List;

public class Database {

    public static final HumanWrapper HUMAN_WRAPPER = (HumanWrapper) FileUtil.readObjectFromFile();
    public static final List<Human> STUDENTS = HUMAN_WRAPPER.students;
    public static final List<Human> TEACHERS = HUMAN_WRAPPER.teachers;
}
