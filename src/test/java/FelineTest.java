import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    //arrange
    Feline feline = new Feline();

    @Test
    public void felineEatMeatTest() throws Exception{
        //act
        List<String> expectedFelineEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFelineEatMeat = feline.eatMeat();
        //assert
        assertEquals(expectedFelineEatMeat, actualFelineEatMeat);
    }
    @Test
    public void felineGetFamilyTest() {
        //act
        String actualFelineGetFamily = feline.getFamily();
        //assert
        assertEquals("Кошачьи", actualFelineGetFamily);
    }
    @Test
    public void felineGetKittensTest() {
        //act
        int actualFelineGetKittens = feline.getKittens();
        //assert
        assertEquals(1, actualFelineGetKittens);
    }
}
