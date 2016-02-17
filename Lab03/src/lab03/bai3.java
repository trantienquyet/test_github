/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class bai3 {
    public static void main(String [] args){
        int sum=0,n = 0,m,i=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap m:\t");
        m=scan.nextInt();
        while (sum<m) {
            i++;
            sum+=i;
            n=i-1;
        }
        System.out.println("So n can tim la:\t"+n);
    }
}
