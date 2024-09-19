package com.corndel.pixmate.drawings;

public class TriangleSandwich {
    public static void main(String[] args) {

        int height = 5;

        for (int i = 0; i <= height; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < i; j++) {
                line.append("*");

            }
            System.out.println(line);

        }
        for (int i = height - 1; i > 0; i--) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < i; j++) {
                line.append("*");
            }
            System.out.println(line);
        }


    }
}
