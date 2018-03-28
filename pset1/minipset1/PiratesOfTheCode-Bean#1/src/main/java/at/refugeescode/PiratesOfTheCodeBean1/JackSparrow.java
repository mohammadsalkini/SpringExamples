package at.refugeescode.PiratesOfTheCodeBean1;

import org.springframework.stereotype.Controller;

@Controller
public class JackSparrow {
    private Compass compass;

    public JackSparrow(Compass compass){
        this.compass = compass;
    }

    public String findCoin(){
        CursedCoin cursedCoin = compass.findCursedCoin();
        if (cursedCoin == null){
            return "Not found";
        }
        return "Found";
    }
}
