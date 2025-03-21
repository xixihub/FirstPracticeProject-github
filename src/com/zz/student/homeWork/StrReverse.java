package com.zz.student.homeWork;

/**
 * @author zz
 * @version 1.0
 * @Description 字符串反转
 */
public class StrReverse {
    public static String reverse(String str, int start, int end){
        if (!(str != null && str.length()>0 && start < end && start >= 0 && end < str.length())){
            throw new IllegalArgumentException("参数错误");
        }
        char[] chars = str.toCharArray();
        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
