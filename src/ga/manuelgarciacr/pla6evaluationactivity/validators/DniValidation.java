package ga.manuelgarciacr.pla6evaluationactivity.validators;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = DniValidationRules.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DniValidation {
	String message() default "DNI no válido";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
	boolean canBeBlank();
}
