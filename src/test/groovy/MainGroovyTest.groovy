import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

class MainGroovyTest {
    @Test
    void testCountElementsWithNullList() {

        int[] nullList = null

        Map<Integer, Integer> result = MainGroovy.countElements(nullList)

        assertEquals(Collections.emptyMap(), result)
    }

    @Test
    void testCountElementsWithNonNullList() {

        def list = [1, 3, 4, 5, 1, 5, 4]

        Map<Integer, Integer> result = MainGroovy.countElements(list)

        Map<Integer, Integer> expectedResult = new HashMap<>()
        expectedResult.put(1, 2)
        expectedResult.put(3, 1)
        expectedResult.put(4, 2)
        expectedResult.put(5, 2)

        assertEquals(expectedResult, result)
    }
}
