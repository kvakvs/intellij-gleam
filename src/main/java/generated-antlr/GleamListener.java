// Generated from java-escape by ANTLR 4.11.1
package se.clau.gleam;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GleamParser}.
 */
public interface GleamListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GleamParser#source_file}.
	 * @param ctx the parse tree
	 */
	void enterSource_file(GleamParser.Source_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#source_file}.
	 * @param ctx the parse tree
	 */
	void exitSource_file(GleamParser.Source_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#target_group}.
	 * @param ctx the parse tree
	 */
	void enterTarget_group(GleamParser.Target_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#target_group}.
	 * @param ctx the parse tree
	 */
	void exitTarget_group(GleamParser.Target_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(GleamParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(GleamParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#unqualified_import}.
	 * @param ctx the parse tree
	 */
	void enterUnqualified_import(GleamParser.Unqualified_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#unqualified_import}.
	 * @param ctx the parse tree
	 */
	void exitUnqualified_import(GleamParser.Unqualified_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#unqualified_imports}.
	 * @param ctx the parse tree
	 */
	void enterUnqualified_imports(GleamParser.Unqualified_importsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#unqualified_imports}.
	 * @param ctx the parse tree
	 */
	void exitUnqualified_imports(GleamParser.Unqualified_importsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(GleamParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(GleamParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_function_parameter_types}.
	 * @param ctx the parse tree
	 */
	void enterConstant_function_parameter_types(GleamParser.Constant_function_parameter_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_function_parameter_types}.
	 * @param ctx the parse tree
	 */
	void exitConstant_function_parameter_types(GleamParser.Constant_function_parameter_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_type_function}.
	 * @param ctx the parse tree
	 */
	void enterConstant_type_function(GleamParser.Constant_type_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_type_function}.
	 * @param ctx the parse tree
	 */
	void exitConstant_type_function(GleamParser.Constant_type_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_tuple}.
	 * @param ctx the parse tree
	 */
	void enterConstant_tuple(GleamParser.Constant_tupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_tuple}.
	 * @param ctx the parse tree
	 */
	void exitConstant_tuple(GleamParser.Constant_tupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_type_tuple}.
	 * @param ctx the parse tree
	 */
	void enterConstant_type_tuple(GleamParser.Constant_type_tupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_type_tuple}.
	 * @param ctx the parse tree
	 */
	void exitConstant_type_tuple(GleamParser.Constant_type_tupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_type_arguement}.
	 * @param ctx the parse tree
	 */
	void enterConstant_type_arguement(GleamParser.Constant_type_arguementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_type_arguement}.
	 * @param ctx the parse tree
	 */
	void exitConstant_type_arguement(GleamParser.Constant_type_arguementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_type_arguements}.
	 * @param ctx the parse tree
	 */
	void enterConstant_type_arguements(GleamParser.Constant_type_arguementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_type_arguements}.
	 * @param ctx the parse tree
	 */
	void exitConstant_type_arguements(GleamParser.Constant_type_arguementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_list}.
	 * @param ctx the parse tree
	 */
	void enterConstant_list(GleamParser.Constant_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_list}.
	 * @param ctx the parse tree
	 */
	void exitConstant_list(GleamParser.Constant_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_record_argument}.
	 * @param ctx the parse tree
	 */
	void enterConstant_record_argument(GleamParser.Constant_record_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_record_argument}.
	 * @param ctx the parse tree
	 */
	void exitConstant_record_argument(GleamParser.Constant_record_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_record_arguments}.
	 * @param ctx the parse tree
	 */
	void enterConstant_record_arguments(GleamParser.Constant_record_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_record_arguments}.
	 * @param ctx the parse tree
	 */
	void exitConstant_record_arguments(GleamParser.Constant_record_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_record}.
	 * @param ctx the parse tree
	 */
	void enterConstant_record(GleamParser.Constant_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_record}.
	 * @param ctx the parse tree
	 */
	void exitConstant_record(GleamParser.Constant_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#bit_string_segment_option_size}.
	 * @param ctx the parse tree
	 */
	void enterBit_string_segment_option_size(GleamParser.Bit_string_segment_option_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#bit_string_segment_option_size}.
	 * @param ctx the parse tree
	 */
	void exitBit_string_segment_option_size(GleamParser.Bit_string_segment_option_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#bit_string_named_segment_option}.
	 * @param ctx the parse tree
	 */
	void enterBit_string_named_segment_option(GleamParser.Bit_string_named_segment_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#bit_string_named_segment_option}.
	 * @param ctx the parse tree
	 */
	void exitBit_string_named_segment_option(GleamParser.Bit_string_named_segment_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#bit_string_segment_option}.
	 * @param ctx the parse tree
	 */
	void enterBit_string_segment_option(GleamParser.Bit_string_segment_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#bit_string_segment_option}.
	 * @param ctx the parse tree
	 */
	void exitBit_string_segment_option(GleamParser.Bit_string_segment_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#bit_string_segment_options}.
	 * @param ctx the parse tree
	 */
	void enterBit_string_segment_options(GleamParser.Bit_string_segment_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#bit_string_segment_options}.
	 * @param ctx the parse tree
	 */
	void exitBit_string_segment_options(GleamParser.Bit_string_segment_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_bit_string_segment}.
	 * @param ctx the parse tree
	 */
	void enterConstant_bit_string_segment(GleamParser.Constant_bit_string_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_bit_string_segment}.
	 * @param ctx the parse tree
	 */
	void exitConstant_bit_string_segment(GleamParser.Constant_bit_string_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_bit_string}.
	 * @param ctx the parse tree
	 */
	void enterConstant_bit_string(GleamParser.Constant_bit_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_bit_string}.
	 * @param ctx the parse tree
	 */
	void exitConstant_bit_string(GleamParser.Constant_bit_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_type}.
	 * @param ctx the parse tree
	 */
	void enterConstant_type(GleamParser.Constant_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_type}.
	 * @param ctx the parse tree
	 */
	void exitConstant_type(GleamParser.Constant_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_type_special}.
	 * @param ctx the parse tree
	 */
	void enterConstant_type_special(GleamParser.Constant_type_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_type_special}.
	 * @param ctx the parse tree
	 */
	void exitConstant_type_special(GleamParser.Constant_type_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterConstant_type_annotation(GleamParser.Constant_type_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitConstant_type_annotation(GleamParser.Constant_type_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_field_access}.
	 * @param ctx the parse tree
	 */
	void enterConstant_field_access(GleamParser.Constant_field_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_field_access}.
	 * @param ctx the parse tree
	 */
	void exitConstant_field_access(GleamParser.Constant_field_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void enterConstant_value(GleamParser.Constant_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void exitConstant_value(GleamParser.Constant_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(GleamParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(GleamParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type_parameters}.
	 * @param ctx the parse tree
	 */
	void enterType_parameters(GleamParser.Type_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type_parameters}.
	 * @param ctx the parse tree
	 */
	void exitType_parameters(GleamParser.Type_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(GleamParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(GleamParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#external_type}.
	 * @param ctx the parse tree
	 */
	void enterExternal_type(GleamParser.External_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#external_type}.
	 * @param ctx the parse tree
	 */
	void exitExternal_type(GleamParser.External_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#function_parameter_types}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter_types(GleamParser.Function_parameter_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#function_parameter_types}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter_types(GleamParser.Function_parameter_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type(GleamParser.Tuple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type(GleamParser.Tuple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(GleamParser.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(GleamParser.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type_base}.
	 * @param ctx the parse tree
	 */
	void enterType_base(GleamParser.Type_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type_base}.
	 * @param ctx the parse tree
	 */
	void exitType_base(GleamParser.Type_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterType_annotation(GleamParser.Type_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitType_annotation(GleamParser.Type_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type_argument}.
	 * @param ctx the parse tree
	 */
	void enterType_argument(GleamParser.Type_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type_argument}.
	 * @param ctx the parse tree
	 */
	void exitType_argument(GleamParser.Type_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type_arguments}.
	 * @param ctx the parse tree
	 */
	void enterType_arguments(GleamParser.Type_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type_arguments}.
	 * @param ctx the parse tree
	 */
	void exitType_arguments(GleamParser.Type_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GleamParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GleamParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#external_function_body}.
	 * @param ctx the parse tree
	 */
	void enterExternal_function_body(GleamParser.External_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#external_function_body}.
	 * @param ctx the parse tree
	 */
	void exitExternal_function_body(GleamParser.External_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#external_function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterExternal_function_parameter(GleamParser.External_function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#external_function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitExternal_function_parameter(GleamParser.External_function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#external_function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterExternal_function_parameters(GleamParser.External_function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#external_function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitExternal_function_parameters(GleamParser.External_function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#external_function}.
	 * @param ctx the parse tree
	 */
	void enterExternal_function(GleamParser.External_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#external_function}.
	 * @param ctx the parse tree
	 */
	void exitExternal_function(GleamParser.External_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#function_parameter_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter_args(GleamParser.Function_parameter_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#function_parameter_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter_args(GleamParser.Function_parameter_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter(GleamParser.Function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter(GleamParser.Function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(GleamParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(GleamParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(GleamParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(GleamParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GleamParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GleamParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#list_pattern_tail}.
	 * @param ctx the parse tree
	 */
	void enterList_pattern_tail(GleamParser.List_pattern_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#list_pattern_tail}.
	 * @param ctx the parse tree
	 */
	void exitList_pattern_tail(GleamParser.List_pattern_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#list_pattern}.
	 * @param ctx the parse tree
	 */
	void enterList_pattern(GleamParser.List_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#list_pattern}.
	 * @param ctx the parse tree
	 */
	void exitList_pattern(GleamParser.List_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#pattern_bit_string_segment}.
	 * @param ctx the parse tree
	 */
	void enterPattern_bit_string_segment(GleamParser.Pattern_bit_string_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#pattern_bit_string_segment}.
	 * @param ctx the parse tree
	 */
	void exitPattern_bit_string_segment(GleamParser.Pattern_bit_string_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#pattern_bit_string}.
	 * @param ctx the parse tree
	 */
	void enterPattern_bit_string(GleamParser.Pattern_bit_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#pattern_bit_string}.
	 * @param ctx the parse tree
	 */
	void exitPattern_bit_string(GleamParser.Pattern_bit_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern(GleamParser.Tuple_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern(GleamParser.Tuple_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#pattern_spread}.
	 * @param ctx the parse tree
	 */
	void enterPattern_spread(GleamParser.Pattern_spreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#pattern_spread}.
	 * @param ctx the parse tree
	 */
	void exitPattern_spread(GleamParser.Pattern_spreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#record_pattern_argument}.
	 * @param ctx the parse tree
	 */
	void enterRecord_pattern_argument(GleamParser.Record_pattern_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#record_pattern_argument}.
	 * @param ctx the parse tree
	 */
	void exitRecord_pattern_argument(GleamParser.Record_pattern_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#record_pattern_arguments}.
	 * @param ctx the parse tree
	 */
	void enterRecord_pattern_arguments(GleamParser.Record_pattern_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#record_pattern_arguments}.
	 * @param ctx the parse tree
	 */
	void exitRecord_pattern_arguments(GleamParser.Record_pattern_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#record_pattern}.
	 * @param ctx the parse tree
	 */
	void enterRecord_pattern(GleamParser.Record_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#record_pattern}.
	 * @param ctx the parse tree
	 */
	void exitRecord_pattern(GleamParser.Record_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(GleamParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(GleamParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#try}.
	 * @param ctx the parse tree
	 */
	void enterTry(GleamParser.TryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#try}.
	 * @param ctx the parse tree
	 */
	void exitTry(GleamParser.TryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#expression_seq}.
	 * @param ctx the parse tree
	 */
	void enterExpression_seq(GleamParser.Expression_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#expression_seq}.
	 * @param ctx the parse tree
	 */
	void exitExpression_seq(GleamParser.Expression_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GleamParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GleamParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GleamParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GleamParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(GleamParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(GleamParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#expression_bit_string_segment}.
	 * @param ctx the parse tree
	 */
	void enterExpression_bit_string_segment(GleamParser.Expression_bit_string_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#expression_bit_string_segment}.
	 * @param ctx the parse tree
	 */
	void exitExpression_bit_string_segment(GleamParser.Expression_bit_string_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#expression_bit_string}.
	 * @param ctx the parse tree
	 */
	void enterExpression_bit_string(GleamParser.Expression_bit_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#expression_bit_string}.
	 * @param ctx the parse tree
	 */
	void exitExpression_bit_string(GleamParser.Expression_bit_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#todo}.
	 * @param ctx the parse tree
	 */
	void enterTodo(GleamParser.TodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#todo}.
	 * @param ctx the parse tree
	 */
	void exitTodo(GleamParser.TodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(GleamParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(GleamParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(GleamParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(GleamParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#anonymous_function_parameter_args}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_parameter_args(GleamParser.Anonymous_function_parameter_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#anonymous_function_parameter_args}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_parameter_args(GleamParser.Anonymous_function_parameter_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_parameter(GleamParser.Anonymous_function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_parameter(GleamParser.Anonymous_function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#anonymous_function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_parameters(GleamParser.Anonymous_function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#anonymous_function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_parameters(GleamParser.Anonymous_function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#anonymous_function}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function(GleamParser.Anonymous_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#anonymous_function}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function(GleamParser.Anonymous_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#expression_group}.
	 * @param ctx the parse tree
	 */
	void enterExpression_group(GleamParser.Expression_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#expression_group}.
	 * @param ctx the parse tree
	 */
	void exitExpression_group(GleamParser.Expression_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#case_clause_tuple_access}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause_tuple_access(GleamParser.Case_clause_tuple_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#case_clause_tuple_access}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause_tuple_access(GleamParser.Case_clause_tuple_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#case_clause_guard_unit}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause_guard_unit(GleamParser.Case_clause_guard_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#case_clause_guard_unit}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause_guard_unit(GleamParser.Case_clause_guard_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#case_clause_guard_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause_guard_binary_operator(GleamParser.Case_clause_guard_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#case_clause_guard_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause_guard_binary_operator(GleamParser.Case_clause_guard_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#case_clause_guard_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause_guard_expression(GleamParser.Case_clause_guard_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#case_clause_guard_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause_guard_expression(GleamParser.Case_clause_guard_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#case_clause_guard}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause_guard(GleamParser.Case_clause_guardContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#case_clause_guard}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause_guard(GleamParser.Case_clause_guardContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#case_clause_pattern}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause_pattern(GleamParser.Case_clause_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#case_clause_pattern}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause_pattern(GleamParser.Case_clause_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#case_clause_patterns}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause_patterns(GleamParser.Case_clause_patternsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#case_clause_patterns}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause_patterns(GleamParser.Case_clause_patternsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause(GleamParser.Case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause(GleamParser.Case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#case_clauses}.
	 * @param ctx the parse tree
	 */
	void enterCase_clauses(GleamParser.Case_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#case_clauses}.
	 * @param ctx the parse tree
	 */
	void exitCase_clauses(GleamParser.Case_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#case_subjects}.
	 * @param ctx the parse tree
	 */
	void enterCase_subjects(GleamParser.Case_subjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#case_subjects}.
	 * @param ctx the parse tree
	 */
	void exitCase_subjects(GleamParser.Case_subjectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(GleamParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(GleamParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#use_args}.
	 * @param ctx the parse tree
	 */
	void enterUse_args(GleamParser.Use_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#use_args}.
	 * @param ctx the parse tree
	 */
	void exitUse_args(GleamParser.Use_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(GleamParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(GleamParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GleamParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GleamParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(GleamParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(GleamParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#assert}.
	 * @param ctx the parse tree
	 */
	void enterAssert(GleamParser.AssertContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#assert}.
	 * @param ctx the parse tree
	 */
	void exitAssert(GleamParser.AssertContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(GleamParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(GleamParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#record_update_argument}.
	 * @param ctx the parse tree
	 */
	void enterRecord_update_argument(GleamParser.Record_update_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#record_update_argument}.
	 * @param ctx the parse tree
	 */
	void exitRecord_update_argument(GleamParser.Record_update_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#record_update_arguments}.
	 * @param ctx the parse tree
	 */
	void enterRecord_update_arguments(GleamParser.Record_update_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#record_update_arguments}.
	 * @param ctx the parse tree
	 */
	void exitRecord_update_arguments(GleamParser.Record_update_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#record_update}.
	 * @param ctx the parse tree
	 */
	void enterRecord_update(GleamParser.Record_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#record_update}.
	 * @param ctx the parse tree
	 */
	void exitRecord_update(GleamParser.Record_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#call_or_access_options}.
	 * @param ctx the parse tree
	 */
	void enterCall_or_access_options(GleamParser.Call_or_access_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#call_or_access_options}.
	 * @param ctx the parse tree
	 */
	void exitCall_or_access_options(GleamParser.Call_or_access_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#call_or_access}.
	 * @param ctx the parse tree
	 */
	void enterCall_or_access(GleamParser.Call_or_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#call_or_access}.
	 * @param ctx the parse tree
	 */
	void exitCall_or_access(GleamParser.Call_or_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#expression_literal}.
	 * @param ctx the parse tree
	 */
	void enterExpression_literal(GleamParser.Expression_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#expression_literal}.
	 * @param ctx the parse tree
	 */
	void exitExpression_literal(GleamParser.Expression_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#expression_unit}.
	 * @param ctx the parse tree
	 */
	void enterExpression_unit(GleamParser.Expression_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#expression_unit}.
	 * @param ctx the parse tree
	 */
	void exitExpression_unit(GleamParser.Expression_unitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(GleamParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(GleamParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(GleamParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(GleamParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStar(GleamParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStar(GleamParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltgt}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtgt(GleamParser.LtgtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltgt}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtgt(GleamParser.LtgtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLt(GleamParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLt(GleamParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEq(GleamParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEq(GleamParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gt}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGt(GleamParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGt(GleamParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusf}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusf(GleamParser.MinusfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusf}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusf(GleamParser.MinusfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percent}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPercent(GleamParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percent}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPercent(GleamParser.PercentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus(GleamParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus(GleamParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusf}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusf(GleamParser.PlusfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusf}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusf(GleamParser.PlusfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unit}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnit(GleamParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unit}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnit(GleamParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code slashf}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSlashf(GleamParser.SlashfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code slashf}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSlashf(GleamParser.SlashfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(GleamParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(GleamParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtf}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtf(GleamParser.GtfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtf}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtf(GleamParser.GtfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gte}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGte(GleamParser.GteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gte}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGte(GleamParser.GteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pipe}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPipe(GleamParser.PipeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pipe}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPipe(GleamParser.PipeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code slash}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSlash(GleamParser.SlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code slash}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSlash(GleamParser.SlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neq}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNeq(GleamParser.NeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neq}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNeq(GleamParser.NeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltef}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtef(GleamParser.LtefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltef}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtef(GleamParser.LtefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lte}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLte(GleamParser.LteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lte}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLte(GleamParser.LteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtef}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtef(GleamParser.GtefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtef}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtef(GleamParser.GtefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starf}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStarf(GleamParser.StarfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starf}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStarf(GleamParser.StarfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltf}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtf(GleamParser.LtfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltf}
	 * labeled alternative in {@link GleamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtf(GleamParser.LtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#data_constructor_argument}.
	 * @param ctx the parse tree
	 */
	void enterData_constructor_argument(GleamParser.Data_constructor_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#data_constructor_argument}.
	 * @param ctx the parse tree
	 */
	void exitData_constructor_argument(GleamParser.Data_constructor_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#data_constructor_arguments}.
	 * @param ctx the parse tree
	 */
	void enterData_constructor_arguments(GleamParser.Data_constructor_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#data_constructor_arguments}.
	 * @param ctx the parse tree
	 */
	void exitData_constructor_arguments(GleamParser.Data_constructor_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#data_constructor}.
	 * @param ctx the parse tree
	 */
	void enterData_constructor(GleamParser.Data_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#data_constructor}.
	 * @param ctx the parse tree
	 */
	void exitData_constructor(GleamParser.Data_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#data_constructors}.
	 * @param ctx the parse tree
	 */
	void enterData_constructors(GleamParser.Data_constructorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#data_constructors}.
	 * @param ctx the parse tree
	 */
	void exitData_constructors(GleamParser.Data_constructorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(GleamParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(GleamParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type_alias}.
	 * @param ctx the parse tree
	 */
	void enterType_alias(GleamParser.Type_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type_alias}.
	 * @param ctx the parse tree
	 */
	void exitType_alias(GleamParser.Type_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GleamParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GleamParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GleamParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GleamParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#constructor_name}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_name(GleamParser.Constructor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#constructor_name}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_name(GleamParser.Constructor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(GleamParser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(GleamParser.Type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#discard}.
	 * @param ctx the parse tree
	 */
	void enterDiscard(GleamParser.DiscardContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#discard}.
	 * @param ctx the parse tree
	 */
	void exitDiscard(GleamParser.DiscardContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(GleamParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(GleamParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter(GleamParser.Type_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter(GleamParser.Type_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type_var}.
	 * @param ctx the parse tree
	 */
	void enterType_var(GleamParser.Type_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type_var}.
	 * @param ctx the parse tree
	 */
	void exitType_var(GleamParser.Type_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#type_hole}.
	 * @param ctx the parse tree
	 */
	void enterType_hole(GleamParser.Type_holeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#type_hole}.
	 * @param ctx the parse tree
	 */
	void exitType_hole(GleamParser.Type_holeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#hole}.
	 * @param ctx the parse tree
	 */
	void enterHole(GleamParser.HoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#hole}.
	 * @param ctx the parse tree
	 */
	void exitHole(GleamParser.HoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#discard_param}.
	 * @param ctx the parse tree
	 */
	void enterDiscard_param(GleamParser.Discard_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#discard_param}.
	 * @param ctx the parse tree
	 */
	void exitDiscard_param(GleamParser.Discard_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#name_param}.
	 * @param ctx the parse tree
	 */
	void enterName_param(GleamParser.Name_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#name_param}.
	 * @param ctx the parse tree
	 */
	void exitName_param(GleamParser.Name_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#labeled_name_param}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_name_param(GleamParser.Labeled_name_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#labeled_name_param}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_name_param(GleamParser.Labeled_name_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#labeled_discard_param}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_discard_param(GleamParser.Labeled_discard_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#labeled_discard_param}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_discard_param(GleamParser.Labeled_discard_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#remote_constructor_name}.
	 * @param ctx the parse tree
	 */
	void enterRemote_constructor_name(GleamParser.Remote_constructor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#remote_constructor_name}.
	 * @param ctx the parse tree
	 */
	void exitRemote_constructor_name(GleamParser.Remote_constructor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#remote_type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterRemote_type_identifier(GleamParser.Remote_type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#remote_type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitRemote_type_identifier(GleamParser.Remote_type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#visibility_modifier}.
	 * @param ctx the parse tree
	 */
	void enterVisibility_modifier(GleamParser.Visibility_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#visibility_modifier}.
	 * @param ctx the parse tree
	 */
	void exitVisibility_modifier(GleamParser.Visibility_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GleamParser#opacity_modifier}.
	 * @param ctx the parse tree
	 */
	void enterOpacity_modifier(GleamParser.Opacity_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GleamParser#opacity_modifier}.
	 * @param ctx the parse tree
	 */
	void exitOpacity_modifier(GleamParser.Opacity_modifierContext ctx);
}