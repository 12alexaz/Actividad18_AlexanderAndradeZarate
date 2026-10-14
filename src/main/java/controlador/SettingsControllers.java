/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.InterfazPrincipal;

/**
 *
 * @author usuario1
 */
public class SettingsControllers implements MouseListener{
    private InterfazPrincipal views;
public SettingsControllers(InterfazPrincipal views){
this.views=views;

this.views.jLabelIncidencia.addMouseListener(this);
this.views.jLabelUsuarios.addMouseListener(this);
this.views.jLabelTecnicos.addMouseListener(this);
this.views.jLabelCategorias.addMouseListener(this);
this.views.jLabelEspecialidades.addMouseListener(this);
this.views.jLabelReportes.addMouseListener(this);
this.views.jLabelAsistenteIA.addMouseListener(this);

}
 @Override
    public void mouseClicked(MouseEvent e) {
    
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
      if(e.getSource()==views.jLabelIncidencia){
      views.jPanelIncidencias.setBackground(new Color(234,244,245));
      }
      else if(e.getSource()==views.jLabelUsuarios){
      views.jPanelUsuarios.setBackground(new Color(234,244,245));
      }
      else if(e.getSource()==views.jLabelTecnicos){
      views.jPanelTecnicos.setBackground(new Color(234,244,245));
      }
      else if(e.getSource()==views.jLabelCategorias){
      views.jPanelCategorias.setBackground(new Color(234,244,245));
      }
      else if(e.getSource()==views.jLabelEspecialidades){
      views.jPanelEspecialidades.setBackground(new Color(234,244,245));
      }
      else if(e.getSource()==views.jLabelReportes){
      views.jPanelReportes.setBackground(new Color(234,244,245));
      }
      else if(e.getSource()==views.jLabelAsistenteIA){
      views.jPanelAsistenteIA.setBackground(new Color(234,244,245));
      }
    }

    @Override
    public void mouseExited(MouseEvent e) {
    if(e.getSource()==views.jLabelIncidencia){
      views.jPanelIncidencias.setBackground(new Color(18,59,70));
      }
      else if(e.getSource()==views.jLabelUsuarios){
      views.jPanelUsuarios.setBackground(new Color(18,59,70));
      }
      else if(e.getSource()==views.jLabelTecnicos){
      views.jPanelTecnicos.setBackground(new Color(18,59,70));
      }
      else if(e.getSource()==views.jLabelCategorias){
      views.jPanelCategorias.setBackground(new Color(18,59,70));
      }
      else if(e.getSource()==views.jLabelEspecialidades){
      views.jPanelEspecialidades.setBackground(new Color(18,59,70));
      }
      else if(e.getSource()==views.jLabelReportes){
      views.jPanelReportes.setBackground(new Color(18,59,70));
      }
      else if(e.getSource()==views.jLabelAsistenteIA){
      views.jPanelAsistenteIA.setBackground(new Color(18,59,70));
      }
    
}
}


