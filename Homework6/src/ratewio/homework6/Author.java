package ratewio.homework6;

public class Author {
    String  name,
            surname;
    int rating;
    public Author (String name, String surname, int rating){
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }
    public Author (String name, String surname){
        this(name, surname, 1);
    }
    public boolean matches(String word){
        return name.contains(word) || surname.contains(word);
    }

    @Override
    public String toString() {
        return  name + " " + surname +
                ", рейтинг - " + rating;
    }
}
