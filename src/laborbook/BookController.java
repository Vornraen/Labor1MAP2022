package laborbook;
public class BookController {
    private Book model;
    private BookView view;

    public BookController(Book model, BookView view){
        this.model = model;
        this.view = view;
    }

    public void setBookName(String name){
        model.setName(name);
    }

    public String getBookName(){
        return model.getName();
    }

    public void setBookId(String id){
        model.setId(id);
    }

    public String getBookId(){
        return model.getId();
    }

    public void setBookSize(int Size){
        model.setSize(Size);
    }

    public int getBookSize(){
        return model.getSize();
    }
    public void updateView(){
        view.printBookDetails(model.getName(), model.getId(), model.getSize());
    }
}