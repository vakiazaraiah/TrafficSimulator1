import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotorbikeTest {
    @Test
    void testDefault(){
        Motorbike motorbike = new Motorbike(0,0);
        assertEquals(0,motorbike.positionx);
        assertEquals(0,motorbike.positiony);
        assertEquals(60,motorbike.width);
        assertEquals(12,motorbike.height);
        assertEquals(6,motorbike.speed);




    }



}