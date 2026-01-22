package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    // =====================================================
    // TEST countExcellentStudents()
    // =====================================================

    @ParameterizedTest
    @MethodSource("provideScoresForExcellentCount")
    void testCountExcellentStudents(List<Double> scores, int expected) {
        assertEquals(expected, analyzer.countExcellentStudents(scores));
    }

    static Stream<Arguments> provideScoresForExcellentCount() {
        return Stream.of(
                // Bình thường: hợp lệ + không hợp lệ
                Arguments.of(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0), 2),

                // Toàn bộ hợp lệ
                Arguments.of(Arrays.asList(8.0, 9.0, 10.0), 3),

                // Toàn bộ không hợp lệ
                Arguments.of(Arrays.asList(-5.0, 11.0, 20.0), 0),

                // Biên sát 8.0
                Arguments.of(Arrays.asList(7.999, 8.0, 8.001), 2),

                // Biên 0 và 10
                Arguments.of(Arrays.asList(0.0, 10.0), 1),

                // Danh sách rỗng
                Arguments.of(Collections.emptyList(), 0)
        );
    }

    // =====================================================
    // TEST calculateValidAverage()
    // =====================================================

    @ParameterizedTest
    @MethodSource("provideScoresForAverage")
    void testCalculateValidAverage(List<Double> scores, double expected) {
        assertEquals(expected, analyzer.calculateValidAverage(scores), 0.01);
    }

    static Stream<Arguments> provideScoresForAverage() {
        return Stream.of(
                // Bình thường: hợp lệ + không hợp lệ
                Arguments.of(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0), 8.17),

                // Toàn bộ hợp lệ
                Arguments.of(Arrays.asList(6.0, 8.0, 10.0), 8.0),

                // Biên: toàn 0
                Arguments.of(Arrays.asList(0.0, 0.0, 0.0), 0.0),

                // Biên: toàn 10
                Arguments.of(Arrays.asList(10.0, 10.0), 10.0),

                // Toàn bộ không hợp lệ
                Arguments.of(Arrays.asList(-2.0, 12.0, 100.0), 0.0),

                // Floating point precision
                Arguments.of(Arrays.asList(8.333, 8.333, 8.334), 8.333),

                // Danh sách rỗng
                Arguments.of(Collections.emptyList(), 0.0)
        );
    }

    // =====================================================
    // TEST NULL (ngoại lệ)
    // =====================================================

    @Test
    void testNullList() {
        assertEquals(0, analyzer.countExcellentStudents(null));
        assertEquals(0.0, analyzer.calculateValidAverage(null));
    }
}
