package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Human implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private Integer age;
    private String email;

}
