package ga.manuelgarciacr.pla6evaluationactivity.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DniValidationRules implements ConstraintValidator<DniValidation, String> {
	private boolean canBeBlank;
	
	@Override
	public void initialize(DniValidation constraint) {
		canBeBlank = constraint.canBeBlank();
	}

	@Override
	public boolean isValid(String dni, ConstraintValidatorContext cxt) {
		boolean valido = false;
		char[] letraDni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		if(canBeBlank && dni.equals(""))
			return true;

		Pattern pat = Pattern.compile("[0-9X-Zx-z][0-9]{0,7}[A-Za-z]");
		Matcher mat = pat.matcher(dni);
		if (mat.matches()) {
			String number = dni.substring(0, dni.length() - 1).toUpperCase();
			if(Character.isLetter(number.charAt(0))) {
				number.replace("X", "0");
				number.replace("Y", "1");
				number.replace("Z", "2");
			}
			char letra = Character.toUpperCase(dni.charAt(dni.length() - 1));
			int numdni = Integer.parseInt(number);
			valido = letra == letraDni[numdni % 23];
		}
		return valido;
	}

}
