package edu.utsa.cs3443.fall2026demoproject;

public class Window {
    private final String title;
    private final String info;

    public Window(String title, String info) {
        this.title = title;
        this.info = info;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }
}
