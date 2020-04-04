package gestionclubdetenis;

/**
 * 
 */
public class Reserva {
    private Cliente cliente;
    private String horario;
    private String dia;
    private int costo;
    private int pista;

    /**
     * 
     * @param dia
     * @param horario
     * @param cliente
     * @param pista
     */
    public Reserva(String dia, String horario, Cliente cliente, int pista) {
        this.dia = dia;
        this.horario = horario;
        this.cliente = cliente;
        this.pista = pista;
        this.costo = calcularCosto();
    }

    /**
     * 
     * @return 
     */
    public int calcularCosto(){
        if(dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miercoles") || 
                dia.equals("Jueves") || dia.equals("Viernes")){
            if (horario.equals("08:00") || horario.equals("09:00") || horario.equals("10:00") ||
                    horario.equals("11:00") || horario.equals("12:00") || horario.equals("13:00") ||
                    horario.equals("14:00") || horario.equals("15:00") || horario.equals("16:00") ||
                    horario.equals("17:00") || horario.equals("18:00")){
                return 5000;
            }
            else if (horario.equals("19:00") || horario.equals("20:00") || horario.equals("21:00") ||
                    horario.equals("22:00") || horario.equals("23:00")){
                return 4000;
            }
        }
        else if (dia.equals("Sabado") || dia.equals("Domingo") ){
            if (horario.equals("08:00") || horario.equals("09:00") || horario.equals("10:00") ||
                    horario.equals("11:00") || horario.equals("12:00") || horario.equals("13:00") ||
                    horario.equals("14:00") || horario.equals("15:00") || horario.equals("16:00") ||
                    horario.equals("17:00") || horario.equals("18:00")){
                return 7000;
            }
            else if (horario.equals("19:00") || horario.equals("20:00") || horario.equals("21:00") ||
                    horario.equals("22:00") || horario.equals("23:00")){
                return 6000;
            }
        }
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