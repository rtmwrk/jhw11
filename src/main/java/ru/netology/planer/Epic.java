package ru.netology.planer;

//--- Класс эпик задачи -------------------------------------------------------------------------------
public class Epic extends Task {                            // содержит id и subtasks задачи
    protected String[] subtasks = new String[0];

    public Epic(int id, String[] subtasks) {
        super(id);                                          // вызов родительского конструктора
        this.subtasks = subtasks;                           // заполнение subtask поля
    }

    @Override
    public boolean matches(String query) {                 // метод поиска задачи в объекте
        for (int i = 0; i < subtasks.length; i++){
            if (subtasks[i].contains(query)) {
                return true;
            }
        }
        return false;
    }

    public String[] getSubTasks() {                         // get метод поля "subtasks"
        return subtasks;
    }
}
