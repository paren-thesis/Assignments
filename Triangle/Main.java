import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        try {
            int base = Integer.parseInt(JOptionPane.showInputDialog("Enter triangle base"));
            int height = Integer.parseInt(JOptionPane.showInputDialog("Enter triangle height"));
            
            Pyramid PyramidTop = new Pyramid(base, height);
            double b = PyramidTop.getBase();
            double h = PyramidTop.getHeight();
            double v = PyramidTop.volume();
            double c = PyramidTop.cost();

            String output = String.format("Base: %5.3f\nHeight: %5.3f\nVolume: %5.3f\nCost: GHC %5.2f", b,h,v,c);

            JOptionPane.showMessageDialog(null, output, "Output", 1);
            
        } catch (Exception e) {
            System.out.println("P");
        }
    }
}
