
package com.mycompany.ilib;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOUsers;
import com.mycompany.models.Users;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author billi
 */
public class DAOUsersImpl extends Database implements DAOUsers {

    @Override
    public void registrar(Users user) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO users(id, nombre, apellido, edad, enfermedad, fecha) VALUES(?,?,?,?,?,?)");
            st.setInt(1, user.getId());
            st.setString(2, user.getNombre());
            st.setString(3, user.getApellido());
            st.setString(4, user.getEdad());
            st.setString(5, user.getEnfermedad());
            st.setString(6, user.getFecha());
            st.executeUpdate();
            st.close();
        } catch(Exception e){
            throw e;
        }   finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Users user) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE users SET nombre = ?, apellido = ?, edad = ?, enfermedad = ?, fecha = ? ");
            st.setString(1, user.getNombre());
            st.setString(2, user.getApellido());
            st.setString(3, user.getEdad());
            st.setString(4, user.getEnfermedad());
            st.setString(5, user.getFecha());
            st.executeUpdate();
            st.close();
        } catch(Exception e){
            throw e;
        }   finally {
            this.Cerrar();
        }
        
    }

    @Override
    public void eliminar(String nombre) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM users WHERE nombre = ?;");
            st.setString(1, nombre);
            st.executeUpdate();
            st.close();
        } catch(Exception e){
            throw e;
        }   finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Users> listar(String nombre) throws Exception {
        List<Users> lista = null;
        try {
            this.Conectar();
            String Query = nombre.isEmpty() ?  "SELECT * FROM users;" : "SELECT * FROM users WHERE nombre LIKE '%"+ nombre +"%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
                
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Users user = new Users();
                user.setId(rs.getInt("id"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setEdad(rs.getString("edad"));
                user.setEnfermedad(rs.getString("enfermedad"));
                user.setFecha(rs.getString("fecha"));
                lista.add(user);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        }   finally {
             this.Cerrar();              
        }
        return lista;
    }

    @Override
    public Users getUserBynombre(String nombre) throws Exception {
        Users user = new Users();
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM users WHERE nombre = ?;");
            st.setString(1, user.getNombre());
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                user.setId(rs.getInt("id"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setEdad(rs.getString("edad"));
                user.setEnfermedad(rs.getString("enfermedad"));
                user.setFecha(rs.getString("fecha"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        }   finally {
             this.Cerrar();              
        }
        return user;
       
    }
    
}
