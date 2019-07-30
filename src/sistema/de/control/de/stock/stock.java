/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.control.de.stock;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class stock {
   private ArrayList <ItemStock> items=new ArrayList<>();

    public ArrayList<ItemStock> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemStock> items) {
        this.items = items;
    }
           
           
}
