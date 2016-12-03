
public class RandomNoise {
	public static void main(String[] args) {
		int[][] draw = new int[400][300];
		for (int i = 0; i < draw.length; i++) {
			for (int b = 0; b < draw[i].length; b++) {
				if (Math.random() > 0.5) {
					int x = 16777215; // num for black
					draw[i][b] = 0;
				} else {
					int x = 16777215; // num for white
					draw[i][b] = x;
				}
			}
		}
		for (int i = 0; i < draw.length; i++) {
			for (int b = 0; b < draw[i].length; b++) {
				System.out.println(draw[i][b]);
			}
		}
	}
		// then just add a draw method from the canvas and jframe class. the 16777215 shows white dots where as 0 is black. 
		//The ratios can be changed to show more black/white. 
}
	