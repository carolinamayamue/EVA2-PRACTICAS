/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Circulo extends FiguraGeometrica {
    
    private double radio;


    @Override
    public int calcularArea() {
        return (int) (Math.PI*(Math.pow(radio, 2)));
    }

    @Override
    public void dibujar() {
        
    }
    
    

    
 
}
