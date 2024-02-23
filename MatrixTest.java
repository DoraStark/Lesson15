import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    private Matrix matrix;

    @BeforeEach
    public void setUp() {
        matrix = new Matrix();
    }

    @AfterEach
    public void tearDown() {
        matrix = null;
    }

    @Test
    void avgArray() {
        int[] testArray = {1, 2, 3, 4, 5};
        double expectedAverage = (1 + 2 + 3 + 4 + 5) / (double) testArray.length;
        assertEquals(expectedAverage, matrix.avgArray(testArray), 0.001);
    }

    @Test
    void isMatrixSquare() {
        int[][] nullMatrix = null;
        assertFalse(matrix.isMatrixSquare(nullMatrix));

        int[][] emptyMatrix = {};
        assertFalse(matrix.isMatrixSquare(emptyMatrix));

        int[][] nonSquareMatrix = {
                {1, 2, 3, 8},
                {4, 5, 6}
        };
        assertFalse(matrix.isMatrixSquare(nonSquareMatrix));

        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertTrue(matrix.isMatrixSquare(squareMatrix));
    }
}
