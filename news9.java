import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;

git add News9.java news.jpg sports.jpg .gitignorepublic class News9 extends JPanel {

    Image mainImage;
    Image sportsImage;

    public News9() {

        try {
            mainImage = ImageIO.read(new File("news.jpg"));
            sportsImage = ImageIO.read(new File("sports.jpg"));
        } catch (Exception e) {
            System.out.println("Images could not be loaded.");
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(new Color(245, 240, 230));

        // Top Header
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1000, 30);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.PLAIN, 12));
        g.drawString("Monday, June 1, 2026 | Kathmandu, Nepal", 20, 20);

        // Newspaper Title
        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD, 42));
        g.drawString("Kathmandu Post", 20, 85);

        // Navigation Bar
        g.fillRect(0, 100, 1000, 25);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 13));
        g.drawString("NATIONAL", 20, 118);
        g.drawString("POLITICS", 120, 118);
        g.drawString("SPORTS", 220, 118);
        g.drawString("WORLD", 310, 118);

        // Main Headline
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.BOLD, 26));
        g.drawString("Parliament Discusses", 20, 170);
        g.drawString("National Development Plans", 20, 205);

        // Main News Image
        if (mainImage != null) {
            g.drawImage(mainImage, 20, 225, 620, 240, this);
        }

        // Main News Content
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("Serif", Font.PLAIN, 15));

        g.drawString("Lawmakers discussed infrastructure, education,", 20, 500);
        g.drawString("and economic development during the latest", 20, 525);
        g.drawString("parliament session in Kathmandu.", 20, 550);

        g.drawString("Several proposals were presented to strengthen", 20, 580);
        g.drawString("national growth and public services.", 20, 605);

        // Sports Section
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.drawString("SPORTS", 700, 170);

        if (sportsImage != null) {
            g.drawImage(sportsImage, 700, 190, 240, 150, this);
        }

        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.BOLD, 18));
        g.drawString("Virat Kohli Leads RCB", 700, 370);
        g.drawString("to IPL Championship", 700, 395);

        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("Serif", Font.PLAIN, 14));

        g.drawString("Virat Kohli played a crucial role in Royal", 700, 430);
        g.drawString("Challengers Bengaluru securing the IPL title.", 700, 450);

        g.drawString("Fans celebrated the historic victory across", 700, 475);
        g.drawString("India and around the cricketing world.", 700, 495);

        // Footer
        g.setColor(Color.BLACK);
        g.fillRect(0, 650, 1000, 25);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.PLAIN, 12));
        g.drawString("Kathmandu Post | National | Politics | Sports | World", 20, 667);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Kathmandu Post Newspaper");

        frame.add(new News9());
        frame.setSize(1000, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}