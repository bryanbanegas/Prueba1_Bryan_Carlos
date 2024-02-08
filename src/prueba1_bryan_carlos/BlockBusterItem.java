
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adalb
 */
public abstract class BlockBusterItem {
    private String codigo;
    private String nombre;
    private double precioRenta;
    private LocalDate fechaAdicion;

    public BlockBusterItem(String codigo, String nombre, double precioRenta) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.precioRenta=precioRenta;
        this.fechaAdicion=LocalDate.now(); 
    }

    public String toString() {
        return "Código: "+codigo+", Nombre: "+nombre+", Precio de Renta: "+precioRenta;
    }
    
    public double getprecioRenta() {
        return precioRenta;
    }
    
    public LocalDate getfechaAdicion() {
        return fechaAdicion;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getnombre() {
        return nombre;
    }

    public abstract double pagoRenta(int dias);
}
