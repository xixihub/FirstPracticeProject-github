package com.zz.student.oop_;

import com.zz.student.poly_.Persons;
import com.zz.student.poly_.Student;
import com.zz.student.poly_.Teacher;

public class Home {
    public static void main(String[] args) {
        Persons[] arr = new Persons[4];
        arr[0] = new Student("张三", 18, "001",1);
        arr[1] = new Student("李四", 20, "002",0);
        arr[2] = new Teacher("王五", 20, 1,1);
        arr[3] = new Teacher("张柳", 20, 2,0);
        show(arr);
        Persons student = new Student("张三", 18, "001",1);
        Persons teacher =  new Teacher("张柳", 20, 2,0);
        show1(student);
        show1(teacher);
//Persons student = new Student("张三", 18, 99);
//student.run();
//student.walk();
//Student student1 = (Student)student;
//student1.run();
//student1.walk();
//student1.show();
//student1.show1();
//        Doctor doctor = new Doctor("张三", "医生", 20);
//        Doctor doctor1 = new Doctor("张三1", "医生", 20);
//        System.out.println(doctor.equals(doctor1));
        //        Employee emp = new Employee("张三", 18, "工人");
//       Employee emp1 = new Employee("李四", 20
//               , "农民");
//       Employee emp2 = new Employee("王五", 20, "服务员");
//       Employee emp3 = new Teacher("hanlaoshi", 20, "老师",2,200);
//       Employee emp4 = new Scientist("jiaoshou", 40, "教授",200);

//        Persons[] arr = new Persons[6];
//        arr[0] = new Persons("张三", 18, "学生");
//        arr[1] = new Persons("王五", 22, "老师");
//        arr[2] = new Persons("赵六", 25, "学生");
//        arr[3] = new Persons("赵六", 25, "学生");
//        arr[4] = new Persons("赵六", 25, "学生");
//        arr[5] = new Persons("赵六", 25, "学生");
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j <arr.length-1-i ; j++) {
//                if (arr[j].getAge() > arr[j+1].getAge()) {
//                    Persons temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//
//            }
//        }
//        for (int k = 0; k < arr.length; k++) {
//            System.out.println(arr[k]);
//        }
    }
    public  static void show(Persons[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j].getAge() < arr[j+1].getAge()) {
                    Persons temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
            arr[i].show();
        }
    }
    public static void show1(Persons persons) {
        if(persons instanceof Student) {
            Student student = (Student)persons;
            System.out.println(student.play());
            student.study();
        }else if(persons instanceof Teacher){
            Teacher teacher = (Teacher)persons;
            System.out.println(teacher.play());
            teacher.teach();
        }
    }
}
