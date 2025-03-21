package com.zz.student.poly_;

/***
 * @ author : Zzz
 * @ create : 2021-01-29
 * @version 1.0
 * 多态学习
 */
public class Polymorphic {
    public static void main(String[] args) {
        Persons person = new Persons("张三", 18);
        Persons persons1=new Persons("张三", 18);
//        person=null; 
        System.out.println("垃圾销毁了");
//        System.gc();
//        Persons persons2=persons1;
//        System.out.println(persons2.hashCode());
//        System.out.println(persons1.hashCode());
//        System.out.println(person.hashCode());
//        System.out.println(person.toString());
//        person.equals(persons1);
//         System.out.println(person.equals(persons1));
//        Worker worker = new Worker("张三", 18000);
//        Manager manager = new Manager("李四", 18000, 9999);
//        show(worker);
//        show(manager);
//        testWork(worker);
//        testWork(manager);

//        Persons[] persons = new Persons[5];
//        Persons person = new Persons("张三", 18);
//        Persons student = new Student("李四", 18, 99);
//        Persons teacher = new Teacher("王五", 18, 9999);
//        Persons stuident1 = new Student("赵六", 18, 99);
//        Persons teacher1 = new Teacher("钱七", 18, 9999);
//        persons[0] = person;
//        persons[1] = student;
//        persons[2] = teacher;
//        persons[3] = stuident1;
//        persons[4] = teacher1;
//        for (int i = 0; i < persons.length; i++) {
//            persons[i].show();
//            if(persons[i] instanceof Student){
//                Student student12 = (Student) persons[i];
//                student12.show1();
//            }else if(persons[i] instanceof Teacher){
//                Teacher teacher12 = (Teacher) persons[i];
//                teacher12.show1();
//            }else{
//                System.out.println("不是学生也不是老师");
//            }
//        }
    }

    public static void show(Employee employee) {
        System.out.println("员工姓名：" + employee.getName() + "员工工资：" + employee.getAnnualSalary());
    }

    public static void testWork(Employee employee) {
        if (employee instanceof Worker) {
            Worker worker = (Worker) employee;
            worker.show();
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            manager.show();
        }
    }
    @Override
    protected void  finalize() throws Throwable {
        super.finalize();
    System.out.println("销毁");
    }


}
