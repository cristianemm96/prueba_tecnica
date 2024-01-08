package anfiteatro;

import anfiteatro.mensajesConsola.MensajesConsola;

class Anfiteatro {
    final String[][] mapa;
    final int cantFilas;
    final int cantAsientos;
    final String estadoLibre = "L";
    final String estadoOcupado = "X";
    
    public Anfiteatro(int cantFilas, int cantAsientos) {
        this.mapa = new String[cantFilas][cantAsientos];
        this.cantFilas = cantFilas;
        this.cantAsientos = cantAsientos;
        iniciarMapa();
    }
    
    private void iniciarMapa(){
        for(int i = 0; i < this.cantFilas; i++){
            for(int j = 0; j < this.cantAsientos; j++){
                mapa[i][j] = this.estadoLibre;
            }
        }
    }
    
    public boolean esAsientoValido(int fila, int asiento){
        return (fila <= this.cantFilas && fila >= 1 && 
                asiento <= this.cantAsientos && asiento >= 1);
    }
    
    void cargarMapa(MensajesConsola mensajes) {
        for(int i = 0; i < this.cantFilas; i++){
            int filaActual = i+1;
            mensajes.imprimirFila(filaActual);
            for(int j = 0; j < this.cantAsientos; j++){
               int asientoActual = j+1;
               mensajes.imprimirAsiento(asientoActual, mapa[i][j]); 
            }
            mensajes.imprimirSaltoDeLinea();
        }
    }

    void intentarReserva(int filaIngresada, int asientoIngresado, MensajesConsola mensajes) {
        if(!esAsientoLibre(filaIngresada-1, asientoIngresado-1)){
            mensajes.imprimirErrorAsientoOcupado();
        }else{
            this.mapa[filaIngresada-1][asientoIngresado-1] = this.estadoOcupado;
            mensajes.imprimirMensajeReservaExitosa(asientoIngresado, filaIngresada);
        }
    }

    public boolean esAsientoLibre(int filaIngresada, int asientoIngresado) {
        return this.mapa[filaIngresada][asientoIngresado].equals(this.estadoLibre);
    }

    void mostrarAsientosLibres(MensajesConsola mensajes) {
        mensajes.mostrarMensajeAsientosLibres();
        for(int i = 0; i < this.cantFilas; i++){
            int filaActual = i+1;
            mensajes.imprimirFila(filaActual);
            for(int j = 0; j < this.cantAsientos; j++){
               if(esAsientoLibre(i,j)){
                    int asientoActual = j+1;
                    mensajes.imprimirAsientoLibre(asientoActual);
               }  
            }
            mensajes.imprimirSaltoDeLinea();
        }
    }
}
