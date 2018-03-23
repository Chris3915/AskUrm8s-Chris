import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class loginGUI extends JFrame{

    private JLabel fehlerDetails;
    private JButton connect;
    private JLabel title;
    private JTextField IP;
    private JTextField name;
    private JLabel fehler;

    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable()
                                               {
                                                   public void run() {
                                                       new loginGUI();
                                                   }
                                               }
        );
    }
    public loginGUI()
    {
        this.setTitle("loginGUI");
        this.setSize(800,600);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(800,600));
        contentPane.setBackground(new Color(255,255,255));


        fehlerDetails = new JLabel();
        fehlerDetails.setBounds(200,500,400,50);
        fehlerDetails.setBackground(new Color(214,217,223));
        fehlerDetails.setForeground(new Color(0,0,0));
        fehlerDetails.setEnabled(true);
        fehlerDetails.setFont(new Font("SansSerif",0,20));
        fehlerDetails.setText("-");
        fehlerDetails.setVisible(false);

        connect = new JButton();
        connect.setBounds(200,360,400,100);
        connect.setBackground(new Color(0,255,0));
        connect.setForeground(new Color(0,0,0));
        connect.setEnabled(true);
        connect.setFont(new Font("SansSerif",0,30));
        connect.setText("Verbinden");
        connect.setVisible(true);

        title = new JLabel(new ImageIcon("title.png"));
        title.setBounds(100,35,600,200);
        title.setVisible(true);

        IP = new JTextField();
        IP.setBounds(300,250,200,35);
        IP.setBackground(new Color(255,255,255));
        IP.setForeground(new Color(0,0,0));
        IP.setEnabled(true);
        IP.setFont(new Font("sansserif",0,12));
        IP.setText("IP-Adresse");
        IP.setVisible(true);

        name = new JTextField();
        name.setBounds(300,300,200,35);
        name.setBackground(new Color(255,255,255));
        name.setForeground(new Color(0,0,0));
        name.setEnabled(true);
        name.setFont(new Font("sansserif",0,12));
        name.setText("gewünschter Name");
        name.setVisible(true);

        fehler = new JLabel();
        fehler.setBounds(350,470,100,35);
        fehler.setBackground(new Color(214,217,223));
        fehler.setForeground(new Color(0,0,0));
        fehler.setEnabled(true);
        fehler.setFont(new Font("SansSerif",0,30));
        fehler.setText("-");
        fehler.setVisible(false);

        //adding components to contentPane panel
        contentPane.add(fehlerDetails);
        contentPane.add(connect);
        contentPane.add(title);
        contentPane.add(IP);
        contentPane.add(name);
        contentPane.add(fehler);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    public void fehlerAnzeigen(String n)
    {
        fehler.setVisible(true);
        fehler.setText("Fehler");
        fehlerDetails.setVisible(true);
        fehlerDetails.setText(n);
    }


}
