import org.junit.*;
import static org.junit.Assert.assertEquals;
public class ONPTest {
    @Before

    @Test
    public void CalculateTest() {
        ONP sut = new ONP();
        Stack onp = new Stack();
        String a = "1 1 +";
        String b = "1 1 -";
        String c = "2 1 *";
        String d = "1 1 2 +";
        //String e = "12 2 3 4 × 10 5 / + × +";
        String e = "12 2 3 + +";


        assertEquals ("Checks if calculating is added correctly","2", sut.calculate(a));
        assertEquals ("Checks if calculating is minused correctly","0", sut.calculate(b));
        assertEquals ("Checks if calculating is mulitplied correctly","2", sut.calculate(c));
        assertEquals ("Checks if calculating is splitted correctly","Incorrect notation.", sut.calculate(d));
        assertEquals ("Checks if calculating is done correctly","17", sut.calculate(e));




    }
}
