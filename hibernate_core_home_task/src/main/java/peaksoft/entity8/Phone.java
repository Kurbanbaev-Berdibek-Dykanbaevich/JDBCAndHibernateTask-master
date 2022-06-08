package peaksoft.entity8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.Model;

import javax.persistence.*;

@Entity
@Table(name="phones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Phone extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String product;
    private Double price;

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
