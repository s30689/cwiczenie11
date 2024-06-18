import java.util.ArrayList;
public class Car implements Comparable {
    public String carName;
    public String carYear;

    public Car (String carName,String carYear){
        this.carName=carName;
        this.carYear=carYear;
    }






    @Override
    public int compareTo(Car car){
        return carYear.compareTo(car.carYear);
    }


    @Override
    public String toString() {
        return "Car: " + carName + "\n Year of Production: " + carYear;

    }
}
