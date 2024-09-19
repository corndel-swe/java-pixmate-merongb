package com.corndel.pixmate.drawings;

public class invertedTriangle {
    public static void main(String[] args) {

        int height = 5;

        for (int i = 5; i > 0; i--) {

            StringBuilder line = new StringBuilder();

            for (int k = 0; k < i; k++) {
                line.append("*");
            }
            System.out.println(line);
        }
    }


}
