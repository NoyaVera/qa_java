import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
    public class LionTest {
    private final String sex;
    private final boolean hasMane;
    Feline feline = new Feline();

    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

        @Parameterized.Parameters
        public static Object[][] getLionManeData() {
            return new Object[][] {
                {"Самец", true},
                {"Самка", false},
            };
        }
        @Test
        public void hasMane() throws Exception {
            //arrange
            Lion lion = new Lion(sex, feline);
            //act
            boolean actualHasMane = lion.doesHaveMane();
            //assert
            assertEquals("Используйте допустимые значения пола животного - самей или самка", hasMane, actualHasMane);
        }
    }

