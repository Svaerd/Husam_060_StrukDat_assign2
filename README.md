# Todo List Manager

simple todo app i made for learning java.

## how to run

```bash
javac -d out src/com/todo/*.java
java -cp out com.todo.Main
```

or just open in eclipse/intellij and run.

## what it does

- add task with title and due date
- see all tasks
- mark task as done
- delete task
- see pending tasks only

## files

- `Task.java` - the task object
- `TodoListManager.java` - main logic
- `Main.java` - entry point

## menu

```
1 add task
2 list all
3 mark done
4 delete
5 show pending
6 quit
```

## example output

```
=== TODO ===

1 add  2 list  3 done  4 del  5 pending  6 quit
> 1
task name: belajar java
due date: 2026-04-05
added: belajar java

1 add  2 list  3 done  4 del  5 pending  6 quit
> 2

All Tasks:
[ ] 1. belajar java | 2026-04-05
```

## oop stuff used

- encapsulation (fields in Task)
- composition (TodoListManager has List<Task>)

## why this project

just wanted something simple to practice basic java concepts. no complicated stuff.

made by [your name]
