/*
 * generated by Xtext 2.20.0
 */
package org.mde.spec.validation

import org.eclipse.xtext.validation.Check
import org.mde.spec.spec.SpecPackage
import org.mde.spec.spec.VarDeclaration
import org.mde.spec.spec.Model
import org.mde.spec.spec.UsingCommand
import org.mde.spec.spec.OpenCommand
import org.mde.spec.spec.SelectCommand
import org.mde.spec.spec.TypeCommand
import org.mde.spec.spec.PropertyCommand

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SpecValidator extends AbstractSpecValidator {
	
	public static val NAME_CAMELCASE = "Invalid variable name"
	public static val INVALID_URL = "Invalid URL definition"
	public static val TOO_MANY_USING_COMMANDS = "Invalid number of Using commands"
	public static val INVALID_OPEN = "Invalid URL definition"
	public static val FIRST_COMMAND_NOT_USING = "First command is not a using command"
	public static val NO_ELEMENT_SELECTED = "An element must be selected before performing this action"
	
	@Check(FAST)
	def void checkNameStartsWithLowerCase(VarDeclaration v) {
		if (Character::isUpperCase(v.getName().charAt(0))) {
			info("A variable name should be in camelCase.", SpecPackage.Literals.VAR_DECLARATION.EStructuralFeatures.head, NAME_CAMELCASE);
		}
	}
	
	@Check(FAST)
	def void checkUrlIsWellDefined(VarDeclaration vd) {
		if (vd.name.contains("url") && !vd.value.contains("https://")) {
			error("A URL variable should be a fully qualified URL", SpecPackage.Literals.VAR_DECLARATION__VALUE, INVALID_URL);
		}
	}
	
	@Check(FAST)
	def void checkUrlIsWellDefined(OpenCommand oc) {
		if (!oc.^val.contains("https://")) {
			error("A URL string should be a fully qualified URL containing https://", SpecPackage.Literals.OPEN_COMMAND__VAL, INVALID_OPEN);
		}
	}
	
	@Check(FAST)
	def void checkOnlyOneUsingCommand(Model m) {
		if (m.commands.filter[x | x instanceof UsingCommand ].length !== 1) 
			error("Only one using command can be used per file.", SpecPackage.Literals.MODEL__COMMANDS, TOO_MANY_USING_COMMANDS)
		
	}
	
	@Check(FAST)
	def void checkFirstCommandIsAUsingCommand(Model m) {
		if (!(m.commands.head instanceof UsingCommand)) 
			error("First command in the script must be a using command", SpecPackage.Literals.MODEL__COMMANDS, FIRST_COMMAND_NOT_USING)
		
	}
	
	@Check(NORMAL)
	def void checkWhenTypingThatElementIsSelected(Model m) {
		val listOfSelectAndTypingCommands = m.commands.filter[x | x instanceof SelectCommand || x instanceof TypeCommand]
		if (listOfSelectAndTypingCommands.head instanceof TypeCommand)
			error("An element must be selected to provide input", SpecPackage.Literals.MODEL__COMMANDS, NO_ELEMENT_SELECTED)
	}
	
	@Check(NORMAL)
	def void checkWhenQueryingThatElementIsSelected(Model m) {
		val listOfSelectAndTypingCommands = m.commands.filter[x | x instanceof SelectCommand || x instanceof PropertyCommand]
		if (listOfSelectAndTypingCommands.head instanceof TypeCommand)
			error("An element must be selected to test properties", SpecPackage.Literals.MODEL__COMMANDS, NO_ELEMENT_SELECTED)
	}
}
