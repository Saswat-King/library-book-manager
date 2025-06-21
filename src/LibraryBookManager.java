import java.util.Scanner;

class Book
{
    private String name;
    private int bookId;
    private boolean isIssued;

    Book(String name, int bookId , boolean isIssued)
    {
        this.name = name;
        this.bookId = bookId;
        this.isIssued = isIssued;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    void displayStatus()
    {
        if(isIssued)
        {
            System.out.println("The book \""+name+"\" is currently issued.\n");
        }
        else
        {
            System.out.println("The book \""+name+"\" is available in the library.\n");
        }
    }

}



public class LibraryBookManager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Library Book Manager ==========");
        System.out.println("Add book details below:\n");

        System.out.print("Enter title for book 1: ");
        String bookName1  = scanner.nextLine();

        System.out.print("Enter ID for book 1: ");
        int bookId1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Is Book 1 issued? (True/False): ");
        boolean bookIssue1 = scanner.nextBoolean();
        scanner.nextLine();

        Book b1 = new Book(bookName1,bookId1,bookIssue1);
        System.out.println();

        System.out.print("Enter title for book 2: ");
        String bookName2  = scanner.nextLine();

        System.out.print("Enter ID for book 2: ");
        int bookId2 = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Is Book 2 issued? (True/False): ");
        boolean bookIssue2 = scanner.nextBoolean();
        scanner.nextLine();

        Book b2 = new Book(bookName2,bookId2,bookIssue2);
        System.out.println();

        while (true)
        {
            System.out.print("Do you want to update? (Y/N): ");
            String check = scanner.nextLine();


            if(check.equalsIgnoreCase("y"))
            {
                System.out.print("Which book to update? (1 or 2): ");
                int update = scanner.nextInt();
                scanner.nextLine();
                if(update==1)
                {
                    System.out.print("What do you want to update? (Title/Id): ");
                    String change = scanner.nextLine();
                    System.out.println();

                    if(change.equalsIgnoreCase("Title"))
                    {
                        System.out.print("Enter new title: ");
                        String newTitle = scanner.nextLine();
                        b1.setName(newTitle);
                    }
                    else if(change.equalsIgnoreCase("Id"))
                    {
                        System.out.print("Enter new id: ");
                        int newId = scanner.nextInt();
                        scanner.nextLine();
                        b1.setBookId(newId);
                    }
                }
                else if(update==2)
                {
                    System.out.print("What do you want to update? (Title/Id): ");
                    String change = scanner.nextLine();
                    System.out.println();

                    if(change.equalsIgnoreCase("Title"))
                    {
                        System.out.print("Enter new title: ");
                        String newTitle = scanner.nextLine();
                        b2.setName(newTitle);
                    }
                    else if(change.equalsIgnoreCase("Id"))
                    {
                        System.out.print("Enter new id: ");
                        int newId = scanner.nextInt();
                        scanner.nextLine();
                        b2.setBookId(newId);
                    }
                }
            }
            else {
                break;
            }

        }

        System.out.println();
        System.out.println("Book 1: Title = "+b1.getName()+" | ID = "+b1.getBookId());
        b1.displayStatus();

        System.out.println("Book 2: Title = "+b2.getName()+" | ID = "+b2.getBookId());
        b2.displayStatus();
        scanner.close();




    }
}