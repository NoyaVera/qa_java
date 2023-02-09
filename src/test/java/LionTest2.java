import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionTest2 {
@Mock
Feline feline;

    @Test
    public void lionGetKittens() throws Exception {
        //arrange
        Lion lion = new Lion("Самец", feline);
        //act
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedGetKittens = 1;
        int actualGetKittens = lion.getKittens();
        //assert
        assertEquals(expectedGetKittens,actualGetKittens);
        }
        @Test
    public void lionGetFood() throws Exception{
            //arrange
            Lion lion = new Lion("Самец", feline);
            //act
            Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> expectedLionGetFood = List.of("Животные", "Птицы", "Рыба");
            List<String> actualLionGetFood = lion.getFood();
            //assert
            assertEquals(expectedLionGetFood, actualLionGetFood);
        }
}
