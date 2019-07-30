/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.control.de.stock;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class ItemStock {
    
   private computadora computadora;
      private int cantidad ;
      private Date ultimaFechaModificacion; 

    public ItemStock(computadora computadora, int cantidad) {
        this.computadora = computadora;
        this.cantidad = cantidad;
    }

    public computadora getComputadora() {
        return computadora;
    }

    public int getCantidad() {
        return cantidad;
    }
                    
      
}
