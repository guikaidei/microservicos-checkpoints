package store.product;


import com.fasterxml.jackson.core.JsonToken;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Builder
@Data @Accessors(fluent = true)
public class Product {

    private String id;
    private String name;
    private Float price;
    private String unit;

}