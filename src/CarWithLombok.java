import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data

@AllArgsConstructor

@EqualsAndHashCode(onlyExplicitlyIncluded = true)


@ToString(exclude = "quantity")
public class CarWithLombok {

    private String model;

    @EqualsAndHashCode.Include
    private String brand;

    private int year;
    private int price;
    private String color;
    private int quantity;
}