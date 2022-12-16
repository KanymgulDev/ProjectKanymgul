import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;
import service.UserServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <BookServiceImpl> void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.


        Book book= new Book(3554265l,"rose", Genre.DETECTIVE,BigDecimal.valueOf(456),"N. Kadurbekov", Language.ENGLISH,LocalDate.of(2010,12,3));
        Book book2= new Book(3554265l,"jamgur",Genre.ROMANCE,BigDecimal.valueOf(654),"CH.Aitmotov",Language.KYRGYZ,LocalDate.of(2012,5,8));
        Book book3= new Book(3554265l,"Asel",Genre.HISTORICAL,BigDecimal.valueOf(987),"G.Mumutbek",Language.ENGLISH,LocalDate.of(2015,7,6));
        Book book4= new Book(7568748l,"Aisel",Genre.ROMANCE,BigDecimal.valueOf(543),"N. Kadurbekov",Language.KYRGYZ,LocalDate.of(2011,11,21));

        User user = new User(9823435l,"assol","janubekova","assoljanubekova@email.com","+996 3456463767", Gender.FEMALE, BigDecimal.ONE,);
        User user1 = new User(64764386l,"lira","nurbekov","liranurbekova@email.com","+996 3456463767", Gender.MALE,BigDecimal.valueOf(1000),BigDecimal.value Of(450));
        User user3= new User(874635563l,"mira","bekova","mirabekova@email.com","+996 3456463767", Gender.FEMALE,BigDecimal.valueOf(2000),"nur");
        User user4= new User(637467567l,"asul","nurov","asulnurov@email.com","+996 3456463767", Gender.MALE,BigDecimal.valueOf(4000)"");
        User user6= new User(8753190765l,"assol","janubekova","assoljanubekova@email.com","+996 3456463767", Gender.FEMALE,BigDecimal.valueOf(6700),"rose");
        List<User> users = new ArrayList<>(List.of(user,user1,user3,user4));
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUser(users);
        BookServiceImpl. = new BookServiceImpl();
        .createBooks(books);
        while (true){
            System.out.println("""
           1 CREATE USER
           2 FIND ALL USERS
           3 FIND USER BY ID
           4 REMOVE USER BY NAME
           5 UPDATE USER
           6 GROUP USER BY GENDER
           7 BUY BOOKS
           8 CREATE BOOKS
           9 GET ALL BOOKS
           10 GET BOOKS BY GENGE
           11 REMOVE BOOKS BY ID
           12 SORT BOOKS BY PRICE IN DESCENDING ORDER
           13 filterBooksByPublishedYear
           14 getBookByInitialLetter
           15 maxPriceBook
             """);
    }
























