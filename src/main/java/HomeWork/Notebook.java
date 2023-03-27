package HomeWork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Notebook {
    private String model;
    private int diagonal;
    private int SSD;
    private String RAM;
    private String OS;
    private String color;

    public Notebook() {
    }

    public Notebook(String model, int diagonal, int SSD, String RAM, String OS, String color) {
        this.model = model;
        this.diagonal = diagonal;
        this.SSD = SSD;
        this.RAM = RAM;
        this.OS = OS;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getSSD() {
        return SSD;
    }

    public String getRAM() {
        return RAM;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }

    public Set<Notebook> Filter(Set<Notebook> notebooks) {
        Scanner scanner = new Scanner(System.in);
        Set<Notebook> listNotebook = new HashSet<>(notebooks);

        System.out.println("Выберите параметр для поиска ноутбука" +
                "\n1. Накопитель SSD\n2. Оперативная память (RAM)\n3. Операционная система (OS)\n4. Цвет");
        String choice = scanner.nextLine();

        for (int i = 0; i < choice.length(); i++) {
            if (1 == Character.getNumericValue(choice.charAt(i))) {
                System.out.println("Введите размер SSD в гб\nЕсть в наличии: 250,256,500,512,1000");
                String SSDisk = scanner.nextLine();
                int parseSSDisk = Integer.parseInt(SSDisk);
                for (Notebook temp : notebooks) {
                    if (parseSSDisk != temp.SSD) {
                        listNotebook.remove(temp);
                    }
                }
            }

            if (2 == Character.getNumericValue(choice.charAt(i))) {
                System.out.println("Введите размер оперативной памяти в гб\nЕсть в наличии: 8, 16, 32");
                String RAMemory = scanner.nextLine();
                for (Notebook temp : notebooks) {
                    if ((!RAMemory.equals(temp.RAM))) {
                        listNotebook.remove(temp);
                    }
                }
            }

            if (3 == Character.getNumericValue(choice.charAt(i))) {
                System.out.println("Введите название операционной системы\nЕсть в наличии: macOS, Chrome OS, Windows 11");
                String OSystem = scanner.nextLine();
                for (Notebook temp : notebooks) {
                    if ((!OSystem.equals(temp.OS))) {
                        listNotebook.remove(temp);
                    }
                }
            }

            if (4 == Character.getNumericValue(choice.charAt(i))) {
                System.out.println("Введите цвет ноутбука\nЕсть в наличии: белый, черный");
                String color = scanner.nextLine();
                for (Notebook temp : notebooks) {
                    if ((!color.equals(temp.color))) {
                        listNotebook.remove(temp);
                    }
                }
            }
        }
        return listNotebook;
    }

    @Override
    public String toString() {
        return "\nНоутбук  -  " + model + ",\ndiagonal - " + diagonal +
                ", \nSSD - " + SSD + ",\nRAM - " + RAM
                + ",\nOS - " + OS + ",\ncolor - " + color + "\n";
    }
}
