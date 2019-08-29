package fordigui;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName DiGui
 * Description TODO
 * @Author huyang
 * Date 2019/8/29 14:52
 **/
public class DiGui {
    public static  void main(String[] args){
        //递归
//        printMethod(1);
        int[] res = sortNum();
        getNum(res,34);
    }

    //递归
    private static void printMethod(int a){
        if (a <11){
            ++a;
            printMethod(a);
        }else{
            System.out.println("a=" + a);
        }
    }

    //冒泡
    private static int[] sortNum(){
        int[] is = {4,1,6,5,8,9,11,2,57,64,52,34,51,12,14,3,16,75,24};
        System.out.println(Arrays.toString(is));
        for (int i = 0;i < is.length - 1;i++){ // 外层 排序 轮数
            for(int j = 0; j < is.length -1 - i;j++){ // 内层 冒泡
                int pre = is[j];
                int next = is[j + 1];
                if(pre > next){
                    is[j] = next;
                    is[j + 1] = pre;
                }
            }
//            System.out.println(Arrays.toString(is));
        }
        System.out.println(Arrays.toString(is));
        return is;
    }

    //折半/二分
    private static int getNum(int[] arr, int num){
        int first = 0;
        int last = arr.length - 1;
        while(true){
            int mod = (first + last) / 2;
            if(arr[mod] > num){
                last = mod;
            }else if(arr[mod] < num){
                first = mod;
            }else{
                System.out.println("查询角标:" + mod);
                return mod;
            }
        }
    }
}
