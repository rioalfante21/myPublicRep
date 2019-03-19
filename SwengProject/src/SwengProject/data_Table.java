/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwengProject;
    
/**
 *
 * @author Alfante
 */
public class data_Table {
    private String item_menu1, item_type1;
    private int quantity_ordered1;
    private double total_value1;
    public data_Table(String item_menu1, int quantity_ordered1, double total_value1, String item_type1){
        this.item_menu1 = item_menu1;
        this.item_type1 = item_type1;
        this.quantity_ordered1 = quantity_ordered1;
        this.total_value1 = total_value1;    
}
    public String getitem_menu1(){
        return item_menu1;
    }
     public String getitem_type1(){
        return item_type1;
    }
    public int getquantity_ordered1(){
        return quantity_ordered1;
    }
    public double gettotal_value1(){
        return total_value1;
    }
}
