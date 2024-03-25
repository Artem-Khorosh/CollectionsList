package practice;

import java.util.ArrayList;

public class TodoList {

  ArrayList<String> todoList = new ArrayList<>();

  public void add(String todo) {
    todoList.add(todo);
    // TODO: добавьте переданное дело в конец списка
  }

  public void add(int index, String todo) {
    if (index <= todoList.size() && index >= 0) {
      todoList.add(index, todo);
    } else {
      todoList.add(todo);
    }
    // TODO: добавьте дело на указаный индекс,
    //  проверьте возможность добавления
  }

  public void edit(int index, String todo) {
    // TODO: заменить дело на index переданным todo индекс,
    //  проверьте возможность изменения
    if (index < todoList.size() && index >= 0) {
      todoList.set(index, todo);
    }
  }

  public void delete(int index) {
    // TODO: удалить дело находящееся по переданному индексу,
    //  проверьте возможность удаления дела
    if (index < todoList.size() && index >= 0) {
      todoList.remove(index);
    }
  }

  public ArrayList<String> getTodos() {
    // TODO: вернуть список дел

    return todoList;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < todoList.size(); i++) {
      sb.append(i).append(" - ").append(todoList.get(i)).append("\n");
    }
    return sb.toString();

  }
}