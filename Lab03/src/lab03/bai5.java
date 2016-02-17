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
public class bai5 {
    public static void main(String [] args){
        double x,sum=0;
        int i=1;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("So thu "+i+":\t");
            x=scan.nextDouble();
            if (x%2==0){
                sum+=x;
        }
            i++;   
        } while (i<=20);
            System.out.println("sum "+sum);      
    }
}
