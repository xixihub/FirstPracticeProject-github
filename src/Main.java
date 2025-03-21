import com.zz.student.override.Person;
import com.zz.student.override.Student;
import com.zz.student0129.Encapsulation;
import com.zz.student0130.ExtendsDetail;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("zz", "20");
//        System.out.println(person.say());
//        Student student=new Student("zz", "20", 100, 100);
////        System.out.println(student.say());
//        student.cry();

//        ExtendsDetail extendsDetail = new ExtendsDetail();
//        extendsDetail.Basetest100();
//        Encapsulation encapsulation = new Encapsulation();
//        encapsulation.setName("ac");
//        encapsulation.setAge(20);
//        encapsulation.setSalary(200000);
//        //输出
//        System.out.println(encapsulation.info());

    }
}

class Person1 {
    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}