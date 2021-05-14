package interfaceDEMO;

public class CustomerManager {
	
	private ICustomerDal customerDal; //CustomerManager �n customerDal � var ve onu Add ini �a��r�caz
          
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	public void add() {
        	  //i� kodlar� yaz�l�r.
        	  //OracleCustomerDal oracleCustomerDal=new OracleCustomerDal();
        	  //yazarsak sistem sadece oracle de �al���r anlam�na gelir. sisteme ba��ml� olur
        	  customerDal.Add();
          }
}
