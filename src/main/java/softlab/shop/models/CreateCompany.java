package softlab.shop.models;

import java.time.LocalDateTime;

public record CreateCompany(String name, Integer id,String countryId, Integer parentId) {

}
