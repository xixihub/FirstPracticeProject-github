package com.zz.student.Interface;

public class InnerClassExercise {
    public static void alarmclock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();
    }
}
