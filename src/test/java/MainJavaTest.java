import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class MainJavaTest {

    @Test
    public void testSimpleList() {
        Map<Integer, Integer> expectedCounts = Stream.of(1, 2, 3)
                .collect(Collectors.toMap(x -> x, x -> 1));
        Map<Integer, Integer> actualCounts = MainJava.countElements(new int[]{1, 2, 3});

        assertEquals(expectedCounts, actualCounts);
    }

    @Test
    public void testDuplicates() {
        Map<Integer, Integer> expectedCounts = new HashMap<>();
        expectedCounts.put(1, 2);
        expectedCounts.put(2, 1);
        expectedCounts.put(3, 1);
        Map<Integer, Integer> actualCounts = MainJava.countElements(new int[]{1, 1, 2, 3});

        assertEquals(expectedCounts, actualCounts);
    }
}