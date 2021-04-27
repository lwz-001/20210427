package edu.xcdq;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/27 15:15
 */
public class Demo02 {
    public static void main(String[] args) {
            int [] a= new int[2] ;
            Scanner scanner = new Scanner(System.in);
            try {
                int i = scanner.nextInt();
                int j = scanner.nextInt();
                a[0] = i ;
                a[2] = j ;
                System.out.println(a[0]/a[2]);
                // Array Index OutOf Bounds Exception 数组、索引 超出 边界 异常
                // Input Mismatch Exception  输入 不匹配 异常
                // Arithmetic Exception 数字数字 异常
            }catch (ArrayIndexOutOfBoundsException |InputMismatchException |ArithmeticException e){
                System.out.println("数组越界异常");

                System.out.println("数据格式不正确异常");

                System.out.println("算数异常");
            }
        }
    }


