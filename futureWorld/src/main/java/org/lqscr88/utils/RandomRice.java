package org.lqscr88.utils;

public class RandomRice {
    public static void main(String[] args) {
//        System.out.print(String.format("%.2f",(Math.random())));
        for (int i = 0; i <20 ; i++) {
            System.out.println(height());
        }

    }
    /*
      0.4-1随机数
    */
    public static String hand(){
        String handRice=String.format("%.2f",(Math.random()));
//        System.out.println(Float.parseFloat(handRice));
        if (Float.parseFloat(handRice)<0.40){
            return hand();
        }else {
            return  handRice;
        }

    }
    /*
      0.5-2.3随机数
    */
    public static String height(){
        String height=String.format("%.2f",(Math.random()*2+0.5));
        return height;
    }

    /*
     1-1000随机数
   */
    public static String randomNumber(){
        long round = Math.round(Math.random() *1000);
        return round+"";
    }


}
