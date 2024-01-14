package com;



public class Main {

  public static void main(String[] args) {
  
     /*
     TTRA
     BTS2
     Symbol Value
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
     
Example 1:
Input: s = "III"
Output: 3
Example 2:
Input: s = "IV"
Output: "4
Example 3:
Input: s = "IX"
Output: 9
Example 4:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 5:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     w h h 6
     */
   rom("LVII");
  
   //System.out.println(two("VX"));
  }
  public static void rom(String s){
    char[] r = s.toCharArray();
    int z = 0;
    if(r.length%2 == 0){
      int t = (r.length) /2;
      
      //System.out.println("jor"+t);
      for(int i = 0; i<t; i++){
        System.out.println(two(""+r[z]+r[++z])  );
        z++;
      }
      
    }else{
      if(r.length == 1){
        
      }else {
        
      }
      System.out.println("bejor");
    }
    
    
  }
  
  public static int two(String s){
    int r = -1;
    char[] c = s.toCharArray();
    if(c[1] == 'I'){
      r = one(c[1]);
      r += one(c[0]);
      //System.out.println("jog");
    }else{
      r = one(c[1]);
      r -= one(c[0]);
      //System.out.println("biyog");
    }
    return r;
    
  }
  
  
  
  
  
  
  
  public static int one(char c){
    int r = -1;
    switch (c){
      case 'I': 
         r = 1;
         break;
      
      case 'V': 
         r = 5;
         break;
         
      case 'X': 
         r = 10;
         break;
         
      case 'L': 
         r = 50;
         break;
         
      case 'C': 
         r = 100;
         break;
         
      case 'D': 
         r = 500;
         break;
         
      case 'M': 
         r = 1000;
         break;
      
    }
    return r;
    
    
  }
  
  
  
  
  
}
