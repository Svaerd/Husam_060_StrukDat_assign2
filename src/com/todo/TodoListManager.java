package com.todo;

public class TodoListManager {
  List<Task> task_list = new ArrayList(); // all tasks
  Scanner sc = new Scanner(System.in);
  int count = 0;

  // add new task
  void add(Task t) {
    task_list.add(t);
    System.out.println("added: " + t.title);
  }

  void listAll() { // show all tasks
    if (task_list.isEmpty()) {
      System.out.println("nothing here yet");
      return;
    }
    System.out.println("\nAll Tasks:");
    for (int i = 0; i < task_list.size(); i++) {
      Task t = task_list.get(i);
      String mark = t.completed ? "x" : " ";
      System.out.println("[" + mark + "] " + t.id + ". " + t.title + " | " + t.due);
    }
  }

  void done(int id) {
    for (Task t : task_list) {
      if (t.id == id) {
        t.completed = true;
        System.out.println("marked: " + t.title);
        return;
      }
    }
    System.out.println("id not found");
  }

  void del(int id) {
    task_list.removeIf(t -> t.id == id);
    System.out.println("deleted");
  }

  void showPending() { // pending tasks
    int pending_count = 0;
    System.out.println("\nPending:");
    for (Task t : task_list) {
      if (t.completed == false) {
        System.out.println("- " + t.title);
        pending_count++;
      }
    }
    if (pending_count == 0)
      System.out.println("none!");
  }

  void start() { // main loop
    System.out.println("=== TODO ===");
    while (true) {
      System.out.println("\n1 add  2 list  3 done  4 del  5 pending  6 quit");
      System.out.print("> ");

      String inp = sc.nextLine();

      if (inp.equals("1")) {
        addTask();
      } else if (inp.equals("2")) {
        listAll();
      } else if (inp.equals("3")) {
        System.out.print("task id: ");
        int id = Integer.parseInt(sc.nextLine());
        done(id);
      } else if (inp.equals("4")) {
        System.out.print("task id: ");
        int id = Integer.parseInt(sc.nextLine());
        del(id);
      } else if (inp.equals("5")) {
        showPending();
      } else if (inp.equals("6")) {
        System.out.println("bye");
        break;
      } else {
        System.out.println("try 1-6");
      }
    }
  }

  void addTask() {
    System.out.print("task name: ");
    String name = sc.nextLine();
    System.out.print("due date: ");
    LocalDate date = LocalDate.parse(sc.nextLine());
    add(new Task(name, date));
  }
}
