package algorithms.HourGlassSum;

import org.junit.jupiter.api.Test;

import static com.tasks.algorithms.HourGlassSum.HourGlassSum.hourglassSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HourGlassSumTest {
    @Test
    public void sanity() {
        int[][] arr = {
                {-9, -9, -9,  1, 1, 1},
                {0, -9,  0,  4, 3, 2 },
                {-9, -9, -9,  1, 2, 3},
                {0,  0,  8,  6, 6, 0},
                {0,  0,  0, -2, 0, 0},
                {0,  0,  1,  2, 4, 0}
        };
        assertEquals(28, hourglassSum(arr));
    }
}
