package clasesobjetos;

public class Carro {

String marca; // Atributos
String modelo;
int numeroPuertas;
int numeroRuedas;

// Metodos

// Parametros
void establecerAtributos(String marca, String modelo, 
                         int numeroPuertas, int numeroRuedas){
    this.marca = marca;
    this.modelo = modelo;
    this.numeroPuertas = numeroPuertas;
    this.numeroRuedas = numeroRuedas;
    
}


void encender(){
    System.out.println("Carro encendido");
}
void andando(){
    System.out.println("Carro andando...!");
}
void frenar(){
    System.out.println("Carro frenando");
}
void apagar(){
    System.out.println("Carro apagado");
}
    
}
