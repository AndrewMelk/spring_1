import com.test.spring.dao.CarDao;
import com.test.spring.dao.CarDaoImpl;
import com.test.spring.model.Car;
import com.test.spring.repository.CarRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

import static org.mockito.Mockito.doReturn;

//@RunWith(SpringJUnit4ClassRunner.class)
public class TestSpring {

    @InjectMocks
    CarDaoImpl carDao;

    @Mock
    CarRepo carRepo;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_1(){
        Car car =new Car();
        car.setId("asd");
        car.setManufacturer("aaaa");
        doReturn(Optional.of(car)).when(carRepo).findById("test_id");

        Car response = carDao.getById("test_id");

        System.out.println(response);


    }



}
