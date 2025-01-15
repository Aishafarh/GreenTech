import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainG extends JFrame {

    private JTextField plasticTextField;
    private JTextField chemischAfvalTextField;
    private JLabel Bedrijfsnaam;
    private JPanel panel1;
    private JTextField Papier;
    private JTextField Restaval;

    public MainG () {
        setContentPane(panel1);
        setTitle ("Greentech");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);

        plasticTextField.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainG.this, "hello world");

            }
        });


            }
        };
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

