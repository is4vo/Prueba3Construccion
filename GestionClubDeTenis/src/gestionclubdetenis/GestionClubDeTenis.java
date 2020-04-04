package gestionclubdetenis;

import java.util.ArrayList;


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
        // TODO code application logic here
    }
    
    /**
     * 
     */
    public GestionClubDeTenis() {
    }

    /**
     * 
     */
    public void menu() {
    }

    /**
     * 
     * @param confirmacion
     * @return
     */
    public boolean confirmarIdentidad(String confirmacion) {
        return false;
    }

    /**
     * @param pista
     * @param horario
     * @return
     */
    public boolean verificarDisponibilidad(int pista, String horario) {
       
        return false;
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