package dev.lanny.java_loop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MultipicationTableTest {

    @Test
    void testGenerateTable() {

        MultipicationTable table = new MultipicationTable();

        List<String> result = table.generateTable(5);

        assertEquals(10, result.size());
        assertEquals("5 x 1 = 5", result.get(0));
        assertEquals("5 x 10 = 50", result.get(9));

    }

    @Test
    void testPrintTable() {
        MultipicationTable table = new MultipicationTable();

        List<String> result = table.printTable(5);
        List<String> expectedOuput = List.of(
                "5 x 1 = 5",
                "5 x 2 = 10",
                "5 x 3 = 15",
                "5 x 4 = 20",
                "5 x 5 = 25",
                "5 x 6 = 30",
                "5 x 7 = 35",
                "5 x 8 = 40",
                "5 x 9 = 45",
                "5 x 10 = 50");
        assertEquals(expectedOuput, result);
    }

}
