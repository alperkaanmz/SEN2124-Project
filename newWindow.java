import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class newWindow extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    newWindow frame = new newWindow();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }




    public newWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 594, 475);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTextField txtApplicantsName = new JTextField();
        txtApplicantsName.setFont(new Font("Tahoma", Font.BOLD, 15));
        txtApplicantsName.setText("APPLICANT'S NAME: "+Name());
        txtApplicantsName.setBounds(21, 23, 532, 65);
        contentPane.add(txtApplicantsName);
        txtApplicantsName.setColumns(10);

        JTextField textFieldScore = new JTextField();
        textFieldScore.setBounds(21, 105, 532, 44);
        contentPane.add(textFieldScore);
        textFieldScore.setColumns(10);
        textFieldScore.setText(mainWindow.totalScore());

        JTextArea textArea = new JTextArea();
        textArea.setBounds(21, 160, 532, 216);
        contentPane.add(textArea);
        //textArea.add(Attribute());
        textArea.setText(mainWindow.scores());

        JButton btnHire = new JButton("HIRE");
        btnHire.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnHire.setBackground(Color.GREEN);
        btnHire.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnHire.setBounds(42, 387, 142, 43);
        contentPane.add(btnHire);

        JButton btnCancel = new JButton("CANCEL");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new mainWindow().setVisible(true);
            }
        });
        btnCancel.setBackground(Color.RED);
        btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnCancel.setBounds(392, 386, 142, 44);
        contentPane.add(btnCancel);

        JButton btnNewButton = new JButton("NEXT");
        btnNewButton.setForeground(Color.BLUE);
        btnNewButton.setBounds(211, 387, 142, 43);
        contentPane.add(btnNewButton);
        //	public void actionPerformed(ActionEvent e) {}
    }

    public static BinaryTree createBinaryTree(BinaryTree bt) {

//	   Person PersonArr[] = new Person[3]; //BU 3 K��� YAN CLASTA OLU�TURDU�UMUZ 3 K��� M� ???
//	    for(Object p:PersonArr) {
//	    	bt.insert(((Person) p).getAveragescore());}

        bt = new BinaryTree();
        ArrayList<Person> PersonArr = new ArrayList<Person>();
        Person p1=new Person("Beg�m Kaya",33);
        Person p2=new Person("Ecem Aydo�an",66);
        Person p3=new Person("Alper Mazino�lu",99);
        PersonArr.add(p1);
        PersonArr.add(p2);
        PersonArr.add(p3);

        for(Person p:PersonArr) {
            bt.insert(p.averagescore);
        }
        bt.inOrderWithoutRecursion();
        return bt.print();
    }

    public static String Name() {
        //for (int i = 0; i < BinaryTree.size; i++) {Person.getName();}
        return Person.getName();}

    //for (int i = 0; i < BinaryTree.size; i++) {}
    //	Person.getName();} return Name();	}


    public static Component Attribute() {
        return null;
    }
}