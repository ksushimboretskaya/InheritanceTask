package buildings;

import interiorItems.Bed;
import interiorItems.Television;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VacationHome extends HomeBuilding {
    private int landArea;
    private Bed bed;
    private Television television;

    public VacationHome(int numberOfFloors, String houseArea, int landArea) {
        super(numberOfFloors, houseArea);
        this.landArea = landArea;
    }

    public void addBedToTheHome(Bed bed) {
        this.bed = bed;
    }

    public void addTelevisionToTheHome(Television television) {
        this.television = television;
    }
}