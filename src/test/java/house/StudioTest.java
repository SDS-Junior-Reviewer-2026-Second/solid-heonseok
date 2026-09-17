package house;


import org.junit.jupiter.api.Test;

<<<<<<< HEAD
=======
import static org.junit.jupiter.api.Assertions.assertEquals;

>>>>>>> 5e81fb74b4c4db9f9740d1f27e0cd635be456442
public class StudioTest {
    @Test
    public void testInitializedWithZeroBedrooms() {
        Studio studio = new Studio();
        assertEquals(0, studio.numberOfBedrooms);
    }

    private void assertEquals(int i, int numberOfBedrooms) {

    }

    @Test
    public void testSetSquareFootage() {
        Studio studio = new Studio();
        studio.setSquareFootage(600);
        assertEquals(600, studio.squareFootage);
    }
}
