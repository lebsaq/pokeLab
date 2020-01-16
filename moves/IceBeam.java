package moves;
        import ru.ifmo.se.pokemon.*;
public class IceBeam extends StatusMove {
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect fr = new Effect().chance(0.5).condition(Status.FREEZE);
        p.setCondition(fr);
    }
}