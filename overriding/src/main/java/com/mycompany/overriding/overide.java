/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.overriding;

/**
 *
 * @author rezar
 */
class Komputer {
  String cekInfo() { 
    return "Ini dari class Komputer"; 
  }
}
 
class Laptop extends Komputer {
  @Override
  String cekInfo() { 
    return "Ini dari class Laptop"; 
  }
}
 
class NyobainOverride {
  public static void main(String args[]){
     
    Laptop laptopReza = new Laptop();
    System.out.println(laptopReza.cekInfo());
   
  }
}