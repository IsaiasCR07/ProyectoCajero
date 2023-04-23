/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoCajero;

import javax.swing.JOptionPane;

/**
 *
 * @author joses
 */
public class Registro {

    private Clientes c = new Clientes();
    private Empleado e = new Empleado();
    private NodoRegistro cabeza;

    public boolean vacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarCliente() {
        c.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre del cliente: "));
        c.setApellido(JOptionPane.showInputDialog(null, "Digite el apellido del cliente: "));
        c.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cedula del usuario: ")));
        c.setNombreUsuario(JOptionPane.showInputDialog(null, "Digite el nombre de usuario en linea: "));
        c.setContraseña(JOptionPane.showInputDialog(null, "Digite la contraseña para usuario en linea: "));
        c.setPin(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el pin de la cuenta: ")));
        c.setNumCliente(c.getNumCliente() + 1);
        c.setBalance(5);

        NodoRegistro nuevo = new NodoRegistro();
        nuevo.setDato(c);
        if (vacia()) {
            cabeza = nuevo;
        } else if (c.getCedula() < cabeza.getDato().getCedula()) {
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        } else if (cabeza.getSiguiente() == null) {
            cabeza.setSiguiente(nuevo);
        } else {
            NodoRegistro aux = cabeza;
            while ((aux.getSiguiente() != null)
                    && (aux.getSiguiente().getDato().getCedula() < c.getCedula())) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }

    }

    public void agregarEmpleado() {
        e.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre del empleado: "));
        e.setApellido(JOptionPane.showInputDialog(null, "Digite el apellido del empleado: "));
        e.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de empleado: ")));
        e.setNombreUsuario(JOptionPane.showInputDialog(null, "Digite el nombre de usuario corporativo: "));
        e.setContraseña(JOptionPane.showInputDialog(null, "Digite la contraseña para usuario corporativo: "));
        e.setNumEmpleado(e.getCedula());

        NodoRegistro nuevo = new NodoRegistro();
        nuevo.setDato(c);
        if (vacia()) {
            cabeza = nuevo;
        } else if (c.getCedula() < cabeza.getDato().getCedula()) {
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        } else if (cabeza.getSiguiente() == null) {
            cabeza.setSiguiente(nuevo);
        } else {
            NodoRegistro aux = cabeza;
            while ((aux.getSiguiente() != null)
                    && (aux.getSiguiente().getDato().getCedula() < c.getCedula())) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public boolean verificarPin(int pin) {
        NodoRegistro actual = new NodoRegistro();
        actual = cabeza;
        boolean encontrado = false;
        if (cabeza != null) {
            while (actual != null && encontrado != true) {
                if (actual.getDato().getPin() == pin) {
                    return true;
                }
                actual = actual.getSiguiente();
            }
        }

        return false;
    }

    public void cambiarPin(int pinActual, int nuevoPin) {
        NodoRegistro actual = new NodoRegistro();
        actual = cabeza;
        boolean encontrado = false;
        if (cabeza != null) {
            while (actual != null && encontrado != true) {
                if (actual.getDato().getPin() == pinActual) {
                    actual.getDato().setPin(nuevoPin);
                }
                actual = actual.getSiguiente();
            }
        }

    }

    public void mostrar() {
        if (!vacia()) {
            String str = "";
            NodoRegistro aux = cabeza;
            while (aux != null) {
                str += aux.getDato().getNombre() + " - " + aux.getDato().getApellido()
                        + " - " + aux.getDato().getCedula() + " - " + aux.getDato().getNombreUsuario()
                        + " - " + aux.getDato().getContraseña()
                        + " - " + aux.getDato().getNumCliente() + " | ";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene: \n" + str,
                    "Contenido de la Lista", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia!",
                    "Lista vacía", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean extraerDinero(int cantidadExtraer, int pin) {
        boolean transaccion = false;
        NodoRegistro actual = new NodoRegistro();
        actual = cabeza;
        boolean encontrado = false;
        if (cabeza != null) {
            while (actual != null && encontrado != true) {
                if (actual.getDato().getPin() == pin) {
                    if (actual.getDato().getBalance() >= cantidadExtraer) {
                        actual.getDato().setBalance((actual.getDato().getBalance()) - cantidadExtraer);
                        transaccion = true;
                        encontrado = true;
                    } else {
                        transaccion = false;
                        encontrado = true;
                    }
                }
                actual = actual.getSiguiente();
            }
        }

        return transaccion;
    }

    public void depositarDinero(int cantidadExtraer, int pin) {
        NodoRegistro actual = new NodoRegistro();
        actual = cabeza;
        boolean encontrado = false;
        if (cabeza != null) {
            while (actual != null && encontrado != true) {
                if (actual.getDato().getPin() == pin) {
                        actual.getDato().setBalance((actual.getDato().getBalance()) + cantidadExtraer);
                        encontrado = true;
                    }
                }
                actual = actual.getSiguiente();
        }
        
    }

}
