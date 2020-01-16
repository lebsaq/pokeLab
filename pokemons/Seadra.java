package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;
public class Seadra extends Horsea {
    public Seadra (String name, int level) {
        super(name, level);
        setStats(55, 65, 95, 95, 45, 85);
        setMove(new Confide(), new Swagger(), new IceBeam());
    }
}