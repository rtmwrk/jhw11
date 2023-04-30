package ru.netology.planer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TaskTest {
    //--- Тесты класса простых задач ---------------------------------------------------------------------------
    // Тестирование метода "matches" класса "SimpleTask" будет включать в себя тестирование 2-х состояний
    // когда задача есть в классе и когда задачи нет.
    // Задача соответствует поисковой
    @Test
    public void shouldSimpleTaskMatchesTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить родителям");
        Assertions.assertTrue(actual);
    }
    // Задача не соответствует поисковой
    @Test
    public void shouldSimpleTaskMatchesFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить другу");
        Assertions.assertFalse(actual);
    }

    //--- Тесты класса эпик задач --------------------------------------------------------------------------------
    // Тестирование метода "matches" класса "Epic" будет включать в себя тестирование состояний:
    // когда задача есть в классе и когда задачи нет.
    // Задача соответствует поисковой
    @Test
    public void shouldEpicMatchesTrue() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Молоко");
        Assertions.assertTrue(actual);
    }
    // Задача не соответствует поисковой
    @Test
    public void shouldEpicMatchesFalse() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Картофель");
        Assertions.assertFalse(actual);
    }

    //--- Тесты класса встреч -----------------------------------------------------------------------------------
    // Тестирование метода "matches" класса "Meeting" будет включать в себя тестирование состояний:
    // - когда задача есть в классе и находится в поле "topic";
    // - когда задача есть в классе и находится в поле "project";
    // - когда задачи нет в классе.
    // Задача в поле "topic"
    @Test
    public void shouldMeetingMatchesTopicTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        Assertions.assertTrue(actual);
    }
    // Задача в поле "project"
    @Test
    public void shouldMeetingMatchesProjectTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = meeting.matches("Приложение НетоБанка");
        Assertions.assertTrue(actual);
    }
    // Задачи нет в классе
    @Test
    public void shouldMeetingMatchesFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = meeting.matches("Позвонить другу");
        Assertions.assertFalse(actual);
    }
}
