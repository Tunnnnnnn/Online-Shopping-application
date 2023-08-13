/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tun
 */
public class Laptop 
{
    public static List<Product> laptop()
    {
        List<Product> laptops = new ArrayList<>();
        
        laptops.add(new Product("Nitro 5", "Acer", 600));
        laptops.add(new Product("ROG", "Asus", 1000));
        laptops.add(new Product("Surface Pro", "Microsoft", 900));
        laptops.add(new Product("XPS13", "Dell", 800));
        
        return laptops;
        
    }
    
}
