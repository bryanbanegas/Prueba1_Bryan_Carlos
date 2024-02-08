
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adalb
 */
public class MovieItem extends BlockBusterItem {
    private String estado;

    public MovieItem(String codigo, String nombre, double precioRenta) {
        super(codigo, nombre, precioRenta);
        this.estado="ESTRENO";
    }

    public String toString() {
        return super.toString()+" - "+estado+" – Movie";
    }

    public double pagoRenta(int dias) {
        double pago=getprecioRenta();
        if(estado.equals("ESTRENO")&&dias > 2){
            pago+=(dias-2)*50; 
        } else if(estado.equals("NORMAL")&&dias>5){
            pago+=(dias-5)*30; 
        }
        return pago;
    }

    public void evaluarEstado() {
        LocalDate fechaActual=LocalDate.now();
        LocalDate fechaAdicion=getfechaAdicion();
        long meses=ChronoUnit.MONTHS.between(fechaAdicion, fechaActual);
        if (meses>=5&&estado.equals("ESTRENO")) {
            estado = "NORMAL"; 
        }
    }
}
