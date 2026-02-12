package ratewio.homework6;

public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book (String title, int releaseYear, Author author, int pages){
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig(){
        return pages > 500;
    }

    public boolean matches(String word){
        return title.contains(word) || author.matches(word);
    }

    public int estimatePrice(){
        return Math.max(
            (int) Math.floor((3 * pages) * Math.sqrt(author.rating)),
            250
        );
    }

    @Override
    public String toString() {
        return  title +
                ", " + releaseYear + "г." +
                ", Автор - " + author +
                ", цена - " + estimatePrice() + "р";
    }
}
