package com.corndel.pixmate.drawings;

public class Diagonal {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder("*");

        for (int i = 0; i < 5; i++) {
            line.insert(0, " ");
            System.out.println(line);
        }

    }
}
