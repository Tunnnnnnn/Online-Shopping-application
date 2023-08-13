/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author tun
 */
public class PCparts 
{
    public static List<Product> part()
    {
        List<Product> parts = new ArrayList<>();
        
        parts.add(new Product("GTX3070", "EVGA", 600));
        parts.add(new Product("Core I5", "Intel", 300));
        parts.add(new Product("GTX4090", "Nvidia", 1400));
        
        return parts;
    }
    
}
