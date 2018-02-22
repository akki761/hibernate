//----------Q14) Create an Entity book with an instance variable bookName.



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String bookName;



  //-----------------Q16) One to Many Bidirectional
    @ManyToOne
    Author author;


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }



  /*.............................................Q17) Many to Many ........................................................
    @ManyToMany(mappedBy = "book")
    List<Author> author=new ArrayList<>();


    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

  .........................................................................................................................*/
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author=" + author +
                '}';
    }
}
