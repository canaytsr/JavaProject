package satranc; 

public class Siyahlar extends Satranc{
	
	private int satir;
	private int sutun;
	private String  tip;
	private double puan;
	private String  renk= "siyah";

	   
	public Siyahlar(String tip, int satir,int sutun) {
		
		this.tip = tip;
		this.satir = satir;
		this.sutun = sutun;
	}
	public Siyahlar() {
		
	}
	
	public void setTas(int satir,int sutun,String tip,String renk) {//yeni siyah taş kaydedilmesi
		
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
	public void setRenk(String renk) {//renk kayıt
		this.renk=renk;
	}
	
	public String getRenk() {
	return renk;
	}
	public void setTip(String tip) {//taş tipi kayıt
		this.tip=tip;
	}
	
	public String getTip() {
	return tip;
	}
	
	public void setSatir(int satir) {//taşın bulunduğu satır kayıt
	this.satir = satir;
	}
	
	public int getSatir() {
	return satir;
	}
		
    public void setSutun(int sutun) {//taşın bulunduğu sutun kayıt
	this.sutun = sutun;
    }
    
    public int getSutun() {
    	return sutun;
   }
    public void setPuan(double puan) {//taş puanı kayıt
    	this.puan = puan;
   }
        
    public double getPuan() {
        	return puan;
    }

	public String display() {//objenin detaylarının gönderilmesi
		return "renk="+ "siyah"+ " tip=" + getTip() +" satir="+getSatir()+" sutun="+getSutun() ;
	}
	
}
	    
