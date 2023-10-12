package softlab.shop.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "company")

public class Company {
    @Id
    private Integer id;

    @Column(name = "perent_id")
    private Integer parent_id;

    @Column(name = "country_id")
    private Integer country_id;

    @Column (name = "name")
    private  String name;

    @Column(name = "name_geo")
    private String name_geo;

    @Column(name = "created_at")
    private LocalDateTime created_at;
}
