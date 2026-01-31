package CA3;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(int id, String title, String author) {
        books.add(new Book(id, title, author));
    }

    public Book searchBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    public void displayBooks() {
        System.out.println("\nBookID\tTitle\tAuthor\tAvailability");
        for (Book book : books) {
            System.out.println(book.getId() + "\t" + book.getTitle() + "\t" + book.getAuthor() + "\t"
                    + (book.isAvailable() ? "Available" : "Not Available"));
        }
    }

    public void issueBook(int id) {
        Book book = searchBook(id);
        if (book != null) {
            if (book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book Issued successfully.");
            } else {
                System.out.println("Book is not available.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(int id) {
        Book book = searchBook(id);
        if (book != null) {
            if (!book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Book Returned successfully.");
            } else {
                System.out.println("Book is already available.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }
}

public class libManagement{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Book Title: ");
                    scanner.nextLine(); // Consume newline left-over
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    library.addBook(id, title, author);
                    break;
                case 2:
                    System.out.println("1. Search by ID");
                    System.out.println("2. Search by Keyword");
                    System.out.print("Enter your choice: ");
                    int searchChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    switch (searchChoice) {
                        case 1:
                            System.out.print("Enter Book ID: ");
                            int searchId = scanner.nextInt();
                            Book foundById = library.searchBook(searchId);
                            if (foundById != null) {
                                System.out.println("Book found:");
                                System.out.println(foundById.getId() + "\t" + foundById.getTitle() + "\t" + foundById.getAuthor());
                            } else {
                                System.out.println("Book not found.");
                            }
                            break;
                        case 2:
                            System.out.print("Enter keyword: ");
                            String keyword = scanner.nextLine();
                            ArrayList<Book> foundByKeyword = library.searchBook(keyword);
                            if (!foundByKeyword.isEmpty()) {
                                System.out.println("Books found:");
                                for (Book book : foundByKeyword) {
                                    System.out.println(book.getId() + "\t" + book.getTitle() + "\t" + book.getAuthor());
                                }
                            } else {
                                System.out.println("No books found with the given keyword.");
                            }
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = scanner.nextInt();
                    library.issueBook(issueId);
                    break;
                case 5:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}