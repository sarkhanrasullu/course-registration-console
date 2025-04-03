package entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Human2 implements Serializable {

    public String name;

    private String surname;
    public void foo() {
        System.out.println("hi");
    }
}
