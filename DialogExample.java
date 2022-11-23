import javax.swing.*;
import java.awt.*;  

public class DialogExample {
    private static JDialog d;

    DialogExample() {
        JFrame f = new JFrame();
        d = new JDialog(f, "Landlord", true);
        d.setLayout(new FlowLayout());

        JLabel name = new JLabel("Name:");
        JLabel email = new JLabel("Email:");
        JLabel phone = new JLabel("Phone:");
        JLabel id = new JLabel("Id");
        JLabel nationality = new JLabel("Nationality");

        JTextField nameBox = new JTextField(16);
        JTextField emailBox = new JTextField(16);
        JTextField phoneBox = new JTextField(16);
        JTextField idBox = new JTextField(16);
        JTextField nationalityBox = new JTextField(16);

        d.add(name);
        d.add(nameBox);

        d.add(email);
        d.add(emailBox);

        d.add(phone);
        d.add(phoneBox);

        d.add(id);
        d.add(idBox);

        d.add(nationality);
        d.add(nationalityBox);

        d.setSize(300, 300);
        d.setVisible(true);
    }

}  