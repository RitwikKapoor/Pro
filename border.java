import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout Example");

        Button northButton = new Button("North");
        Button southButton = new Button("South");
        Button eastButton = new Button("East");
        Button westButton = new Button("West");
        Button centerButton = new Button("Center");

        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton, BorderLayout.CENTER);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
