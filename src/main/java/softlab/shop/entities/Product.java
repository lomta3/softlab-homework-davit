package softlab.shop.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "products")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_sequence_gen")
    @SequenceGenerator(name = "products_seqvence_gen", sequenceName = "products_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "ean")
    private String ean;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "country_id")
    private Integer countryid;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}
