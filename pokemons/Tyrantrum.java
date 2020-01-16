package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;
public class Tyrantrum extends Tyrunt {
    public Tyrantrum (String name, int level) {
        super(name, level);
        setStats(82, 121, 119, 69, 59, 71);
        setMove(new Splash(), new Facade(), new Confide(), new EnergyBall());
    }
}