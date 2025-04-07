package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HumanWrapper implements Serializable {

    private static final long serialVersionUID = 1L;

    public List<Human> students = new ArrayList<>();
    public List<Human> teachers = new ArrayList<>();

}
