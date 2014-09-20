/**
 * Created by Zafar Mahmudov on 20.09.2014.
 */
import org.junit.Test;

public class Testtriangle {
    @Test
    public void testTr() {
        Rtriangle res = RtriangleProvider.getRtriangle();
        double a_length = Math.sqrt((res.getApexX1() - res.getApexX2()) * (res.getApexX1() - res.getApexX2()) + (res.getApexY1() - res.getApexY2()) * (res.getApexY1() - res.getApexY2()));
        double b_length = Math.sqrt((res.getApexX1() - res.getApexX3()) * (res.getApexX1() - res.getApexX3()) + (res.getApexY1() - res.getApexY3()) * (res.getApexY1() - res.getApexY3()));
        double c_length = Math.sqrt((res.getApexX3() - res.getApexX2()) * (res.getApexX3() - res.getApexX2()) + (res.getApexY3() - res.getApexY2()) * (res.getApexY3() - res.getApexY2()));

        if (a_length + b_length > c_length && a_length + c_length > b_length && b_length + c_length > a_length) {
            if (a_length * a_length + b_length * b_length != c_length * c_length &&
                    a_length * a_length + c_length * c_length != b_length * b_length &&
                    b_length * b_length + c_length * c_length != a_length * a_length) {
                System.out.println("Test failed");
            }
        } else {
            System.out.println("Test failed");
        }
    }
}
