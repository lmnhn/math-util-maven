/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhandz.mathutil.main;

import com.nhandz.mathutil.core.MathUtility;

/**
 *
 * @author lmnhn
 */
public class Main {
    public static void main(String[] args) {
        //test thứ mình vừa viết tính giai thừa có 
        // đúng kh
        // chuẩn bị bộ data test
        //Test case #1 check if getFactorial() runs well with n=0
        
        //test producer
        //              given n= 0
        //              invoke getFactorial (n=0)
        
        //Expected result: 1; //0! == 1 ????
        
        long Expected = 1;  //em hy vongj 1 ddc trar veef
        long n= 0;          // nếu anh đưa vào 0!
        long actual = MathUtility.getFactorial(0);
        
        //in ra và tự kết luận có gióng kì vọng hay ko
        System.out.println(n + "! | expected = "+Expected
                            + "| actual = "+actual);
        
        
        //Test case #2 check if getFactorial() runs well with n = 1
        
        //test producer
        //              given n= 1
        //              invoke getFactorial (n=1)
        
        //Expected result: 1; //1! == 1 ????
        
         //in ra và tự kết luận có gióng kì vọng hay ko
        System.out.println(n+1 + "! | expected = "+Expected
                            + "| actual = "+MathUtility.getFactorial(1));
        
        
        
        
    }
}
