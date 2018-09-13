package dynamic.progaming;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class praktek {
    private static void tampilJudul(String identitas){
        System.out.println("Identitas : "+identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1 , 1, 2, 3, 4, 5, 8, 13, 21,..,dst.\n");
        
    }
    public static void main(String[]args){
        String identitas = "Natasya Putri Hardiyanti / XRPL5 /30";
    tampilJudul(identitas);
       int n = tampilinput();
         BigInteger hasil = fibo(n);
         tampilhasil(n ,hasil);
    }
    
    private static int tampilinput(){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Bilangan ke- :");
        int n = scanner.nextInt();
        return n ;
    }
 

    private static BigInteger fibo(int n){
        
        BigInteger []hasil = new BigInteger[n];
        hasil [0] = BigInteger.ONE;
        hasil[1]= BigInteger.ONE;
        
        for (int i= 2 ; i<n ; i++){
          hasil[i] = hasil [ i-1].add(hasil[i-2]);
        }
        return hasil [n-1];
        }
  
    private static void tampilhasil(int n , BigInteger hasil){
        System.out.println("Bilangan fibonacci ke-"+n +":"+hasil);
        
  
    }
    
    }
    
    
    