package lab3.domain.iterator.intf;

import lab3.domain.models.intf.Vehicle;

public interface VehicleIterator {
    Vehicle getNext();
    Vehicle getPrevious();
    int getCurrentPosition();
    Vehicle getCurrent();
    boolean hasMore();
    void reset();
}
