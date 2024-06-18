import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars= new ArrayList<>();
        Car car1= new Car("Honda Civic","1999");
        Car car2= new Car("Lexus IS200","2000");
        Car car3= new Car("BMW E36","1997");
        Car car4= new Car("Ferrari Enzo","2006");
        Car car5= new Car("Toyota Prius","2015");
        Car car6= new Car("BMW M5","2022");
        Car car7= new Car("Audi A4","2007");
        Car car8= new Car("Fiat Punto","2005");
        Car car9= new Car("Ford T","1908");
        Car car10= new Car("Seat Ibiza","2002");


        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);


        //Szybsza metoda
       // cars.sort((a,b) -> a.compareTo(b));


        //Chyba tak powinno byc programowo ;)
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.compareTo(o2);
            }
        });

        

        for(int i = 0; i < cars.size(); i++) {
           System.out.println(cars.get(i));
        }


    }}
