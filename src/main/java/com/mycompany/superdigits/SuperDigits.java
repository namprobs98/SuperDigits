/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superdigits;

import java.util.Scanner;

/**
 *
 * @author Nhat Anh
 */
public class SuperDigits {
    
    //Tính tổng các chữ số của num
    private static long sumOfDigits(String num) {
        long sum = 0;
        for (char digit : num.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }
    //Tính super digit
    private static int superDigit(long num){
        //Lặp đến khi nào num < 10
        while(num >= 10){
            num =  sumOfDigits(Long.toString(num));
        }
    return (int) num;
    }
    
    //Hàm main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhận n và k từ input
        System.out.println("Nhập vào 2 số n và k cách nhau bởi khoảng trống");
        String n = sc.next();
        int k = sc.nextInt();
        
        //Tính tổng các chữ số của n
        long sumOfN = sumOfDigits(n);
        
        //Tính tổng các chữ số của P
        long sumOfP = sumOfN * k;
        
        //Tính super digits của P
        int superDigitOfP = superDigit(sumOfP);
        System.out.println("Super digit của P là: " + superDigitOfP);
    }
}
