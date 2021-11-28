package buildings;

import interiorItems.Sofa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apartment extends HomeBuilding {
    public int floorNumber;
    public int apartmentNumber;
    private Sofa sofa;

    public Apartment(int numberOfFloors, String houseArea, int floorNumber, int apartmentNumber) {
        super(numberOfFloors, houseArea);
        this.apartmentNumber = apartmentNumber;
        this.floorNumber = floorNumber;
    }

    public void addSofaToTheApartment(Sofa sofa) {
        this.sofa = sofa;
    }
}