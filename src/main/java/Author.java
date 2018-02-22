//Q1) Creation of Author class

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Author {
    //-------------Q9) Generate Id for Author Using IDENTITY and TABLE strategy
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)    //for id as table use @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    //------------Q6) Rename all the fields using column annotation - use @Column(name=field_name) .
    @Column(name = "fname")
    private String firstName;


    @Column(name = "lname")
    //------------Q7) Mark lastName as @Transient.
    @Transient
    private String lastName;
    //Q3) Introduce dob of author




    @Column(name="date_of_birth")
    //------------Q8) Use @Temporal for date of birth of Author.
    @Temporal(TemporalType.DATE)
    private Date dob;

    private int age;


    //------------Q11) Create instance variable of Address class inside Author class and save it as embedded object.
    @Embedded
    Address address;


    //-------------Q12) Introduce a List of subjects for author.
    @ElementCollection
    List<String> subjects=new ArrayList<>();


    /*---------------Q15)  One to one mapping
    @OneToOne
    Book book;




    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    */

/*
    //---------------Q16) One to Many Unidirectional
    @OneToMany(cascade = CascadeType.PERSIST)
    List<Book> book=new ArrayList<>();*/


   //------------------Q16) One to Many Without using third table
  @OneToMany(mappedBy = "author")
   List<Book> book=new ArrayList<>();





/*............................................ Q17) Many to Many.......................................
    @ManyToMany(cascade = CascadeType.PERSIST)
    List<Book> book=new ArrayList<>();

.......................................................................................................*/


    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", address=" + address +
                ", subjects=" + subjects +
                ", book=" + book +
                '}';
    }


}
