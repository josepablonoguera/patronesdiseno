/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

/**
 *
 * @author pablonoguera
 */
public class Numeros {
    
/**
 * Determinar(Mostrar) los numeros armstrong de 0 a 10000.
 * @param x
 * @return vector con los numeros de armstrong
 */    
boolean checkArmstrong(int x){ 
        int l = 0, n = x; 
        while(n!=0){ 
            l++; 
            n = n/10; 
        }
        int sum=0;
        int num = x;
        while(num!=0){ 
            int digit = num%10; 
            sum += Math.pow(digit, l); 
            num = num/10; 
        }
        return(sum == x); 
    } 
  /**
   * 
   * @param args 
   */
    public static void main(String[] args){ 
        Numeros a = new Numeros(); 
        
        for (int i = 0; i < 10000; i++) {
            if(a.checkArmstrong(i))
            System.out.println("Yes: "+ i);
        }
        
    } 
    
}
