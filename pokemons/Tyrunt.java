package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;
public class Tyrunt extends Pokemon {
    public Tyrunt (String name, int level) {
        super(name, level);
        setStats(58, 89, 77, 45, 45, 48);
        setType(Type.ROCK, Type.DRAGON);
        setMove(new Splash(), new Facade(), new Confide());
    }
}