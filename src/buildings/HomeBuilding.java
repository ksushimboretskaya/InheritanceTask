package buildings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class HomeBuilding {
    public int numberOfFloors;
    public String houseArea;
}