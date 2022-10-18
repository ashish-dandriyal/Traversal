import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Traverse2DArrayTest {

    @Test
    void verifyForRightInput() {
        String expectedSequence = "1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10";
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        String actualSequence = Traverse2DArray.spiralPrint(4, 4, arr);
        assertEquals(expectedSequence, actualSequence);
    }

    @Test
    void verifyForWrongInput() {
        String expectedSequence = "1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10";
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        String actualSequence = Traverse2DArray.spiralPrint(2, 2, arr);
        assertNotEquals(expectedSequence, actualSequence);
    }
}