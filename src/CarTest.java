import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testDefault(){
        Car car = new Car(0,0);
        assertEquals(0,car.positionx);
        assertEquals(0,car.positiony);
        assertEquals(120,car.width);
        assertEquals(35,car.height);
        assertEquals(5,car.speed);




    }



}