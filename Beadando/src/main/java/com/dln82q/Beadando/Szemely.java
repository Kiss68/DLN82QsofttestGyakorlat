package com.dln82q.Beadando;

public class Szemely {

	private String nev; // A személy neve
	private int kor; // A személy életkora
	private boolean alkohol; // A személy alkoholt vesz-e

	public String getNev() { // Visszaadja a személy nevét
		return nev;
	}

	public void setNev(String nev) { // Beállítja a személy nevét
		this.nev = nev;
	}

	public int getKor() { // Visszaadja a személy életkorát
		return kor;
	}

	public void setKor(int kor) { // Beállítja a személy életkorát
		this.kor = kor;
	}

	public boolean isAlkohol() {
		return alkohol;
	}

	public void setAlkohol(boolean alkohol) {
		this.alkohol = alkohol;
	}

	@Override
	public String toString() {
		return "Szemely [nev=" + nev + ", kor=" + kor + ", alkohol=" + alkohol + "]";
	}

	public boolean ihat() { // Eldönti, hogy a személy fogyaszthat-e már alkoholt
		if (getKor() > 18) {
			return true;
		}
		System.out.println("A személy nem szeretne alkoholt inni");
		return false;
	}

	public boolean validKor() {
		if (getKor() > 0) {
			return true;
		} else
			return false;
	}

}
