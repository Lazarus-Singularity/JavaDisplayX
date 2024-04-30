package javadisplayx;

public class JavaDisplayX {

	public static void main(String[] args) {

		String[][] mostrarX = new String[10][10];

		int Acum1 = 0;
		int Acum2 = 9;

		for (int i = 0; i < mostrarX.length; i++) {
			for (int j = 0; j < mostrarX.length; j++) {

				mostrarX[i][j] = " ";
			}

		}

		for (int i = 0; i < mostrarX.length; i++) {
			for (int j = 0; j < mostrarX.length; j++) {

				mostrarX[Acum1][Acum2] = "X";
				mostrarX[Acum1][Acum1] = "X";

			}
			Acum1++;
			Acum2--;
		}
		for (int i = 0; i < mostrarX.length; i++) {
			for (int j = 0; j < mostrarX.length; j++) {
				System.out.print(mostrarX[i][j] + " ");

			}
			System.out.println(" ");
		}

	}

}
