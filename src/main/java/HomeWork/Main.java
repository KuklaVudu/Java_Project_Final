package HomeWork;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Notebook Apple_MacBook_Air_M2 = new Notebook("Apple_MacBook_Air_M2", 10,
                256, "8", "macOS", "black");

        Notebook Lenovo_IdeaPad_Duet = new Notebook("Lenovo_IdeaPad_Duet", 14,
                500, "8", "Chrome OS", "white");

        Notebook Apple_MacBook_Air_M1 = new Notebook("Apple_MacBook_Air_M1", 13,
                256, "8", "macOS", "черный");

        Notebook Dell_XPS_13 = new Notebook("Dell_XPS_13", 13,
                1000, "16", "Windows 11", "черный");

        Notebook Acer_Swift_3 = new Notebook("Acer_Swift_3", 15,
                512, "16", "Windows 11", "белый");

        Notebook Samsung_Galaxy_Book2_360 = new Notebook("Samsung_Galaxy_Book2_360", 13,
                512, "16", "Windows 11",
                "белый");

        Notebook ASUS_ZenBook_13 = new Notebook("ASUS_ZenBook_13", 13,
                1000, "32", "Windows 11", "черный");


        Set<Notebook> noteBook = new HashSet<>();
        noteBook.add(Apple_MacBook_Air_M2);
        noteBook.add(Lenovo_IdeaPad_Duet);
        noteBook.add(Apple_MacBook_Air_M1);
        noteBook.add(Dell_XPS_13);
        noteBook.add(Acer_Swift_3);
        noteBook.add(Samsung_Galaxy_Book2_360);
        noteBook.add(ASUS_ZenBook_13);
        Notebook notebook = new Notebook();
        System.out.println(notebook.Filter(noteBook));
    }
}
