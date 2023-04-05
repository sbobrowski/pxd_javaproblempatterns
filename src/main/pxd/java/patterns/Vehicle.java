package pxd.java.patterns;

public sealed interface Vehicle permits Plane, Boat, Car {

    public String getMovement();

}

final class Plane implements Vehicle {

    @Override
    public String getMovement() {
        return "A plane flies";
    }
}

final class Boat implements Vehicle {

    @Override
    public String getMovement() {
        return "A boat swims";
    }
}

