
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adalb
 */
public class VideoGameItem extends BlockBusterItem {
    private String consola;

    public static final String PLAYSTATION="PLAYSTATION";
    public static final String XBOX="XBOX";
    public static final String WII="WII";

    public VideoGameItem(String consola) {
        super("", "", 30); 
        this.consola=consola;
    }

    public String toString() {
        return super.toString()+" - "+consola+" Game";
    }

    public double pagoRenta(int dias) {
        return getprecioRenta()*dias;
    }
    
    
}
