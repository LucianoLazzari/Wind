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
    float angulo (float A, float Real, float Alpha, float bSp){ 
        
        float Beta;
        
        Beta = (float) Math.acos((float) ((A*Math.cos(Alpha)-bSp)/Real));
       
        
        return Beta;
    }
    
}
