/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoCajero;

/**
 *
 * @author joses
 */
public class NodoRegistro {

    private Clientes dato;
    private Empleado info;
    private NodoRegistro siguiente;

    public NodoRegistro() {
        this.siguiente = null;
    }

    public Clientes getDato() {
        return dato;
    }

    public void setDato(Clientes dato) {
        this.dato = dato;
    }

    public Empleado getInfo() {
        return info;
    }

    public void setInfo(Empleado info) {
        this.info = info;
    }

    public NodoRegistro getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRegistro siguiente) {
        this.siguiente = siguiente;
    }



}
