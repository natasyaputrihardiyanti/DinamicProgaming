/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic.progaming;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Tugas1 {
    public static void main (String[]args){
       int uang = input() ;
       int []Nominal = new int []{5000 , 2000, 1000, 500, 100};
       jumlahuang(uang , Nominal);
    }
    private static int input(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Jumlah Uang = Rp. ");
        
       int uang = scan.nextInt();
       return uang ;
    }
    private static void jumlahuang(int uang , int[]Nominal){
        for (int i =0 ; i< Nominal.length;i++){
            int y = 0;
            while(uang >= Nominal[i]){
                uang =uang - Nominal[i];
                y++;
            }
            System.out.println(Nominal[i] + "Sebanyak :"+y);
            
            
        }
    }
}
