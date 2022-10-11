package laborbook;
public class Book {
    private String BookName;
    private String BookId;
    private int BookSize;

    public String getId() {
        return BookId;
    }

    public void setId(String id) {
        this.BookId = id;
    }

    public String getName() {
        return BookName;
    }

    public void setName(String name) {
        this.BookName = name;
    }

    public int getSize() {
        return BookSize;
    }

    public void setSize(int Size) {
        this.BookSize = Size;
    }

}