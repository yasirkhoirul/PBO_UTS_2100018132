public class Tendik extends Karyawan{
    protected int lembur;

    public void tendik( int hasil, int lembur){//overloading
        int bonus;
        bonus = lembur*50000;
		hasil+= bonus;
        System.out.println("total bonus	: "+bonus);
		System.out.println("total gaji	: "+hasil);
	}
    public void tendik(){
      
            System.out.println("nip		: "+ super.nip);
            System.out.println("nama		: "+ super.nama);
            System.out.println("alamat		: "+super.alamat);
            System.out.println("ttl		: "+super.ttl);
            System.out.println("tahun masuk	: "+super.tahun);
    
    }


    public int getLembur() {
        return this.lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

  

}
