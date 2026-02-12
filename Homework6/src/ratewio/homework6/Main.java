package ratewio.homework6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //наша библиотека, в которой хранятся все книги
    public static ArrayList<Book> library = new ArrayList<Book>();

    public void main(String[] args) {
        //объявляем авторов
        Author  tolstoy = new Author("Лев", "Толстой", 9),
                turgenev = new Author("Иван", "Тургенев", 7),
                shakespeare = new Author("Уильям", "Шекспир", 10),
                dostoevsky = new Author("Фёдор", "Достоевский", 5);


        //Добавляем в библиотеку книги Льва Толстого
        library.add(new Book("Война и мир", 1869, tolstoy, 1200));
        library.add(new Book("Детство", 1852, tolstoy, 100));
        library.add(new Book("Отрочество", 1854, tolstoy, 80));
        library.add(new Book("Юность", 1857, tolstoy, 150));

        //Добавляем в библиотеку книги Ивана Тургенева
        library.add(new Book("Отцы и дети", 1862, turgenev, 220));
        library.add(new Book("Муму", 1852, turgenev, 40));
        library.add(new Book("Ася", 1858, turgenev, 50));

        //Добавляем в библиотеку книги Уильяма Шекспира
        library.add(new Book("Гамлет", 1601, shakespeare, 160));
        library.add(new Book("Ромео и Джульетта", 1597, shakespeare, 130));

        //Добавляем в библиотеку книги Фёдора Достоевского
        library.add(new Book("Преступление и наказание", 1866, dostoevsky, 600));
        library.add(new Book("Белые ночи", 1848, dostoevsky, 70));
        library.add(new Book("Игрок", 1866, dostoevsky, 200));

        //Выводим все большие книги в нашей библиотеке
        System.out.println("Большие книги: ");
        for(Book b : library)
            if(b.isBig())
                System.out.println(b + ", " + b.pages + " страниц");
        System.out.println();

        //Выводим найденные книги по запросу "Шекспир"
        findAndPrint("Шекспир");

        //Выводим найденные книги по запросу "тво"
        findAndPrint("тво");

        //Выводим найденные книги по запросу "Отцы"
        findAndPrint("Отцы");


        /** (!)
         *  КОД НИЖЕ МОЖНО РАЗКОМЕНТИРОВАТЬ И ПОИГРАТЬСЯ САМОМУ ВВОДЯ ЗАПРОС В КОНСОЛИ!
         *  (!)
         */

//        Scanner sc = new Scanner(System.in);
//        while(true){
//            System.out.print("Введите строку для поиска (Чувствителен к регистру): ");
//            String input = sc.nextLine();
//            if("end".equals(input))
//                break;
//            findAndPrint(input);
//        }

    }

    /**
     * Выводит информацию о найденных книгах, описания которых содержат совпадения word в нашей библиотеке
     */
    public static void findAndPrint(String word){
        System.out.println("По запросу \"" + word + "\" найдено: ");
        findMatchesInLibrary(word)
                .forEach(b -> System.out.println(b));
        System.out.println();
    }

    /**
     * Возвращает ArrayList объектов Book который содержит совпадения word с описаниями книг в нашей библиотеке
     */
    public static ArrayList<Book> findMatchesInLibrary(String word){
        ArrayList<Book> matched = new ArrayList<Book>();
        for(Book b : library)
            if(b.matches(word))
                matched.add(b);
        return matched;
    }
}
