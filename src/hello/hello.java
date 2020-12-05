package hello;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author jinlu
 * @create 2020-12-03 9:57
 */
public class hello {
    public static void main(String[] args) {
        System.out.println("xixiixi");
        System.out.println("hello0");
        int num=1;
        int a =10;
        System.out.println(a);
        System.out.println("num = " + num);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("hello.main");

        String arr[]=new String[]{"lixuehui","jinlu","haha","xiuzhengdai"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        for (String s : arr) {
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(567);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

    }
    public void method(){
        System.out.println("hello.method");
    }
}
