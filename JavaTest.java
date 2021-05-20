package com.purplepaul.vanzilarjava;

public class JavaTest{

  private JavaTest(){
  }
  
  public static void main(String[] args){
    try{
      
      System.out.println("Haro!  Warudo! Genkai Kai?");
      
      if(314==314){
        //well why should the code do something
      }
      else{
        throw new Exception("Red Alert... something is very amiss... integers no longer work right");
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }
  
  }


}
