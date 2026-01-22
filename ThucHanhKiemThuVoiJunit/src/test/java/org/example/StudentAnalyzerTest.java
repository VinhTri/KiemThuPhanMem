package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    void testEmptyList() {
        List<Double> scores = new ArrayList<>();

        assertEquals(0, analyzer.countExcellentStudents(scores));
        assertEquals(0.0, analyzer.calculateValidAverage(scores));
    }
}
