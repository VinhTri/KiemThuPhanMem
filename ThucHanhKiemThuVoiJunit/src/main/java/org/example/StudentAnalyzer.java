package org.example;

import java.util.List;

public class StudentAnalyzer {

    /**
     * Đếm số sinh viên có điểm xuất sắc
     * Điều kiện:
     * - Điểm hợp lệ: 0 <= score <= 10
     * - Xuất sắc: score >= 8.0
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (Double score : scores) {
            if (score == null) continue;

            if (score >= 8.0 && score <= 10.0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Tính điểm trung bình các điểm hợp lệ
     * Điểm hợp lệ: 0 <= score <= 10
     * Nếu không có điểm hợp lệ → trả về 0.0
     */
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        int count = 0;

        for (Double score : scores) {
            if (score == null) continue;

            if (score >= 0.0 && score <= 10.0) {
                sum += score;
                count++;
            }
        }

        if (count == 0) {
            return 0.0;
        }

        return sum / count;
    }
}
