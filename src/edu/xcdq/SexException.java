package edu.xcdq;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/27 15:44
 */
public class SexException extends Exception {
    public SexException(){
    }
    public SexException(String message){
        System.out.println(message);
        System.out.println("自定义的异常，知道非男飞女，但是没办法处理");
        System.out.println("..........");
    }
}
