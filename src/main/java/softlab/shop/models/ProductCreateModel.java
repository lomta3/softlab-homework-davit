package softlab.shop.models;

public record ProductCreateModel(String ean,String name, Integer companyId, Integer countryId) {
}
