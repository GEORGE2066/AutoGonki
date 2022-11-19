package Transport;

import Driver.Driver;
import Mechanic.Mechanik;
import Mechanic.Sponsor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Transport {
    private final String brand;
    private String model;
    private double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanik<?>> mechaniks = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume) {
//        this.color = "White";
//        this.maxSpeed = 220;
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
//        }
         if (model == null) {
             this.model = "default";
         } else {
             this.model = model;
         }
         if (engineVolume == 0) {
             this.engineVolume = 1.5;
         }else {
             this.engineVolume = engineVolume;
         }
//        if (productionCountry == null) {
//            this.productionCountry = "default";
//        } else {
//            this.productionCountry = productionCountry;
//        }
//        if (productionYear == 0) {
//            this.productionYear = 2000;
//        } else {
//            this.productionYear = productionYear;
//        }

        }


    }

    public abstract void startMoving();

    public abstract void stopMoving();
    public abstract void printType();
    public abstract boolean service();
    public abstract void repair();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void addCar(Mechanik<?> mechanik) {
        mechaniks.add(mechanik);
    }

    public void addDrivar(Driver<?> driver) {
        drivers.add(driver);
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    class SponsorList {

        Set<Transport> listTransport = new HashSet<>();
        //k
        public boolean addProduct(Transport transport) {
            if (!listTransport.add(transport)) {
                throw new RuntimeException("Этот спонсор уже есть в списке.");
            }
            return true;
        }
    }
}
