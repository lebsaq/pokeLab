package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;
public class TapuFini extends Pokemon {
    public TapuFini (String name, int level) {
        super(name, level);
        setStats(50, 75, 115, 95, 130, 85);
        setType(Type.WATER, Type.FAIRY);
        setMove(new AquaTail(), new Rest(), new AquaRing(), new Swagger());
    }
}