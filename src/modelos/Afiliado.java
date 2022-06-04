package modelos;

public class Afiliado extends Vendedor{

    public Afiliado() {

    }


    @Override
    public Integer calcularPuntos() {
        Integer totalPuntos=getVentas()*15;
        return totalPuntos;
    }
}
