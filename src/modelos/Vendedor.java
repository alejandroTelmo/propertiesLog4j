package modelos;

public abstract class Vendedor {

    private Integer puntos;
    private Integer ventas;

    public Vendedor() {

    }
    public String mostrarCategoria(){
        String categoria="";
        if(puntos<20) {
          categoria="Novato";
        } else if (puntos>=20&&puntos<=30) {
            categoria="Aprendices";
        } else if (puntos>=31&&puntos<=40) {
            categoria="Buenos";
        }else {
            categoria="Maestros";
        }
        return categoria;
    }
    public abstract Integer calcularPuntos();

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getVentas() {
        return ventas;
    }

    public void setVentas(Integer ventas) {
        this.ventas = ventas;
    }
}
