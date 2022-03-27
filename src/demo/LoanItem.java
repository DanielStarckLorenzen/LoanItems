package demo;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class LoanItem {

    private String title;
    private String type;

    public LoanItem(String type, String title) {
        this.type = type;
        this.title = title;
    }

    String getTitle() {
        return title;
    }

}
