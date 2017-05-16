/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomshapegenerator;

import java.awt.Dimension;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author Alex Nelson
 */
public class RandomShapeGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double i1= (Math.random()*60);
        double i2=(int) (Math.random()*60);
        double i3=(int) (Math.random()*60);
        double i4=(int) (Math.random()*60);
        double i5=(int) (Math.random()*60);
        double i6=(int) (Math.random()*60);
        
        double h1=(int) (Math.random()*100);
        double h2=(int) (Math.random()*100);
        double h3=(int) (Math.random()*100);
        double h4=(int) (Math.random()*100);
        double h5=(int) (Math.random()*100);
        double h6=(int) (Math.random()*100);
        
        
        final double rad=57.2958;
        final double xTrans=400;
        final double yTrans=400;
        
        double x1=h1*Math.sin(i1/rad)+xTrans;
        double y1=h1*Math.cos(i1/rad)+yTrans;
        
        
        double x2;
        double y2;
        
        if(i2<30){
            
        y2=h2*Math.sin(i2/rad)+yTrans;
        x2=h2*Math.cos(i2/rad)+xTrans;}
        
        else{
            
        y2=-h2*Math.sin((i2-30)/rad)+yTrans;
        x2=h2*Math.cos((i2-30)/rad)+xTrans;
        }
        
        
        
        
        double x3=h3*Math.sin(i3/rad)+xTrans;
        double y3=-h3*Math.cos(i3/rad)+yTrans;
        
           
        
        
        
        double y4=-h4*Math.cos(i4/rad)+yTrans;
        double x4=-h4*Math.sin(i4/rad)+xTrans;
        
       
        
        double x5;
        double y5;
        
        if(i5<30){
        x5=-h5*Math.cos(i5/rad)+xTrans;
        y5=-h5*Math.sin(i5/rad)+yTrans;}
        
        else{
            
        x5=-h5*Math.cos((i5-30)/rad)+xTrans;
        y5=h5*Math.sin((i5-30)/rad)+yTrans;    
        }
        
        
        
        double x6=-h6*Math.sin(i6/rad)+xTrans;
        double y6=h6*Math.cos(i6/rad)+yTrans;
    
        GeneralPath path=new GeneralPath();
        
        path.moveTo(x1, y1);
        path.lineTo(x2, y2);
        path.lineTo(x3, y3);
        path.lineTo(x4, y4);
        path.lineTo(x5, y5);
        path.lineTo(x6, y6);
        path.closePath();
        
        JFrame frame = new JFrame();
        frame.setVisible( true );
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 


        Panel1 panel=new Panel1(path);
        panel.setPreferredSize(new Dimension(420,420));
        frame.add(panel);
       
    
    
    }
        
        
        
    }
    

