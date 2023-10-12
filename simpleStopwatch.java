import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simpleStopwatch implements ActionListener{
    JLabel jlab;
    double begin;
    double end;

    simpleStopwatch(){
        //create a new JFrame container.
        JFrame jfrm = new JFrame("Simple Stopwatch");
        jfrm.getContentPane().setLayout(new FlowLayout());
        //Give the frame an initial size
        jfrm.setSize(400,200);
        // Terminate program when user closes application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create start and stop buttons
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        //add action listener
        start.addActionListener(this);
        stop.addActionListener(this);
        //add buttons to frame
        jfrm.getContentPane().add(start);
        jfrm.getContentPane().add(stop);

        //create label prompt
        jlab = new JLabel("Press button to start");
        //add prompt to frame
        jfrm.getContentPane().add(jlab);

        //display frame
        jfrm.setVisible(true);
    }

    //Handle action event (for when the button is pressed)
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Start")) {
            //text when start is pressed
            begin = System.currentTimeMillis();
            jlab.setText("Timer Started");
        }
        else {
            //text when stop is pressed
            end = System.currentTimeMillis();
            jlab.setText("Time: " + (end - begin));
        }
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new simpleStopwatch();
            }
        });
    }
}
