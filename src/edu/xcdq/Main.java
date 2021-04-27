package edu.xcdq;

public class Main {

    public static void main(String[] args) {
	    int divisor = 10 ;
	    int dividend = 0 ;
	    try{
            System.out.println(divisor / dividend);//ArithmeticException    算数异常
        }catch (Exception e){
	        e.printStackTrace();
            System.out.println("捕获到一个异常");
        }finally {
            System.out.println("不管怎" +
                    "样都会执行这个代码");
        }


        System.out.println("哈哈");
    }
}
