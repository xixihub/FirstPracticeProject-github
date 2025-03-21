package com.zz.student.HashMap_;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author zz
 * @version 1.0
 * @Description
 */
@SuppressWarnings("all")
public class mapMain {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        List employees1 = new ArrayList<>();
        employees.add(new Employee(123, "bohn", new BigDecimal(20000), new MyDate(1999, 2, 1)));
        employees.add(new Employee(22, "bohn", new BigDecimal(10000), new MyDate(1999, 1, 1)));
//        employees.add(new Employee(33, "aweqw", new BigDecimal(10000), new MyDate(1999, 1, 1)));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().compareTo(o2.getName()) == 0) {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(employees);
//        HashMap<String,Integer> hashMap=new HashMap<>();
//        hashMap.put("c12yb",10000);
//        hashMap.put("b12yb",20000);
//        hashMap.put("a12yb",30000);
//        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
//        for (Map.Entry<String, Integer> entry : entries){
//            System.out.println(entry.getKey()+":"+(entry.getValue()+1000));
//        }

//        TreeSet treeSet=new TreeSet();
//        TreeMap treeMap=new TreeMap();
//        treeMap.put("c12yb",new Employee(123,"c12yb",new BigDecimal(10000)));
//        treeMap.put("b12yb",new Employee(123,"c12yb",new BigDecimal(10000)));
//        treeMap.put("a12yb",new Employee(123,"c12yb",new BigDecimal(10000)));
//        treeSet.add("c12yb");
//        treeSet.add("bca");
//        treeSet.add("sdg");
//        System.out.println(treeMap);


//        Employee john = new Employee(123, "John", new BigDecimal(10000));
//        Employee jack = new Employee(456, "Jack", new BigDecimal(20000));
//        Employee jim = new Employee(789, "Jim", new BigDecimal(18000));
//        Employee john1 = new Employee(123, "John");
//        HashMap map=new HashMap<>();
//        map.put("john",john);
//        map.put("jack",jack);
//        map.put("jim","qdwqd");
//        Collection values = map.values();
//        Properties properties=new Properties();
//        properties.put("jo2n",john);
//        properties.put("jo3n",john);
//        properties.put("jo3n",john);
//        System.out.println(properties);
////        for (Object value : values){
////            Employee employee=(Employee)value;
////            if (employee.getSalary().compareTo(new BigDecimal(18000))>=0){
////                System.out.println(employee.getName()+":"+employee);
////            }
////        }
//        for (Object entry: map.entrySet()){
//            Map.Entry entry1=(Map.Entry) entry;
//            if(!Objects.isNull(entry1.getValue()) && entry1.getValue() instanceof Employee) {
//                Employee employee = (Employee) entry1.getValue();
//                if (employee.getSalary().compareTo(new BigDecimal(18000))>0){
//                    System.out.println(employee.getName()+":"+employee);
//                }
//            }else{
//                System.out.println("该对象不规范:"+entry1.getKey()+":"+entry1.getValue());
//            }
//
//
//        }
//        Iterator iterator1 = values.iterator();
//        while (iterator1.hasNext()) {
//            System.out.println(iterator1.next());
//            Employee employee=(Employee)iterator1.next();
//            if (employee.getSalary().compareTo(new BigDecimal(18000))>0){
//                System.out.println(employee.getName()+":"+employee);
//            }
//        }

//        Iterator iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            Map employeeMap=(Map) next;
//            if (map.get())
//            System.out.println(employeeMap.get("john"));
//        }
//        HashSet<Employee> hashSet = new HashSet<>();
//        hashSet.add(john);
//        hashSet.add(jack);
//        hashSet.add(jim);
//        hashSet.add(john1);
//        System.out.println(hashSet);
//        LinkedHashSet<CarLinkedHashSet>linkedHashSets=new LinkedHashSet<>();
//        linkedHashSets.add(new CarLinkedHashSet("BMW", 100000));

    }
}
