package lesson4;


import lesson4.Triangle.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void checkTriangleSquare() throws Exception {
        Assertions.assertEquals(2.904, Triangle.triangleSquare(2,3,4),0.001);

    }
    @Test
    void incorrectTriangle()throws Exception{
        Assertions.assertThrows(Exception.class,()->Triangle.triangleSquare(2,30,400));
        Assertions.assertThrows(Exception.class,()->Triangle.triangleSquare(-2,-3,-4));
    }

}
