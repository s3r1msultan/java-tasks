package Cars.CommercialCarBody.EngineCapacity;

import javax.management.InvalidAttributeValueException;

public class HighCapacity extends Capacity {
    @Override
    public void setCapacity(float capacity) {
        if (capacity >= 4.2) {
            super.setCapacity(capacity);
        } else {
            try {
                throw new InvalidAttributeValueException("Please, enter the capacity more or equals to 4.2 liter");
            } catch (InvalidAttributeValueException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
