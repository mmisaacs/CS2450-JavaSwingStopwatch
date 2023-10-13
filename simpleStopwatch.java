import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simpleStopwatch implements ActionListener{
    //declaring variables
    private JPanel panel;
    private JLabel jlab;
    double begin;
    double end;
    private JButton start;
    private JButton stop;

    simpleStopwatch(){
        //create a new JFrame container.
        JFrame jfrm = new JFrame("Simple Stopwatch");
        //jfrm.getContentPane().setLayout(new FlowLayout());
        //Give the frame an initial size
        jfrm.setSize(225,150);
        // Terminate program when user closes application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //declare the panel with a flow layout
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER));


        //create start and stop buttons
        start = new JButton("Start");
        stop = new JButton("Stop");
        //add action listener
        start.addActionListener(this);
        stop.addActionListener(this);
        //add buttons to panel
        panel.add(start);
        panel.add(stop);

        //create label prompt
        jlab = new JLabel("Press button to start");
        //add prompt to panel
        panel.add(jlab);

        //add panel to frame
        jfrm.add(panel);

        //display frame
        jfrm.setVisible(true);
    }

    //Handle action event (for when the button is pressed)
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Start")) {
            //text when start is pressed
            begin = System.currentTimeMillis();
            jlab.setText("Stopwatch is running");
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
