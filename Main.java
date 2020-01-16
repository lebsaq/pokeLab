import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
	Battle b = new Battle();
        b.addAlly(new Horsea("Михаил", 1));
        b.addAlly(new Kingdra("Лёха", 2));
        b.addAlly(new Seadra("Васёк", 1));
        b.addFoe(new TapuFini("Ваня", 7));
        b.addFoe(new Tyrantrum("Гоша", 6));
        b.addFoe(new Tyrunt("Дмитрий", 6));
        b.go();
    }
}
