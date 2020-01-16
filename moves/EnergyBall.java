package moves;
import ru.ifmo.se.pokemon.*;
public class EnergyBall extends SpecialMove {
    public EnergyBall(){
        super(Type.GRASS, 90,100);
    }
    @Override
    protected void applyOppEffects (Pokemon p){
        Effect sa = new Effect().chance(0.1).stat(Stat.SPECIAL_ATTACK, -1);
        p.setCondition(sa);
    }
}
