/*
* Wilmer Antonio Zuniga Gomez   12211100
* crear un administrador de productos, con el siguiente menu

1- agregar

2- listar

3- modificar

4 eliminar

5 salir
 */

//
package tarea.pkg1;

import java.util.Scanner;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JColorChooser;

public class Tarea1 {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        Dtabase lb = new Dtabase();

        boolean centinelita = true;
        
        System.out.println("PROBANDOOOOOOOOOOOO");
        
        while (centinelita == true) {
            System.out.println("");

            System.out.println(ANSI_YELLOW + "▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ " + ANSI_RESET + "PRODUCTOS" + ANSI_YELLOW + " ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀" + ANSI_RESET);
            System.out.println("        1)Agregar producto");
            System.out.println("        2)Eliminar producto");
            System.out.println("        3)Listar");
            System.out.println("        4)Modificar producto");
            System.out.println("        5)Salir");
            System.out.println(ANSI_YELLOW + "▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀" + ANSI_RESET);
            System.out.print("Ingrese la opcion deseada: ");

            int tinyopt = lea.nextInt(); //una opcion que es tiny 

            switch (tinyopt) {
                case 1: {
                    System.out.println();
                    System.out.println("-------------------------------");
                    System.out.println("Ingrese el codigo del producto que desea agregar: ");
                    lea.nextLine();
                    Integer codigo = lea.nextInt();
                    lb.setCodigo(codigo);
                    System.out.println("");

                    System.out.println("Ingrese el nombre del producto que desea agregar: ");
                    lea.nextLine();
                    String name = lea.nextLine();
                    lb.setNombre(name);
                    System.out.println("");

                    System.out.println("Ingrese el precio del producto que desea agregar: ");
                    Integer precio = lea.nextInt();
                    lb.setPrecio(precio);
                    System.out.println("");

                    Color color = Color.CYAN;
                    System.out.println("Ingrese el color del producto que desea agregar: ");
                    color = JColorChooser.showDialog(null, "-", color);
                    lb.setColor(color);
                    System.out.println("");

                    System.out.println("Ingrese la fecha de creacion del producto que desea agregar(yyyy/MM/dd): ");
                    lea.nextLine();
                    String fechcrea = lea.nextLine();
                    SimpleDateFormat sdfe = new SimpleDateFormat("yyyy/MM/dd");
                    Date crea = sdfe.parse(fechcrea);
                    lb.setFechaCrea(crea);
                    System.out.println("");

                    System.out.println("Ingrese la fecha de vencimiento del producto que desea agregar(yyyy/MM/dd): ");
                    String fechven = lea.nextLine();
                    Date ven = sdfe.parse(fechven);
                    lb.setFechaVen(ven);
                    System.out.println("");

                }
                break;

                case 2: {
                    System.out.println("-------------------------------");
                    System.out.println("Ingrese el indice del producto que desea eliminar: ");
                    int delete = lea.nextInt();
                    if ((delete - 1) < lb.codigo.size()) {
                        lb.codigo.remove(delete - 1);
                        lb.nombre.remove(delete - 1);
                        lb.precio.remove(delete - 1);
                        lb.color.remove(delete - 1);
                        lb.fechaCrea.remove(delete - 1);
                        lb.fechaVen.remove(delete - 1);
                        System.out.println("El producto fue eliminado exitosamente");
                    } else {
                        System.out.println("el producto ingresado no existe.");
                    }

                }
                break;

                case 3: {
                    System.out.println("");
                    System.out.println("--------------------------------------------------------------");
                    for (int i = 0; i < lb.codigo.size(); i++) {
                        System.out.println("Producto            " + (i + 1));
                        System.out.println("Codigo:             " + lb.codigo.get(i));
                        System.out.println("Nombre:             " + lb.nombre.get(i));
                        System.out.println("Precio:             " + lb.precio.get(i));
                        System.out.println("Color:              " + lb.color.get(i));
                        System.out.println("Fecha Creacion:     " + lb.fechaCrea.get(i));
                        System.out.println("Fecha Vencimiento:  " + lb.fechaVen.get(i));

                        System.out.println("");
                        System.out.println("");

                    }
                    System.out.println("--------------------------------------------------------------");

                }
                break;

                case 4: {
                    System.out.println("");
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Ingrese el indice del producto que desea modificar: ");
                    int mod = lea.nextInt();
                    
                    mod--;
                    
                    if ((mod - 1) < lb.codigo.size()) {
                        System.out.println("-------------------------------");
                        System.out.println("1 - Codigo            ");
                        System.out.println("2 - Nombre             ");
                        System.out.println("3 -Precio            ");
                        System.out.println("4 - Color              ");
                        System.out.println("5 - Fecha Creacion     ");
                        System.out.println("6 - Fecha Vencimiento  ");
                        System.out.println("-------------------------------");
                        System.out.println("Ingrese el dato que desea modificar: ");
                        int coso = lea.nextInt();

                        switch (coso) {
                            case 1: {
                                System.out.println("Ingrese el codigo del producto que desea agregar: ");
                                lea.nextLine();
                                Integer codigo = lea.nextInt();
                                lb.codigo.set(mod, codigo);
                                System.out.println("");
                            }
                            break;

                            case 2: {
                                System.out.println("Ingrese el nombre del producto que desea agregar: ");
                                lea.nextLine();
                                String name = lea.nextLine();
                                lb.nombre.set(mod, name);
                                System.out.println("");
                            }
                            break;

                            case 3: {
                                System.out.println("Ingrese el precio del producto que desea agregar: ");
                                Integer precio = lea.nextInt();
                                lb.precio.set(mod, precio);
                                System.out.println("");
                            }
                            break;

                            case 4: {
                                Color color = Color.CYAN;
                                System.out.println("Ingrese el color del producto que desea agregar: ");
                                color = JColorChooser.showDialog(null, "-", color);
                                lb.color.set(mod, color);
                                System.out.println("");
                            }
                            break;

                            case 5: {
                                System.out.println("Ingrese la fecha de creacion del producto que desea agregar(yyyy/MM/dd): ");
                                lea.nextLine();
                                String fechcrea = lea.nextLine();
                                SimpleDateFormat sdfe = new SimpleDateFormat("yyyy/MM/dd");
                                Date crea = sdfe.parse(fechcrea);
                                lb.fechaCrea.set(mod, crea);
                                System.out.println("");
                            }
                            break;

                            case 6: {
                                System.out.println("Ingrese la fecha de vencimiento del producto que desea agregar(yyyy/MM/dd): ");
                                String fechven = lea.nextLine();
                                SimpleDateFormat sdfe = new SimpleDateFormat("yyyy/MM/dd");
                                Date ven = sdfe.parse(fechven);
                                lb.fechaVen.set(mod, ven);
                                System.out.println("");
                            }
                            break;

                        }

                        System.out.println("El producto fue modificado exitosamente");
                    } else {
                        System.out.println("el producto ingresado no existe.");
                    }
                    System.out.println("--------------------------------------------------------------");
                }
                break;

                case 5: {
                    centinelita = false;
                    System.out.println("");
                }
                break;

                default: {
                    System.out.println("OPCION EQUIVOCADA, QUE DESCEPCION DE PERSONA.");
                }
            }
        }

    }

//FIN  DEL CASO UNO    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

}
