/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Personal
 */
public class main {
    public static void main(String[] args){

       int M_1 [][] = new int [2][2];
       int M_2 [][] = new int [2][2];
       int M_3 [][] = new int [2][2];
       int M_R1 [][] = new int [2][2];
       int M_R2 [][] = new int [2][2];
       

         for(int i = 0; i < M_1.length; i++){
              for(int j = 0; j<M_1.length; j++) {
          M_1[i][j] = (int) (Math.random() *9);
         }         
}
         for(int i = 0; i < M_2.length; i++){
              for(int j = 0; j<M_2.length; j++) {
          M_2[i][j] = (int) (Math.random() *9);   
}
}
         for(int i = 0; i < M_3.length; i++){
              for(int j = 0; j<M_3.length; j++) {
          M_3[i][j] = (int) (Math.random() *9);   
}
}

for(int i = 0; i < M_1.length; i++){
              for(int j = 0; j<M_2.length; j++) {
                M_R1[i][j] = M_1[i][j] + M_2[i][j];  
}
}
    


      }
}
