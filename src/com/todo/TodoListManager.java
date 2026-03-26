package com.todo;

public class TodoListManager {
  List<Task> task_list = new ArrayList(); // all tasks
  Scanner sc = new Scanner(System.in);
  int count = 0;

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
}
