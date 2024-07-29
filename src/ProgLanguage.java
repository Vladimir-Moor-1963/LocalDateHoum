import java.time.LocalDate;
import java.util.Objects;

public class ProgLanguage {
//    1. Создайте класс "Язык программирования"
//            1.1 Добавьте поля: название языка, автор языка (или компания), дата первой версии языка
//1.2 Создайте несколько языков программирования
//1.3 Найдите среди них самых старый язык, используя любой подход (стримы привествуются)
//
//2. Создайте класс "посылка".
//            2.1 Добавьте поля: город отправления и город получения, вес посылки, дата-время создания посылки
//            (посылки могут создаваться по всему миру, очень много часовых поясов, нам важна не конкретная дата,
//             а лишь какая посылка была создана ранее, чем другая)
//2.2 Создать несколько посылок
//2.3 Найти самую новую посылку среди тех, кто отправляется в Берлин
//
//3. Создать класс Meeting (встреча),
//3.1 В класс добавьте поля: кто встречается, с кем встречается и дату-время встречи
//3.2 Создайте несколько встреч
//3.3 Найдите среднее время начала всех встреч
//            (Например, две встречи - одна встреча начинается 14-00, другая встреча начинается 16-00.
//                    Тогда среднее время начала встречи - 15-00)

   private String name;
   private String author;
   private LocalDate creationDate;

    public ProgLanguage(String name, String author, LocalDate creationDate) {
        this.name = name;
        this.author = author;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "ProgLanguage{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProgLanguage that = (ProgLanguage) o;
        return Objects.equals(name, that.name) && Objects.equals(author, that.author) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(author);
        result = 31 * result + Objects.hashCode(creationDate);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
