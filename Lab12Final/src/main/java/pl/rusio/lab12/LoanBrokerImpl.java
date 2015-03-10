package pl.rusio.lab12;

import javax.jws.WebService;

@WebService(endpointInterface = "pl.rusio.lab12.LoanBroker")
public class LoanBrokerImpl implements LoanBroker {

	@Override
	public LoanApplicationStatus getLoanApplicationStatus(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sendLoanApplication(LoanApplication arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
