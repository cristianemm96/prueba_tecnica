package anfiteatro;

import anfiteatro.mensajesConsola.MensajesConsola;
import java.util.Scanner;

public class AnfiteatroMain {

    public static void main(String[] args) {
        //Inicializacion de clases y variables.
        int cantidadTotalFilas = 10;
        int cantidadTotalAsientos = 10;
        int filaIngresada;
        int asientoIngresado;
        Scanner objScanner = new Scanner(System.in);
        Anfiteatro anfiteatro = new Anfiteatro(cantidadTotalFilas, cantidadTotalAsientos);
        MensajesConsola mensajes = new MensajesConsola();
        //Muestra menu inicial
        mensajes.imprimirMenu();
        int opcionMenu = objScanner.nextInt();
        while (opcionMenu != 0) {
            switch (opcionMenu) {
                case 1:
                    anfiteatro.cargarMapa(mensajes);
                    break;
                case 2:
                    mensajes.imprimirMensajeReservaFila();
                    filaIngresada = objScanner.nextInt();
                    mensajes.imprimirMensajeReservaAsiento();
                    asientoIngresado = objScanner.nextInt();
                    if (anfiteatro.esAsientoValido(filaIngresada, asientoIngresado)) {
                        anfiteatro.intentarReserva(filaIngresada, asientoIngresado, mensajes);
                    } else {
                        mensajes.imprimirErrorDesbordeMapa();
                    }
                    break;
                case 3:
                    anfiteatro.mostrarAsientosLibres(mensajes);
                    break;
                default:
                    mensajes.imprimirErrorOpcion();
            }
            mensajes.imprimirMenu();
            opcionMenu = objScanner.nextInt();
        }
    }
}
