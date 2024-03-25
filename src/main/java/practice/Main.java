package practice;

import java.util.Scanner;

public class Main {

  private static TodoList todoList = new TodoList();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // TODO: написать консольное приложение для работы со списком дел todoList
    while (true) {
      System.out.println("Введите команду (LIST, ADD, EDIT, DELETE) или EXIT для выхода");
      String input = scanner.nextLine().trim();

      if (input.equalsIgnoreCase("EXIT")) {
        System.out.println("Программа завершена.");
        break;
      }
      String[] parts = input.split("\\s", 3);
      String command = parts[0].toUpperCase();

      switch (command) {
        case "ADD" -> {
          if (parts.length < 2) {
            System.out.println("Недостаточно аргументов для команды ADD");
          } else if (parts.length == 2) {
            todoList.add(parts[1]);
          } else {
            try {
              int index = Integer.parseInt(parts[1]);
              todoList.add(index, parts[2]);
            } catch (NumberFormatException e) {
              System.out.println("Неверный формат команды ADD.");
            }
          }
        }
        case "EDIT" -> {
          if (parts.length < 3) {
            System.out.println("Недостаточно аргументов для команды ADD");
          } else {
            try {
              int index = Integer.parseInt(parts[1]);
              todoList.edit(index, parts[2]);
            } catch (NumberFormatException e) {
              System.out.println("Неверный формат команды ADD.");
            }
          }

        }
        case "DELETE" -> {
          if (parts.length < 2) {
            System.out.println("Недостаточно аргументов для команды DELETE.");
          } else {
            try {
              int index = Integer.parseInt(parts[1]);
              todoList.delete(index);
            } catch (NumberFormatException e) {
              System.out.println("Неверный формат команды DELETE.");
            }
          }
        }
        case "LIST" -> System.out.println(todoList.toString());
      }
    }
  }
}
