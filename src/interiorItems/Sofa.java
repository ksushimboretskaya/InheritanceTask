package interiorItems;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Sofa extends Furniture {
    private int numberOfSeats;

    public Sofa(String material, int numberOfSeats) {
        super(material);
        this.numberOfSeats = numberOfSeats;
    }
}