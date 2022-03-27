package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private int loans;
    private String type;
    private String title;

    private ArrayList<LoanItem> items = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    void go() {
        System.out.print("How many loan items do you want to register? ");
        loans = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i < loans + 1; i++) {
            System.out.println("ITEM no. " + i);
            System.out.print("Type (b or v): ");
            type = scan.nextLine();
            System.out.print("Title: ");
            title = scan.nextLine();
            addItem();
        }
        print();
    }

    void addItem() {
        switch (type) {
            case "b", "book" -> items.add(new Book("Book", title));
            case "v", "video" -> items.add(new Video("video", title));
        }
    }

    void print() {
        String list = "";
        for (int i = 0; i < items.size(); i++) {
            list += items.get(i).getTitle();
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
	new Main().go();
    }
}
