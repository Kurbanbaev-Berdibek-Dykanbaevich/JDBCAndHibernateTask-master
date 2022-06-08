package peaksoft.entity10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.Model;

import javax.persistence.*;

@Entity
@Table(name="footbal_clubs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FootballClub extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "club_name")
    private String clubName;
    private String trainer;
    private String country;

    @Override
    public String toString() {
        return "FootballClub{" +
                "id=" + id +
                ", clubName='" + clubName + '\'' +
                ", trainer='" + trainer + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
