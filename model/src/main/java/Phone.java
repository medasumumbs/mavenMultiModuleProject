import java.math.BigDecimal;

public record Phone(
        String manufacturer,
        String model,
        BigDecimal price
) {
}
