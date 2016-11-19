/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myWind;

/**
 *
 * @author Luciano
 */
public class CalcVientoReal {
    float modulo(float A, float R, float Alpha){
        float Real;
        
        Real = (float) Math.sqrt((Math.pow(A,2)+Math.pow(R,2)-2*A*R*Math.cos(Alpha)));
        
        return Real;
}
    float angulo (float A, float Real, float Alpha){ 
        
        float Beta;
        
        Beta = (float) (A*Math.sin(Alpha)/Real);
        
        return Beta;
    }
    
}
