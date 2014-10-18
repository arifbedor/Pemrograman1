class DotA { //Kelasnya Hero

	String Hero; //mendeklarasikan data yang bertipe data string
	String Tipe; 
	String Level; 
	String Role; 
	
	public String getHero(){ //menginisialisasi nilai Hero
		return Hero; //mengembalikan nilai Hero
	}
	public void setHero(String x){ //mendeklarasi set untuk atribut Hero
		this.Hero=x; 
	}
	
	public String getTipe(){ //menginisialisasi nilai Tipe
		return Tipe; //mengembalikan nilai Tipe
	}
	public void setTipe(String y){ //mendeklarasi set untuk atribut Tipe
		this.Tipe=y;
	}
	
	public String getLevel(){ //menginisialisasi nilai Level
		return Level; //mengembalikan nilai Level
	}
	public void setLevel(String a){ //mendeklarasi set untuk atribut Level
		this.Level=a;
	}
	
	public String getRole(){ //menginisialisasi nilai Role
		return Role; //mengembalikan nilai Role
	}
	public void setRole(String b){ //mendeklarasi set untuk atribut Role
		this.Role=b;
	}
	
	public static void main(String [] args){
		DotA Ancient = new DotA();
		Ancient.setHero("Queen Of Pain");
		System.out.print("Hero DotA : ");
		System.out.print(Ancient.getHero()); //memanggil setter Hero dengan getter
		
		Ancient.setTipe("Intelligent"); 
		System.out.print("\nTipenya adalah : "); 
		System.out.print(Ancient.getTipe()); //memanggil setter Tipe dengan getter
		
		Ancient.setLevel("25"); 
		System.out.print("\nLevelnya adalah : "); 
		System.out.print(Ancient.getLevel()); //memanggil setter Level dengan getter
		
		Ancient.setRole("Midlaner/Offlaner/Carry"); 
		System.out.print("\nRolenya adalah : "); 
		System.out.print(Ancient.getRole()); //memanggil setter Role dengan getter
	}
}