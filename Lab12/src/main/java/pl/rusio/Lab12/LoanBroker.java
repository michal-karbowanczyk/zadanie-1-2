package pl.rusio.Lab12;

import javax.jws.WebService;

@WebService
public class LoanBroker {
	public int sendLoanApplication(LoanApplication loanApplication){
		return 0;
	
	}
	
	public LoanApplicationStatus getLoanApplicationStatus(int id){
		return new LoanApplicationStatus();
	}
}
