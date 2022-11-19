import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.*;

import javax.swing.table.TableRowSorter;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car granta = new Car("Lada", "Granta", 1.9, BodyType.COUPE);
        Car audi = new Car("Audi", "A8", 2.3, BodyType.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3.2, BodyType.MINIVAN);
        Car kia = new Car("Kia", "Sportage", 2.0, BodyType.STATION_WAGON);
        Bus kamaz = new Bus("Камаз", "пассажирский", 4.0, Capacity.AVERAGE);
        Bus liaz = new Bus("Liaz", "K76", 3.5, Capacity.ESPECIALLY_SMALL);
        Bus karosa = new Bus("Karosa", "128756", 5.1, Capacity.AVERAGE);
        Bus pazik = new Bus("Paz", "Pazik", 2.3, Capacity.LARGE);
        Cargo iveko = new Cargo("Iveko", "IZ", 3.5, LiftingСapacity.N1);
        Cargo ford = new Cargo("Ford", "Transporter", 4.5, LiftingСapacity.N3);
        Cargo tesla = new Cargo("Tesla", "Myphic", 6.2, LiftingСapacity.N2);
        Cargo zil = new Cargo("Zil", "3151", 5.2, LiftingСapacity.N3);
        Driver vasya = new DriverB("VAsya", "B", 10, granta);
        Driver senna = new DriverC("Aaron Senna", "C", 25, tesla);
        Driver petryxa = new DriverD("Petryxa", "D", 5, pazik);

        List<Transport> transports = List.of(audi, bmw, kia, granta, kamaz, liaz, karosa, pazik, iveko, tesla);
//k
        System.out.println(vasya);
        System.out.println(petryxa);
        System.out.println(senna);
        granta.startMoving();
        granta.pitStop();
        granta.maxSpeed();
        granta.bestTimeCircle();
        System.out.println();
        tesla.startMoving();
        tesla.pitStop();
        tesla.maxSpeed();
        tesla.bestTimeCircle();
        System.out.println();
        pazik.startMoving();
        pazik.pitStop();
        pazik.maxSpeed();
        pazik.bestTimeCircle();
        System.out.println();
        granta.printType();
        iveko.printType();
        pazik.printType();
    }
}