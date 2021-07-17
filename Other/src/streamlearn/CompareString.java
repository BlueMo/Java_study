package streamlearn;

import java.util.function.BinaryOperator;

public class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String t, String u) {
		if (t.getBytes().length >= u.getBytes().length) return t;
		else return u;
	}

}
