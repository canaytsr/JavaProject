package oyun;

import java.util.*;

public class Tahta extends Oyun{

	private String board[][];
	int satir = 0;
	int sutun = 0;
	double puan;

	public Tahta() {

	}

	// 2D array dosya verileri kaydedilmesi
	public void setBoard(String[][] b) {

		int length = b.length;

		board = new String[length][b[0].length];

		for (int i = 0; i < length; i++) {
			System.arraycopy(b[i], 0, board[i], 0, b[i].length);
		}

	}

	public String[][] getBoard() {

		return board;
	}

	// liste içindeki siyah objeleri cekip cakýþtýðý beyaz objelerden puan düþmesi
	public void TehditSiyah(ArrayList<Siyahlar> l1, ArrayList<Beyazlar> l2) {// siyah

		for (int i = 0; i < l1.size(); i++) {
			satir = (l1.get(i).getSatir()) - 1;
			sutun = (l1.get(i).getSutun()) - 1;

			if (l1.get(i).getTip() == "At") // eðer obje at ise cevredeki kareleri tarama
			{
				// L indexteki nesneleri tarama

				if (satir + 2 < 8 && sutun + 1 < 8) {
					if (board[satir + 2][sutun + 1].equals("pb") || board[satir + 2][sutun + 1].equals("kb")
							|| board[satir + 2][sutun + 1].equals("sb") || board[satir + 2][sutun + 1].equals("vb")
							|| board[satir + 2][sutun + 1].equals("ab") || board[satir + 2][sutun + 1].equals("fb")) {

						for (int j = 0; j < l2.size(); j++) {
							if (l2.get(j).getSatir() == (satir + 3) && l2.get(j).getSutun() == (sutun + 2)) {
								l2.get(j).setPuan(l2.get(j).getPuan() / 2);
								puan = l2.get(j).getPuan();

							}
						}
					}
				}

				////////////////////////////////////////////////////////////////////////
				if (satir + 2 < 8 && sutun - 1 > 0) {
					if (board[satir + 2][sutun - 1].equals("pb") || board[satir + 2][sutun - 1].equals("kb")
							|| board[satir + 2][sutun - 1].equals("sb") || board[satir + 2][sutun - 1].equals("vb")
							|| board[satir + 2][sutun - 1].equals("ab") || board[satir + 2][sutun - 1].equals("fb")) {

						for (int j = 0; j < l2.size(); j++) {
							if (l2.get(j).getSatir() == (satir + 3) && l2.get(j).getSutun() == (sutun)) {
								l2.get(j).setPuan(l2.get(j).getPuan() / 2);
								puan = l2.get(j).getPuan();
							}
						}
					}
				}
				////////////////////////////////////////////////////////////////////////////////
				if (satir - 2 > 0 && sutun + 1 < 8) {
					if (board[satir - 2][sutun + 1].equals("pb") || board[satir - 2][sutun + 1].equals("kb")
							|| board[satir - 2][sutun + 1].equals("sb") || board[satir - 2][sutun + 1].equals("vb")
							|| board[satir - 2][sutun + 1].equals("ab") || board[satir - 2][sutun + 1].equals("fb")) {

						for (int j = 0; j < l2.size(); j++) {
							if (l2.get(j).getSatir() == (satir - 1) && l2.get(j).getSutun() == (sutun + 2)) {
								l2.get(j).setPuan(l2.get(j).getPuan() / 2);
								puan = l2.get(j).getPuan();
							}
						}
					}
				}
				//////////////////////////////////////////////////////////////////////////
				if (satir + 1 < 8 && sutun - 2 > 0) {
					if (board[satir + 1][sutun - 2].equals("pb") || board[satir + 1][sutun - 2].equals("kb")
							|| board[satir + 1][sutun - 2].equals("sb") || board[satir + 1][sutun - 2].equals("vb")
							|| board[satir + 1][sutun - 2].equals("ab") || board[satir + 1][sutun - 2].equals("fb")) {

						for (int j = 0; j < l2.size(); j++) {

							if (l2.get(j).getSatir() == (satir + 2) && l2.get(j).getSutun() == (sutun - 1)) {

								l2.get(j).setPuan(l2.get(j).getPuan() / 2);
								puan = l2.get(j).getPuan();

							}
						}
					}
				}
				///////////////////////////////////////////////////////////////////////////
				if (satir - 1 > 0 && sutun + 2 < 8) {
					if (board[satir - 1][sutun + 2].equals("pb") || board[satir - 1][sutun + 2].equals("kb")
							|| board[satir - 1][sutun + 2].equals("sb") || board[satir - 1][sutun + 2].equals("vb")
							|| board[satir - 1][sutun + 2].equals("ab") || board[satir - 1][sutun + 2].equals("fb")) {

						for (int j = 0; j < l2.size(); j++) {
							if (l2.get(j).getSatir() == (satir) && l2.get(j).getSutun() == (sutun + 3)) {
								l2.get(j).setPuan(l2.get(j).getPuan() / 2);
								puan = l2.get(j).getPuan();
							}
						}
					}
				}
				//////////////////////////////////////////////////////////////////////////////////////////
				if (satir - 1 > 0 && sutun - 2 > 0) {
					if (board[satir - 1][sutun - 2].equals("pb") || board[satir - 1][sutun - 2].equals("kb")
							|| board[satir - 1][sutun - 2].equals("sb") || board[satir - 1][sutun - 2].equals("vb")
							|| board[satir - 1][sutun - 2].equals("ab") || board[satir - 1][sutun - 2].equals("fb")) {

						for (int j = 0; j < l2.size(); j++) {
							if (l2.get(j).getSatir() == (satir) && l2.get(j).getSutun() == (sutun - 1)) {
								l2.get(j).setPuan(l2.get(j).getPuan() / 2);
								puan = l2.get(j).getPuan();
							}
						}
					}
				}
				///////////////////////////////////////////////////////////////////////////////////////////
				if (satir + 1 < 8 && sutun + 2 < 8) {
					if (board[satir + 1][sutun + 2].equals("pb") || board[satir + 1][sutun + 2].equals("kb")
							|| board[satir + 1][sutun + 2].equals("sb") || board[satir + 1][sutun + 2].equals("vb")
							|| board[satir + 1][sutun + 2].equals("ab") || board[satir + 1][sutun + 2].equals("fb")) {

						for (int j = 0; j < l2.size(); j++) {
							if (l2.get(j).getSatir() == (satir + 2) && l2.get(j).getSutun() == (sutun + 3)) {
								l2.get(j).setPuan(l2.get(j).getPuan() / 2);
								puan = l2.get(j).getPuan();
							}
						}
					}
				}
				/////////////////////////////////////////////////////////////////////////////////////////
				if (satir - 2 > 0 && sutun - 1 > 0) {
					if (board[satir - 2][sutun - 1].equals("pb") || board[satir - 2][sutun - 1].equals("kb")
							|| board[satir - 2][sutun - 1].equals("sb") || board[satir - 2][sutun - 1].equals("vb")
							|| board[satir - 2][sutun - 1].equals("ab") || board[satir - 2][sutun - 1].equals("fb")) {

						for (int j = 0; j < l2.size(); j++) {
							if (l2.get(j).getSatir() == (satir - 1) && l2.get(j).getSutun() == (sutun)) {
								l2.get(j).setPuan(l2.get(j).getPuan() / 2);
								puan = l2.get(j).getPuan();

							}
						}
					}
				}
				/////////////////////////////////////////////////////////////////////////////////////////////
				if (satir - 2 > 0 && sutun + 1 < 8) {
					if (board[satir - 2][sutun + 1].equals("pb") || board[satir - 2][sutun + 1].equals("kb")
							|| board[satir - 2][sutun + 1].equals("sb") || board[satir - 2][sutun + 1].equals("vb")
							|| board[satir - 2][sutun + 1].equals("ab") || board[satir - 2][sutun + 1].equals("fb")) {

						for (int j = 0; j < l2.size(); j++) {
							if (l2.get(j).getSatir() == (satir - 1) && l2.get(j).getSutun() == (sutun + 2)) {
								l2.get(j).setPuan(l2.get(j).getPuan() / 2);
								puan = l2.get(j).getPuan();

							}
						}
					}
				}
			}

			////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////

			else if (l1.get(i).getTip() == "Fil") {// eðer obje fil ise cevredeki kareleri tarama
				int a = 0;
				int ysa = satir + 1;
				int ysu = sutun + 1;

				// caprazdaki indexleri tarama
				while (a < 8)

				{
					a = a + 1;

					if (satir + a < 8 && sutun - a >= 0) {
						if (board[satir + a][sutun - a].equals("ps") || board[satir + a][sutun - a].equals("ks")
								|| board[satir + a][sutun - a].equals("as") || board[satir + a][sutun - a].equals("fs")
								|| board[satir + a][sutun - a].equals("vs")
								|| board[satir + a][sutun - a].equals("ss")) {

							for (int j = 0; j < l2.size(); j++) {
								if (l2.get(j).getSatir() == (ysa + a) && l2.get(j).getSutun() == (ysu - a)) {
									l2.get(j).setPuan(l2.get(j).getPuan() / 2);
									puan = l2.get(j).getPuan();
								}
							}
						}
					} else if (satir - a >= 0 && sutun + a < 8) {
						if (board[satir - a][sutun + a].equals("ps") || board[satir - a][sutun + a].equals("ks")
								|| board[satir - a][sutun + a].equals("as") || board[satir - a][sutun + a].equals("fs")
								|| board[satir - a][sutun + a].equals("vs")
								|| board[satir - a][sutun + a].equals("ss")) {
							for (int j = 0; j < l2.size(); j++) {
								if (l2.get(j).getSatir() == (ysa - a) && l2.get(j).getSutun() == (ysu + a)) {
									l2.get(j).setPuan(l2.get(j).getPuan() / 2);
									puan = l2.get(j).getPuan();
								}
							}
						}
					} else if (satir - a >= 0 && sutun - a >= 0) {
						if (board[satir - a][sutun - a].equals("ps") || board[satir - a][sutun - a].equals("ks")
								|| board[satir - a][sutun - a].equals("as") || board[satir - a][sutun - a].equals("fs")
								|| board[satir - a][sutun - a].equals("vs")
								|| board[satir - a][sutun - a].equals("ss")) {
							for (int j = 0; j < l2.size(); j++) {
								if (l2.get(j).getSatir() == (ysa - a) && l2.get(j).getSutun() == (ysu - a)) {
									l2.get(j).setPuan(l2.get(j).getPuan() / 2);
									puan = l2.get(j).getPuan();
								}
							}

						}
					} else if (satir + a < 8 && sutun + a < 8) {
						if (board[satir + a][sutun + a].equals("ps") || board[satir + a][sutun + a].equals("ks")
								|| board[satir + a][sutun + a].equals("as") || board[satir + a][sutun + a].equals("fs")
								|| board[satir + a][sutun + a].equals("vs")
								|| board[satir + a][sutun + a].equals("ss")) {
						}
						for (int j = 0; j < l2.size(); j++) {
							if (l2.get(j).getSatir() == (ysa + a) && l2.get(j).getSutun() == (ysu + a)) {
								l2.get(j).setPuan(l2.get(j).getPuan() / 2);
								puan = l2.get(j).getPuan();
							}
						}

					}

				}
			}

		}

	}

