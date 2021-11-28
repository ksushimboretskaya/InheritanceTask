package interiorItems;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Television extends ElectricalDevices {
    private String diagonal;

    public Television(int powerConsumption, String diagonal) {
        super(powerConsumption);
        this.diagonal = diagonal;
    }
}