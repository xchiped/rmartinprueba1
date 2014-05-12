/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author avanza
 */
public class Coche {
    String marca;
    String modelo;
    String color;
    String matricula;
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public String getMatricula(){
        return matricula;
    }

    
    public void setMarca(String m)
    {
        marca=m;    
    }
    public void setModelo(String m)
    {
        modelo=m;    
    }
    public void setColor(String m)
    {
        color=m;    
    }
    public void setMatricula(String mat)
    {
        matricula=mat;    
    }
    
}
