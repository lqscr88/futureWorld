package org.lqscr88.utils.attribute;

public class Attributes {

    /*
      任务属性概率计算方法
    */
    public static String getAttribute(){
        String[] gradeOne=new String[5];
        gradeOne[0]="金";
        gradeOne[1]="木";
        gradeOne[2]="水";
        gradeOne[3]="火";
        gradeOne[4]="土";
        String[] gradeTwo=new String[8];
        gradeTwo[0]="风";
        gradeTwo[1]="雷";
        gradeTwo[2]="冰";
        gradeTwo[3]="毒";
        gradeTwo[4]="光";
        gradeTwo[5]="暗";
        gradeTwo[6]="阴";
        gradeTwo[7]="阳";
        String[] gradeThree=new String[5];
        gradeThree[0]="生命";
        gradeThree[1]="死亡";
        gradeThree[2]="时间";
        gradeThree[3]="空间";
        gradeThree[4]="吞噬";
        String[] gradefour=new String[4];
        gradefour[0]="创造";
        gradefour[1]="毁灭";
        gradefour[2]="虚无";
        gradefour[3]="混沌";

        String gl=String.format("%.3f",(Math.random()*100));
//        System.out.println(gl);
        if (Float.parseFloat(gl)>3.000){
            return gradeOne[(int) Float.parseFloat(gl)%gradeOne.length];
        }else if(Float.parseFloat(gl)<3.000&&Float.parseFloat(gl)>0.500){
            return gradeTwo[(int) (Float.parseFloat(gl)*1000)%gradeTwo.length];
        }else if(Float.parseFloat(gl)<0.500&&Float.parseFloat(gl)>0.005){
            return gradeThree[(int) (Float.parseFloat(gl)*1000)%gradeThree.length];
        }else if(Float.parseFloat(gl)<0.005){
            return gradefour[(int) (Float.parseFloat(gl)*1000)%gradefour.length];
        }
        return getAttribute();
    }

    public static void main(String[] args) {

        for (int i = 0; i <10000 ; i++) {
            System.out.println(getAttribute());
        }
//        System.out.println((int)(Float.parseFloat(gl)*1000));
//        System.out.println(4%4);
    }
}
