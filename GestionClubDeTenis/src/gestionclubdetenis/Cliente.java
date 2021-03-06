package gestionclubdetenis;

/**
 * 
 */
public class Cliente {
    private String rut;
    private int multa;
    private boolean mensualidadPagada;
    private final int mensualidad = 35000;

    /**
     * 
     * @param rut
     */
    public Cliente(String rut) {
        this.rut = rut;
        this.multa = 0;
        this.mensualidadPagada = false;
    }

    /**
     * 
     * @param multa
     */
    public void anadirMulta(int multa) {
        this.multa += multa;
    }

    /**
     *
     */
    public void pagarDeuda() {
        multa = 0;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public boolean isMensualidadPagada() {
        return mensualidadPagada;
    }

    public void setMensualidadPagada(boolean mensualidadPagada) {
        this.mensualidadPagada = mensualidadPagada;
    }

    public int getMensualidad() {
        return mensualidad;
    }
    
    

}