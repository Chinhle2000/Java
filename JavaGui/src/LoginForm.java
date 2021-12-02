import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {
    private JTextField txtuser;
    private JPasswordField txtpass;
    private JButton btnDangnhap;
    private JButton btnDangki;
    private JLabel lbTen;
    private JLabel lbMatkhau;
    private JLabel lbDanngnhap;
    private Container container =getContentPane();
    LoginForm (){
        setLayout();
        setLocationSize();
        addToContainer();
        setEvent();
    }
    
    public void setLayout (){
        container.setLayout(null);
    }
    public void setLocationSize(){
        lbDanngnhap.setBounds(150,10,100,40);
        lbTen.setBounds(50,50,100,30);
        lbMatkhau.setBounds(50,100,100,30);
        txtuser.setBounds(150,50,150,30);
        txtpass.setBounds(150,100,150,30);
        btnDangki.setBounds(90,150,100,30);
        btnDangnhap.setBounds(210,150,100,30);
    }
    public void addToContainer(){
        container.add(lbDanngnhap);
        container.add(lbTen);
        container.add(lbMatkhau);
        container.add(txtuser);
        container.add(txtpass);
        container.add(btnDangnhap);
        container.add(btnDangki);

    }
    public void setEvent(){
        btnDangnhap.addActionListener(this);
        btnDangki.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String Username =txtuser.getText();
            String Password=new String(txtpass.getPassword());
            StringBuilder sb =new StringBuilder ();
            if (Username .equals("")){
                sb.append("Username is emty \n");
            }
            if (Password.equals("")){
                sb.append("Password is emty \n");

            }
            if (sb.length()>0){
                JOptionPane.showMessageDialog(this,sb.toString(),"Invalidation",JOptionPane.ERROR_MESSAGE);
                return;

            }
        }

}
