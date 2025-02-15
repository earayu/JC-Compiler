// Generated from rules.g4 by ANTLR 4.7.2

package parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rulesParser}.
 */
public interface rulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rulesParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(rulesParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(rulesParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(rulesParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(rulesParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleArrayInitialization}
	 * labeled alternative in {@link rulesParser#arrayInitialization}.
	 * @param ctx the parse tree
	 */
	void enterSimpleArrayInitialization(rulesParser.SimpleArrayInitializationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleArrayInitialization}
	 * labeled alternative in {@link rulesParser#arrayInitialization}.
	 * @param ctx the parse tree
	 */
	void exitSimpleArrayInitialization(rulesParser.SimpleArrayInitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newArray}
	 * labeled alternative in {@link rulesParser#arrayInitialization}.
	 * @param ctx the parse tree
	 */
	void enterNewArray(rulesParser.NewArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newArray}
	 * labeled alternative in {@link rulesParser#arrayInitialization}.
	 * @param ctx the parse tree
	 */
	void exitNewArray(rulesParser.NewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(rulesParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(rulesParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 */
	void enterRValue(rulesParser.RValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 */
	void exitRValue(rulesParser.RValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#lValue}.
	 * @param ctx the parse tree
	 */
	void enterLValue(rulesParser.LValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#lValue}.
	 * @param ctx the parse tree
	 */
	void exitLValue(rulesParser.LValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(rulesParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(rulesParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(rulesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(rulesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 */
	void enterCodeContent(rulesParser.CodeContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 */
	void exitCodeContent(rulesParser.CodeContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termLabel}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTermLabel(rulesParser.TermLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termLabel}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTermLabel(rulesParser.TermLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpression(rulesParser.InfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpression(rulesParser.InfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixTerms}
	 * labeled alternative in {@link rulesParser#term}.
	 * @param ctx the parse tree
	 */
	void enterInfixTerms(rulesParser.InfixTermsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixTerms}
	 * labeled alternative in {@link rulesParser#term}.
	 * @param ctx the parse tree
	 */
	void exitInfixTerms(rulesParser.InfixTermsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorLabel}
	 * labeled alternative in {@link rulesParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactorLabel(rulesParser.FactorLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorLabel}
	 * labeled alternative in {@link rulesParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactorLabel(rulesParser.FactorLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link rulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(rulesParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link rulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(rulesParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalLabel}
	 * labeled alternative in {@link rulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterLiteralLabel(rulesParser.LiteralLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalLabel}
	 * labeled alternative in {@link rulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitLiteralLabel(rulesParser.LiteralLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallLabel}
	 * labeled alternative in {@link rulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallLabel(rulesParser.FunctionCallLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallLabel}
	 * labeled alternative in {@link rulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallLabel(rulesParser.FunctionCallLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structReferenceLabel}
	 * labeled alternative in {@link rulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStructReferenceLabel(rulesParser.StructReferenceLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structReferenceLabel}
	 * labeled alternative in {@link rulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStructReferenceLabel(rulesParser.StructReferenceLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionInParentheses}
	 * labeled alternative in {@link rulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInParentheses(rulesParser.ExpressionInParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionInParentheses}
	 * labeled alternative in {@link rulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInParentheses(rulesParser.ExpressionInParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link rulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(rulesParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link rulesParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(rulesParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(rulesParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(rulesParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(rulesParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(rulesParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#pureBlock}.
	 * @param ctx the parse tree
	 */
	void enterPureBlock(rulesParser.PureBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#pureBlock}.
	 * @param ctx the parse tree
	 */
	void exitPureBlock(rulesParser.PureBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnInStatement}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterReturnInStatement(rulesParser.ReturnInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnInStatement}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitReturnInStatement(rulesParser.ReturnInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatementLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatementLabel(rulesParser.BreakStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatementLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatementLabel(rulesParser.BreakStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStatementLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatementLabel(rulesParser.ContinueStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStatementLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatementLabel(rulesParser.ContinueStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentInStatement}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentInStatement(rulesParser.AssignmentInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentInStatement}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentInStatement(rulesParser.AssignmentInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDefinitionInStatement}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinitionInStatement(rulesParser.VariableDefinitionInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDefinitionInStatement}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinitionInStatement(rulesParser.VariableDefinitionInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rValueInStatement}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterRValueInStatement(rulesParser.RValueInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rValueInStatement}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitRValueInStatement(rulesParser.RValueInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(rulesParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(rulesParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(rulesParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(rulesParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(rulesParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(rulesParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#blockOrStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockOrStatement(rulesParser.BlockOrStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#blockOrStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockOrStatement(rulesParser.BlockOrStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#statementNode}.
	 * @param ctx the parse tree
	 */
	void enterStatementNode(rulesParser.StatementNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#statementNode}.
	 * @param ctx the parse tree
	 */
	void exitStatementNode(rulesParser.StatementNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#blockBodyCode}.
	 * @param ctx the parse tree
	 */
	void enterBlockBodyCode(rulesParser.BlockBodyCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#blockBodyCode}.
	 * @param ctx the parse tree
	 */
	void exitBlockBodyCode(rulesParser.BlockBodyCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(rulesParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(rulesParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#functionDefinitionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#functionDefinitionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#functionParameterDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterDefinition(rulesParser.FunctionParameterDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#functionParameterDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterDefinition(rulesParser.FunctionParameterDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(rulesParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(rulesParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(rulesParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(rulesParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#logicBlock}.
	 * @param ctx the parse tree
	 */
	void enterLogicBlock(rulesParser.LogicBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#logicBlock}.
	 * @param ctx the parse tree
	 */
	void exitLogicBlock(rulesParser.LogicBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(rulesParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(rulesParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseIfBlock(rulesParser.ElseIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseIfBlock(rulesParser.ElseIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(rulesParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(rulesParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(rulesParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(rulesParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#initOrStepCondition}.
	 * @param ctx the parse tree
	 */
	void enterInitOrStepCondition(rulesParser.InitOrStepConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#initOrStepCondition}.
	 * @param ctx the parse tree
	 */
	void exitInitOrStepCondition(rulesParser.InitOrStepConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#terminateCondition}.
	 * @param ctx the parse tree
	 */
	void enterTerminateCondition(rulesParser.TerminateConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#terminateCondition}.
	 * @param ctx the parse tree
	 */
	void exitTerminateCondition(rulesParser.TerminateConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(rulesParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(rulesParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(rulesParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(rulesParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#ordinaryVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryVariableDefinition(rulesParser.OrdinaryVariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#ordinaryVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryVariableDefinition(rulesParser.OrdinaryVariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(rulesParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(rulesParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#ordinaryVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryVariableDeclaration(rulesParser.OrdinaryVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#ordinaryVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryVariableDeclaration(rulesParser.OrdinaryVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(rulesParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(rulesParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#arrayDefinition}.
	 * @param ctx the parse tree
	 */
	void enterArrayDefinition(rulesParser.ArrayDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#arrayDefinition}.
	 * @param ctx the parse tree
	 */
	void exitArrayDefinition(rulesParser.ArrayDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(rulesParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(rulesParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#structFieldStatementList}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#structFieldStatementList}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(rulesParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(rulesParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#structReference}.
	 * @param ctx the parse tree
	 */
	void enterStructReference(rulesParser.StructReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#structReference}.
	 * @param ctx the parse tree
	 */
	void exitStructReference(rulesParser.StructReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(rulesParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(rulesParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#double_literal}.
	 * @param ctx the parse tree
	 */
	void enterDouble_literal(rulesParser.Double_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#double_literal}.
	 * @param ctx the parse tree
	 */
	void exitDouble_literal(rulesParser.Double_literalContext ctx);
}