/*
 * generated by Xtext 2.20.0
 */
package org.mde.spec.validation

import org.eclipse.xtext.validation.Check
import org.mde.spec.spec.Variable
import org.mde.spec.spec.SpecPackage
import org.mde.spec.spec.OpenCommand
import org.mde.spec.spec.Command
import org.mde.spec.spec.SelectCommand
import org.mde.spec.spec.Model

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SpecValidator extends AbstractSpecValidator {
	
	public static val INVALID_NAME = "Invalid variable name"

	@Check(FAST)
	def void checkVariableStartsWithDollar(Command c) {
		switch c {
			case OpenCommand: if (!c.toString.contains("$")) warning("A variable must be used with a '$' preceding it", SpecPackage.Literals.VARIABLE__NAME)
			case SelectCommand: if (!c.toString.contains("$")) warning("A variable must be used with a '$' preceding it", SpecPackage.Literals.VARIABLE__NAME)
		}
	}
	
	@Check(FAST)
	def void checkNameStartsWithLowerCase(Variable v) {
		if (Character::isUpperCase(v.getName().charAt(0))) {
			warning("A variable name should be in camelCase", SpecPackage.Literals.VARIABLE__NAME, INVALID_NAME);
		}
	}
	
	
	@Check(FAST)
	def void checkUrlIsWellDefined(){
		
	}
}
