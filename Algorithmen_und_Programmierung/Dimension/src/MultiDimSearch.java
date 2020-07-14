public class MultiDimSearch {

	/**
	 * @author Skopp, Jonathan
	 * @Matrikel 60128
	 */

	public static void find1(char[][] a, char[][] m) {

		int x, y;
		int sizeMx = m.length - 1, sizeMy = m[sizeMx].length - 1;

		for (int i = 0; i < a.length; i++) {
			for (int p = 0; p < a[i].length; p++) {
				if (a[i][p] == m[0][0]) {
					// System.out.println(i + " "+p);
					x = i;
					y = p;

					jump: {
						// System.out.println("Pattern scanning...");
						for (int k = 0; k < m.length; k++) {
							for (int l = 0; l < m[k].length; l++) {
								if ((x + k >= a.length) || (y + l >= a[x + k].length)) {

									break jump;
								} else if (a[x + k][y + l] != m[k][l]) {
									break jump;

								} else if ((k == sizeMx) && (l == sizeMy)) {
									if (a[x + k][y + l] == m[k][l]) {
										System.out.println("Das Muster wurde gefunden!");
										System.out.println("Koordinaten in A: x= " + x + " y= " + y);

										return;
									}
								}
							}
						}
					}

				}

			}
		}

		System.out.println("Das Muster konnte nicht gefunden werden!");
		return;
	}

	public static void find2(char[][] a, char[][] m) {
		int x, y;
		int sizeMx = m.length - 1, sizeMy = m[sizeMx].length - 1;

		for (int i = 0; i < a.length; i++) {
			for (int p = 0; p < a[i].length; p++) {
				if ((a[i][p] == m[0][0]) || (m[0][0] == '*')) {
					// System.out.println(i + " "+p);
					x = i;
					y = p;

					jump: {
						// System.out.println("Pattern scanning...");
						for (int k = 0; k < m.length; k++) {
							for (int l = 0; l < m[k].length; l++) {
								if ((x + k >= a.length) || (y + l >= a[i + k].length)) {
									// System.out.println("Nicht gefunden!");
									break jump;
								} else if (a[x + k][y + l] != m[k][l]) {
									if (m[k][l] != '*') {
										break jump;
									}
								} else if ((k == sizeMx) && (l == sizeMy)) {
									if ((a[x + k][y + l] == m[k][l]) || (m[k][l] == '*')) {
										System.out.println("Das Muster wurde gefunden!");
										System.out.println("Koordinaten in A: x= " + x + " y= " + y);
										return;
									}

								}
							}
						}
					}

				}
			}
		}

		System.out.println("Das Muster konnte nicht gefunden werden!");
		return;

	}

	public static void main(String[] args) {

		// m = char Array (Das was durchsucht wird)
		char[][] m = { { '8', '8', '8', '8' }, { '`', 'P', '\'' }, { ' ', ' ' } };
		char[][] m2 = { { '8', '-' }, { '8', '8' } };
		char[][] m3 = { { '.', '*', '.' }, { '8', '*', '8' } };

		// Bender aus Furutrama :)
		char[][] a = new char[44][];

		a[0] = "                      .-.".toCharArray();
		a[1] = "                     (   )".toCharArray();
		a[2] = "                      '-'".toCharArray();
		a[3] = "                      J L".toCharArray();
		a[4] = "                      | |".toCharArray();
		a[5] = "                     J   L".toCharArray();
		a[6] = "                     |   |".toCharArray();
		a[7] = "                    J     L".toCharArray();
		a[8] = "                  .-'.___.'-.".toCharArray();
		a[9] = "                 /___________\\".toCharArray();
		a[10] = "            _.-'''           `bmw._".toCharArray();
		a[11] = "          .'                       `.".toCharArray();
		a[12] = "        J                            `.".toCharArray();
		a[13] = "       F                               L".toCharArray();
		a[14] = "      J                                 J".toCharArray();
		a[15] = "     J                                  `".toCharArray();
		a[16] = "     |                                   L".toCharArray();
		a[17] = "     |                                   |".toCharArray();
		a[18] = "     |                                   |".toCharArray();
		a[19] = "     |                                   J".toCharArray();
		a[20] = "     |                                    L".toCharArray();
		a[21] = "     |                                    |".toCharArray();
		a[22] = "     |             ,.___          ___....--._".toCharArray();
		a[23] = "     |           ,'     `'''''''''           `-._".toCharArray();
		a[24] = "     |          J           _____________________`-.".toCharArray();
		a[25] = "     |         F         .-'   `-88888-'    `Y8888b.`.".toCharArray();
		a[26] = "     |         |       .'         `P'         `88888b \\".toCharArray();
		a[27] = "     |         |      J       #     L      #    q8888b L".toCharArray();
		a[28] = "     |         |      |             |           )8888D )".toCharArray();
		a[29] = "     |         J      \\             J           d8888PP".toCharArray();
		a[30] = "     |          L      `.         .b.         ,88888P /".toCharArray();
		a[31] = "     |           `.      `-.___,o88888o.___,o88888P'.'".toCharArray();
		a[32] = "     |             `-.__________________________..-'".toCharArray();
		a[33] = "     |                                    |".toCharArray();
		a[34] = "     |         .-----.........____________J".toCharArray();
		a[35] = "     |       .' |       |      |       |".toCharArray();
		a[36] = "     |      J---|-----..|...___|_______|".toCharArray();
		a[37] = "     |      |   |       |      |       |".toCharArray();
		a[38] = "     |      Y---|-----..|...___|_______|".toCharArray();
		a[39] = "     |       `. |       |      |       |".toCharArray();
		a[40] = "     |         `'-------:....__|______.J".toCharArray();
		a[41] = "     |                                  |".toCharArray();
		a[42] = "      L___                              |".toCharArray();
		a[43] = "          '''----...______________....--'".toCharArray();

		// Das sind die Aufrufe für die Suche
		find1(a, m);
		find1(a, m2);
		find2(a, m3);
	}
}
