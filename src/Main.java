import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*задача 10
        Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида:
        “Название книги” Имя Отчество Фамилия автора
         */
        String[] array = {
                "Сказка о рыбаке и рыбке, А.С.Пушкин",
                "Ася, И.С.Тургенев",
                "Маскарад, М.Ю.Лермонтов"
        };
        for (int i = 0; i < array.length; i++) {
            String[] part = array[i].split(",");
            String name = part[0];
            String author = part[1];
            array[i] = "\"" + name + "\"" + author;
        }
        System.out.println(Arrays.toString(array));
    }
}