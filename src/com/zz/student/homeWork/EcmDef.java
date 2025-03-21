package com.zz.student.homeWork;

/**
 * @author zz
 * @version 1.0
 * @Description 异常练习题
 */
public class EcmDef {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数错误");
            }
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(cal(a,b));
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static double cal(int a,int b){
        return a/b;
    }
}
