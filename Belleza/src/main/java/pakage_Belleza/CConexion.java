/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pakage_Belleza;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DAVID
 */
public class CConexion {
    Connection conectar = null;
    
    String usuario="root";
    String contraseña="";
    String bd="belleza";
    String ip="localhost";
    String puerto="3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
            
            JOptionPane.showMessageDialog(null,"Se conecto ala BD correctamente");
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null,"No se conecto ala BD correctamente");
        }
        
        return conectar;
    }
    public void cerrarConexion(){
        try {
            
            if (conectar != null && !conectar.isClosed()) {
                conectar.close();
                JOptionPane.showMessageDialog(null,"Se cerro corectamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo cerrar la conexion");
        }
    }
//    public static void main(String[] args) {
//        CConexion cone = new CConexion();
//        cone.estableceConexion();
//    }
}
