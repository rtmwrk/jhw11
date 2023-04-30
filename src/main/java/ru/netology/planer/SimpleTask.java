package ru.netology.planer;

//--- Класс простой задачи -------------------------------------------------------------------------------
public class SimpleTask extends Task {                   // простая задача имеет только id и title
   protected String title;

   public SimpleTask(int id, String title) {             // конструктор создания объекта - простой задачи
      super(id);                                         // вызов родительского конструктора
      this.title = title;                                // заполнение своих полей
   }

   @Override
   public boolean matches(String query) {                 // метод поиска задачи в объекте
      if (title.contains(query)) {
         return true;
      } else {
         return false;
      }
   }

   public String getTitle() {                             // get метод поля "title"
      return title;
   }
}
