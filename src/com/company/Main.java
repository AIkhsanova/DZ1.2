package com.company;

public class Main {

    public static void main(String[] args) {
        String num = "89917257877";
        checkNUM(num);
    }

    public static void checkNUM(String num) {
        String err = "";
        if (num.contains("+7")) {
            num = num.replace("+7", "8");
            err = err + "Замена +7 на 8;";
        }


        if (num.contains(" ") || num.contains("(") || num.contains(")")) {
            num = num.replace(" ", "");
            num = num.replace("(", "");
            num = num.replace(")", "");
            err = err + "Удалены пробелы и скобки;";
        }

        if (num.length()== 11) {
            if (num.contains("+")) {
                System.out.println("Введен некорректный номер");
            } else {
                System.out.println(num);
                if (err.isEmpty()) {
                    System.out.println("Не было изменений");
                } else {
                    System.out.println(err);
                }
            }
        } else {
            System.out.println("Введен некорректный номер");
            System.out.println(err);
        }

    }
}