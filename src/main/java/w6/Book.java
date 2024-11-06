package w6;


import java.util.ArrayList;

class Book {
    String title;
    String publisher;
    int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }
    public String title() {
        return title;
    }
    public String publisher() {
        return publisher;
    }
    public int year() {
        return year;
    }
    public String toString() {
        return title + " " + publisher + " " + year;
    }


}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }

        public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> filteredBooks = new ArrayList<>();
        this.books
                .stream()
                .filter(book -> StringUtils.included(book.title(), title))
                .forEach(filteredBooks::add);
        return filteredBooks;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> filteredBooks = new ArrayList<>();
        this.books
                .stream()
                .filter(book -> StringUtils.included(book.publisher(), publisher))
                .forEach(filteredBooks::add);
        return filteredBooks;
    }
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> filteredBooks = new ArrayList<>();
        this.books.stream().filter(book -> book.year == year).forEach(filteredBooks::add);
        return filteredBooks;
    }
}

class StringUtils {
    public static boolean included(String word, String searched) {
        String normalizedWord = word.toUpperCase();
        String normalizedSearched = searched.trim().toUpperCase();
        return normalizedWord.contains(normalizedSearched);
    }
}
