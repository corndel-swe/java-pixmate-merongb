package com.corndel.pixmate.drawings;

public class InvertedDiagonal {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder("     *");

        for (int i = 5; i > 0; i--) {
            System.out.println(line);
            line.deleteCharAt(0);
        }

    }
}
