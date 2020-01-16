package moves;
import ru.ifmo.se.pokemon.*;
public class AquaRing extends StatusMove {
    public AquaRing(){
        super(Type.WATER, 0 , 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.HP, (int) (1/16*p.getStat(Stat.HP)));
    }
}
