package com.company.Tasssk8.university.HW_Task_8.Task_2;

import com.company.Tasssk8.university.HW_Task_8.SortEnum;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LengthSortingAlgorithm f = new LengthSortingAlgorithm();
        f.startFrequency(new File("src\\main\\java\\com\\company\\Tasssk8\\university\\HW_Task_8\\File_To_Task_2.txt"), SortEnum.DESC);
        f.printFrequency();
    }
}
