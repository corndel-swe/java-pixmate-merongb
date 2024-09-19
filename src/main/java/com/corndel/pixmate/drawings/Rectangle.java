package com.corndel.pixmate.drawings;

import com.github.tomaslanger.chalk.Chalk;

public class Rectangle {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder();

            int width = 10;
            int height = 2;

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    line.append("*");
                }
                line.append("\n");
            }
            System.out.println(line);
    }
}
