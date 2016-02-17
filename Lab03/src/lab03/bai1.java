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
public class bai1 {
    public static void main(String [] args){
        int x,nam;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap thang:\t");
        x=scan.nextInt();
        switch (x){
            case 2:
                System.out.print("Nhap nam:\t");
                nam=scan.nextInt();
                if (nam%4==0 && nam%100!=0 || (nam%400==0)){
                    System.out.println("Thang nay co 29 ngay");  
                }
                else System.out.println("Thang nay co 28 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang nay co 30 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang nay co 31 ngay");
                break;
            default:
                System.out.println("Nam ngoai gia tri cua thang... Xin nhap lai");
        }
              
//        if (x==2){
//            System.out.print("Nhap nam: ");
//            nam=scan.nextInt();
//            if (nam%4==0 && nam%100!=0 || (nam%400==0)){
//                System.out.println("Thang nay co 29 ngay");  
//            }
//            else System.out.println("Thang nay co 28 ngay");
//        }
//        if (x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12){
//            System.out.println("Thang nay co 31 ngay");
//                }
//        if (x==4 || x==6 || x==9 || x==11){
//       System.out.println("Thang nay co 30 ngay");
//        }
    }
}
