package peaksoft.entity6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.Model;

import javax.persistence.*;

@Entity
@Table(name="computers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Computer extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mark;
    private Double price;

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", price=" + price +
                '}';
    }
}
