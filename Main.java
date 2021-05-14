package interfaceDEMO;

public class Main {

	public static void main(String[] args) {
	    
     CustomerManager customerManager=new CustomerManager(new MysqlCustomerDal());
     //customerManager.customerDal=new OracleCustomerDal();
     customerManager.add();
	}

}
