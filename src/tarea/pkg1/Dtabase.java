package tarea.pkg1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

public class Dtabase {

    public ArrayList<Integer> codigo = new ArrayList<>();
    public ArrayList<String> nombre = new ArrayList<>();
    public ArrayList<Integer> precio = new ArrayList<>();
    public ArrayList<Color> color = new ArrayList<>();
    public ArrayList<Date> fechaCrea = new ArrayList<>();
    public ArrayList<Date> fechaVen = new ArrayList<>();

    public Dtabase() {

    }

    public ArrayList<String> getNombre() {//para imprimir y obtener el dato
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.add(nombre);

    }
    public ArrayList<Integer> getCodigo() {//para imprimir y obtener el dato
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo.add(codigo);
    }

    public ArrayList<Integer> getPrecio() {//para imprimir y obtener el dato
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio.add(precio);
    }

    public ArrayList<Color> getColor() {//para imprimir y obtener el dato
        return color;
    }

    public void setColor(Color colorcito) {
        this.color.add(colorcito);
    }

    public ArrayList<Date> getFechaCrea() {//para imprimir y obtener el dato
        return fechaCrea;
    }

    public void setFechaCrea(Date fecha) {
        this.fechaCrea.add(fecha);

    }

    public ArrayList<Date> getFechaVen() {//para imprimir y obtener el dato
        return fechaVen;
    }

    public void setFechaVen(Date fecha) {
        this.fechaVen.add(fecha);
    }

}
