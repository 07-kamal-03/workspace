package OopsTasks.oopsTask1;

public class Bike extends Vehicle {
    boolean helmetIncluded;

    public boolean isHelmetIncluded() {
        return helmetIncluded;
    }

    public void setHelmetIncluded(boolean helmetIncluded) {
        this.helmetIncluded = helmetIncluded;
    }

    @Override
    double calculateRent(int days) {
        if (!isHelmetIncluded()){
            return (days*getPricePerDay())-((days*getPricePerDay())*(0.05));
        }
        else {
            return days*getPricePerDay();
        }
    }
}
