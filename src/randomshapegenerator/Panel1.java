/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomshapegenerator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

/**
 *
 * @author Alex Nelson
 */
public class Panel1 extends JPanel{
    
    private GeneralPath path;
    
        Panel1(GeneralPath p) {
            // set a preferred size for the custom panel.
            setPreferredSize(new Dimension(420,420));
            path=p;
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d=(Graphics2D)g;

            g2d.draw(path);
        }
    }
    
    

