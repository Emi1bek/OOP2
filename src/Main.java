import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*** обект тузуп атабыз***/
        Person andrey = new Person();
        Scanner sc = new Scanner(System.in);

        /*** обьектинин переменныйларына маани беруу***/
        System.out.println("Как вас завуд? ");
        andrey.namePerson = sc.nextLine();
        System.out.println("Сколько вам лет? ");
        andrey.agePerson = sc.nextInt();
        /*** Массивтин колумун консолдон суроо ***/
        System.out.println("Сколько языков вы знаете? ");
        int a;
        a= sc.nextInt();
        andrey.Languages = new String[a];


        /*** обект чыкыруу***/

        andrey.getlanguages(andrey.Languages );
        andrey.getAge();




//        Phone phone = new Phone();
//        phone.number = "89967843049";
//        phone.model = "Iphone X";
//        phone.weight = 62;
//        phone.recevelCall("Emilbek");



//
//
//        Home home = new Home();
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Сколько этажей");
//        home.Level= sc.nextInt();
//
//        home.outLevel(home.Level);
    }
}