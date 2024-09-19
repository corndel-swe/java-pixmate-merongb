package com.corndel.pixmate.drawings;

public class Checkerboard {
    public static void  main(String[] args) {
        int height = 5;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            if (i % 2 == 0) {
                for (int j = 0; j < height; j++) {
                    line.append("* ");
                }
            } else {
                for (int j = 0; j < height - 1; j++) {
                    line.append(" *");
                }
            }
            System.out.println(line);
        }

    }
}
