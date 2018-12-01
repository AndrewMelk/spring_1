
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

//@RunWith(SpringJUnit4ClassRunner.class)
public class TestSpring {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_1(){
        System.out.println("response");


    }



}
