package org.scoula;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class CSVTest1 {
    public static void main(String[] args) {
        String filePath = "travel.csv"; // 프로젝트 루트에 있는 travel.csv

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;

            while ((line = reader.readNext()) != null) {
                // 배열을 쉼표로 연결해서 한 줄 출력
                System.out.println(String.join(",", line));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}