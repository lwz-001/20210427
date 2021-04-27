package edu.xcdq;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/27 15:31
 */
public class Demo03 {
    public static void main(String[] args) throws Exception{       //继续向上声明，不处理
        /*try {
            steSex("双性人");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("非男非女");
        }*/
        steSex("afwarf");
    }
    public static void steSex(String sex) throws Exception{  //声明异常
        if (!(sex.equals("男")|| sex.equals("女"))){
           throw new Exception("处理不了的异常，扔出去");  //抛出异常
        }
    }
}
