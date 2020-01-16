package moves;
import ru.ifmo.se.pokemon.*;
public class Facade extends PhysicalMove{
    public Facade(){
        super (Type.NORMAL, 70 , 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Status con = p.getCondition();
        if(con.equals(Status.BURN) || con.equals(Status.PARALYZE) || con.equals(Status.POISON)) {
            p.setMod(Stat.ATTACK, +2);
        }
    }
}

