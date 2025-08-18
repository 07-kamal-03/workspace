package OopsTasks.oopsTask1;

public abstract class Vehicle {
    private String brand;
    private double pricePerDay;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        if(pricePerDay < 0){
            System.out.println("Invalid price! Setting to 0.");
        }
        else{
            this.pricePerDay = pricePerDay;
        }
    }

    abstract double calculateRent(int days);

}

