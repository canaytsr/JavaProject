package satranc;

public class Beyazlar extends Satranc{
	
	private int satir;
	private int sutun;
	private String  tip;
	private double puan;
	private String  renk= "beyaz";

	   
	public Beyazlar(String tip, int satir,int sutun) {
		
		this.tip = tip;
		this.satir = satir;
		this.sutun = sutun;
	}
	public Beyazlar() {
		
	}
	
	public void setTas(int satir,int sutun,String tip,String renk) {//yeni beyaz ta� kaydedilmesi
		
		this.renk=renk;
		this.satir= satir;
		this.sutun=sutun;
		
		if(tip == "Piyon") {
		this.tip="Piyon";	
		this.puan=1;
		}
		
		else if(tip == "Sah") {	
		this.tip="Sah";
		this.puan=100;	
		}
		
		else if(tip == "Vezir") {
		this.tip="Vezir";
		this.puan=9;
		}
		
		else if(tip == "Kale") {
		this.tip="Kale";
		this.puan=5;
		}
		
		else if(tip == "At") {
		this.tip="At";
		this.puan=3;
        }
		else if(tip == "Fil") {
		this.tip="Fil";
		this.puan=3;	
		}
		else {
			
		}
		
	}
	public void setRenk(String renk) {//renk kay�t
		this.renk=renk;
	}
	
	public String getRenk() {
	return renk;
	}
	public void setTip(String tip) {//ta� tipi kay�t
		this.tip=tip;
	}
	
	public String getTip() {
	return tip;
	}
	
	public void setSatir(int satir) {//ta��n bulundu�u sat�r kay�t
	this.satir = satir;
	}
	
	public int getSatir() {
	return satir;
	}
		
    public void setSutun(int sutun) {//ta��n bulundu�u sutun kay�t
	this.sutun = sutun;
    }
    
    public int getSutun() {
    	return sutun;
   }
    public void setPuan(double d) {//ta� puan� kay�t
    	this.puan = d;
   }
        
    public double getPuan() {
        	return puan;
    }

	public String display() {//objenin detaylar�n�n g�nderilmesi
		return "renk="+ "beyaz"+ " tip=" + getTip() +" satir="+getSatir()+" sutun="+getSutun() ;
	}
	
	

}
	    
