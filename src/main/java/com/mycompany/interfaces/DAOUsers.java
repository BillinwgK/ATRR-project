
package com.mycompany.interfaces;

import com.mycompany.models.Users;
import java.util.List;

/**
 *
 * @author billi
 */
public interface DAOUsers {
    public void registrar(Users user) throws Exception;
    public void modificar(Users user) throws Exception;
    public void eliminar(String nombre) throws Exception;
    public List<Users> listar(String nombre) throws Exception;
    public Users getUserBynombre(String nombre) throws Exception;
}
