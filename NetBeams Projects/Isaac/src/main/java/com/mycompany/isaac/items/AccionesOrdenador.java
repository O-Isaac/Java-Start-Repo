package com.mycompany.isaac.items;

public class AccionesOrdenador {
    Ordenador ordenador;
    
    public AccionesOrdenador(Ordenador ordenador) {
        this.ordenador = ordenador;
    }
    
    public void Encender() {
        this.ordenador.setEncendido(true);
    }
    
    public void Apagar() {
        this.ordenador.setEncendido(false);
    }
    
    public void ComutarEncendido() {
        boolean estado = this.ordenador.getEncendido();
        this.ordenador.setEncendido(!estado);
        System.out.printf("Estado conmutado a %s\n", this.ordenador.getEncendido());
    }
    
    public void Estado() {
        String Estado = String.format("Estado del ordenador:%s\nMarca:%s\nProcesador:%s\nPantalla:%s\n", 
            this.ordenador.getEncendido() ? "Encendido" : "Apagado",
            this.ordenador.getMarca(),
            this.ordenador.getProcesador(),
            this.ordenador.getPantalla()
        );
        
        System.out.println(Estado);
    }
}
