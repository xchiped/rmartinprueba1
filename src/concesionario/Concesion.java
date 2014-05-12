/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author avanza
 */
public class Concesion {
      Coche[] stock;
      int numCochesStock;
      int maxNumCoches;
      
      
      public Concesion(int NumCoches)
      {
          stock = new Coche[NumCoches];
          numCochesStock=0;
          maxNumCoches=NumCoches;
      }
      //insertarCoche("seat","leon","rojo","12312asd");
      public boolean insertarCoche(String marca,String modelo,String color,String matricula){
          boolean retorno;
          if (numCochesStock==maxNumCoches)
              retorno = false;
          else{
              Coche miCoche = new Coche();
              miCoche.setModelo(modelo);
              miCoche.setMarca(marca);
              miCoche.setColor(color);
              miCoche.setMatricula(matricula);
              stock[numCochesStock]=miCoche;
              numCochesStock++;
              retorno=true;
          }
          return retorno;
      }
      
      public int cochesEnMiConcesionario()
      {
          return numCochesStock;
      }
      
      public void listarStock(){
          for (int i=0;i<numCochesStock;i++)              
          {
              Coche aux=new Coche();
              aux = stock[i];
              System.out.println(aux.getMarca()+"-"+aux.getModelo()+"-"+aux.getColor()+"-"+aux.getMatricula());
          }
      }
      
      
}
