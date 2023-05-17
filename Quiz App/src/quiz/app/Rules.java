package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Online Quiz");
        heading.setBounds(195, 35, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.darkGray);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 120, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Only Single participation is allowed." + "<br><br>" +
                "2. The medium of the questions will be only English." + "<br><br>" +
                "3. There will be no screening round." + "<br><br>" +
                "4. All the participants can play all the rounds." + "<br><br>" +
                "5. On the average score derives from all the rounds, winners will be declared." + "<br><br>" +
                "6. There will be certain time span for each question." + "<br><br>" +
                "7. If there is any tie up among the participants about average score, it will be solved by taking another round or set of rounds." + "<br><br>" +
                "8. Good Luck!" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(Color.MAGENTA);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
