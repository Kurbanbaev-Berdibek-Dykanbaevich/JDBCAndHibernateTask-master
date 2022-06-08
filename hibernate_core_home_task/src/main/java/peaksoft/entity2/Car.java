package peaksoft.entity2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.Model;

import javax.persistence.*;

@Entity
@Table(name="cars")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mark;

    private String color;

    @Column(name = "producing_country")
    private String producingСountry;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", producingСountry ='" + producingСountry + '\'' +
                '}';
    }
}
