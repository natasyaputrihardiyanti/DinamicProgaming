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
public class Tugas2 {
    
    public static void main(String[]args){
         String identitas = "Natasya Putri Hardiyanti / XRPL5 /30";
    judul(identitas);
     int [] Berat= new int []{7 , 5, 4 , 3, 2};
   
     int berat = input();
     int[] Harga = new int []{1000 , 7000 , 5000, 3000, 2000};
     perhitungan(berat , Berat , Harga);
     
    }
     private static int input(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Berat Barang  =  " );
        
       int bb = scan.nextInt();
       return bb ;
    }
   
    public static void judul(String identitas){
         System.out.println(" Nama Saya  : "+identitas);
         
         System.out.println("==JASA PENGANGKUT BARANG==");
         
         
         
        
      
    }
    private static void perhitungan (int bb ,int []Berat , int []Harga){
        int jumlah= 0 ;
        
    
        for (int i = 0 ; i< Berat.length; i++) {
         int n = 0 ;
         while (bb >=Berat[i]){
             bb = bb- Berat[i];
             n++;
         }
         int total = n* Harga[i];
            System.out.println(Berat[i]+" sebanyak "+ n + " dengan harga Rp." +total);
            jumlah= jumlah + total ;
            
             
         }
        System.out.println("\nTotal Bayaran : Rp. " +jumlah );
        
          }
    }

        
   
       
            
        
          
    
        
                    




