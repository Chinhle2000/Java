import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupForm extends JFrame implements ActionListener {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JPasswordField txtPasswordNew;
    private JButton btnDangki;
    private JButton btnDangnhap;
    private JLabel lbTentaokhoan;
    private JLabel lbmatkhaumoi;
    private JLabel lbNhaplaimatkhau;
    private JLabel lbDangki;
    private Container container =getContentPane();
    SignupForm (){
        setLayout();
        setLocationSize();
        addToContainer();
        setEvent();
    }
    public void setLayout (){
        container.setLayout(null);
    }
    public void setLocationSize(){
        lbDangki.setBounds(150,10,100,40);
        lbTentaokhoan.setBounds(50,50,100,30);
        lbmatkhaumoi.setBounds(50,100,100,30);
        lbNhaplaimatkhau.setBounds(50,120,100,100);
        txtUsername.setBounds(150,50,150,30);
        txtPassword.setBounds(150,100,150,30);
        txtPasswordNew.setBounds(150,150,150,30);
        btnDangki.setBounds(90,200,100,30);
        btnDangnhap.setBounds(210,200,100,30);


    }
    public void addToContainer(){
        container.add(lbDangki);
        container.add(lbTentaokhoan);
        container.add(lbmatkhaumoi);
        container.add(lbNhaplaimatkhau);
        container.add(txtUsername);
        container.add(txtPasswordNew) ;
        container.add(txtPassword);
        container.add(btnDangnhap);
        container.add(btnDangki);

    }
    public void setEvent(){
        btnDangnhap.addActionListener(this);
        btnDangki.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
