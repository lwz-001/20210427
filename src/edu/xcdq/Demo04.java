package edu.xcdq;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/27 15:46
 */
public class Demo04 {
    public static void main(String[] args){  //继续向上声明，不处理
        try {
            steSex("双性人");
        }catch (Exception e){
            System.out.println("调用者说处理过了");
        }
    }
    public static void steSex(String sex) throws SexException{  //声明异常
        if (!(sex.equals("男")|| sex.equals("女"))){
            throw new SexException("发现一个不对劲的");  //抛出异常
        }
    }
}
