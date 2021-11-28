package interiorItems;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bed extends Furniture {
    private String numberOfBerths;

    public Bed(String material, String numberOfBerths) {
        super(material);
        this.numberOfBerths = numberOfBerths;
    }
}