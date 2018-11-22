/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorion;

/**
 *
 * @author Sergio
 */
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author Sergio
 */
public class Carta extends JButton{
    
    private boolean volteada=false;
    private ImageIcon imagenDorso;
    private ImageIcon imagenFrontal;
    private Image imagetrasera,imagefrontal;
    private ControladorMenu controladorMenu;
    private int indice;
    private String[] imagenes={"lazarillo1.jpg","lazarillo2.jpg"};
    
    public Carta(ControladorMenu controladorMenu,int indice){
        /*URL url=getClass().getResource("trasera.png");
        imagenDorso=new ImageIcon(url);
        image = imagenDorso.getImage();
        //Dimension tamaño=this.getSize();
        //image = image.getScaledInstance(tamaño.getWidth(),tamaño.getHeight(), Image.SCALE_SMOOTH);
        imagenDorso.setImage(image);*/
        reescalarImagen(400,336);
        añadirImagenFrontal(400,366);
        establecerIcono();
        System.out.println(getIcon().toString());
        this.controladorMenu=controladorMenu;
        this.indice=indice;
        addActionListener(controladorMenu);
    }
    public void añadirImagenFrontal(int x,int y){
        URL url=getClass().getResource(imagenes[(int) (Math.random() * 2)]);
        imagenFrontal=new ImageIcon(url);
        imagefrontal = imagenFrontal.getImage();
        imagefrontal = imagefrontal.getScaledInstance(x, y, Image.SCALE_SMOOTH);
    } 
    public String imagenActual() {
        System.out.println("Nombre icono: "+getIcon().toString());
        return getIcon().toString();
        
    }

    public void voltear(){
        if(getIcon().equals(imagenDorso)){
            setIcon(imagenFrontal);
            System.out.println("Imagen puesta: "+imagenFrontal);
        }else if(getIcon().equals(imagenFrontal)){
            setIcon(imagenDorso);
            System.out.println("Imagen puesta: "+imagenDorso);
        }
        
    }
    
    public void establecerIcono(){
        if(volteada){
            System.out.println("No esta volteada,por lo que deberia tener la imagen trasera y poner la frontal");
            setIcon(imagenFrontal);
        }else{
            System.out.println("Si esta volteada,por lo que deberia tener la imagen frontal y poner la trasera");
            setIcon(imagenDorso);
        }
    }
    
    public ControladorMenu getControladorMenu() {
        return controladorMenu;
    }
    
    public void setControladorMenu(ControladorMenu controladorMenu) {
        this.controladorMenu = controladorMenu;
    }
    
    public ImageIcon getImagenDorso() {
        return imagenDorso;
    }

    public void setImagenDorso(ImageIcon imagenDorso) {
        this.imagenDorso = imagenDorso;
    }

    public ImageIcon getImagenFrontal() {
        return imagenFrontal;
    }

    public void setImagenFrontal(ImageIcon imagenFrontal) {
        this.imagenFrontal = imagenFrontal;
    }
    
    public String[] getImagenes() {
        return imagenes;
    }
    
    public void setImagenes(String[] imagenes) {
        this.imagenes = imagenes;
    }

    public int getIndice() {
        return indice;
    }

    public boolean isVolteada() {
        return volteada;
    }

    public void setVolteada(boolean volteada) {
        this.volteada = volteada;
    }
    
    public void reescalarImagen(int x,int y){
        URL url=getClass().getResource("trasera.png");
        imagenDorso=new ImageIcon(url);
        imagetrasera = imagenDorso.getImage();
        imagetrasera = imagetrasera.getScaledInstance(x, y, Image.SCALE_SMOOTH);
        imagenDorso.setImage(imagetrasera);
    }
    
}

