package Todo;
// Importa librerías necesarias para manipulación de interfaz gráfica
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
/**
 * @author Edson Garcia Quiros
 */

public class Inicio extends javax.swing.JFrame {
 
    // Constructor de la clase Inicio
    public Inicio() {
        // Inicializa los componentes gráficos de la ventana
        initComponents();
        // Configura el título de la ventana
        this.setTitle("Encuéntralo");
        // Establece la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        // Bloquea la posibilidad de cambiar el tamaño de la ventana
        this.setResizable(false);
        // Configura la acción al cerrar la ventana (terminar ejecución) evita ejecucion en segundo plano
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //permite colocar otros objetos donde queramos
        this.setLayout(null);
        // Carga el ícono de la aplicación desde los recursos
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icon.png"));
        this.setIconImage(ico);
    }
    // Método estático para configurar el nivel fácil
    static void nivelFacil() {
        easy p = new easy();// Crea una instancia de la clase "easy"
        PanelPricipal.removeAll();// Limpia el contenido anterior del panel principal
        PanelPricipal.add(p, BorderLayout.CENTER);// Agrega el nuevo contenido al centro
        PanelPricipal.revalidate();// Actualiza la interfaz gráfica
        PanelPricipal.repaint();// Redibuja el contenido
    }
    // Método estático para configurar el nivel normal  
    static void nivelNormal() {
        normal p = new normal();// Crea una instancia de la clase "normal"
        PanelPricipal.removeAll();// Limpia el contenido anterior del panel principal
        PanelPricipal.add(p, BorderLayout.CENTER);// Agrega el nuevo contenido al centro
        PanelPricipal.revalidate();// Actualiza la interfaz gráfica
        PanelPricipal.repaint();// Redibuja el contenido
    }
    // Método estático para configurar el nivel difícil
    static void nivelDificil() {
        dificil p = new dificil();// Método estático para configurar el nivel difícil
        PanelPricipal.removeAll();// Limpia el contenido anterior del panel principal
        PanelPricipal.add(p, BorderLayout.CENTER);// Agrega el nuevo contenido al centro
        PanelPricipal.revalidate();// Actualiza la interfaz gráfica
        PanelPricipal.repaint();// Redibuja el contenido
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        // Panel principal donde se mostrarán los niveles
        PanelPricipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        PanelPricipal.setBackground(new java.awt.Color(255, 255, 255)); // Color blanco de fondo
        PanelPricipal.setAlignmentX(0.0F);
        PanelPricipal.setAlignmentY(0.0F);
        PanelPricipal.setInheritsPopupMenu(true);
        getContentPane().add(PanelPricipal);
        PanelPricipal.setBounds(0, -10, 600, 560);  // Color blanco de fondo
        PanelPricipal.setBackground(new Color(0, 0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoInicio.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 600);// Ubicación y tamaño del fondo
        jLabel1.getAccessibleContext().setAccessibleName("FondoInicio");
        jLabel1.getAccessibleContext().setAccessibleDescription("Fondo de Pantalla de inicio");

        jMenu2.setText("Iniciar");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);
        
        jMenu1.setText("Niveles");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        // Opciones dentro del menú "Niveles"
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconKing1.png"))); // NOI18N
        jMenuItem1.setText("Fácil");
        jMenuItem1.setActionCommand("Facil");
        jMenuItem1.setAutoscrolls(true);
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconKing2.png"))); // NOI18N
        jMenuItem2.setText("Normal");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconKing3.png"))); // NOI18N
        jMenuItem3.setText("Difícil");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1); // Opciones dentro del menú "Niveles"

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        nivelDificil();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        nivelNormal();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        nivelFacil();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        nivelFacil();
    }//GEN-LAST:event_jMenu2MouseClicked
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PanelPricipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
