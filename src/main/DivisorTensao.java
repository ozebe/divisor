/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public class DivisorTensao {
    public static float Calculo(float R1, float R2, float VIN, float OUT){
     float OUTreturn = 0;
     
     OUTreturn = VIN  * (R2 / (R1 + R2));
     return OUTreturn;
    }
  
}
