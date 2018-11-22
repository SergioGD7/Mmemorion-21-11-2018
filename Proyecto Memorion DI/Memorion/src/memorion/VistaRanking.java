/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorion;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Sergio
 */
public class VistaRanking extends JFrame{
    
    public VistaRanking(){
        crearInterfaz();
    }
    
    public void crearInterfaz(){
        setTitle("Ranking");

        //Cambiamos el icono de la aplicación
        Image icon = new ImageIcon(getClass().getResource("trasera.png")).getImage();
        setIconImage(icon);
        
        setLayout(null);
       
        setResizable(false);
        setSize(1366,768);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Para que la ventana salga centrada
        setLocationRelativeTo(null);
    }
}
