package Online-Library-Java;
class Library{

    String [] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println("The "+book+" has been added!");
    }

    void showAvailableBooks(){
        System.out.println("\nAvailable books are :-");
        for (String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("* " + book );
        }
        System.out.println();
    }

    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.printf("\nThe %s has been issued!\n",book);
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }

}

public class Library_Code {
    public static void main(String[] args) {
        Library li = new Library();

        li.addBook("The Human");
        li.addBook("To Kill a Mockingbird");
        li.addBook("The Great Gatsby");
        li.addBook("Pride and Prejudice");
        li.addBook("Harry Potter");
        li.showAvailableBooks();

        li.issueBook("Harry Potter");
        li.showAvailableBooks();

        li.returnBook("Harry Potter");
        li.showAvailableBooks();
    }
    
}
