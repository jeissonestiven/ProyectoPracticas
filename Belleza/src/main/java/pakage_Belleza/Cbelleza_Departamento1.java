/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pakage_Belleza;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAVID
 */
public class Cbelleza_Departamento1 {
    public void AgregarUsuario(JTextField id_producto, JTextField Labial1, JTextField Labial2, JTextField Labial3, JTextField Pestañina1, JTextField Pestañina2,JTextField Pestañina3, JTextField Base1, JTextField Base2, JTextField Base3){
        CConexion objetoConexion = new CConexion();
        
        String consulta = "insert into departamento1(id_producto,Labial1,Labial2,Labial3,Pestañina1,Pestañina2,Pestañina3,Base1,Base2,Base3) values(?,?,?,?,?,?,?,?,?,?)";
        
        try {
        CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
        cs.setInt(1,Integer.parseInt(id_producto.getText()));
        cs.setInt(2,Integer.parseInt(Labial1.getText()));
        cs.setInt(3,Integer.parseInt(Labial2.getText()));
        cs.setInt(4,Integer.parseInt(Labial3.getText()));
        cs.setInt(5,Integer.parseInt(Pestañina1.getText()));
        cs.setInt(6,Integer.parseInt(Pestañina2.getText()));
        cs.setInt(7,Integer.parseInt(Pestañina3.getText()));
        cs.setInt(8,Integer.parseInt(Base1.getText()));
        cs.setInt(9,Integer.parseInt(Base2.getText()));
        cs.setInt(10,Integer.parseInt(Base3.getText()));
        
        
        cs.execute();
        
        JOptionPane.showMessageDialog(null, "Se guardó el usuario correctamente");
        
    } catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, "No se guardó el usuario correctamente " + e);
    } finally{
        objetoConexion.cerrarConexion();
    }
 }
  
    public void MostrarUsuarios( JTable tablaTotalDepartamento1){
       CConexion objetoConexion = new CConexion();
       
       DefaultTableModel modelo = new DefaultTableModel();
       
       String sql="";
       
       modelo.addColumn("id_producto");
       modelo.addColumn("Labial1");
       modelo.addColumn("Labial2");
       modelo.addColumn("Labial3");
       modelo.addColumn("Pestañina1");
       modelo.addColumn("Pestañina2");
       modelo.addColumn("Pestañina3");
       modelo.addColumn("Base1");
       modelo.addColumn("Base2");
       modelo.addColumn("Base3");
      
       
       
       tablaTotalDepartamento1.setModel(modelo);
       
       sql="select * from departamento1";
       
       try {
           Statement st = objetoConexion.estableceConexion().createStatement();
           ResultSet rs = st.executeQuery(sql);
           
           while(rs.next()){
               String id_producto = rs.getString("id_producto");
               String Labial1 = rs.getString("Labial1");
               String Labial2 = rs.getString("Labial2");
               String Labial3 = rs.getString("Labial3");
               String Pestañina1 = rs.getString("Pestañina1");
               String Pestañina2 = rs.getString("Pestañina2");
               String Pestañina3 = rs.getString("Pestañina3");
               String Base1 = rs.getString("Base1");
               String Base2 = rs.getString("Base2");
               String Base3 = rs.getString("Base3");
               
               
               
               modelo.addRow(new Object[]{id_producto,Labial1,Labial2,Labial3,Pestañina1,Pestañina2,Pestañina3,Base1,Base2,Base3});
           }
           
           tablaTotalDepartamento1.setModel(modelo);
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al mostrar los usuarios" + e);
       }finally{
       objetoConexion.cerrarConexion();
       }
   }
     public void ModificarUsuario(JTextField id_producto, JTextField Labial1, JTextField Labial2, JTextField Labial3, JTextField Pestañina1, JTextField Pestañina2,JTextField Pestañina3, JTextField Base1, JTextField Base2, JTextField Base3){
     CConexion objetoCConexion = new CConexion();
     
     String consulta = "update departamento1 set departamento1.Labial1=?, departamento1.Labial2=?, departamento1.Labial3=?, departamento1.Pestañina1=?, departamento1.Pestañina2=?, departamento1.Pestañina3=?, departamento1.Base1=?, departamento1.Base2=?, departamento1.Base3=?   where departamento1.id_producto=?";
     
       try {
           CallableStatement cs = objetoCConexion.estableceConexion().prepareCall(consulta);
            
       
        cs.setInt(1,Integer.parseInt(Labial1.getText()));
        cs.setInt(2,Integer.parseInt(Labial2.getText()));
        cs.setInt(3,Integer.parseInt(Labial3.getText()));
        cs.setInt(4,Integer.parseInt(Pestañina1.getText()));
        cs.setInt(5,Integer.parseInt(Pestañina2.getText()));
        cs.setInt(6,Integer.parseInt(Pestañina3.getText()));
        cs.setInt(7,Integer.parseInt(Base1.getText()));
        cs.setInt(8,Integer.parseInt(Base2.getText()));
        cs.setInt(9,Integer.parseInt(Base3.getText()));
        cs.setInt(10,Integer.parseInt(id_producto.getText()));
        
            
            cs.execute();
           
           JOptionPane.showMessageDialog(null, "Se modifico correctamente");
           
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "No se modifico correctamente" + e);
       }finally{
            objetoCConexion.cerrarConexion();
       }
    }
     public void EliminarUsuario(JTextField id_producto){
                
       CConexion objetoCConexion = new CConexion();
       
       String consulata = "Delete from departamento1 where departamento1.id_producto=?;";
       
       try {
           CallableStatement cs = objetoCConexion.estableceConexion().prepareCall(consulata);
           
           cs.setInt(1, Integer.parseInt(id_producto.getText()));
           
           cs.execute();
           
           JOptionPane.showMessageDialog(null, "Se elimino correctamente");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "No se elimino correctamente" + e);
       }finally{
           objetoCConexion.cerrarConexion();
       }
         
     }
     public void limpiarcampos(JTextField id_producto, JTextField Labial1, JTextField Labial2, JTextField Labial3, JTextField Pestañina1, JTextField Pestañina2,JTextField Pestañina3, JTextField Base1, JTextField Base2, JTextField Base3){
         id_producto.setText("");
         Labial1.setText("");
         Labial2.setText("");
         Labial3.setText("");
         Pestañina1.setText("");
         Pestañina2.setText("");
         Pestañina3.setText("");
         Base1.setText("");
         Base2.setText("");
         Base3.setText("");
     }
     public void sumar(JTextField id_producto){
         CConexion objetoConexion = new CConexion();
        String consulta = "SELECT Labial1 + Labial2 + Labial3 + Pestañina1 + Pestañina2 + Pestañina3 + Base1 + Base2 + Base3 AS suma " +
                          "FROM departamento1 WHERE id_producto = ?";

        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            
            conexion = objetoConexion.estableceConexion();
            
            
            ps = conexion.prepareStatement(consulta);
            ps.setInt(1, Integer.parseInt(id_producto.getText()));

            
            rs = ps.executeQuery();

            
            if (rs.next()) {
                int sumaTotal = rs.getInt("suma");
                JOptionPane.showMessageDialog(null, "La suma total es: " + sumaTotal);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron datos para el ID especificado.");
            }
         } catch(Exception e){
             JOptionPane.showMessageDialog(null, "No se elimino correctamente" + e);
         }
     }
     public void promedio(JTextField id_producto){
         CConexion objetoConexion = new CConexion();
        String consulta = "SELECT (Labial1 + Labial2 + Labial3 + Pestañina1 + Pestañina2 + Pestañina3 + Base1 + Base2 + Base3)/9 AS promedio " +
                          "FROM departamento1 WHERE id_producto = ?";

        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            
            conexion = objetoConexion.estableceConexion();
            
            
            ps = conexion.prepareStatement(consulta);
            ps.setInt(1, Integer.parseInt(id_producto.getText()));

            
            rs = ps.executeQuery();

            
            if (rs.next()) {
                int promedioTotal = rs.getInt("promedio");
                JOptionPane.showMessageDialog(null, "El promedio total es: " + promedioTotal);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron datos para el ID especificado.");
            }
         } catch(Exception e){
             JOptionPane.showMessageDialog(null, "No se elimino correctamente" + e);
         }
     }
}

