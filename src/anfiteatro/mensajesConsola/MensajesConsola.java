package anfiteatro.mensajesConsola;

/*

Clase que se encarga de los mensajes por consola.

*/

public class MensajesConsola {

    public MensajesConsola(){}
    
    public void imprimirMenu(){
        System.out.print("###-------------------------------------###\n");
        System.out.print("Presione 1 para ver el mapa de asientos.\n");
        System.out.print("Presione 2 para hacer una reserva.\n");
        System.out.print("Presione 3 ver los asientos libres.\n");
        System.out.print("Presione 0 para salir.\n");
        System.out.print("###-------------------------------------###\n");
    }
    
    public void imprimirFila(int fila){
        System.out.print("Fila "+ fila + "\n");
    }
    
    public void imprimirAsiento(int asiento, String estadoAsiento){
        System.out.print("[Asiento " + asiento + " => "+ estadoAsiento + "] ");
    }
    
    public void imprimirAsientoLibre(int asiento){
        System.out.print("[Asiento " + asiento + "] ");
    }
    
    public void imprimirMensajeReservaFila(){
        System.out.print("Ingrese numero de fila:...");
    }
    
    public void imprimirMensajeReservaAsiento(){
        System.out.print("Ingrese numero de asiento:...");        
    }
    
    public void imprimirErrorDesbordeMapa() {
        System.out.print(">>> El numero de asiento o fila ingresado no existe en el mapa. <<<\n");
    }
    
    public void imprimirErrorAsientoOcupado() {
        System.out.print(">>> No se puede realizar una reserva, este asiento esta ocupado. <<<\n");
    }
    
    public void imprimirMensajeReservaExitosa(int asientoIngresado, int filaIngresada) {
        System.out.print(">>> La reserva en el asiento "+ asientoIngresado + " de la fila "+ filaIngresada + " se ha realizado con exito. <<<\n");
    }
    
    public void imprimirErrorOpcion() {
        System.out.print(">>> La opcion ingresada no es correcta. <<<\n");
    }
    
    public void imprimirSaltoDeLinea(){
        System.out.print("\n");
    }

    public void mostrarMensajeAsientosLibres() {
        System.out.print("Los asientos libres son: \n");
    }
    
}
