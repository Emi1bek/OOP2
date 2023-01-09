import java.sql.SQLOutput;
import java.util.Scanner;

public class Person {
    String namePerson;
    int agePerson;
    String[] Languages;


    void getlanguages(String[] lan){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lan.length; i++) {
            System.out.println(i+1+" язык");
                lan[i] =sc.nextLine();
        }

        if (lan.length+1 == 1){
            System.out.println("Надо учится! "+namePerson);
        }else if (lan.length+1 <4){
            System.out.println("Жакшы жетишкенчилик! "+namePerson);
        }else if (lan.length+1 >4){
            System.out.println("Вы политолог! "+namePerson);
        }else {
            System.out.println("Вас я не понял! "+namePerson);
        }

    }

    void getAge(){
        if (agePerson <7 ) {
            System.out.println("вы не допусщены к выбору!"+namePerson);
        } else if (agePerson >=18) {
            System.out.println("Вы допушены к выбору!"+namePerson);
        }else {
            System.out.println("Вас не понимаю!"+namePerson);
        }

    }
}
