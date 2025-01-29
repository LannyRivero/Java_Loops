package dev.lanny.java_loop;

import java.util.List;
import java.util.ArrayList;

public class MultipicationTable {

    public List<String> generateTable(int n) {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            table.add(String.format("%d x %d = %d", n, i, n * i));
        }
        return table;
    }


    public List<String> printTable(int n) {
        
        List<String> table = generateTable(n);

        for (String row : table) {

            System.out.println(row);
        }
        return table;
    }

}

