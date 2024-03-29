/*
 * generated by Xtext 2.20.0
 */
package org.mde.spec.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.mde.spec.ide.contentassist.antlr.internal.InternalSpecParser;
import org.mde.spec.services.SpecGrammarAccess;

public class SpecParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SpecGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SpecGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getOpenCommandAccess().getAlternatives_2(), "rule__OpenCommand__Alternatives_2");
			builder.put(grammarAccess.getClickCommandAccess().getAlternatives_1(), "rule__ClickCommand__Alternatives_1");
			builder.put(grammarAccess.getSelectCommandAccess().getAlternatives(), "rule__SelectCommand__Alternatives");
			builder.put(grammarAccess.getSelectorAccess().getAlternatives_1(), "rule__Selector__Alternatives_1");
			builder.put(grammarAccess.getPropertyCommandAccess().getAlternatives_3(), "rule__PropertyCommand__Alternatives_3");
			builder.put(grammarAccess.getTypeCommandAccess().getAlternatives_1(), "rule__TypeCommand__Alternatives_1");
			builder.put(grammarAccess.getSleepCommandAccess().getAlternatives_3(), "rule__SleepCommand__Alternatives_3");
			builder.put(grammarAccess.getBrowserAccess().getAlternatives(), "rule__Browser__Alternatives");
			builder.put(grammarAccess.getElementTypeAccess().getAlternatives(), "rule__ElementType__Alternatives");
			builder.put(grammarAccess.getPropertyAccess().getAlternatives(), "rule__Property__Alternatives");
			builder.put(grammarAccess.getConditionAccess().getAlternatives(), "rule__Condition__Alternatives");
			builder.put(grammarAccess.getCommandAccess().getGroup_7(), "rule__Command__Group_7__0");
			builder.put(grammarAccess.getUsingCommandAccess().getGroup(), "rule__UsingCommand__Group__0");
			builder.put(grammarAccess.getOpenCommandAccess().getGroup(), "rule__OpenCommand__Group__0");
			builder.put(grammarAccess.getClickCommandAccess().getGroup(), "rule__ClickCommand__Group__0");
			builder.put(grammarAccess.getClickCommandAccess().getGroup_1_0(), "rule__ClickCommand__Group_1_0__0");
			builder.put(grammarAccess.getClickCommandAccess().getGroup_1_1(), "rule__ClickCommand__Group_1_1__0");
			builder.put(grammarAccess.getSelectCommandAccess().getGroup_0(), "rule__SelectCommand__Group_0__0");
			builder.put(grammarAccess.getSelectCommandAccess().getGroup_1(), "rule__SelectCommand__Group_1__0");
			builder.put(grammarAccess.getSelectorAccess().getGroup(), "rule__Selector__Group__0");
			builder.put(grammarAccess.getPropertyCommandAccess().getGroup(), "rule__PropertyCommand__Group__0");
			builder.put(grammarAccess.getTypeCommandAccess().getGroup(), "rule__TypeCommand__Group__0");
			builder.put(grammarAccess.getSleepCommandAccess().getGroup(), "rule__SleepCommand__Group__0");
			builder.put(grammarAccess.getPointAccess().getGroup(), "rule__Point__Group__0");
			builder.put(grammarAccess.getVarDeclarationAccess().getGroup(), "rule__VarDeclaration__Group__0");
			builder.put(grammarAccess.getModelAccess().getCommandsAssignment(), "rule__Model__CommandsAssignment");
			builder.put(grammarAccess.getCommandAccess().getCustomAssignment_8(), "rule__Command__CustomAssignment_8");
			builder.put(grammarAccess.getUsingCommandAccess().getNameAssignment_0(), "rule__UsingCommand__NameAssignment_0");
			builder.put(grammarAccess.getUsingCommandAccess().getBrowserAssignment_1(), "rule__UsingCommand__BrowserAssignment_1");
			builder.put(grammarAccess.getOpenCommandAccess().getNameAssignment_1(), "rule__OpenCommand__NameAssignment_1");
			builder.put(grammarAccess.getOpenCommandAccess().getValAssignment_2_0(), "rule__OpenCommand__ValAssignment_2_0");
			builder.put(grammarAccess.getOpenCommandAccess().getVarAssignment_2_1(), "rule__OpenCommand__VarAssignment_2_1");
			builder.put(grammarAccess.getClickCommandAccess().getNameAssignment_0(), "rule__ClickCommand__NameAssignment_0");
			builder.put(grammarAccess.getClickCommandAccess().getSelectorAssignment_1_0_1(), "rule__ClickCommand__SelectorAssignment_1_0_1");
			builder.put(grammarAccess.getClickCommandAccess().getPointAssignment_1_1_1(), "rule__ClickCommand__PointAssignment_1_1_1");
			builder.put(grammarAccess.getSelectCommandAccess().getNameAssignment_0_0(), "rule__SelectCommand__NameAssignment_0_0");
			builder.put(grammarAccess.getSelectCommandAccess().getValueAssignment_0_1(), "rule__SelectCommand__ValueAssignment_0_1");
			builder.put(grammarAccess.getSelectCommandAccess().getNameAssignment_1_0(), "rule__SelectCommand__NameAssignment_1_0");
			builder.put(grammarAccess.getSelectCommandAccess().getValueAssignment_1_2(), "rule__SelectCommand__ValueAssignment_1_2");
			builder.put(grammarAccess.getSelectorAccess().getTypeAssignment_0(), "rule__Selector__TypeAssignment_0");
			builder.put(grammarAccess.getSelectorAccess().getVarAssignment_1_0(), "rule__Selector__VarAssignment_1_0");
			builder.put(grammarAccess.getSelectorAccess().getValAssignment_1_1(), "rule__Selector__ValAssignment_1_1");
			builder.put(grammarAccess.getPropertyCommandAccess().getNameAssignment_0(), "rule__PropertyCommand__NameAssignment_0");
			builder.put(grammarAccess.getPropertyCommandAccess().getPropAssignment_1(), "rule__PropertyCommand__PropAssignment_1");
			builder.put(grammarAccess.getPropertyCommandAccess().getCondAssignment_2(), "rule__PropertyCommand__CondAssignment_2");
			builder.put(grammarAccess.getPropertyCommandAccess().getValAssignment_3_0(), "rule__PropertyCommand__ValAssignment_3_0");
			builder.put(grammarAccess.getPropertyCommandAccess().getVarAssignment_3_1(), "rule__PropertyCommand__VarAssignment_3_1");
			builder.put(grammarAccess.getTypeCommandAccess().getNameAssignment_0(), "rule__TypeCommand__NameAssignment_0");
			builder.put(grammarAccess.getTypeCommandAccess().getStrAssignment_1_0(), "rule__TypeCommand__StrAssignment_1_0");
			builder.put(grammarAccess.getTypeCommandAccess().getVarAssignment_1_1(), "rule__TypeCommand__VarAssignment_1_1");
			builder.put(grammarAccess.getSleepCommandAccess().getNameAssignment_0(), "rule__SleepCommand__NameAssignment_0");
			builder.put(grammarAccess.getSleepCommandAccess().getTimeAssignment_2(), "rule__SleepCommand__TimeAssignment_2");
			builder.put(grammarAccess.getPointAccess().getXAssignment_1(), "rule__Point__XAssignment_1");
			builder.put(grammarAccess.getPointAccess().getYAssignment_3(), "rule__Point__YAssignment_3");
			builder.put(grammarAccess.getVarDeclarationAccess().getNameAssignment_1(), "rule__VarDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getVarDeclarationAccess().getValueAssignment_3(), "rule__VarDeclaration__ValueAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SpecGrammarAccess grammarAccess;

	@Override
	protected InternalSpecParser createParser() {
		InternalSpecParser result = new InternalSpecParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SpecGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SpecGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
