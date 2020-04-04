package gestionclubdetenis;

/**
 * 
 */
public class Reserva {
    private Cliente cliente;
    private String horario;
    private int costo;
    private int pista;

    /**
     * 
     */
    public Reserva() {
    }

    /**
     * 
     * @return 
     */
    public int calcularCosto(){
        return 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getPista() {
        return pista;
    }

    public void setPista(int pista) {
        this.pista = pista;
    }
    
    



}