package empresa;

import a.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Empresa {

    
     
    
    public static void main(String[] args) {
        Empleado trabajador1=new Empleado(JOptionPane.showInputDialog("ingrese nombre1"),JOptionPane.showInputDialog("ingrese direccion1"),Integer.parseInt(JOptionPane.showInputDialog("ingrese  edad 1")),Integer.parseInt(JOptionPane.showInputDialog("ingrese  telefono 1")));
        Empleado trabajador2=new Empleado(JOptionPane.showInputDialog("ingrese nombre2"),JOptionPane.showInputDialog("ingrese direccion2"),Integer.parseInt(JOptionPane.showInputDialog("ingrese  edad 2")),Integer.parseInt(JOptionPane.showInputDialog("ingrese  telefono 2")));
        Empleado trabajador3=new Empleado(JOptionPane.showInputDialog("ingrese nombre3"),JOptionPane.showInputDialog("ingrese direccion3"),Integer.parseInt(JOptionPane.showInputDialog("ingrese  edad 3")),Integer.parseInt(JOptionPane.showInputDialog("ingrese  telefono 3")));
        Empleado trabajador4=new Empleado(JOptionPane.showInputDialog("ingrese nombre4"),JOptionPane.showInputDialog("ingrese direccion4"),Integer.parseInt(JOptionPane.showInputDialog("ingrese  edad 4")),Integer.parseInt(JOptionPane.showInputDialog("ingrese  telefono 4")));
        Empleado trabajador5=new Empleado(JOptionPane.showInputDialog("ingrese nombre5"),JOptionPane.showInputDialog("ingrese direccion5"),Integer.parseInt(JOptionPane.showInputDialog("ingrese  edad 5")),Integer.parseInt(JOptionPane.showInputDialog("ingrese  telefono 5")));
        
     
      JOptionPane.showMessageDialog(null,"1.trabajador");
      JOptionPane.showMessageDialog(null,"2.trabajador");
      JOptionPane.showMessageDialog(null,"3.trabajador");
      JOptionPane.showMessageDialog(null,"4.trabajador");
      JOptionPane.showMessageDialog(null,"5.trabajador");
      JOptionPane.showMessageDialog(null,"salir");
      
      int op;
      
      op=Integer.parseInt("ingresa tu opcion");
      
      switch(op){
          
          case 1:
              System.out.println("nombre:"+trabajador1.getNombre());
              System.out.println("direccion:"+trabajador1.getDireccion());
              System.out.println("edad"+trabajador1.getEdad());
              System.out.println("telefono"+trabajador1.getTelefono());
              break;
          case 2:
              System.out.println("nombre:"+trabajador2.getNombre());
              System.out.println("direccion:"+trabajador2.getDireccion());
              System.out.println("edad"+trabajador2.getEdad());
              System.out.println("telefono"+trabajador2.getTelefono());
              break;
          case 3:
              System.out.println("nombre:"+trabajador3.getNombre());
              System.out.println("direccion:"+trabajador3.getDireccion());
              System.out.println("edad"+trabajador3.getEdad());
              System.out.println("telefono"+trabajador3.getTelefono());
              break;
          case 4:
              System.out.println("nombre:"+trabajador4.getNombre());
              System.out.println("direccion:"+trabajador4.getDireccion());
              System.out.println("edad"+trabajador4.getEdad());
              System.out.println("telefono"+trabajador4.getTelefono());
              break;
          case 5:
             System.out.println("nombre:"+trabajador5.getNombre());
              System.out.println("direccion:"+trabajador5.getDireccion());
              System.out.println("edad"+trabajador5.getEdad());
              System.out.println("telefono"+trabajador5.getTelefono());
              break;
              
         
      }
        
    }
    
}
