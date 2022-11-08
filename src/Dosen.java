// import javax.sound.sampled.SourceDataLine;

public class Dosen extends Karyawan{//overiding

    private int nidn;
	private int lebih_sks;
	private String jurusan;

	public void setLebih_sks(int lebih_sks) {
		this.lebih_sks = lebih_sks;
	}
	public int getLebih_sks() {
		return this.lebih_sks;
	}

	public void dosen( int hasil, int lebih_sks){//overloading
		int bonus;
		bonus = (lebih_sks*100000);
		hasil+= bonus;
		System.out.println("total bonus	:"+bonus);
		System.out.println("total gaji	: "+hasil);
	}
	public void dosen(){
		//inheritance
		System.out.println("nip		: "+ super.nip);
		System.out.println("nama		: "+ super.nama);
		System.out.println("alamat		: "+super.alamat);
		System.out.println("ttl		: "+super.ttl);
		System.out.println("tahun masuk	: "+super.tahun);
	}
	
	public int getNidn() {
		return this.nidn;
	}

	public void setNidn(int nidn) {
		this.nidn = nidn;
	}
	public String getJurusan() {
		return this.jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

}

	
