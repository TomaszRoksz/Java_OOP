import org.junit.*;
import static org.junit.Assert.assertEquals;

public class StackTest{
        @Before
    @Test
    public void TestPushOne(){
        Stack sut=new Stack();
        String a ="asd";
        sut.push(a);
        assertEquals("Test push one", a, sut.getElement(0));
    }
@Test
    public void TestPop(){
        Stack sut=new Stack();
        sut.push("a");
        sut.push("b");
        sut.pop();
        assertEquals("does pop pops correct element", "a", sut.getElement(0));
    }

    @Test
    public void TestPopNull(){
        Stack sut=new Stack();
        assertEquals("does pop pops empty stack", "Empty Stack", sut.pop());
    }
@Test
    public void TestPopReturnedValue(){
        Stack sut=new Stack();
        sut.push("a");
        assertEquals("return popped el. value", "a", sut.pop()); //it has to return popped el. value
    }


    @Test
    public void TestPeek(){
        Stack sut=new Stack();
        sut.push("a");
        sut.peek();
        assertEquals("does peek peeks", "a", sut.peek());
    }
    @Test
    public void TestPeekEmpty(){
        Stack sut=new Stack();
        sut.peek();
        assertEquals("does peek peeks empty stack", "Empty Stack", sut.peek());
    }
}
