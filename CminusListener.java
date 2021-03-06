// Generated from Cminus.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CminusParser}.
 */
public interface CminusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CminusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CminusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CminusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(CminusParser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(CminusParser.Declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#declaration_list_}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list_(CminusParser.Declaration_list_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#declaration_list_}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list_(CminusParser.Declaration_list_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CminusParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CminusParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(CminusParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(CminusParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(CminusParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(CminusParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFun_declaration(CminusParser.Fun_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFun_declaration(CminusParser.Fun_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CminusParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CminusParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(CminusParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(CminusParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#param_list_}.
	 * @param ctx the parse tree
	 */
	void enterParam_list_(CminusParser.Param_list_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#param_list_}.
	 * @param ctx the parse tree
	 */
	void exitParam_list_(CminusParser.Param_list_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CminusParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CminusParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(CminusParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(CminusParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declarations(CminusParser.Local_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declarations(CminusParser.Local_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#local_declarations_}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declarations_(CminusParser.Local_declarations_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#local_declarations_}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declarations_(CminusParser.Local_declarations_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(CminusParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(CminusParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#statement_list_}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list_(CminusParser.Statement_list_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#statement_list_}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list_(CminusParser.Statement_list_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CminusParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CminusParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpression_stmt(CminusParser.Expression_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpression_stmt(CminusParser.Expression_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelection_stmt(CminusParser.Selection_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelection_stmt(CminusParser.Selection_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIteration_stmt(CminusParser.Iteration_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIteration_stmt(CminusParser.Iteration_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(CminusParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(CminusParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CminusParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CminusParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CminusParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CminusParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(CminusParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(CminusParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(CminusParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(CminusParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(CminusParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(CminusParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#additive_expression_}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression_(CminusParser.Additive_expression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#additive_expression_}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression_(CminusParser.Additive_expression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(CminusParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(CminusParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CminusParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CminusParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#term_}.
	 * @param ctx the parse tree
	 */
	void enterTerm_(CminusParser.Term_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#term_}.
	 * @param ctx the parse tree
	 */
	void exitTerm_(CminusParser.Term_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(CminusParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(CminusParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CminusParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CminusParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CminusParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CminusParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CminusParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CminusParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(CminusParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(CminusParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#arg_list_}.
	 * @param ctx the parse tree
	 */
	void enterArg_list_(CminusParser.Arg_list_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#arg_list_}.
	 * @param ctx the parse tree
	 */
	void exitArg_list_(CminusParser.Arg_list_Context ctx);
}