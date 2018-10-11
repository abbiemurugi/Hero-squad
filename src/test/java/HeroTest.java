import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero myHero = new Hero("Super-Man, ultimate strength, kryptonite");
        assertEquals(true, myHero instanceof Hero);
    }

    @Test
    public void Hero_instantiatesWithDescription_String() {
        Hero myHero= new Hero("Super-Man, ultimate strength, kryptonite");
        assertEquals("Super-Man, ultimate strength, kryptonite", myHero.getDescription());
    }

    @Test
    public void HeroSquad_instantiatesCorrectly_true() {
        HeroSquad myHeroSquad = new HeroSquad("Avegers, 10, Human destruction");
        assertEquals(true, myHeroSquad instanceof HeroSquad);
    }

    @Test
    public void HeroSquad_instantiatesWithDescription_String() {
        HeroSquad myHeroSquad= new HeroSquad("Avegers, 10, Human destruction");
        assertEquals("", myHeroSquad.getDescription());
    }
}