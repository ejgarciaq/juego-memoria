package Todo;

import static Todo.Inicio.PanelPricipal;
import static Todo.Inicio.nivelNormal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Edson Garcia Quiros
 */

public class easy extends javax.swing.JPanel {
     
private Logica log = new Logica();
private boolean caraArriba = false;
private ImageIcon img1;
private ImageIcon img2;
private JButton[] pbtn = new JButton[2];
private boolean segunCar= false;
private int puntos = 0;
JLabel reloj;
int min;
int seg;

    public easy() {
        initComponents();
        setCards();
        Tiempo();
    }
    
    private void setCards(){
        int[] numeros = log.getCardNumbers();
        btnC1.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[0]+".png")));
        btnC2.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[1]+".png")));
        btnC3.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[2]+".png")));
        btnC4.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[3]+".png")));
        btnC5.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[4]+".png")));
        btnC6.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[5]+".png")));
        btnC7.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[6]+".png")));
        btnC8.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[7]+".png")));
        btnC9.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[8]+".png")));
        btnC10.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[9]+".png")));
        btnC11.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[10]+".png")));
        btnC12.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[11]+".png")));
        btnC13.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[12]+".png")));
        btnC14.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[13]+".png")));
        btnC15.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[14]+".png")));
        btnC16.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[15]+".png")));
    }
    
    //metodo para voltear cartas
    private void btnEnabled(JButton btn){
        if(!caraArriba){
            btn.setEnabled(false);
            img1 = (ImageIcon) btn.getDisabledIcon();
            pbtn [0] = btn;
            caraArriba = true;
            segunCar = false;
        }
        else{
            btn.setEnabled(false);
            img2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            segunCar = true;
            puntos += 2;
            pregwin();
        }
    }

    //metodo para comparar cartas
    private void comparar(){
        if(caraArriba && segunCar){
            if(img1.getDescription().compareTo(img2.getDescription())!=0){
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if (puntos > 0) puntos -= 1;
            }
            caraArriba = false;
        }
    }
   
    // metodo para reiniciar nivel
    private void reinicio(){
        easy p = new easy();
        PanelPricipal.removeAll();
        PanelPricipal.add(p, BorderLayout.CENTER);
        PanelPricipal.revalidate();
        PanelPricipal.repaint();
    }
    
    public void Tiempo(){
        reloj = new JLabel();
        reloj.setSize(120, 20);//tamanno
        reloj.setLocation(jLabel1.getWidth()-500, 20);
        reloj.setForeground(Color.yellow); //seleccionar imagen
        reloj.setVisible(true);// hacer visible imagen
        jLabel1.add(reloj,0);  
    //timepo
         min = 0;
         seg = 0;
    Timer tiempo = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e){
            seg++;
            if(seg == 60){
                min++;
                seg = 0;   
            }
            reloj.setText(min +":"+ seg);
        }});
    tiempo.start();
    } 
    
    //metodo para ver puntage al terminar
    public void pregwin(){
        if (!btnC1.isEnabled() && !btnC2.isEnabled() && !btnC3.isEnabled() && !btnC4.isEnabled() && !btnC5.isEnabled() && !btnC6.isEnabled()
                && !btnC7.isEnabled() && !btnC8.isEnabled() && !btnC9.isEnabled() && !btnC10.isEnabled() && !btnC11.isEnabled()
                && !btnC12.isEnabled() && !btnC13.isEnabled() && !btnC14.isEnabled() && !btnC15.isEnabled() && !btnC16.isEnabled()) {
            reloj.setVisible(false);
            String[] buttons = { "Finalizar", "Sig. Nivel" };
            
            int rc = JOptionPane.showOptionDialog(null, "Felicidades, usted ha ganado. Su puntaje es: " + puntos + " en un tiempo de " + min +" : "+ seg, "Ganaste!!",
            JOptionPane.INFORMATION_MESSAGE, 0,null,buttons,0);
            
            if (1 == rc)
                nivelNormal();
            else {
                System.exit(0);
            };
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC8 = new javax.swing.JButton();
        btnC9 = new javax.swing.JButton();
        btnC10 = new javax.swing.JButton();
        btnC11 = new javax.swing.JButton();
        btnC12 = new javax.swing.JButton();
        btnC13 = new javax.swing.JButton();
        btnC14 = new javax.swing.JButton();
        btnC15 = new javax.swing.JButton();
        btnC16 = new javax.swing.JButton();
        btnReinicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 550));
        setLayout(null);

        btnC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnC1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC1MouseExited(evt);
            }
        });
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });
        add(btnC1);
        btnC1.setBounds(170, 80, 60, 80);

        btnC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC2MouseExited(evt);
            }
        });
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });
        add(btnC2);
        btnC2.setBounds(230, 80, 60, 80);

        btnC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC3MouseExited(evt);
            }
        });
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });
        add(btnC3);
        btnC3.setBounds(290, 80, 60, 80);

        btnC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC4MouseExited(evt);
            }
        });
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });
        add(btnC4);
        btnC4.setBounds(350, 80, 60, 80);

        btnC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC5MouseExited(evt);
            }
        });
        btnC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC5ActionPerformed(evt);
            }
        });
        add(btnC5);
        btnC5.setBounds(170, 160, 60, 80);

        btnC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC6MouseExited(evt);
            }
        });
        btnC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC6ActionPerformed(evt);
            }
        });
        add(btnC6);
        btnC6.setBounds(230, 160, 60, 80);

        btnC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC7MouseExited(evt);
            }
        });
        btnC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC7ActionPerformed(evt);
            }
        });
        add(btnC7);
        btnC7.setBounds(290, 160, 60, 80);

        btnC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC8MouseExited(evt);
            }
        });
        btnC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC8ActionPerformed(evt);
            }
        });
        add(btnC8);
        btnC8.setBounds(350, 160, 60, 80);

        btnC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC9MouseExited(evt);
            }
        });
        btnC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC9ActionPerformed(evt);
            }
        });
        add(btnC9);
        btnC9.setBounds(170, 240, 60, 80);

        btnC10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC10MouseExited(evt);
            }
        });
        btnC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC10ActionPerformed(evt);
            }
        });
        add(btnC10);
        btnC10.setBounds(230, 240, 60, 80);

        btnC11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC11MouseExited(evt);
            }
        });
        btnC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC11ActionPerformed(evt);
            }
        });
        add(btnC11);
        btnC11.setBounds(290, 240, 60, 80);

        btnC12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC12MouseExited(evt);
            }
        });
        btnC12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC12ActionPerformed(evt);
            }
        });
        add(btnC12);
        btnC12.setBounds(350, 240, 60, 80);

        btnC13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC13MouseExited(evt);
            }
        });
        btnC13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC13ActionPerformed(evt);
            }
        });
        add(btnC13);
        btnC13.setBounds(170, 320, 60, 80);

        btnC14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC14MouseExited(evt);
            }
        });
        btnC14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC14ActionPerformed(evt);
            }
        });
        add(btnC14);
        btnC14.setBounds(230, 320, 60, 80);

        btnC15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC15MouseExited(evt);
            }
        });
        btnC15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC15ActionPerformed(evt);
            }
        });
        add(btnC15);
        btnC15.setBounds(290, 320, 60, 80);

        btnC16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC16MouseExited(evt);
            }
        });
        btnC16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC16ActionPerformed(evt);
            }
        });
        add(btnC16);
        btnC16.setBounds(350, 320, 60, 80);

        btnReinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnReinicio.png"))); // NOI18N
        btnReinicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReinicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnReinicioClic.png"))); // NOI18N
        btnReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinicioActionPerformed(evt);
            }
        });
        add(btnReinicio);
        btnReinicio.setBounds(450, 10, 80, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 570));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 570));
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 550));
        jLabel1.setVerifyInputWhenFocusTarget(false);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 590);
    }// </editor-fold>//GEN-END:initComponents

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        btnEnabled(btnC1);
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        btnEnabled(btnC2);
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        btnEnabled(btnC3);
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        btnEnabled(btnC4);
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        btnEnabled(btnC5);
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC6ActionPerformed
        btnEnabled(btnC6);
    }//GEN-LAST:event_btnC6ActionPerformed

    private void btnC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC7ActionPerformed
        btnEnabled(btnC7);
    }//GEN-LAST:event_btnC7ActionPerformed

    private void btnC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC8ActionPerformed
        btnEnabled(btnC8);
    }//GEN-LAST:event_btnC8ActionPerformed

    private void btnC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC9ActionPerformed
        btnEnabled(btnC9);
    }//GEN-LAST:event_btnC9ActionPerformed

    private void btnC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC10ActionPerformed
        btnEnabled(btnC10);
    }//GEN-LAST:event_btnC10ActionPerformed

    private void btnC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC11ActionPerformed
        btnEnabled(btnC11);
    }//GEN-LAST:event_btnC11ActionPerformed

    private void btnC12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC12ActionPerformed
        btnEnabled(btnC12);
    }//GEN-LAST:event_btnC12ActionPerformed

    private void btnC13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC13ActionPerformed
        btnEnabled(btnC13);
    }//GEN-LAST:event_btnC13ActionPerformed

    private void btnC14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC14ActionPerformed
        btnEnabled(btnC14);
    }//GEN-LAST:event_btnC14ActionPerformed

    private void btnC15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC15ActionPerformed
        btnEnabled(btnC15);
    }//GEN-LAST:event_btnC15ActionPerformed

    private void btnC16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC16ActionPerformed
        btnEnabled(btnC16);
    }//GEN-LAST:event_btnC16ActionPerformed

    private void btnC1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseExited
        comparar();
    }//GEN-LAST:event_btnC1MouseExited

    private void btnC2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MouseExited
        comparar();
    }//GEN-LAST:event_btnC2MouseExited

    private void btnC3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC3MouseExited
        comparar();
    }//GEN-LAST:event_btnC3MouseExited

    private void btnC4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC4MouseExited
        comparar();
    }//GEN-LAST:event_btnC4MouseExited

    private void btnC5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC5MouseExited
        comparar();
    }//GEN-LAST:event_btnC5MouseExited

    private void btnC6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC6MouseExited
        comparar();
    }//GEN-LAST:event_btnC6MouseExited

    private void btnC7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC7MouseExited
        comparar();
    }//GEN-LAST:event_btnC7MouseExited

    private void btnC8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC8MouseExited
        comparar();
    }//GEN-LAST:event_btnC8MouseExited

    private void btnC9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC9MouseExited
        comparar();
    }//GEN-LAST:event_btnC9MouseExited

    private void btnC10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC10MouseExited
        comparar();
    }//GEN-LAST:event_btnC10MouseExited

    private void btnC11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC11MouseExited
        comparar();
    }//GEN-LAST:event_btnC11MouseExited

    private void btnC12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC12MouseExited
        comparar();
    }//GEN-LAST:event_btnC12MouseExited

    private void btnC13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC13MouseExited
        comparar();
    }//GEN-LAST:event_btnC13MouseExited

    private void btnC14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC14MouseExited
        comparar();
    }//GEN-LAST:event_btnC14MouseExited

    private void btnC15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC15MouseExited
        comparar();
    }//GEN-LAST:event_btnC15MouseExited

    private void btnC16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC16MouseExited
        comparar();
    }//GEN-LAST:event_btnC16MouseExited

    private void btnReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinicioActionPerformed
        reinicio();
    }//GEN-LAST:event_btnReinicioActionPerformed

    private void btnC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseClicked

    }//GEN-LAST:event_btnC1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC11;
    private javax.swing.JButton btnC12;
    private javax.swing.JButton btnC13;
    private javax.swing.JButton btnC14;
    private javax.swing.JButton btnC15;
    private javax.swing.JButton btnC16;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnC5;
    private javax.swing.JButton btnC6;
    private javax.swing.JButton btnC7;
    private javax.swing.JButton btnC8;
    private javax.swing.JButton btnC9;
    private javax.swing.JButton btnReinicio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}