	// liste içindeki beyaz objeleri cekip cakýþtýðý beyaz objelerden puan düþmesi
	public void TehditBeyaz(ArrayList<Siyahlar> ll1, ArrayList<Beyazlar> ll2) {

		for (int i = 0; i < ll2.size(); i++) {
			satir = (ll2.get(i).getSatir()) - 1;
			sutun = (ll2.get(i).getSutun()) - 1;

			if (ll2.get(i).getTip() == "At") { // beyaz atýn L alanýnýn taranmasý

				if (satir - 2 > 0 && sutun - 1 > 0) {
					if (board[satir - 2][sutun - 1].equals("ps") || board[satir - 2][sutun - 1].equals("ks")
							|| board[satir - 2][sutun - 1].equals("ss") || board[satir - 2][sutun - 1].equals("vs")
							|| board[satir - 2][sutun - 1].equals("as") || board[satir - 2][sutun - 1].equals("fs"))

						for (int j = 0; j < ll1.size(); j++) {
							if (ll1.get(j).getSatir() == (satir - 1) && ll1.get(j).getSutun() == (sutun)) {
								ll1.get(j).setPuan(ll1.get(j).getPuan() / 2);
								puan = ll1.get(j).getPuan();

							}
						}
				}

				/////////////////////////////////////////////////////////////////////////////////////////////
				if (satir - 2 > 0 && sutun + 1 < 8) {
					if (board[satir - 2][sutun + 1].equals("ps") || board[satir - 2][sutun + 1].equals("ks")
							|| board[satir - 2][sutun + 1].equals("ss") || board[satir - 2][sutun + 1].equals("vs")
							|| board[satir - 2][sutun + 1].equals("as") || board[satir - 2][sutun + 1].equals("fs")) {

						for (int j = 0; j < ll1.size(); j++) {
							if (ll1.get(j).getSatir() == (satir - 1) && ll1.get(j).getSutun() == (sutun + 2)) {
								ll1.get(j).setPuan(ll1.get(j).getPuan() / 2);
								puan = ll1.get(j).getPuan();

							}
						}
					}
				}
				/////////////////////////////////////////////////////////////////////////////////////////////////
				if (satir + 2 < 8 && sutun + 1 < 8) {

					if (board[satir + 2][sutun + 1].equals("ps") || board[satir + 2][sutun + 1].equals("ks")
							|| board[satir + 2][sutun + 1].equals("ss") || board[satir + 2][sutun + 1].equals("vs")
							|| board[satir + 2][sutun + 1].equals("as") || board[satir + 2][sutun + 1].equals("fs")) {

						for (int j = 0; j < ll1.size(); j++) {
							if (ll1.get(j).getSatir() == (satir + 3) && ll1.get(j).getSutun() == (sutun + 2)) {
								ll1.get(j).setPuan(ll1.get(j).getPuan() / 2);
								puan = ll1.get(j).getPuan();

							}
						}
					}
				}

				/////////////////////////////////////////////////////////////////////////////////////////////////

				if (satir + 2 < 8 && sutun - 1 > 0) {
					if (board[satir + 2][sutun - 1].equals("ps") || board[satir + 2][sutun - 1].equals("ks")
							|| board[satir + 2][sutun - 1].equals("ss") || board[satir + 2][sutun - 1].equals("vs")
							|| board[satir + 2][sutun - 1].equals("as") || board[satir + 2][sutun - 1].equals("fs")) {

						for (int j = 0; j < ll1.size(); j++) {
							if (ll1.get(j).getSatir() == (satir + 3) && ll1.get(j).getSutun() == (sutun)) {
								ll1.get(j).setPuan(ll1.get(j).getPuan() / 2);
								puan = ll1.get(j).getPuan();
							}
						}
					}
				}
				//////////////////////////////////////////////////////////////////////////////////////////
				if (satir + 1 < 8 && sutun + 2 < 8) {
					if (board[satir + 1][sutun + 2].equals("ps") || board[satir + 1][sutun + 2].equals("ks")
							|| board[satir + 1][sutun + 2].equals("ss") || board[satir + 1][sutun + 2].equals("vs")
							|| board[satir + 1][sutun + 2].equals("as") || board[satir + 1][sutun + 2].equals("fs")) {

						for (int j = 0; j < ll1.size(); j++) {
							if (ll1.get(j).getSatir() == (satir + 2) && ll1.get(j).getSutun() == (sutun + 3)) {
								ll1.get(j).setPuan(ll1.get(j).getPuan() / 2);
								puan = ll1.get(j).getPuan();
							}
						}
					}
				}
				/////////////////////////////////////////////////////////////////////////////////////////////////
				if (satir + 1 < 8 && sutun - 2 > 0) {
					if (board[satir + 1][sutun - 2].equals("ps") || board[satir + 1][sutun - 2].equals("ks")
							|| board[satir + 1][sutun - 2].equals("ss") || board[satir + 1][sutun - 2].equals("vs")
							|| board[satir + 1][sutun - 2].equals("as") || board[satir + 1][sutun - 2].equals("fs")) {

						for (int j = 0; j < ll1.size(); j++) {

							if (ll1.get(j).getSatir() == (satir + 2) && ll1.get(j).getSutun() == (sutun - 1)) {
								ll1.get(j).setPuan(ll1.get(j).getPuan() / 2);
								puan = ll1.get(j).getPuan();
							}
						}
					}
				}
				///////////////////////////////////////////////////////////////////////////////////////////////////////
				if (satir - 1 > 0 && sutun + 2 < 8) {
					if (board[satir - 1][sutun + 2].equals("ps") || board[satir - 1][sutun + 2].equals("ks")
							|| board[satir - 1][sutun + 2].equals("ss") || board[satir - 1][sutun + 2].equals("vs")
							|| board[satir - 1][sutun + 2].equals("as") || board[satir - 1][sutun + 2].equals("fs")) {

						for (int j = 0; j < ll1.size(); j++) {
							if (ll1.get(j).getSatir() == (satir) && ll1.get(j).getSutun() == (sutun + 3)) {
								ll1.get(j).setPuan(ll1.get(j).getPuan() / 2);
								puan = ll1.get(j).getPuan();
							}
						}
					}
				}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if (satir - 1 > 0 && sutun - 2 > 0) {
					if (board[satir - 1][sutun - 2].equals("ps") || board[satir - 1][sutun - 2].equals("ks")
							|| board[satir - 1][sutun - 2].equals("ss") || board[satir - 1][sutun - 2].equals("vs")
							|| board[satir - 1][sutun - 2].equals("as") || board[satir - 1][sutun - 2].equals("fs")) {

						for (int j = 0; j < ll1.size(); j++) {
							if (ll1.get(j).getSatir() == (satir) && ll1.get(j).getSutun() == (sutun - 1)) {
								ll1.get(j).setPuan(ll1.get(j).getPuan() / 2);
								puan = ll1.get(j).getPuan();
							}
						}
					}

				}
			}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			///////////////////////////////////////////////////////////////////////////////////////////////////////

			else if (ll2.get(i).getTip() == "Fil") // eðer obje beyaz fil ise cevredeki kareleri tarama
			{
				int b = 0;
				int yenisatir = satir + 1;
				int yenisutun = sutun + 1;

				// caprazdaki siyah taþlarýn aranmasý
				while (b < 8) {
					b = b + 1;

					if (satir + b < 8 && sutun - b > 0) {
						if (board[satir + b][sutun - b].equals("ps") || board[satir + b][sutun - b].equals("ks")
								|| board[satir + b][sutun - b].equals("as") || board[satir + b][sutun - b].equals("fs")
								|| board[satir + b][sutun - b].equals("vs")
								|| board[satir + b][sutun - b].equals("ss")) {

							for (int j = 0; j < ll1.size(); j++) {
								if (ll1.get(j).getSatir() == (yenisatir + b)
										&& ll1.get(j).getSutun() == (yenisutun - b)) {
									ll1.get(j).setPuan(ll1.get(j).getPuan() / 2);
									puan = ll1.get(j).getPuan();

								}
							}

						}
					}

					if (satir - b > 0 && sutun + b < 8) {

						if (board[satir - b][sutun + b].equals("ps") || board[satir - b][sutun + b].equals("ks")
								|| board[satir - b][sutun + b].equals("as") || board[satir - b][sutun + b].equals("fs")
								|| board[satir - b][sutun + b].equals("vs")
								|| board[satir - b][sutun + b].equals("ss")) {

							for (int j = 0; j < ll1.size(); j++) {
								if (ll1.get(j).getSatir() == (yenisatir - b)
										&& ll1.get(j).getSutun() == (yenisutun + b)) {
									ll1.get(j).setPuan(ll1.get(j).getPuan() / 2);
									puan = ll1.get(j).getPuan();
								}
							}

						}
					}

					if (satir - b >= 0 && sutun - b > 0) {
						if (board[satir - b][sutun - b].equals("ps") || board[satir - b][sutun - b].equals("ks")
								|| board[satir - b][sutun - b].equals("as") || board[satir - b][sutun - b].equals("fs")
								|| board[satir - b][sutun - b].equals("vs")
								|| board[satir - b][sutun - b].equals("ss")) {

							for (int j = 0; j < ll1.size(); j++) {
								if (ll1.get(j).getSatir() == (yenisatir - b)
										&& ll1.get(j).getSutun() == (yenisutun - b)) {
									ll1.get(j).setPuan(ll1.get(j).getPuan() / 2);
									puan = ll1.get(j).getPuan();

								}
							}

						}
					}
					if (satir + b < 8 && sutun + b < 8) {
						if (board[satir + b][sutun + b].equals("ps") || board[satir + b][sutun + b].equals("ks")
								|| board[satir + b][sutun + b].equals("ss") || board[satir + b][sutun + b].equals("vs")
								|| board[satir + b][sutun + b].equals("as")
								|| board[satir + b][sutun + b].equals("fs")) {

							for (int j = 0; j < ll1.size(); j++) {
								if (ll1.get(j).getSatir() == (yenisatir + b)
										&& ll1.get(j).getSutun() == (yenisutun + b)) {
									ll1.get(j).setPuan(ll1.get(j).getPuan() / 2);
									puan = ll1.get(j).getPuan();
								}
							}

						}
					}

				}
			}
		}
	}
}
