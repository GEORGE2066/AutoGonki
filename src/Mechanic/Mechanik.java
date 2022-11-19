package Mechanic;

import Driver.Driver;
import Transport.Transport;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mechanik <T extends Transport> {
    private final String name;
    private final String surname;//k
    private final String company;

    public Mechanik(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }



    //getter`s setter`s


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }
}

class MechanikList {

    Set<Mechanik> listMechanic = new HashSet<>();

    public boolean addProduct(Mechanik mechanik) {
        if (!listMechanic.add(mechanik)) {
            throw new RuntimeException("Этот Механик уже есть в списке.");
        }
        return true;//k
    }
}
