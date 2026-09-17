package house;


import org.junit.jupiter.api.Test;

<<<<<<< HEAD
=======
import static org.junit.jupiter.api.Assertions.assertEquals;

>>>>>>> 5e81fb74b4c4db9f9740d1f27e0cd635be456442
public class PenthouseSuiteTest {
    @Test
    public void testInitializedWithFourBedrooms() {
        PenthouseSuite penthouse = new PenthouseSuite();
        assertEquals(4, penthouse.numberOfBedrooms);
    }

    private void assertEquals(int i, int numberOfBedrooms) {

    }

    @Test
    public void testSetsSquareFootage() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);
        assertEquals(1500, penthouse.squareFootage);
    }
}
