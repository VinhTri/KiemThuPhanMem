package org.example;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        List<Double> scores = new ArrayList<>();
        scores.add(9.0);
        scores.add(8.5);
        scores.add(7.0);
        scores.add(-1.0);   // dữ liệu sai
        scores.add(11.0);   // dữ liệu sai
        scores.add(10.0);

        int excellent = analyzer.countExcellentStudents(scores);
        double avg = analyzer.calculateValidAverage(scores);

        System.out.println("Số học sinh giỏi: " + excellent);
        System.out.println("Điểm trung bình hợp lệ: " + avg);
    }
}
