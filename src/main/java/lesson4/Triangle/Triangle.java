package lesson4.Triangle;

public class Triangle {
    public static double triangleSquare(double a, double b, double c) throws Exception {
        if (a < (b + c) & b < (a + c) & c < (a + b)) {
            double p = (a + b + c) / 2;
            return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else if (a<=0 ||b<=0 ||c<=0) {
            throw new TriangleExeption("одна из сторон меньше нуля");

        }
        else {
            throw new Exception("не верные параметры");
        }
    }
}
