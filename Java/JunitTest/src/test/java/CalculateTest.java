import org.junit.*;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class CalculateTest {
    Calculate calculate = null;
    Add add;
    @AfterClass
    public static void AfterClassMethod(){
        System.out.println("After Class");
    }
    @After
    public void AfterTest(){
        System.out.println("After Test");
    }
    @BeforeClass
    public static void BeforeClassMethod(){
        System.out.println("Before Class");
    }
    @Before
    public void BeforeTest(){
    add = new Add(calculate);
        System.out.println("Before Test");}
    @Test(timeout = 100000) //Test case fails if exceeds the timeout
    public void Tester2(){
        int k= 100000;
        while(k!=0){k-=1;

        assertNotEquals(21,add.calc(20,2));
        assertNotNull("Some");
        assertNull(null);
        assertSame(12,add.calc(4,8));
        assertFalse(2==3);
        assertEquals(2,add.calc(0,2));};
        System.out.println("Test 2");

    }
    @Test(expected= ArithmeticException.class)
    public void Teset(){
        System.out.println("Expected");
        throw new ArithmeticException();
    }
    @Ignore
    public void Tester(){
        System.out.println("Test Succeded");
     assertEquals(20,add.calc(13,7));
    }
    @Test
    public void MockitoTest(){
        System.out.println("Mockito Test");
        Calculate mockobj = Mockito.mock(Calculate.class);
        Add add = new Add(mockobj);
        Mockito.when(mockobj.calc(2,4)).thenReturn(8);
        assertEquals(8,add.adder(2,4));

    }

}
