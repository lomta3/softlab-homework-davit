package softlab.shop.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "country")

public class Country {
    @Id
    private Integer id;

    @Column (name = "iso_code_2")
    private  String iso_code_2;

    @Column (name = "iso_code_3")
    private String iso_code_3;

    @Column(name = "name")
    private  String name;

    @Column(name = "name_geo")
    private String name_geo;
}
