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
@Table(schema = "public", name = "countries")

public class Country {
    @Id
    @Column(name ="id")
    private Integer id;

    @Column (name = "iso_code_2")
    private  String isocode2;

    @Column (name = "iso_code_3")
    private String isocode3;

    @Column(name = "name")
    private  String name;

    @Column(name = "name_geo")
    private String namegeo;
}
