package moves;
import ru.ifmo.se.pokemon.*;
public class Rest extends PhysicalMove{
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect sleep = new Effect().turns(2);
        Effect.sleep(p);
    }

}
