import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private static List<Usuario> listaUsuarios = new ArrayList<>();

    public static void cadastrar(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public static boolean excluir(int id) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == id) {
                listaUsuarios.remove(usuario);
                return true;
            }
        }
        return false;
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static Usuario buscar(int id) {
        for (Usuario temp : listaUsuarios) {
            if (temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }
}