
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adalb
 */
public class BlockBuster {

    private ArrayList<BlockBusterItem> items;

    public BlockBuster() {
        this.items = new ArrayList<>();
    }

    public BlockBusterItem buscarItem(int codigo, String tipo) {
        for (BlockBusterItem item : items) {
            if (item instanceof MovieItem&&tipo.equals("MOVIE")||item instanceof VideoGameItem&&tipo.equals("GAME")){
                if(item.getCodigo().equals(Integer.toString(codigo))){
                    return item;
                }
            }
        }
        return null; 
    }

    public void agregarItem(int codigo, String nombre, String tipoItem) {
        Scanner scanner=new Scanner(System.in);
        if (buscarItem(codigo, tipoItem)==null) {
            if (tipoItem.equals("MOVIE")) {
                System.out.println("Ingrese el estado de la pelicula (ESTRENO/NORMAL):");
                String estado=scanner.nextLine();
                items.add(new MovieItem(Integer.toString(codigo),nombre,estado.equals("ESTRENO")? 50:30));
            } else if (tipoItem.equals("GAME")) {
                System.out.println("Ingrese la consola del videojuego (PLAYSTATION/XBOX/WII):");
                String consola = scanner.nextLine();
                items.add(new VideoGameItem(consola));
            }
            System.out.println("Item agregado correctamente.");
        } else {
            System.out.println("Ya existe un ítem con ese codigo y tipo.");
        }
    }

    public void rentar(int codigo, String tipoItem, int dias) {
        BlockBusterItem item=buscarItem(codigo, tipoItem);
        if (item != null){
            System.out.println("Detalles del item:");
            System.out.println(item);
            System.out.println("Monto a pagar: Lps. "+item.pagoRenta(dias));
        } else {
            System.out.println("Item No Existe");
        }
    }

    public void auditarMovieEstados() {
        for (BlockBusterItem item : items) {
            if (item instanceof MovieItem) {
                ((MovieItem)item).evaluarEstado();
            }
        }
    }
}
