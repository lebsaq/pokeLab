package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;
public class Kingdra extends Horsea {
    public Kingdra (String name, int level) {
        super(name, level);
        setStats(75, 95, 95, 95, 95, 85);
        addType(Type.DRAGON);
        setMove(new Confide(), new Swagger(), new IceBeam(), new Screech());
    }
}