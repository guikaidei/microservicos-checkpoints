package store.order;

import lombok.Builder;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.List;
import java.io.Serializable;


@Builder
@Accessors(fluent = true)
public record OrderOut(
        String id,
        LocalDateTime date,
        List<ItemOut> items,
        Double total
) implements Serializable {
}
