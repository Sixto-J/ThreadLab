import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements Runnable{

    private final JFrame myFrame;
    private Viewer viewer;
    private Thread myThread;
    private Thread myThread2;
    private int valor;

    public View(){

        viewer = new Viewer();
        viewer.setBounds(0, 0, 800, 800);
        this.myFrame = new JFrame("JFrame");

        myFrame.setSize(1000, 1000);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setLayout(new FlowLayout());

        ControlPanel cp1 = new ControlPanel();
        cp1.setBounds(50,50,400,400);
        cp1.getMessageOK().setPreferredSize(new Dimension(150, 50));
        cp1.getMessageCancel().setPreferredSize(new Dimension(150, 50));

        myFrame.setLocationRelativeTo(null);

        // Create a button to start the thread
        JButton startButton = new JButton("Start Thread");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //startMyThread();
            }
        });

        // Add the button to the JFrame
        myFrame.add(startButton);

        JButton button1 = new JButton("Click Me");
        button1.setPreferredSize(new Dimension(150, 50));
        myFrame.add(button1);

        myFrame.pack();
        myFrame.add(viewer);
        myFrame.setVisible(true);
        //myFrame.add(new Viewer());
        //super(jp1);

    }



    @Override
    public void run(){}

    public void stop(){}



}
