package oyun;

import java.io.*;
import java.util.*;


abstract public class Oyun {
	static final int ROWS = 8;
	static final int COLUMNS = 8;

	public static int bul(String[][] arr2, String s) {//2D arrayde kelimene tekarar� bulunma
		int tane = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[i][j].equals(s)) {
					tane++;

				}
			}
		}

		return tane;

	}

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String[][] covArray = new String[ROWS][COLUMNS];
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Dosya Girin(.txt): ");//Kullan�c�dan aktar�lacak dosyan�n istenmesi
		String dosya_adi = keyboard.nextLine();
		
		Scanner scc = new Scanner(new File(dosya_adi));//dosyan�n a��lmas�
		
		//txt file okuma ,2D array atama
		while (scc.hasNextLine()) {
			for (int i = 0; i < covArray.length; i++) {
				String[] line = scc.nextLine().split(" ");
				for (int j = 0; j < line.length; j++) {
					covArray[i][j] = line[j];
				}
			}
		}

		
		Tahta board =new Tahta();
		board.setBoard(covArray);//2D arrayi classa aktarma
		
		ArrayList<Siyahlar> sl = new ArrayList<Siyahlar>();//siyah ta�lar� tutmak i�in array list olu�turma

		int t = 1;

		for (int i = 0; i < ROWS; i++) {

			for (int j = 0; j < COLUMNS; j++) {
				Siyahlar s = new Siyahlar();//dosyada verilen siyah ta�lar� objeye atama

				
				// siyah �ah varsa kaydet ve objeyi listeye ekle
				if (covArray[i][j].equals("ss")) {// siyah �ah
					s.setTas((i + 1), (j + 1), "Sah", "siyah");
					sl.add(s);
					
					
				// siyah kale varsa kaydet ve objeyi listeye ekle
				} else if (covArray[i][j].equals("ks")) {
					s.setTas((i + 1), (j + 1), "Kale", "siyah");
					sl.add(s);
					
					
				// siyah piyon varsa kaydet ve objeyi listeye ekle
				} else if (covArray[i][j].equals("ps")) {
					s.setTas((i + 1), (j + 1), "Piyon", "siyah");
					sl.add(s);

					
				// siyah vezir varsa kaydet ve objeyi listeye ekle
				} else if (covArray[i][j].equals("vs")) {
					s.setTas((i + 1), (j + 1), "Vezir", "siyah");
					sl.add(s);

					
				// siyah at varsa kaydet ve objeyi listeye ekle
				} else if (covArray[i][j].equals("as")) {
					s.setTas((i + 1), (j + 1), "At", "siyah");
					sl.add(s);

					
				// siyah fil varsa kaydet ve objeyi listeye ekle	
				} else if (covArray[i][j].equals("fs")) {
					s.setTas((i + 1), (j + 1), "Fil", "siyah");
					sl.add(s);
				}

				else
					t = 0;

			}
			if (t == 0) {
				// System.out.println(" Eleman bulunamad�");
			}
		}

		ArrayList<Beyazlar> bl = new ArrayList<Beyazlar>();//beyaz ta�lar� tutmak i�in array list olu�turma
		int m = 1;
		for (int i = 0; i < ROWS; i++) {

			for (int j = 0; j < COLUMNS; j++) {

				Beyazlar b = new Beyazlar();//dosyada verilen beyaz ta�lar� objeye atama
				
				
				// beyaz �ah varsa kaydet ve objeyi listeye ekle
				if (covArray[i][j].equals("sb")) {
					b.setTas((i + 1), (j + 1), "Sah", "beyaz");
					bl.add(b);

					
				// beyaz piyon varsa kaydet ve objeyi listeye ekle
				} else if (covArray[i][j].equals("pb")) {
					b.setTas((i + 1), (j + 1), "Piyon", "beyaz");
					bl.add(b);

					
				// beyaz vezir varsa kaydet ve  objeyi listeye ekle
				} else if (covArray[i][j].equals("vb")) {
					b.setTas((i + 1), (j + 1), "Vezir", "beyaz");
					bl.add(b);

					
				// beyaz at varsa kaydet ve objeyi listeye ekle
				} else if (covArray[i][j].equals("ab")) {
					b.setTas((i + 1), (j + 1), "At", "beyaz");
					bl.add(b);
					
					
				// beyaz fil varsa kaydet ve objeyi listeye ekle
				} else if (covArray[i][j].equals("fb")) {
					b.setTas((i + 1), (j + 1), "Fil", "beyaz");
					bl.add(b);
					
					
				// beyaz kale varsa kaydet ve objeyi listeye ekle	
				} else if (covArray[i][j].equals("kb")) {
					b.setTas((i + 1), (j + 1), "Kale", "beyaz");
					bl.add(b);
				}

				else
					m = 0;

			}
			if (m == 0) {
				// System.out.println(" Eleman bulunamad�");
			}
		}

		double toplamsiyah=0,toplambeyaz = 0;
		
		board.TehditSiyah(sl, bl);//Tehdit kontrol 
		board.TehditBeyaz(sl, bl);//Tehdit kontrol 
		
		
		//siyah ta�lar�n puan toplam�:
		for (int s = 0; s < sl.size(); s++) {
			toplamsiyah = toplamsiyah + (sl.get(s).getPuan());
		}
		
        //beyaz ta�lar�n puan toplam�:
		for (int u = 0; u < bl.size(); u++) {
			toplambeyaz = toplambeyaz + (bl.get(u).getPuan());
		}
		System.out.print(dosya_adi+"          ");
		System.out.println("Siyah:" + toplamsiyah+" , "+"Beyaz:" + toplambeyaz);

	}
}
