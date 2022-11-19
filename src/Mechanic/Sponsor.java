package Mechanic;

import java.util.HashSet;
import java.util.Set;

public class Sponsor {
    private final String name;
    private final int amout;

    public Sponsor(String name, int amout) {
        this.name = name;
        this.amout = amout;
    }
    //k
    public String getName() {
        return name;
    }

    public int getAmout() {
        return amout;
    }

    public void toSponsorRace() {
        System.out.printf("Спонсор %s проспонсировал заезд на %s", name, amout);
    }
}

class SponsorList {

    Set<Sponsor> listSponsor = new HashSet<>();

    public boolean addProduct(Sponsor sponsor) {
        if (!listSponsor.add(sponsor)) {
            throw new RuntimeException("Этот спонсор уже есть в списке.");
        }
        return true;//k
    }
}
