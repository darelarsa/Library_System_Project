import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //somethings
        ArrayList<LibraryItems> bookshelf = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int itemid = 1;

        while (true){
            System.out.println("\nWhat kind of books do you want to store? 1. Novel 2. Magazine 3. exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 3){
                break;
            }
            if(choice == 1){ //wants to store a novel
                System.out.println("what is the title of the book?: ");
                String bookTitle = scanner.nextLine();
                System.out.println("what is the name of the author: ");
                String authorName = scanner.nextLine();
                System.out.println("what is the name of the publisher: ");
                String publisherName = scanner.nextLine();
                System.out.println("what is the published date of the book: ");
                int publishedDate = scanner.nextInt();
                scanner.nextLine();
                System.out.println("How many pages does the book have: ");
                int pageNumber = scanner.nextInt();
                scanner.nextLine();
                Novel newnovel = new Novel(bookTitle, authorName, publisherName, publishedDate, itemid, pageNumber);
                bookshelf.add(newnovel);
                newnovel.displayCitation();
                newnovel.displayInfo();
            }
            else{ //wants to store a magazine (choice 2)
                System.out.println("what is the title of the book?: ");
                String bookTitle = scanner.nextLine();
                System.out.println("what is the name of the author: ");
                String authorName = scanner.nextLine();
                System.out.println("what is the name of the publisher: ");
                String publisherName = scanner.nextLine();
                System.out.println("what is the published date of the book: ");
                int publishedDate = scanner.nextInt();
                scanner.nextLine();
                System.out.println("What is the issue number of the magazine: ");
                int issueNumber = scanner.nextInt();
                scanner.nextLine();
                Magazine newmagazine = new Magazine(bookTitle, authorName, publisherName, publishedDate, itemid, issueNumber);
                bookshelf.add(newmagazine);
                newmagazine.displayCitation();
                newmagazine.displayInfo();
            }
        }

        System.out.println("books in bookshelf: " );
        for (LibraryItems book : bookshelf) {
            System.out.print(book.title + ", ");
        }
    }
}