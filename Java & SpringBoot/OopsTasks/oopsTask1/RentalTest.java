package OopsTasks.oopsTask1;

public class RentalTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("BMW");
        car.setPricePerDay(150);
        car.setNumberOfSeats(4);

        Bike bike = new Bike();
        bike.setBrand("Ninja");
        bike.setPricePerDay(50);
        bike.setHelmetIncluded(false);

        Vehicle []vehicles = {car, bike};
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle.getClass().getSimpleName()+": "+vehicle.getBrand());
            double rent = vehicle.calculateRent(7);
            System.out.println("Rent: "+ rent);
        }
    }
}
