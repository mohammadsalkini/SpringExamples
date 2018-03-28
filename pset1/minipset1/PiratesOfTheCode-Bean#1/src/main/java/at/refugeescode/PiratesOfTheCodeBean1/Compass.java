package at.refugeescode.PiratesOfTheCodeBean1;

import org.springframework.stereotype.Service;

@Service
public class Compass {

    private CursedCoin cursedCoin;

    public  Compass(CursedCoin cursedCoin){
        this.cursedCoin = cursedCoin;
    }

    public CursedCoin findCursedCoin() {
        return cursedCoin;
    }
}
