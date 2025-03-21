package com.zz.student.Interface;

import java.util.Arrays;
import java.util.Comparator;

public class InterfaceMain {
    public static void main(String[] args)
    {
        //匿名类测试
        InnerClassExercise.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了！");
            }
        });
        InnerClassExercise.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了！");
            }
        });
        //接口测试
        DBConnect db = new Oracle();
        show(db);
        show(new MysqlConnect());
        //自定义实现冒泡排序方法
        int[] arr = {2,1,3,4,5,6,7,8,9,10};
        ArraySortCustom.arraySortCustom(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if((int)o1>=(int)o2)
                    return 1;
                else
                    return -1;

            }
        });
        System.out.println(Arrays.toString(arr));
        Book[] books = new Book[4];
        books[0] = new Book(100,"西游记");
        books[1] = new Book(200,"红楼梦");
        books[2] = new Book(300,"水浒传");
        books[3] = new Book(400,"三国演义");
        ArraySortCustom.bookSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return  (int)(((Book) o1).getPrice()-((Book) o2).getPrice());
            }
        });
        System.out.println("升序"+Arrays.toString(books));
        ArraySortCustom.bookSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return  (int)(((Book) o2).getPrice()-((Book) o1).getPrice());
            }
        });
        System.out.println("降序"+Arrays.toString(books));
    }
    public static void show(DBConnect db){
        db.connect();
        db.disconnect();
    }
}
 

