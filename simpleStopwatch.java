import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class simpleStopwatch implements ActionListener{
    JLabel jlab;

    simpleStopwatch(){
        //create a new JFrame container.
        JFrame jfrm = new JFrame("Simple Stopwatch");
        jfrm.getContentPane().setLayout(new FlowLayout());
        //Give the frame an initial size
        jfrm.setSize(400,200);
        // Terminate program when user closes application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create label prompt
        jlab = new JLabel("Press button to start");
        //add prompt to frame
        jfrm.getContentPane().add(jlab);

        //create start and stop buttons
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        //add action listener
        start.addActionListener(this);
        stop.addActionListener(this);
        //add buttons to frame
        jfrm.getContentPane().add(start);
        jfrm.getContentPane().add(stop);

        //display frame
        jfrm.setVisible(true);
    }

    //Handle action event (for when the button is pressed)
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Start"))
            //text when start is pressed
            jlab.setText("Stopwatch is running");
        else
            //text when stop is pressed
            jlab.setText("Stopwatch was stopped");
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new simpleStopwatch();
            }
        });
    }
}
