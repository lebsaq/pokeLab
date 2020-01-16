package moves;
import ru.ifmo.se.pokemon.*;

public class Screech extends StatusMove{
    public Screech(){
        super(Type.NORMAL, 0 ,85);
    }
    @Override
    public void applyOppEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, -2);
    }
}
