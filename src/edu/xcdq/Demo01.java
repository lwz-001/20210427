package edu.xcdq;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/27 15:07
 */
public class Demo01 {
    public static void main(String[] args) {
        int [] a= new int[2] ;
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            a[0] = i ;
            a[2] = j ;
            System.out.println(a[0]/a[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
        }catch (InputMismatchException e){
            System.out.println("数据格式不正确异常");
        }catch (ArithmeticException e){
            System.out.println("算数异常");
        }
    }
}
