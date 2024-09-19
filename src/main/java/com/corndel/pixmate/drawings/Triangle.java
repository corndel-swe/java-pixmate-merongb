package com.corndel.pixmate.drawings;

public class Triangle {
    public static void main(String[] args) {


        int height = 5;

        for (int i = 1; i <= height; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < i; j++) {
                line.append("*");
            }
            System.out.println(line);
        }
    }

}
