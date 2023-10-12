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
@Table(schema = "public", name = "products")

public class Products {
    @Id
    private Integer id;

    @Column(name = "ean")
    private String ean;

    @Column(name = "company_id")
    private Integer company_id;

    @Column(name = "county_id")
    private String country_id;

    @Column(name = "description")
    private String description;
}
