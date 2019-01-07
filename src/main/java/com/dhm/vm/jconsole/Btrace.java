package com.dhm.vm.jconsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2019/1/6 12:53
 */
public class Btrace {
    public int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) throws IOException {
        Btrace btrace = new Btrace();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            reader.readLine();
            int a = (int)Math.round(Math.random() * 1000);
            int b = (int)Math.round(Math.random() * 1000);
            System.out.println(btrace.add(a,b));
        }
    }
}
