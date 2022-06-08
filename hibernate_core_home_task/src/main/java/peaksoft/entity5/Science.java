package peaksoft.entity5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.Model;

import javax.persistence.*;

@Entity
@Table(name="sciences")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Science extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String direction;
    private String scientist;

    @Override
    public String toString() {
        return "Science{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                ", scientist='" + scientist + '\'' +
                '}';
    }
}
