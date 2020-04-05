package gestionclubdetenis;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 
 */
public class GestionClubDeTenis {
    
    private ArrayList<Reserva> reservasRealizadas;
    private ArrayList<Cliente> sociosRegistrados;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionClubDeTenis g = new GestionClubDeTenis();
        g.menu();
    }
    
    /**
     * Constructor de la clase, se crean algunos socios y reservas para probar
     */
    public GestionClubDeTenis() {
        reservasRealizadas = new ArrayList<>();
        sociosRegistrados = new ArrayList<>();
        /* Registrar clientes para pruebas */
        Cliente a = new Cliente("12345678-9");
        Cliente b = new Cliente("11111111-1");
        Cliente c = new Cliente("9999999-9");
        sociosRegistrados.add(a);
        sociosRegistrados.add(b);
        sociosRegistrados.add(c);
        
        /* Registrar reservas para pruebas */
        reservasRealizadas.add(new Reserva("Lunes", "17:00", a, 1));
        reservasRealizadas.add(new Reserva("Sabado", "10:00", a, 2));
        reservasRealizadas.add(new Reserva("Jueves", "15:00", b, 1));
        reservasRealizadas.add(new Reserva("Sabado", "23:00", b, 3));
        reservasRealizadas.add(new Reserva("Viernes", "19:00", b, 4));
    }

    /**
     * 
     */
    public void menu() {
        String op = "";
        Scanner s = new Scanner(System.in);
        System.out.println("-----MENU-----");
        System.out.print("Ingrese rut: ");
        String rut = s.nextLine();
        Cliente cliente = null;
        for (Cliente c: sociosRegistrados){
            if (c.getRut().equals(rut)){
                cliente = c;
                break;
            }
        }
        System.out.print("¿Coincide identidad? [S/N]: ");
        String confirmacion = s.nextLine();
        if(confirmarIdentidad(confirmacion)){
            while(!op.equals("0")){
                System.out.println("1. Reservar cancha de tenis.");
                System.out.println("2. Servicios restaurante.");
                System.out.println("3. Pagar deudas.");
                System.out.println("4. Simular paso de 1 mes.");
                System.out.println("0. Salir");
                System.out.print("Ingrese opcion: ");
                op = s.nextLine();
                switch (op) {
                    case "1":
                        if (cliente.getMulta()>0 && !cliente.isMensualidadPagada()){
                            System.out.println("El socio tiene deudas, no puede reservar");
                        }
                        else{
                            System.out.print("Ingrese pista a reservar: ");
                            int pista = Integer.parseInt(s.nextLine());
                            System.out.print("Ingrese día [Lunes, Martes, "
                                    + "Miercoles, Jueves, Viernes, Sabado, Domingo]: ");
                            String dia = s.nextLine();
                            System.out.print("Ingrese hora [08:00 a 23:00]: ");
                            String hora = s.nextLine();
                            if(verificarDisponibilidad(pista, hora, dia)){
                                Reserva r = new Reserva(dia, hora, cliente, pista);
                                reservasRealizadas.add(r);
                                cliente.anadirMulta(r.getCosto());
                            }
                            else{
                                System.out.println("Pista no disponible con ese horario");
                            }
                        }
                        break;
                    
                    case "2":
                        System.out.print("Ingrese total de lo consumido: ");
                        int total = (int) (Integer.parseInt(s.nextLine())*0.9);
                        System.out.println("Total a pagar con descuento de socio: $" + total);
                        System.out.println("1. Pagar ahora");
                        System.out.println("2. Pagar despues");
                        String opcion = s.nextLine();
                        if (opcion.equals("1")){
                            System.out.println("Monto pagado, muchas gracias.");
                        }
                        else{
                            cliente.anadirMulta(total);
                            System.out.println("Se añadio el total a su cuenta.");
                        }
                        break;
                        
                    case "3":
                        System.out.println("-----Pagar deudas-----");
                        System.out.print("¿El socio esta pagando a tiempo? "
                                + "(Antes de fin de mes) [S/N]:");
                        String fechaPago = s.nextLine();
                        int deuda;
                        if(cliente.isMensualidadPagada()){
                            deuda = cliente.getMulta();
                        }
                        else{
                            deuda = cliente.getMulta() + cliente.getMensualidad();
                        }
                        if(fechaPago.equals("S")){
                            
                            System.out.println("Total a pagar: $" + deuda);
                            
                            
                        }
                        else{
                            System.out.println("Se le añade el 10% de multa al pago");
                            System.out.println("Total a pagar: $ " + (deuda*1.1));
                            
                        }
                        cliente.setMulta(0);
                        cliente.setMensualidadPagada(true);
                        System.out.println("Pagado... Muchas gracias.");
                        break;
                        
                    case "4":
                        System.out.println("Simulando el paso de 1 mes, todos los clientes deben su membresía");
                        for(Cliente c: sociosRegistrados){
                            c.setMensualidadPagada(false);
                        }
                        break;
                }
            }
            
        }
        else{
            System.out.println("No puede acceder a los servicios");
        }
    }

    /**
     * 
     * @param confirmacion
     * @return
     */
    public boolean confirmarIdentidad(String confirmacion) {
        return confirmacion.equals("S");
        
    }

    /**
     * @param pista
     * @param horario
     * @param dia
     * @return
     */
    public boolean verificarDisponibilidad(int pista, String horario, String dia) {
       for (Reserva r: reservasRealizadas){
           if (r.getPista()==pista && r.getHorario().equals(horario) && r.getDia().equals(dia)){
               return false;
           }
       }
        return true;
    }

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }

    public void setReservasRealizadas(ArrayList<Reserva> reservasRealizadas) {
        this.reservasRealizadas = reservasRealizadas;
    }

    public ArrayList<Cliente> getSociosRegistrados() {
        return sociosRegistrados;
    }

    public void setSociosRegistrados(ArrayList<Cliente> sociosRegistrados) {
        this.sociosRegistrados = sociosRegistrados;
    }
    
    

}