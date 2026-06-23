import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10,12,14})
    void isEven(int number) {
        //Arange
        Number n = new Number();

        //Act
        boolean res=n.isEven(number);

        //Assert
        assertEquals(true,res);

    }
}