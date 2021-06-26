package oyun;

import java.io.*;
import java.util.*;


abstract public class Oyun {
	static final int ROWS = 8;
	static final int COLUMNS = 8;

	public static int bul(String[][] arr2, String s) {//2D arrayde kelimene tekararý bulunma
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
		System.out.print("Dosya Girin(.txt): ");//Kullanýcýdan aktarýlacak dosyanýn istenmesi
		String dosya_adi = keyboard.nextLine();
		
		Scanner scc = new Scanner(new File(dosya_adi));//dosyanýn açýlmasý
		
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
		
		ArrayList<Siyahlar> sl = new ArrayList<Siyahlar>();//siyah taþlarý tutmak için array list oluþturma

		int t = 1;

		for (int i = 0; i < ROWS; i++) {

			for (int j = 0; j < COLUMNS; j++) {
				Siyahlar s = new Siyahlar();//dosyada verilen siyah taþlarý objeye atama

				
				// siyah þah varsa kaydet ve objeyi listeye ekle
				if (covArray[i][j].equals("ss")) {// siyah þah
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
				// System.out.println(" Eleman bulunamadý");
			}
		}

		ArrayList<Beyazlar> bl = new ArrayList<Beyazlar>();//beyaz taþlarý tutmak için array list oluþturma
		int m = 1;
		for (int i = 0; i < ROWS; i++) {

			for (int j = 0; j < COLUMNS; j++) {

				Beyazlar b = new Beyazlar();//dosyada verilen beyaz taþlarý objeye atama
				
				
				// beyaz þah varsa kaydet ve objeyi listeye ekle
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
				// System.out.println(" Eleman bulunamadý");
			}
		}

		double toplamsiyah=0,toplambeyaz = 0;
		
		board.TehditSiyah(sl, bl);//Tehdit kontrol 
		board.TehditBeyaz(sl, bl);//Tehdit kontrol 
		
		
		//siyah taþlarýn puan toplamý:
		for (int s = 0; s < sl.size(); s++) {
			toplamsiyah = toplamsiyah + (sl.get(s).getPuan());
		}
		
        //beyaz taþlarýn puan toplamý:
		for (int u = 0; u < bl.size(); u++) {
			toplambeyaz = toplambeyaz + (bl.get(u).getPuan());
		}
		System.out.print(dosya_adi+"          ");
		System.out.println("Siyah:" + toplamsiyah+" , "+"Beyaz:" + toplambeyaz);

	}
}
