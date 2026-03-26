package com.todo;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Task {
    static AtomicInteger nextId = new AtomicInteger(1);
    
    int id;
    String title;
    LocalDate due;
    boolean completed;
    
    Task(String title, LocalDate due) {
        this.id = nextId.getAndIncrement();
        this.title = title;
        this.due = due;
        this.completed = false;
    }
}
