/* 
 * 2)	Implement the following case study using OOP concepts in Java. E-Book stall: Every book has properties which includes : Book _Name, Book_Author, Book_Count; Every Customer is having properties as: Customer_Id, Customer_Name, Customer_Address and he can buy books from E-Book stall. Write a Program which will display the text book name and the remaining count of text books when a customer buys a text book
 */



class Book {
    private String bookName;
    private String bookAuthor;
    private int bookCount;

    public Book(String bookName, String bookAuthor, int bookCount) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCount = bookCount;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
}

class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;

    public Customer(int customerId, String customerName, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }
}

class EbookStall {
    private Book[] books;

    public EbookStall(Book[] books) {
        this.books = books;
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        System.out.println("----------------------------");
        for (Book book : books) {
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Remaining Count: " + book.getBookCount());
            System.out.println("----------------------------");
        }
    }

    public void buyBook(Customer customer, String bookName) {
        boolean bookFound = false;
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                if (book.getBookCount() > 0) {
                    book.setBookCount(book.getBookCount() - 1);
                    System.out.println(customer.getCustomerName() + " bought " + bookName);
                    System.out.println("Remaining Count: " + book.getBookCount());
                } else {
                    System.out.println("Sorry, " + bookName + " is out of stock.");
                }
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Sorry, " + bookName + " not found.");
        }
    }
}

public class Q2_BookStore {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Java Programming", "John Doe", 10),
                new Book("Python Programming", "Jane Smith", 15),
                new Book("Data Structures and Algorithms", "Alice Johnson", 8)
        };

        EbookStall ebookStall = new EbookStall(books);
        Customer customer1 = new Customer(1, "Alice", "123 Main St");
        Customer customer2 = new Customer(2, "Bob", "456 Elm St");

        ebookStall.displayAvailableBooks();
        System.out.println();

        ebookStall.buyBook(customer1, "Java Programming");
        ebookStall.buyBook(customer2, "Python Programming");
        ebookStall.buyBook(customer1, "Java Programming");

        System.out.println();
        ebookStall.displayAvailableBooks();
    }
}
