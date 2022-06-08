package peaksoft.entity4;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.Model;

import javax.persistence.*;

@Entity
@Table(name="cities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class City extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mayor;
    private int population;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mayor='" + mayor + '\'' +
                ", population=" + population +
                '}';
    }
}
