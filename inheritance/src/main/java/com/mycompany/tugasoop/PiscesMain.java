/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tugasoop;

/**
 *
 * @author rezar
 */
public class PiscesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    public static void main(String[] args) {
        // TODO code application logic here'
      Pisces ikan=new Pisces();
      IkanKoi merah=new IkanKoi();
      Lele kumis=new Lele();
      
      System.out.println("Ikan Koi berjenis tulang :" +ikan.StrukturTulang);
      ikan.StrukturTulang();
      
      System.out.println("Lele Bernafas dengan:" + ikan.AlatNafas);
      ikan.OrganPernafasan();
      
      ikan.Habitat();
    }  
       
    
    
}
