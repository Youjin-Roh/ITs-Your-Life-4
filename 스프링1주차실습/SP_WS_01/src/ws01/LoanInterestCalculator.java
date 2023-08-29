package ws01;

import org.springframework.stereotype.Component;

@Component("loanCalcator")
public class LoanInterestCalculator implements InterestCalculator{

	private static final double RATE = 0.0525;
	
	@Override
	public double calculate(int amount) {
		System.out.println("LoanInterestCalculator - calculate()");
		return amount * RATE;
	}

}
