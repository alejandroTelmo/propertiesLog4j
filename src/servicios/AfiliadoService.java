package servicios;

import daos.IDao;
import modelos.Afiliado;

import java.util.List;

public class AfiliadoService implements IDao<Afiliado> {
    private AfiliadoService afiliadoService;

    public AfiliadoService getAfiliadoService() {
        return afiliadoService;
    }

    public void setAfiliadoService(AfiliadoService afiliadoService) {
        this.afiliadoService = afiliadoService;
    }

    @Override
    public Afiliado guardar(Afiliado afiliado) {
        return afiliadoService.guardar(afiliado);
    }

    @Override
    public void eliminar(Long id) {
        afiliadoService.eliminar(id);
    }

    @Override
    public Afiliado buscar(Long id) {
        return afiliadoService.buscar(id);
    }

    @Override
    public List<Afiliado> listarTodos() {
        return afiliadoService.listarTodos();
    }
}
