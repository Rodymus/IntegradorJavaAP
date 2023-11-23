package org.example;

public class Incidente {

    private Long ID;
    private String descripcion;
    private String estatus;
    private String prioridad;
    private String tecnico_asignado;


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getTecnico_asignado() {
        return tecnico_asignado;
    }

    public void setTecnico_asignado(String tecnico_asignado) {
        this.tecnico_asignado = tecnico_asignado;
    }
}
