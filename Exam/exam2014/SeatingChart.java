package exam2014;

import java.util.*;

public class SeatingChart {

    private Student seat[][];

    public SeatingChart(List<Student> studentList, int rows, int cols) {

        seat = new Student[rows][cols];
        int seatCount = 0;
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                if (seatCount <  studentList.size()) {
                    seat[r][c] = studentList.get(seatCount);
                    seatCount++;
                }
                else seat[r][c] = null;
            }
        }

    }

    public int removeAbsentStudents(int allowedAbsences) {

        int absentCount = 0;
        for (int r = 0; r < seat.length; r++) {
            for (int c = 0; c < seat[r].length; c++) {
                if (seat[r][c] != null && seat[r][c].getAbsenceCount() > allowedAbsences) {
                    seat[r][c] = null;
                    absentCount++;
                }
            }
        }

        return absentCount;

    }

}
