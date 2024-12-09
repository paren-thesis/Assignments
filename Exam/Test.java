import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {

		try {
			int base = Integer.parseInt(JOptionPane.showInputDialog("Enter triangle base"));
			int height = Integer.parseInt(JOptionPane.showInputDialog("Enter triangle height"));

			Pyramid pyramidTop = new Pyramid(base, height);

			String output = String.format("Base: %d\nHeight: %d\nArea: %5.3f\nVolume: %5.3f\nCost: GHC  %5.2f", base,
					height, pyramidTop.area(), pyramidTop.volume(), pyramidTop.cost());

			JOptionPane.showMessageDialog(null, output, "Output", 1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Error", 0);
		}
	}

}