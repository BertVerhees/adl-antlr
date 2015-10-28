// Generated from org/openehr/grammar/Odin.g4 by ANTLR 4.5
package org.openehr.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OdinParser}.
 */
public interface OdinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OdinParser#odin_text}.
	 * @param ctx the parse tree
	 */
	void enterOdin_text(OdinParser.Odin_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#odin_text}.
	 * @param ctx the parse tree
	 */
	void exitOdin_text(OdinParser.Odin_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#attr_vals}.
	 * @param ctx the parse tree
	 */
	void enterAttr_vals(OdinParser.Attr_valsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#attr_vals}.
	 * @param ctx the parse tree
	 */
	void exitAttr_vals(OdinParser.Attr_valsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#attr_val}.
	 * @param ctx the parse tree
	 */
	void enterAttr_val(OdinParser.Attr_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#attr_val}.
	 * @param ctx the parse tree
	 */
	void exitAttr_val(OdinParser.Attr_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#object_block}.
	 * @param ctx the parse tree
	 */
	void enterObject_block(OdinParser.Object_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#object_block}.
	 * @param ctx the parse tree
	 */
	void exitObject_block(OdinParser.Object_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#object_value_block}.
	 * @param ctx the parse tree
	 */
	void enterObject_value_block(OdinParser.Object_value_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#object_value_block}.
	 * @param ctx the parse tree
	 */
	void exitObject_value_block(OdinParser.Object_value_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#keyed_object}.
	 * @param ctx the parse tree
	 */
	void enterKeyed_object(OdinParser.Keyed_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#keyed_object}.
	 * @param ctx the parse tree
	 */
	void exitKeyed_object(OdinParser.Keyed_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#primitive_object}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_object(OdinParser.Primitive_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#primitive_object}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_object(OdinParser.Primitive_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#primitive_value}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_value(OdinParser.Primitive_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#primitive_value}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_value(OdinParser.Primitive_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#primitive_list_value}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_list_value(OdinParser.Primitive_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#primitive_list_value}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_list_value(OdinParser.Primitive_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#primitive_interval_value}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_interval_value(OdinParser.Primitive_interval_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#primitive_interval_value}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_interval_value(OdinParser.Primitive_interval_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#object_reference_block}.
	 * @param ctx the parse tree
	 */
	void enterObject_reference_block(OdinParser.Object_reference_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#object_reference_block}.
	 * @param ctx the parse tree
	 */
	void exitObject_reference_block(OdinParser.Object_reference_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#odin_path_list}.
	 * @param ctx the parse tree
	 */
	void enterOdin_path_list(OdinParser.Odin_path_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#odin_path_list}.
	 * @param ctx the parse tree
	 */
	void exitOdin_path_list(OdinParser.Odin_path_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#odin_path}.
	 * @param ctx the parse tree
	 */
	void enterOdin_path(OdinParser.Odin_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#odin_path}.
	 * @param ctx the parse tree
	 */
	void exitOdin_path(OdinParser.Odin_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#odin_path_segment}.
	 * @param ctx the parse tree
	 */
	void enterOdin_path_segment(OdinParser.Odin_path_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#odin_path_segment}.
	 * @param ctx the parse tree
	 */
	void exitOdin_path_segment(OdinParser.Odin_path_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#odin_path_element}.
	 * @param ctx the parse tree
	 */
	void enterOdin_path_element(OdinParser.Odin_path_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#odin_path_element}.
	 * @param ctx the parse tree
	 */
	void exitOdin_path_element(OdinParser.Odin_path_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#string_value}.
	 * @param ctx the parse tree
	 */
	void enterString_value(OdinParser.String_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#string_value}.
	 * @param ctx the parse tree
	 */
	void exitString_value(OdinParser.String_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#string_list_value}.
	 * @param ctx the parse tree
	 */
	void enterString_list_value(OdinParser.String_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#string_list_value}.
	 * @param ctx the parse tree
	 */
	void exitString_list_value(OdinParser.String_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#integer_value}.
	 * @param ctx the parse tree
	 */
	void enterInteger_value(OdinParser.Integer_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#integer_value}.
	 * @param ctx the parse tree
	 */
	void exitInteger_value(OdinParser.Integer_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#integer_list_value}.
	 * @param ctx the parse tree
	 */
	void enterInteger_list_value(OdinParser.Integer_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#integer_list_value}.
	 * @param ctx the parse tree
	 */
	void exitInteger_list_value(OdinParser.Integer_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#integer_interval_value}.
	 * @param ctx the parse tree
	 */
	void enterInteger_interval_value(OdinParser.Integer_interval_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#integer_interval_value}.
	 * @param ctx the parse tree
	 */
	void exitInteger_interval_value(OdinParser.Integer_interval_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#integer_interval_list_value}.
	 * @param ctx the parse tree
	 */
	void enterInteger_interval_list_value(OdinParser.Integer_interval_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#integer_interval_list_value}.
	 * @param ctx the parse tree
	 */
	void exitInteger_interval_list_value(OdinParser.Integer_interval_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#real_value}.
	 * @param ctx the parse tree
	 */
	void enterReal_value(OdinParser.Real_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#real_value}.
	 * @param ctx the parse tree
	 */
	void exitReal_value(OdinParser.Real_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#real_list_value}.
	 * @param ctx the parse tree
	 */
	void enterReal_list_value(OdinParser.Real_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#real_list_value}.
	 * @param ctx the parse tree
	 */
	void exitReal_list_value(OdinParser.Real_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#real_interval_value}.
	 * @param ctx the parse tree
	 */
	void enterReal_interval_value(OdinParser.Real_interval_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#real_interval_value}.
	 * @param ctx the parse tree
	 */
	void exitReal_interval_value(OdinParser.Real_interval_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#real_interval_list_value}.
	 * @param ctx the parse tree
	 */
	void enterReal_interval_list_value(OdinParser.Real_interval_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#real_interval_list_value}.
	 * @param ctx the parse tree
	 */
	void exitReal_interval_list_value(OdinParser.Real_interval_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#boolean_value}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_value(OdinParser.Boolean_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#boolean_value}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_value(OdinParser.Boolean_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#boolean_list_value}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_list_value(OdinParser.Boolean_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#boolean_list_value}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_list_value(OdinParser.Boolean_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#character_value}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_value(OdinParser.Character_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#character_value}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_value(OdinParser.Character_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#character_list_value}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_list_value(OdinParser.Character_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#character_list_value}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_list_value(OdinParser.Character_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#date_value}.
	 * @param ctx the parse tree
	 */
	void enterDate_value(OdinParser.Date_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#date_value}.
	 * @param ctx the parse tree
	 */
	void exitDate_value(OdinParser.Date_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#date_list_value}.
	 * @param ctx the parse tree
	 */
	void enterDate_list_value(OdinParser.Date_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#date_list_value}.
	 * @param ctx the parse tree
	 */
	void exitDate_list_value(OdinParser.Date_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#date_interval_value}.
	 * @param ctx the parse tree
	 */
	void enterDate_interval_value(OdinParser.Date_interval_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#date_interval_value}.
	 * @param ctx the parse tree
	 */
	void exitDate_interval_value(OdinParser.Date_interval_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#date_interval_list_value}.
	 * @param ctx the parse tree
	 */
	void enterDate_interval_list_value(OdinParser.Date_interval_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#date_interval_list_value}.
	 * @param ctx the parse tree
	 */
	void exitDate_interval_list_value(OdinParser.Date_interval_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#time_value}.
	 * @param ctx the parse tree
	 */
	void enterTime_value(OdinParser.Time_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#time_value}.
	 * @param ctx the parse tree
	 */
	void exitTime_value(OdinParser.Time_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#time_list_value}.
	 * @param ctx the parse tree
	 */
	void enterTime_list_value(OdinParser.Time_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#time_list_value}.
	 * @param ctx the parse tree
	 */
	void exitTime_list_value(OdinParser.Time_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#time_interval_value}.
	 * @param ctx the parse tree
	 */
	void enterTime_interval_value(OdinParser.Time_interval_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#time_interval_value}.
	 * @param ctx the parse tree
	 */
	void exitTime_interval_value(OdinParser.Time_interval_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#time_interval_list_value}.
	 * @param ctx the parse tree
	 */
	void enterTime_interval_list_value(OdinParser.Time_interval_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#time_interval_list_value}.
	 * @param ctx the parse tree
	 */
	void exitTime_interval_list_value(OdinParser.Time_interval_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#date_time_value}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_value(OdinParser.Date_time_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#date_time_value}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_value(OdinParser.Date_time_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#date_time_list_value}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_list_value(OdinParser.Date_time_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#date_time_list_value}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_list_value(OdinParser.Date_time_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#date_time_interval_value}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_interval_value(OdinParser.Date_time_interval_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#date_time_interval_value}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_interval_value(OdinParser.Date_time_interval_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#date_time_interval_list_value}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_interval_list_value(OdinParser.Date_time_interval_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#date_time_interval_list_value}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_interval_list_value(OdinParser.Date_time_interval_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#duration_value}.
	 * @param ctx the parse tree
	 */
	void enterDuration_value(OdinParser.Duration_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#duration_value}.
	 * @param ctx the parse tree
	 */
	void exitDuration_value(OdinParser.Duration_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#duration_list_value}.
	 * @param ctx the parse tree
	 */
	void enterDuration_list_value(OdinParser.Duration_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#duration_list_value}.
	 * @param ctx the parse tree
	 */
	void exitDuration_list_value(OdinParser.Duration_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#duration_interval_value}.
	 * @param ctx the parse tree
	 */
	void enterDuration_interval_value(OdinParser.Duration_interval_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#duration_interval_value}.
	 * @param ctx the parse tree
	 */
	void exitDuration_interval_value(OdinParser.Duration_interval_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#duration_interval_list_value}.
	 * @param ctx the parse tree
	 */
	void enterDuration_interval_list_value(OdinParser.Duration_interval_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#duration_interval_list_value}.
	 * @param ctx the parse tree
	 */
	void exitDuration_interval_list_value(OdinParser.Duration_interval_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#term_code_value}.
	 * @param ctx the parse tree
	 */
	void enterTerm_code_value(OdinParser.Term_code_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#term_code_value}.
	 * @param ctx the parse tree
	 */
	void exitTerm_code_value(OdinParser.Term_code_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#term_code_list_value}.
	 * @param ctx the parse tree
	 */
	void enterTerm_code_list_value(OdinParser.Term_code_list_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#term_code_list_value}.
	 * @param ctx the parse tree
	 */
	void exitTerm_code_list_value(OdinParser.Term_code_list_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#uri_value}.
	 * @param ctx the parse tree
	 */
	void enterUri_value(OdinParser.Uri_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#uri_value}.
	 * @param ctx the parse tree
	 */
	void exitUri_value(OdinParser.Uri_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(OdinParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(OdinParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#type_id}.
	 * @param ctx the parse tree
	 */
	void enterType_id(OdinParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#type_id}.
	 * @param ctx the parse tree
	 */
	void exitType_id(OdinParser.Type_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#attribute_id}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_id(OdinParser.Attribute_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#attribute_id}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_id(OdinParser.Attribute_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OdinParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OdinParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdinParser#archetype_ref}.
	 * @param ctx the parse tree
	 */
	void enterArchetype_ref(OdinParser.Archetype_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdinParser#archetype_ref}.
	 * @param ctx the parse tree
	 */
	void exitArchetype_ref(OdinParser.Archetype_refContext ctx);
}