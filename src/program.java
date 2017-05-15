
public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c = new Client();
		c.setName("Addissu");
		c.setEmail("addissu@gmail.com");
		
		Donor d = new Donor();
		d.setDonorName("Bobby");
		d.setDonorEmail("Bobby@gmail.com");
		
		Employee e = new Employee();
		
		e.setEmployeeName("Terry");
		e.setEmployeeID("99sds23");
		
		GeneralUser g = new GeneralUser();
		
		g.setRegister("default");
		
		Donations don = new Donations();
		don.setDonationAmount("100.00");
		
		System.out.println(c.getName());
		System.out.println(c.getEmail());
		
		System.out.println(d.getDonorName());
		System.out.println(d.getDonorEmail());
		
		System.out.println(e.getEmployeeName());
		System.out.println(e.getEmployeeID());
		
		System.out.println(g.getRegister());
		
		System.out.println(don.getDonationAmount());
		
		

	}

}
