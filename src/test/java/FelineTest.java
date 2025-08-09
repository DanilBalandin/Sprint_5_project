import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FelineTest {

    @Test
    public void getMeatCorrectListTest() throws Exception {
        Feline feline = Mockito.spy(new Feline());
        List<String> expectedListMeat = Arrays.asList("Животные", "Птицы", "Рыба");

        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedListMeat);

        List<String> actualListMeat = feline.eatMeat();

        assertEquals(expectedListMeat, actualListMeat, "Метод getMeat возвращает некорректное значение");
    }

    @Test
    public void getFamilyCorrectValueTest() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";

        String actualFamily = feline.getFamily();

        assertEquals(expectedFamily, actualFamily, "Метод getFamily возвращает некорректное значение");
    }

    @Test
    public void getKittensCorrectValueTest() {
        Feline feline = new Feline();
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();

        assertEquals(expectedKittens, actualKittens, "Метод getKittens возвращает некорректное значение");
    }

    @Test
    public void getKittensWithParametersTest() {
        Feline feline = new Feline();
        int expectedKittens = 10;

        int actualKittens = feline.getKittens(10);

        assertEquals(expectedKittens, actualKittens, "Метод getKittens c параметром возвращает некорректное значение");
    }
}