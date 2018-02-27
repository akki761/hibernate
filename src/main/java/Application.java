import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {

    public static void main(String[] args) {



        SessionFactory session_factory = new Configuration().configure().buildSessionFactory();
        Session session = session_factory.openSession();
        session.beginTransaction();




        //...............................Q2) CRUD operation on Author
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Author author=new Author();
        Address address=new Address();

        /*   One to One

        Book book=new Book();
        book.setBookName("GOT");
        session.save(book);
        author.setBook(book);
        */


        author.setFirstName("Akash");  //.....................CREATE
        author.setLastName("Gupta");
        author.setDob(new Date(27/02/1997));  //Added new column
        System.out.println(format.parse("1998/08/12"));
        author.setAge(21);
        address.setStreetNumber("224/59");
        address.setLocation("Lucknow");
        address.setState("UP");
        author.setAddress(address);
        List<String> list=new ArrayList<>();

        //-----------Q13 ) Persist 3 subjects for each author.
        list.add("1");
        list.add("2");
        list.add("3");
        author.setSubjects(list);

        Book book = new Book();
        book.setBookName("GOT");
        Book book1=new Book();
        book1.setBookName("Ramayana");
        book.setAuthor(author);
        book1.setAuthor(author);
        author.getBook().add(book);
        author.getBook().add(book1);
//        session.save(book);
//        session.save(book1);

        session.persist(author);


        Address address1=new Address();
        Author author1=new Author();        //CREATE

        /* One to One
           Book book1=new Book();
        book1.setBookName("FRIENDS");
        session.save(book1);
        author1.setBook(book1);
         */


        author1.setFirstName("Abhishek");
        author1.setLastName("Sharma");
        author1.setDob(format.parse("1998/08/11"));  // Q3) Added new column dob
        author1.setAge(25);
        address1.setStreetNumber("22B");
        address1.setLocation("Baker Street");
        address1.setState("MP");
        author1.setAddress(address1);
        List<String> list1=new ArrayList<>();

        //-----------Q13 ) Persist 3 subjects for each author.
        list1.add("4");
        list1.add("5");
        list1.add("6");
        author1.setSubjects(list1);

        Book book2 = new Book();
        book2.setBookName("Mahabharat");
        Book book3 = new Book();
        book3.setBookName("Malgudi Days");
        book2.setAuthor(author1);
        book3.setAuthor(author1);
        author1.getBook().add(book2);
        author1.getBook().add(book3);
//        session.save(book2);
//        session.save(book3);

        session.persist(author1);


        Author author_get = session.get(Author.class,1);   //.................UPDATE
        author_get.setFirstName("Sumit");
        session.update(author_get);

        author_get = session.get(Author.class,1);   //.................. READ

       // Q3) Use hbm2ddl create to introduce Date of Birth for Author.

         Author author_get1 = session.get(Author.class,2);  //................DELETE
          session.delete(author_get1);


      //  Q4) Use hbm2dll update to insert at least 4 records for Author.

        Author author2=new Author();
        Address address2=new Address();

        /*One to One
           Book book2=new Book();
        book2.setBookName("My book");
        session.save(book2);
        author2.setBook(book2);
         */


        author2.setFirstName("Mayank");
        author2.setLastName("Gupta");
        author2.setAge(22);
    
        author2.setDob(format.parse("1998/08/10"));
        address2.setStreetNumber("23");
        address2.setLocation("Latus Road");
        address2.setState("JK");
        author2.setAddress(address2);
        List<String> list2=new ArrayList<>();

        //-----------Q13 ) Persist 3 subjects for each author.
        list2.add("7");
        list2.add("8");
        list2.add("9");
        author2.setSubjects(list2);

        Book book4 = new Book();
        book4.setBookName("Mahabharat");
        Book book5 = new Book();
        book5.setBookName("Malgudi Days");
        book4.setAuthor(author2);
        book5.setAuthor(author2);
        session.save(book4);
        session.save(book5);
        author2.getBook().add(book4);
        author2.getBook().add(book5);
        session.persist(author2);

        Author author3=new Author();
        Address address3=new Address();
        /* One to One
        Book book3=new Book();
        book3.setBookName("book3");
        session.save(book3);
        author3.setBook(book3);*/


        author3.setFirstName("Prerit");
        author3.setLastName("Singh");
        author3.setAge(24);
        author3.setDob(format.parse("1998/08/02"));
        address3.setStreetNumber("21B");
        address3.setLocation("Baker Marg");
        address3.setState("HP");
        author3.setAddress(address3);
        List<String> list3=new ArrayList<>();

        //-----------Q13 ) Persist 3 subjects for each author.
        list3.add("11");
        list3.add("22");
        list3.add("33");
        author3.setSubjects(list3);

        Book book6 = new Book();
        book6.setBookName("Mahabharat");
        Book book7 = new Book();
        book7.setBookName("Malgudi Days");
        book6.setAuthor(author3);
        book7.setAuthor(author3);
        session.save(book6);
        session.save(book7);
        author3.getBook().add(book6);
        author3.getBook().add(book7);
        session.persist(author3);


        Author author4=new Author();
        Address address4=new Address();

        /*One to One
        Book book4=new Book();
        book4.setBookName("book4");
        session.save(book4);
        author4.setBook(book4);
        */


        author4.setFirstName("Swapnil");
        author4.setLastName("Verma");
        author4.setAge(22);
        author4.setDob(format.parse("1998/08/21"));
        address4.setStreetNumber("231");
        address4.setLocation("Baker");
        address4.setState("KP");
        author4.setAddress(address4);
        List<String> list4=new ArrayList<>();

        //-----------Q13 ) Persist 3 subjects for each author.
        list4.add("55");
        list4.add("66");
        list4.add("77");
        author4.setSubjects(list4);

        Book book8 = new Book();
        book8.setBookName("Mahabharat");
        Book book9 = new Book();
        book9.setBookName("Malgudi Days");
        book8.setAuthor(author4);
        book9.setAuthor(author4);
        session.save(book8);
        session.save(book9);
        author4.getBook().add(book8);
        author4.getBook().add(book9);
        session.save(author4);



        Author author5=new Author();
        Address address5=new Address();

        /*One to One
        Book book5=new Book();
        book5.setBookName("book5");
        session.save(book5);
        author5.setBook(book5);*/


        author5.setFirstName("Saurabh");
        author5.setLastName("Singh");
        author5.setAge(28);
        author5.setDob(format.parse("1998/08/22"));
        address5.setStreetNumber("231");
        address5.setLocation("Baker");
        address5.setState("KP");
        author5.setAddress(address5);
        List<String> list5=new ArrayList<>();

        //-----------Q13 ) Persist 3 subjects for each author.
        list5.add("88");
        list5.add("99");
        list5.add("00");
        author5.setSubjects(list5);

        Book book10 = new Book();
        book10.setBookName("Mahabharat");
        Book book11 = new Book();
        book11.setBookName("Malgudi Days");
        book11.setAuthor(author5);
        book10.setAuthor(author5);
        session.save(book10);
        session.save(book11);
        author5.getBook().add(book10);
        author5.getBook().add(book11);
        session.save(author5);



        /*********************************** MANY TO MANY ***********************************
        Author author=new Author();
        Address address=new Address();

        author.setFirstName("Akash");
        author.setLastName("Gupta");
        author.setDob(format.parse("1998/08/12"));
        System.out.println(author.getDob());
        author.setAge(21);
        address.setStreetNumber("224/59");
        address.setLocation("Lucknow");
        address.setState("UP");
        author.setAddress(address);
        List<String> list=new ArrayList<>();


        list.add("1");
        list.add("2");
        list.add("3");
        author.setSubjects(list);

        Book book = new Book();
        book.setBookName("GOT");
        Book book1=new Book();
        book1.setBookName("Ramayana");

//        session.save(book);
//        session.save(book1);




        Address address1=new Address();
        Author author1=new Author();



        author1.setFirstName("Abhishek");
        author1.setLastName("Sharma");
        author1.setDob(format.parse("1998/08/02"));
        author1.setAge(25);
        address1.setStreetNumber("22B");
        address1.setLocation("Baker Street");
        address1.setState("MP");
        author1.setAddress(address1);
        List<String> list1=new ArrayList<>();


        list1.add("4");
        list1.add("5");
        list1.add("6");
        author1.setSubjects(list1);

        Book book2 = new Book();
        book2.setBookName("Mahabharat");
        Book book3 = new Book();
        book3.setBookName("Malgudi Days");

        book.getAuthor().add(author);
        book.getAuthor().add(author1);
        author.getBook().add(book);
        author.getBook().add(book2);
        book2.getAuthor().add(author);
        book2.getAuthor().add(author1);
        author1.getBook().add(book);
        author1.getBook().add(book2);
        book3.getAuthor().add(author);
        author.getBook().add(book3);
        book1.getAuthor().add(author1);
        author1.getBook().add(book1);




//        session.save(book2);
//        session.save(book3);




        session.persist(author1);
        session.persist(author);
********************************************************************************************************/


        session.getTransaction().commit();
        session.close();
        session_factory.close();

        System.out.println(author_get);         //Print read value

    }


}
