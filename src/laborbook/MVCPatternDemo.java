package laborbook;
public class MVCPatternDemo {
    public static void main(String[] args) {

        Book model  = retriveBookFromDatabase();

        BookView view = new BookView();

        BookController controller = new BookController(model, view);

        controller.updateView();

        controller.setBookName("Ursul cu patru iezi");
        System.out.println("\nAfter update");

        controller.updateView();
    }

    private static Book retriveBookFromDatabase(){
        Book Book = new Book();
        Book.setName("Capra cu Trei Iezi");
        Book.setId("01");
        Book.setSize(100);
        return Book;
    }
}