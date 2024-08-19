package laboratorio02;

/**
 *
 * @author luana
 */
public class Retangulo {
    // atributos
    private int lado1;
    private int lado2;

// Método set
    public void setLado1(int lado1) {
        this.lado1 = lado1;
}

    public void setLado2(int lado2) {
        this.lado2 = lado2;
}

// Métodos get
    public int getLado1() {
        return lado1;
}

    public int getLado2() {
        return lado2;
}

//  retorno da área do retângulo
    public int area() {
        return lado1 * lado2;
}

// Perimetro
    public int perimetro() {
        return 2 * (lado1 + lado2);
}
}

