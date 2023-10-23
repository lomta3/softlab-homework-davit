package softlab.shop.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "company_sequens_generate")
    @SequenceGenerator(name ="company_sequens_generate",sequenceName = "companies_id_seq",allocationSize = 1)
    private Integer id;

    @Column(name = "parent_id")
    private Integer parentid;

    @Column(name = "country_id")
    private Integer countrid;

    @Column (name = "name")
    private  String name;

    @Column(name = "name_geo")
    private String nameGeo;

    @Column(name = "created_at")
    private LocalDateTime createdat;
}
