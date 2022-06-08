package peaksoft.entity;

import lombok.*;
import peaksoft.Model;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Student extends Model {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String facult;
    private int age;

    @Override
    public String toString() {
        return "\nStudent" +
                "id " + id +
                ", name - " + name  +
                ", surname - " + surname +
                ", facult : " + facult  +
                ", age  " + age;
    }
}
