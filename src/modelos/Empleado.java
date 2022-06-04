package modelos;

public class Empleado extends Vendedor{
    private Integer afiliados;
    private Integer antiguedad;


    public Empleado( Integer antiguedad) {

        this.antiguedad = antiguedad;
    }

    @Override
    public Integer calcularPuntos() {
        Integer totalPuntos=getVentas()*5+antiguedad*5+afiliados*10;

        return totalPuntos;
    }
}
