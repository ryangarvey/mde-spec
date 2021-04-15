/*
 * generated by Xtext 2.20.0
 */
package org.mde.spec.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.mde.spec.services.SpecGrammarAccess;
import org.mde.spec.spec.ClickCommand;
import org.mde.spec.spec.Command;
import org.mde.spec.spec.LoopCommand;
import org.mde.spec.spec.Model;
import org.mde.spec.spec.OpenCommand;
import org.mde.spec.spec.Point;
import org.mde.spec.spec.PropertyCommand;
import org.mde.spec.spec.SelectCommand;
import org.mde.spec.spec.Selector;
import org.mde.spec.spec.SleepCommand;
import org.mde.spec.spec.SpecPackage;
import org.mde.spec.spec.TypeCommand;
import org.mde.spec.spec.UsingCommand;
import org.mde.spec.spec.VarDeclaration;

@SuppressWarnings("all")
public class SpecSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpecGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SpecPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SpecPackage.CLICK_COMMAND:
				sequence_ClickCommand(context, (ClickCommand) semanticObject); 
				return; 
			case SpecPackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case SpecPackage.LOOP_COMMAND:
				sequence_LoopCommand(context, (LoopCommand) semanticObject); 
				return; 
			case SpecPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case SpecPackage.OPEN_COMMAND:
				sequence_OpenCommand(context, (OpenCommand) semanticObject); 
				return; 
			case SpecPackage.POINT:
				sequence_Point(context, (Point) semanticObject); 
				return; 
			case SpecPackage.PROPERTY_COMMAND:
				sequence_PropertyCommand(context, (PropertyCommand) semanticObject); 
				return; 
			case SpecPackage.SELECT_COMMAND:
				sequence_SelectCommand(context, (SelectCommand) semanticObject); 
				return; 
			case SpecPackage.SELECTOR:
				sequence_Selector(context, (Selector) semanticObject); 
				return; 
			case SpecPackage.SLEEP_COMMAND:
				sequence_SleepCommand(context, (SleepCommand) semanticObject); 
				return; 
			case SpecPackage.TYPE_COMMAND:
				sequence_TypeCommand(context, (TypeCommand) semanticObject); 
				return; 
			case SpecPackage.USING_COMMAND:
				sequence_UsingCommand(context, (UsingCommand) semanticObject); 
				return; 
			case SpecPackage.VAR_DECLARATION:
				sequence_VarDeclaration(context, (VarDeclaration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Command returns ClickCommand
	 *     ClickCommand returns ClickCommand
	 *
	 * Constraint:
	 *     (name='Click' (selector=Selector | point=Point))
	 */
	protected void sequence_ClickCommand(ISerializationContext context, ClickCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Command
	 *
	 * Constraint:
	 *     custom=CUSTOM_COMMAND?
	 */
	protected void sequence_Command(ISerializationContext context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns LoopCommand
	 *     LoopCommand returns LoopCommand
	 *
	 * Constraint:
	 *     (times=INT command+=Command*)
	 */
	protected void sequence_LoopCommand(ISerializationContext context, LoopCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     commands+=Command+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns OpenCommand
	 *     OpenCommand returns OpenCommand
	 *
	 * Constraint:
	 *     (name='Open' (val=STRING | var=[VarDeclaration|ID]))
	 */
	protected void sequence_OpenCommand(ISerializationContext context, OpenCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Point
	 *
	 * Constraint:
	 *     (x=INT y=INT)
	 */
	protected void sequence_Point(ISerializationContext context, Point semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpecPackage.Literals.POINT__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.POINT__X));
			if (transientValues.isValueTransient(semanticObject, SpecPackage.Literals.POINT__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.POINT__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns PropertyCommand
	 *     PropertyCommand returns PropertyCommand
	 *
	 * Constraint:
	 *     (name='Property' prop=Property cond=Condition (val=STRING | var=[VarDeclaration|ID]))
	 */
	protected void sequence_PropertyCommand(ISerializationContext context, PropertyCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns SelectCommand
	 *     SelectCommand returns SelectCommand
	 *
	 * Constraint:
	 *     ((name='Within' value=Selector) | (name='Select' value=Selector))
	 */
	protected void sequence_SelectCommand(ISerializationContext context, SelectCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Selector returns Selector
	 *
	 * Constraint:
	 *     (type=ElementType? (var=[VarDeclaration|ID] | val=STRING))
	 */
	protected void sequence_Selector(ISerializationContext context, Selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns SleepCommand
	 *     SleepCommand returns SleepCommand
	 *
	 * Constraint:
	 *     (name='Sleep' time=INT)
	 */
	protected void sequence_SleepCommand(ISerializationContext context, SleepCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpecPackage.Literals.SLEEP_COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.SLEEP_COMMAND__NAME));
			if (transientValues.isValueTransient(semanticObject, SpecPackage.Literals.SLEEP_COMMAND__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.SLEEP_COMMAND__TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSleepCommandAccess().getNameSleepKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSleepCommandAccess().getTimeINTTerminalRuleCall_2_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns TypeCommand
	 *     TypeCommand returns TypeCommand
	 *
	 * Constraint:
	 *     (name='Type' (str=STRING | var=[VarDeclaration|ID]))
	 */
	protected void sequence_TypeCommand(ISerializationContext context, TypeCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns UsingCommand
	 *     UsingCommand returns UsingCommand
	 *
	 * Constraint:
	 *     (name='Using' browser=Browser)
	 */
	protected void sequence_UsingCommand(ISerializationContext context, UsingCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpecPackage.Literals.USING_COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.USING_COMMAND__NAME));
			if (transientValues.isValueTransient(semanticObject, SpecPackage.Literals.USING_COMMAND__BROWSER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.USING_COMMAND__BROWSER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUsingCommandAccess().getNameUsingKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUsingCommandAccess().getBrowserBrowserEnumRuleCall_1_0(), semanticObject.getBrowser());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns VarDeclaration
	 *     VarDeclaration returns VarDeclaration
	 *
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_VarDeclaration(ISerializationContext context, VarDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpecPackage.Literals.VAR_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.VAR_DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, SpecPackage.Literals.VAR_DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecPackage.Literals.VAR_DECLARATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVarDeclarationAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}