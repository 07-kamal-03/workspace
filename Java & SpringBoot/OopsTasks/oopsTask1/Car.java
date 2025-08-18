package OopsTasks.oopsTask1;

public class Car extends Vehicle{
    int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    double calculateRent(int days) {
        double rent;
        if(days>5){
           rent = days * getPricePerDay() + 50;
        }
        else{
            rent = days * getPricePerDay();
        }
        return rent;
    }
}
