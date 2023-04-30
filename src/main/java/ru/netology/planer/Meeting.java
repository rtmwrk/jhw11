package ru.netology.planer;

//--- Класс встречи ---------------------------------------------------------------------------------------
public class Meeting extends Task {                                      // встреча, кроме id имеет еще ряд полей
    protected String topic;
    protected String project;
    protected String start;

    public Meeting(int id, String topic, String project, String start) {  // конструктор создания объекта
        super(id);                                                      // вызов родительского конструктора
        this.topic = topic;                                             // заполнение своих полей
        this.project = project;
        this.start = start;
    }

    @Override
    public boolean matches(String query) {                              // метод поиска задачи в объекте
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }

    public String getTopic() {                                          // get метод поля "topic"
        return topic;
    }

    public String getProject() {                                        // get метод поля "project"
        return project;
    }

    public String getStart() {                                          // get метод поля "start"
        return start;
    }
}