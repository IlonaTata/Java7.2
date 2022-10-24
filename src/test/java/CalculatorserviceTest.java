import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.CalculatorService;

public class CalculatorserviceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")

    public void test(String value, int amount, boolean registered, int expected) {
        CalculatorService service = new CalculatorService();
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected,actual,value);
    }

}

