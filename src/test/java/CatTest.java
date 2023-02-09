import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void catGetSoundTest(){
        //arrange
        Cat cat = new Cat(feline);
        //act
        String actualCatGetSound = cat.getSound();
        //assert
        assertEquals("Мяу",actualCatGetSound);
    }
@Test
    public void catGetFoodTest() throws Exception {
    //arrange
    Cat cat = new Cat(feline);
    List<String> expectedCatGetFood = List.of("Животные", "Птицы", "Рыба");
    Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    //act
    List<String> actualCatGetFood = cat.getFood();
    //assert
    assertEquals(expectedCatGetFood, actualCatGetFood);
}
}