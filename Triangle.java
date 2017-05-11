import javax.swing.JOptionPane;

public class Triangle {

	public static int getArea(int width){

		if (width ==1){
			return 1;	//special case

		}
		else if (width <0){
			return 0;	//special case
		}
		else{
			getArea(width-1);
			return getArea(width-1) + width;
			
		}
	}

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int w = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a width of the base of the triangle "));
		int area = getArea(w);
		JOptionPane.showMessageDialog(null, area);

	}

}
