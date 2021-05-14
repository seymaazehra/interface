package interfaceDEMO;

public class CustomerManager {
	
	private ICustomerDal customerDal; //CustomerManager ýn customerDal ý var ve onu Add ini çaðýrýcaz
          
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	public void add() {
        	  //iþ kodlarý yazýlýr.
        	  //OracleCustomerDal oracleCustomerDal=new OracleCustomerDal();
        	  //yazarsak sistem sadece oracle de çalýþýr anlamýna gelir. sisteme baðýmlý olur
        	  customerDal.Add();
          }
}
