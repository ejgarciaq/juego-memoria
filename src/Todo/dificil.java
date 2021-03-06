package Todo;

import static Todo.Inicio.PanelPricipal;
import static Todo.Inicio.nivelFacil;
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

public class dificil extends javax.swing.JPanel {
    
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

    public dificil() {
        initComponents();
        setCards();
        Tiempo();
    }
    
    private void setCards(){
        int[] numeros = log.getCardNumDificil();
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
        btnC17.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[16]+".png")));
        btnC18.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[17]+".png")));
        btnC19.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[18]+".png")));
        btnC20.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[19]+".png")));
        btnC21.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[20]+".png")));
        btnC22.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[21]+".png")));
        btnC23.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[22]+".png")));
        btnC24.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[23]+".png")));
        btnC25.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[24]+".png")));
        btnC26.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[25]+".png")));
        btnC27.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[26]+".png")));
        btnC28.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[27]+".png")));
        btnC29.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[28]+".png")));
        btnC30.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[29]+".png")));
        btnC31.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[30]+".png")));
        btnC32.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[31]+".png")));
        btnC33.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[32]+".png")));
        btnC34.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[33]+".png")));
        btnC35.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[34]+".png")));
        btnC36.setDisabledIcon(new ImageIcon(getClass().getResource("/img/"+numeros[35]+".png")));
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
                if (puntos > 2 ) puntos -= 1; 
            }
            caraArriba = false;
        }
    }
    
    // metodo para reiniciar nivel
    private void reinicio(){
        dificil p = new dificil();
        PanelPricipal.removeAll();
        PanelPricipal.add(p, BorderLayout.CENTER);
        PanelPricipal.revalidate();
        PanelPricipal.repaint();
    }
    
    //metodo para ver puntage al terminar
    private void pregwin(){
        if (!btnC1.isEnabled() && !btnC2.isEnabled() && !btnC3.isEnabled() && !btnC4.isEnabled() && !btnC5.isEnabled() && !btnC6.isEnabled()
                && !btnC7.isEnabled() && !btnC8.isEnabled() && !btnC9.isEnabled() && !btnC10.isEnabled() && !btnC11.isEnabled()
                && !btnC12.isEnabled() && !btnC13.isEnabled() && !btnC14.isEnabled() && !btnC15.isEnabled() && !btnC16.isEnabled()
                && !btnC17.isEnabled() && !btnC18.isEnabled() && !btnC19.isEnabled() && !btnC20.isEnabled() && !btnC21.isEnabled()
                && !btnC22.isEnabled() && !btnC23.isEnabled() && !btnC24.isEnabled() && !btnC25.isEnabled() && !btnC26.isEnabled()
                && !btnC27.isEnabled() && !btnC28.isEnabled() && !btnC29.isEnabled() && !btnC30.isEnabled() && !btnC31.isEnabled()
                && !btnC32.isEnabled() && !btnC33.isEnabled() && !btnC34.isEnabled() && !btnC35.isEnabled() && !btnC36.isEnabled()) {
           reloj.setVisible(false);
           String[] buttons = { "Finalizar", "Iniciar" };

            int rc = JOptionPane.showOptionDialog(null, "Felicidades, usted ha ganado. Su puntaje es: " + puntos + " en un tiempo de " + min +" : "+ seg, "Ganaste!!",
            JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, null);
            
            if (1 == rc)
                nivelFacil();
            else {
                System.exit(0);
            }; 
        }
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
        btnC17 = new javax.swing.JButton();
        btnC18 = new javax.swing.JButton();
        btnC19 = new javax.swing.JButton();
        btnC20 = new javax.swing.JButton();
        btnC21 = new javax.swing.JButton();
        btnC22 = new javax.swing.JButton();
        btnC23 = new javax.swing.JButton();
        btnC24 = new javax.swing.JButton();
        btnC25 = new javax.swing.JButton();
        btnC26 = new javax.swing.JButton();
        btnC27 = new javax.swing.JButton();
        btnC28 = new javax.swing.JButton();
        btnC29 = new javax.swing.JButton();
        btnC30 = new javax.swing.JButton();
        btnC31 = new javax.swing.JButton();
        btnC32 = new javax.swing.JButton();
        btnC33 = new javax.swing.JButton();
        btnC34 = new javax.swing.JButton();
        btnC35 = new javax.swing.JButton();
        btnC36 = new javax.swing.JButton();
        btnReinicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setPreferredSize(new java.awt.Dimension(600, 570));
        setLayout(null);

        btnC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC1.addMouseListener(new java.awt.event.MouseAdapter() {
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
        btnC1.setBounds(110, 50, 60, 80);

        btnC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC2.setBounds(170, 50, 60, 80);

        btnC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC3.setBounds(230, 50, 60, 80);

        btnC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC4.setBounds(290, 50, 60, 80);

        btnC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC5.setBounds(350, 50, 60, 80);

        btnC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC6.setBounds(410, 50, 60, 80);

        btnC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC7.setBounds(110, 130, 60, 80);

        btnC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC8.setBounds(170, 130, 60, 80);

        btnC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC9.setBounds(230, 130, 60, 80);

        btnC10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC10.setBounds(290, 130, 60, 80);

        btnC11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC11.setBounds(350, 130, 60, 80);

        btnC12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC12.setBounds(410, 130, 60, 80);

        btnC13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC13.setBounds(110, 210, 60, 80);

        btnC14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC14.setBounds(170, 210, 60, 80);

        btnC15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC15.setBounds(230, 210, 60, 80);

        btnC16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
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
        btnC16.setBounds(290, 210, 60, 80);

        btnC17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC17MouseExited(evt);
            }
        });
        btnC17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC17ActionPerformed(evt);
            }
        });
        add(btnC17);
        btnC17.setBounds(350, 210, 60, 80);

        btnC18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC18MouseExited(evt);
            }
        });
        btnC18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC18ActionPerformed(evt);
            }
        });
        add(btnC18);
        btnC18.setBounds(410, 210, 60, 80);

        btnC19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC19MouseExited(evt);
            }
        });
        btnC19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC19ActionPerformed(evt);
            }
        });
        add(btnC19);
        btnC19.setBounds(110, 290, 60, 80);

        btnC20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC20MouseExited(evt);
            }
        });
        btnC20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC20ActionPerformed(evt);
            }
        });
        add(btnC20);
        btnC20.setBounds(170, 290, 60, 80);

        btnC21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC21MouseExited(evt);
            }
        });
        btnC21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC21ActionPerformed(evt);
            }
        });
        add(btnC21);
        btnC21.setBounds(230, 290, 60, 80);

        btnC22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC22MouseExited(evt);
            }
        });
        btnC22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC22ActionPerformed(evt);
            }
        });
        add(btnC22);
        btnC22.setBounds(290, 290, 60, 80);

        btnC23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC23MouseExited(evt);
            }
        });
        btnC23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC23ActionPerformed(evt);
            }
        });
        add(btnC23);
        btnC23.setBounds(350, 290, 60, 80);

        btnC24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC24.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC24MouseExited(evt);
            }
        });
        btnC24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC24ActionPerformed(evt);
            }
        });
        add(btnC24);
        btnC24.setBounds(410, 290, 60, 80);

        btnC25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC25.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC25MouseExited(evt);
            }
        });
        btnC25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC25ActionPerformed(evt);
            }
        });
        add(btnC25);
        btnC25.setBounds(110, 370, 60, 80);

        btnC26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC26MouseExited(evt);
            }
        });
        btnC26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC26ActionPerformed(evt);
            }
        });
        add(btnC26);
        btnC26.setBounds(170, 370, 60, 80);

        btnC27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC27MouseExited(evt);
            }
        });
        btnC27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC27ActionPerformed(evt);
            }
        });
        add(btnC27);
        btnC27.setBounds(230, 370, 60, 80);

        btnC28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC28MouseExited(evt);
            }
        });
        btnC28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC28ActionPerformed(evt);
            }
        });
        add(btnC28);
        btnC28.setBounds(290, 370, 60, 80);

        btnC29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC29.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC29MouseExited(evt);
            }
        });
        btnC29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC29ActionPerformed(evt);
            }
        });
        add(btnC29);
        btnC29.setBounds(350, 370, 60, 80);

        btnC30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC30.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC30MouseExited(evt);
            }
        });
        btnC30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC30ActionPerformed(evt);
            }
        });
        add(btnC30);
        btnC30.setBounds(410, 370, 60, 80);

        btnC31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC31.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC31MouseExited(evt);
            }
        });
        btnC31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC31ActionPerformed(evt);
            }
        });
        add(btnC31);
        btnC31.setBounds(110, 450, 60, 80);

        btnC32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC32.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC32MouseExited(evt);
            }
        });
        btnC32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC32ActionPerformed(evt);
            }
        });
        add(btnC32);
        btnC32.setBounds(170, 450, 60, 80);

        btnC33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC33.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC33MouseExited(evt);
            }
        });
        btnC33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC33ActionPerformed(evt);
            }
        });
        add(btnC33);
        btnC33.setBounds(230, 450, 60, 80);

        btnC34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC34.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC34MouseExited(evt);
            }
        });
        btnC34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC34ActionPerformed(evt);
            }
        });
        add(btnC34);
        btnC34.setBounds(290, 450, 60, 80);

        btnC35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC35.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC35MouseExited(evt);
            }
        });
        btnC35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC35ActionPerformed(evt);
            }
        });
        add(btnC35);
        btnC35.setBounds(350, 450, 60, 80);

        btnC36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_face.png"))); // NOI18N
        btnC36.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bf_click.png"))); // NOI18N
        btnC36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC36MouseExited(evt);
            }
        });
        btnC36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC36ActionPerformed(evt);
            }
        });
        add(btnC36);
        btnC36.setBounds(410, 450, 60, 80);

        btnReinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnReinicio.png"))); // NOI18N
        btnReinicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReinicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnReinicioClic.png"))); // NOI18N
        btnReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinicioActionPerformed(evt);
            }
        });
        add(btnReinicio);
        btnReinicio.setBounds(460, 10, 80, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 570));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 570));
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 570));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 590);
    }// </editor-fold>//GEN-END:initComponents

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC1);
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC2);
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC3);
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC4);
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC5);
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC6ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC6);
    }//GEN-LAST:event_btnC6ActionPerformed

    private void btnC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC7ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC7);
    }//GEN-LAST:event_btnC7ActionPerformed

    private void btnC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC8ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC8);
    }//GEN-LAST:event_btnC8ActionPerformed

    private void btnC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC9ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC9);
    }//GEN-LAST:event_btnC9ActionPerformed

    private void btnC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC10ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC10);
    }//GEN-LAST:event_btnC10ActionPerformed

    private void btnC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC11ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC11);
    }//GEN-LAST:event_btnC11ActionPerformed

    private void btnC12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC12ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC12);
    }//GEN-LAST:event_btnC12ActionPerformed

    private void btnC13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC13ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC13);
    }//GEN-LAST:event_btnC13ActionPerformed

    private void btnC14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC14ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC14);
    }//GEN-LAST:event_btnC14ActionPerformed

    private void btnC15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC15ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC15);
    }//GEN-LAST:event_btnC15ActionPerformed

    private void btnC16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC16ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC16);
    }//GEN-LAST:event_btnC16ActionPerformed

    private void btnC1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC1MouseExited

    private void btnC2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC2MouseExited

    private void btnC3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC3MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC3MouseExited

    private void btnC4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC4MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC4MouseExited

    private void btnC5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC5MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC5MouseExited

    private void btnC6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC6MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC6MouseExited

    private void btnC7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC7MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC7MouseExited

    private void btnC8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC8MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC8MouseExited

    private void btnC9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC9MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC9MouseExited

    private void btnC10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC10MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC10MouseExited

    private void btnC11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC11MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC11MouseExited

    private void btnC12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC12MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC12MouseExited

    private void btnC13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC13MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC13MouseExited

    private void btnC14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC14MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC14MouseExited

    private void btnC15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC15MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC15MouseExited

    private void btnC16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC16MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC16MouseExited

    private void btnReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinicioActionPerformed
        // TODO add your handling code here:
        reinicio();
    }//GEN-LAST:event_btnReinicioActionPerformed

    private void btnC17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC17ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC17);
    }//GEN-LAST:event_btnC17ActionPerformed

    private void btnC18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC18ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC18);
    }//GEN-LAST:event_btnC18ActionPerformed

    private void btnC19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC19ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC19);
    }//GEN-LAST:event_btnC19ActionPerformed

    private void btnC20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC20ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC20);
    }//GEN-LAST:event_btnC20ActionPerformed

    private void btnC21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC21ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC21);
    }//GEN-LAST:event_btnC21ActionPerformed

    private void btnC22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC22ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC22);
    }//GEN-LAST:event_btnC22ActionPerformed

    private void btnC23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC23ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC23);
    }//GEN-LAST:event_btnC23ActionPerformed

    private void btnC24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC24ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC24);
    }//GEN-LAST:event_btnC24ActionPerformed

    private void btnC25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC25ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC25);
    }//GEN-LAST:event_btnC25ActionPerformed

    private void btnC26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC26ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC26);
    }//GEN-LAST:event_btnC26ActionPerformed

    private void btnC27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC27ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC27);
    }//GEN-LAST:event_btnC27ActionPerformed

    private void btnC28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC28ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC28);
    }//GEN-LAST:event_btnC28ActionPerformed

    private void btnC29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC29ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC29);
    }//GEN-LAST:event_btnC29ActionPerformed

    private void btnC30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC30ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC30);
    }//GEN-LAST:event_btnC30ActionPerformed

    private void btnC31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC31ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC31);
    }//GEN-LAST:event_btnC31ActionPerformed

    private void btnC32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC32ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC32);
    }//GEN-LAST:event_btnC32ActionPerformed

    private void btnC33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC33ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC33);
    }//GEN-LAST:event_btnC33ActionPerformed

    private void btnC34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC34ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC34);
    }//GEN-LAST:event_btnC34ActionPerformed

    private void btnC35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC35ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC35);
    }//GEN-LAST:event_btnC35ActionPerformed

    private void btnC36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC36ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC36);
    }//GEN-LAST:event_btnC36ActionPerformed

    private void btnC17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC17MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC17MouseExited

    private void btnC18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC18MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC18MouseExited

    private void btnC19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC19MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC19MouseExited

    private void btnC20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC20MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC20MouseExited

    private void btnC21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC21MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC21MouseExited

    private void btnC22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC22MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC22MouseExited

    private void btnC23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC23MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC23MouseExited

    private void btnC24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC24MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC24MouseExited

    private void btnC25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC25MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC25MouseExited

    private void btnC26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC26MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC26MouseExited

    private void btnC27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC27MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC27MouseExited

    private void btnC28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC28MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC28MouseExited

    private void btnC29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC29MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC29MouseExited

    private void btnC30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC30MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC30MouseExited

    private void btnC31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC31MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC31MouseExited

    private void btnC32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC32MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC32MouseExited

    private void btnC33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC33MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC33MouseExited

    private void btnC34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC34MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC34MouseExited

    private void btnC35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC35MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC35MouseExited

    private void btnC36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC36MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_btnC36MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC11;
    private javax.swing.JButton btnC12;
    private javax.swing.JButton btnC13;
    private javax.swing.JButton btnC14;
    private javax.swing.JButton btnC15;
    private javax.swing.JButton btnC16;
    private javax.swing.JButton btnC17;
    private javax.swing.JButton btnC18;
    private javax.swing.JButton btnC19;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC20;
    private javax.swing.JButton btnC21;
    private javax.swing.JButton btnC22;
    private javax.swing.JButton btnC23;
    private javax.swing.JButton btnC24;
    private javax.swing.JButton btnC25;
    private javax.swing.JButton btnC26;
    private javax.swing.JButton btnC27;
    private javax.swing.JButton btnC28;
    private javax.swing.JButton btnC29;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC30;
    private javax.swing.JButton btnC31;
    private javax.swing.JButton btnC32;
    private javax.swing.JButton btnC33;
    private javax.swing.JButton btnC34;
    private javax.swing.JButton btnC35;
    private javax.swing.JButton btnC36;
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