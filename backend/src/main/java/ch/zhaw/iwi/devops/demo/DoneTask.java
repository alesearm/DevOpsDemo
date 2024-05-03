package ch.zhaw.iwi.devops.demo;

import java.time.LocalDate;

public class DoneTask {
    private int id;
    private String title;
    private String description;
    private LocalDate completedOn;  // Datum des Abschlusses

    public DoneTask() {
    }

    public DoneTask(int id, String title, String description, LocalDate completedOn) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completedOn = completedOn;
    }

    // Getter und Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCompletedOn() {
        return completedOn;
    }

    public void setCompletedOn(LocalDate completedOn) {
        this.completedOn = completedOn;
    }
}
