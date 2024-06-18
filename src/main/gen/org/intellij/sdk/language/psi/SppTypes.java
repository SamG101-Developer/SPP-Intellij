// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface SppTypes {

  IElementType ANNOTATION = new SppElementType("ANNOTATION");
  IElementType ASSIGNMENT_STATEMENT = new SppElementType("ASSIGNMENT_STATEMENT");
  IElementType BINARY_EXPRESSION_LEVEL_1 = new SppElementType("BINARY_EXPRESSION_LEVEL_1");
  IElementType BINARY_EXPRESSION_LEVEL_2 = new SppElementType("BINARY_EXPRESSION_LEVEL_2");
  IElementType BINARY_EXPRESSION_LEVEL_3 = new SppElementType("BINARY_EXPRESSION_LEVEL_3");
  IElementType BINARY_EXPRESSION_LEVEL_4 = new SppElementType("BINARY_EXPRESSION_LEVEL_4");
  IElementType BINARY_EXPRESSION_LEVEL_5 = new SppElementType("BINARY_EXPRESSION_LEVEL_5");
  IElementType BINARY_EXPRESSION_LEVEL_6 = new SppElementType("BINARY_EXPRESSION_LEVEL_6");
  IElementType BINARY_EXPRESSION_LEVEL_7 = new SppElementType("BINARY_EXPRESSION_LEVEL_7");
  IElementType BINARY_OP_PRECEDENCE_LEVEL_1 = new SppElementType("BINARY_OP_PRECEDENCE_LEVEL_1");
  IElementType BINARY_OP_PRECEDENCE_LEVEL_2 = new SppElementType("BINARY_OP_PRECEDENCE_LEVEL_2");
  IElementType BINARY_OP_PRECEDENCE_LEVEL_3 = new SppElementType("BINARY_OP_PRECEDENCE_LEVEL_3");
  IElementType BINARY_OP_PRECEDENCE_LEVEL_4 = new SppElementType("BINARY_OP_PRECEDENCE_LEVEL_4");
  IElementType BINARY_OP_PRECEDENCE_LEVEL_5 = new SppElementType("BINARY_OP_PRECEDENCE_LEVEL_5");
  IElementType BINARY_OP_PRECEDENCE_LEVEL_6 = new SppElementType("BINARY_OP_PRECEDENCE_LEVEL_6");
  IElementType BINARY_OP_PRECEDENCE_LEVEL_7 = new SppElementType("BINARY_OP_PRECEDENCE_LEVEL_7");
  IElementType CLASS_ATTRIBUTE = new SppElementType("CLASS_ATTRIBUTE");
  IElementType CLASS_IMPLEMENTATION = new SppElementType("CLASS_IMPLEMENTATION");
  IElementType CLASS_MEMBER = new SppElementType("CLASS_MEMBER");
  IElementType CLASS_PROTOTYPE = new SppElementType("CLASS_PROTOTYPE");
  IElementType CONVENTION = new SppElementType("CONVENTION");
  IElementType COROUTINE_PROTOTYPE = new SppElementType("COROUTINE_PROTOTYPE");
  IElementType EXPRESSION = new SppElementType("EXPRESSION");
  IElementType FUNCTION_CALL_ARGUMENT = new SppElementType("FUNCTION_CALL_ARGUMENT");
  IElementType FUNCTION_CALL_ARGUMENTS = new SppElementType("FUNCTION_CALL_ARGUMENTS");
  IElementType FUNCTION_CALL_ARGUMENT_NAMED = new SppElementType("FUNCTION_CALL_ARGUMENT_NAMED");
  IElementType FUNCTION_CALL_ARGUMENT_NORMAL = new SppElementType("FUNCTION_CALL_ARGUMENT_NORMAL");
  IElementType FUNCTION_IMPLEMENTATION = new SppElementType("FUNCTION_IMPLEMENTATION");
  IElementType FUNCTION_PARAMETER = new SppElementType("FUNCTION_PARAMETER");
  IElementType FUNCTION_PARAMETERS = new SppElementType("FUNCTION_PARAMETERS");
  IElementType FUNCTION_PARAMETER_OPTIONAL = new SppElementType("FUNCTION_PARAMETER_OPTIONAL");
  IElementType FUNCTION_PARAMETER_REQUIRED = new SppElementType("FUNCTION_PARAMETER_REQUIRED");
  IElementType FUNCTION_PARAMETER_SELF = new SppElementType("FUNCTION_PARAMETER_SELF");
  IElementType FUNCTION_PARAMETER_VARIADIC = new SppElementType("FUNCTION_PARAMETER_VARIADIC");
  IElementType FUNCTION_PROTOTYPE = new SppElementType("FUNCTION_PROTOTYPE");
  IElementType GENERIC_ARGUMENT = new SppElementType("GENERIC_ARGUMENT");
  IElementType GENERIC_ARGUMENTS = new SppElementType("GENERIC_ARGUMENTS");
  IElementType GENERIC_ARGUMENT_NAMED = new SppElementType("GENERIC_ARGUMENT_NAMED");
  IElementType GENERIC_ARGUMENT_NORMAL = new SppElementType("GENERIC_ARGUMENT_NORMAL");
  IElementType GENERIC_IDENTIFIER = new SppElementType("GENERIC_IDENTIFIER");
  IElementType GENERIC_INLINE_CONSTRAINTS = new SppElementType("GENERIC_INLINE_CONSTRAINTS");
  IElementType GENERIC_PARAMETER = new SppElementType("GENERIC_PARAMETER");
  IElementType GENERIC_PARAMETERS = new SppElementType("GENERIC_PARAMETERS");
  IElementType GENERIC_PARAMETER_OPTIONAL = new SppElementType("GENERIC_PARAMETER_OPTIONAL");
  IElementType GENERIC_PARAMETER_REQUIRED = new SppElementType("GENERIC_PARAMETER_REQUIRED");
  IElementType GENERIC_PARAMETER_VARIADIC = new SppElementType("GENERIC_PARAMETER_VARIADIC");
  IElementType IDENTIFIER = new SppElementType("IDENTIFIER");
  IElementType IF_EXPRESSION = new SppElementType("IF_EXPRESSION");
  IElementType INNER_SCOPE = new SppElementType("INNER_SCOPE");
  IElementType LAMBDA_CAPTURE_BLOCK = new SppElementType("LAMBDA_CAPTURE_BLOCK");
  IElementType LAMBDA_CAPTURE_ITEM = new SppElementType("LAMBDA_CAPTURE_ITEM");
  IElementType LAMBDA_CAPTURE_ITEM_NAMED = new SppElementType("LAMBDA_CAPTURE_ITEM_NAMED");
  IElementType LAMBDA_CAPTURE_ITEM_NORMAL = new SppElementType("LAMBDA_CAPTURE_ITEM_NORMAL");
  IElementType LAMBDA_COROUTINE_PROTOTYPE = new SppElementType("LAMBDA_COROUTINE_PROTOTYPE");
  IElementType LAMBDA_PROTOTYPE = new SppElementType("LAMBDA_PROTOTYPE");
  IElementType LAMBDA_SUBROUTINE_PROTOTYPE = new SppElementType("LAMBDA_SUBROUTINE_PROTOTYPE");
  IElementType LET_STATEMENT = new SppElementType("LET_STATEMENT");
  IElementType LET_STATEMENT_INITIALIZED = new SppElementType("LET_STATEMENT_INITIALIZED");
  IElementType LET_STATEMENT_UNINITIALIZED = new SppElementType("LET_STATEMENT_UNINITIALIZED");
  IElementType LITERAL = new SppElementType("LITERAL");
  IElementType LITERAL_BOOLEAN = new SppElementType("LITERAL_BOOLEAN");
  IElementType LITERAL_NUMBER = new SppElementType("LITERAL_NUMBER");
  IElementType LITERAL_NUMBER_BASE_10 = new SppElementType("LITERAL_NUMBER_BASE_10");
  IElementType LITERAL_NUMBER_BASE_10_FLOAT = new SppElementType("LITERAL_NUMBER_BASE_10_FLOAT");
  IElementType LITERAL_NUMBER_BASE_10_INTEGER = new SppElementType("LITERAL_NUMBER_BASE_10_INTEGER");
  IElementType LITERAL_NUMBER_BASE_16 = new SppElementType("LITERAL_NUMBER_BASE_16");
  IElementType LITERAL_NUMBER_BASE_2 = new SppElementType("LITERAL_NUMBER_BASE_2");
  IElementType LITERAL_REGEX = new SppElementType("LITERAL_REGEX");
  IElementType LITERAL_STRING = new SppElementType("LITERAL_STRING");
  IElementType LITERAL_TUPLE = new SppElementType("LITERAL_TUPLE");
  IElementType LITERAL_TUPLE_0_ITEMS = new SppElementType("LITERAL_TUPLE_0_ITEMS");
  IElementType LITERAL_TUPLE_1_ITEMS = new SppElementType("LITERAL_TUPLE_1_ITEMS");
  IElementType LITERAL_TUPLE_N_ITEMS = new SppElementType("LITERAL_TUPLE_N_ITEMS");
  IElementType LOCAL_VARIABLE = new SppElementType("LOCAL_VARIABLE");
  IElementType LOCAL_VARIABLE_ASSIGNMENT = new SppElementType("LOCAL_VARIABLE_ASSIGNMENT");
  IElementType LOCAL_VARIABLE_DESTRUCTURE = new SppElementType("LOCAL_VARIABLE_DESTRUCTURE");
  IElementType LOCAL_VARIABLE_NESTED_FOR_DESTRUCTURE = new SppElementType("LOCAL_VARIABLE_NESTED_FOR_DESTRUCTURE");
  IElementType LOCAL_VARIABLE_NESTED_FOR_TUPLE = new SppElementType("LOCAL_VARIABLE_NESTED_FOR_TUPLE");
  IElementType LOCAL_VARIABLE_NON_ASSIGNMENT = new SppElementType("LOCAL_VARIABLE_NON_ASSIGNMENT");
  IElementType LOCAL_VARIABLE_SINGLE = new SppElementType("LOCAL_VARIABLE_SINGLE");
  IElementType LOCAL_VARIABLE_SKIP_ARGUMENT = new SppElementType("LOCAL_VARIABLE_SKIP_ARGUMENT");
  IElementType LOCAL_VARIABLE_TUPLE = new SppElementType("LOCAL_VARIABLE_TUPLE");
  IElementType MODULE_IDENTIFIER = new SppElementType("MODULE_IDENTIFIER");
  IElementType MODULE_IMPLEMENTATION = new SppElementType("MODULE_IMPLEMENTATION");
  IElementType MODULE_MEMBER = new SppElementType("MODULE_MEMBER");
  IElementType MODULE_PROTOTYPE = new SppElementType("MODULE_PROTOTYPE");
  IElementType NUMERIC_POSTFIX_OP = new SppElementType("NUMERIC_POSTFIX_OP");
  IElementType NUMERIC_PREFIX_OP = new SppElementType("NUMERIC_PREFIX_OP");
  IElementType OBJECT_INITIALIZATION = new SppElementType("OBJECT_INITIALIZATION");
  IElementType OBJECT_INITIALIZER_ARGUMENT = new SppElementType("OBJECT_INITIALIZER_ARGUMENT");
  IElementType OBJECT_INITIALIZER_ARGUMENTS = new SppElementType("OBJECT_INITIALIZER_ARGUMENTS");
  IElementType OBJECT_INITIALIZER_ARGUMENT_NAMED = new SppElementType("OBJECT_INITIALIZER_ARGUMENT_NAMED");
  IElementType OBJECT_INITIALIZER_ARGUMENT_NAMED_KEY = new SppElementType("OBJECT_INITIALIZER_ARGUMENT_NAMED_KEY");
  IElementType OBJECT_INITIALIZER_ARGUMENT_NORMAL = new SppElementType("OBJECT_INITIALIZER_ARGUMENT_NORMAL");
  IElementType PARENTHESIZED_EXPRESSION = new SppElementType("PARENTHESIZED_EXPRESSION");
  IElementType PATTERN_COMP_OP = new SppElementType("PATTERN_COMP_OP");
  IElementType PATTERN_GUARD = new SppElementType("PATTERN_GUARD");
  IElementType PATTERN_STATEMENT = new SppElementType("PATTERN_STATEMENT");
  IElementType PATTERN_VARIANT = new SppElementType("PATTERN_VARIANT");
  IElementType PATTERN_VARIANT_ASSIGNMENT = new SppElementType("PATTERN_VARIANT_ASSIGNMENT");
  IElementType PATTERN_VARIANT_DESTRUCTURE = new SppElementType("PATTERN_VARIANT_DESTRUCTURE");
  IElementType PATTERN_VARIANT_ELSE = new SppElementType("PATTERN_VARIANT_ELSE");
  IElementType PATTERN_VARIANT_LITERAL = new SppElementType("PATTERN_VARIANT_LITERAL");
  IElementType PATTERN_VARIANT_NESTED_FOR_DESTRUCTURE = new SppElementType("PATTERN_VARIANT_NESTED_FOR_DESTRUCTURE");
  IElementType PATTERN_VARIANT_NESTED_FOR_NON_ASSIGNMENT = new SppElementType("PATTERN_VARIANT_NESTED_FOR_NON_ASSIGNMENT");
  IElementType PATTERN_VARIANT_NESTED_FOR_TUPLE = new SppElementType("PATTERN_VARIANT_NESTED_FOR_TUPLE");
  IElementType PATTERN_VARIANT_SKIP_ARGUMENT = new SppElementType("PATTERN_VARIANT_SKIP_ARGUMENT");
  IElementType PATTERN_VARIANT_TUPLE = new SppElementType("PATTERN_VARIANT_TUPLE");
  IElementType PATTERN_VARIANT_VARIABLE = new SppElementType("PATTERN_VARIANT_VARIABLE");
  IElementType POSTFIX_EXPRESSION = new SppElementType("POSTFIX_EXPRESSION");
  IElementType POSTFIX_IDENTIFIER = new SppElementType("POSTFIX_IDENTIFIER");
  IElementType POSTFIX_OP = new SppElementType("POSTFIX_OP");
  IElementType POSTFIX_OP_EARLY_RETURN = new SppElementType("POSTFIX_OP_EARLY_RETURN");
  IElementType POSTFIX_OP_FUNCTION_CALL = new SppElementType("POSTFIX_OP_FUNCTION_CALL");
  IElementType POSTFIX_OP_MEMBER_ACCESS = new SppElementType("POSTFIX_OP_MEMBER_ACCESS");
  IElementType POSTFIX_OP_MEMBER_ACCESS_RUNTIME = new SppElementType("POSTFIX_OP_MEMBER_ACCESS_RUNTIME");
  IElementType POSTFIX_OP_MEMBER_ACCESS_STATIC = new SppElementType("POSTFIX_OP_MEMBER_ACCESS_STATIC");
  IElementType PRIMARY_EXPRESSION = new SppElementType("PRIMARY_EXPRESSION");
  IElementType RETURN_STATEMENT = new SppElementType("RETURN_STATEMENT");
  IElementType SELF_KEYWORD = new SppElementType("SELF_KEYWORD");
  IElementType SELF_TYPE = new SppElementType("SELF_TYPE");
  IElementType STATEMENT = new SppElementType("STATEMENT");
  IElementType SUBROUTINE_PROTOTYPE = new SppElementType("SUBROUTINE_PROTOTYPE");
  IElementType SUP_IMPLEMENTATION = new SppElementType("SUP_IMPLEMENTATION");
  IElementType SUP_MEMBER = new SppElementType("SUP_MEMBER");
  IElementType SUP_METHOD_PROTOTYPE = new SppElementType("SUP_METHOD_PROTOTYPE");
  IElementType SUP_PROTOTYPE_INHERITANCE = new SppElementType("SUP_PROTOTYPE_INHERITANCE");
  IElementType SUP_PROTOTYPE_NORMAL = new SppElementType("SUP_PROTOTYPE_NORMAL");
  IElementType SUP_TYPEDEF = new SppElementType("SUP_TYPEDEF");
  IElementType TYPE = new SppElementType("TYPE");
  IElementType TYPEDEF_ITEM = new SppElementType("TYPEDEF_ITEM");
  IElementType TYPEDEF_STATEMENT = new SppElementType("TYPEDEF_STATEMENT");
  IElementType TYPEDEF_STATEMENT_ALL_ITEMS = new SppElementType("TYPEDEF_STATEMENT_ALL_ITEMS");
  IElementType TYPEDEF_STATEMENT_SPECIFIC_ITEM = new SppElementType("TYPEDEF_STATEMENT_SPECIFIC_ITEM");
  IElementType TYPEDEF_STATEMENT_SPECIFIC_ITEMS = new SppElementType("TYPEDEF_STATEMENT_SPECIFIC_ITEMS");
  IElementType TYPEDEF_STATEMENT_SPECIFIC_ITEM_ALIAS = new SppElementType("TYPEDEF_STATEMENT_SPECIFIC_ITEM_ALIAS");
  IElementType TYPE_NAMESPACE = new SppElementType("TYPE_NAMESPACE");
  IElementType TYPE_NON_UNION = new SppElementType("TYPE_NON_UNION");
  IElementType TYPE_OPTIONAL = new SppElementType("TYPE_OPTIONAL");
  IElementType TYPE_PART = new SppElementType("TYPE_PART");
  IElementType TYPE_PARTS = new SppElementType("TYPE_PARTS");
  IElementType TYPE_PART_FIRST = new SppElementType("TYPE_PART_FIRST");
  IElementType TYPE_SINGLE = new SppElementType("TYPE_SINGLE");
  IElementType TYPE_TUPLE = new SppElementType("TYPE_TUPLE");
  IElementType TYPE_UNION = new SppElementType("TYPE_UNION");
  IElementType UNARY_EXPRESSION = new SppElementType("UNARY_EXPRESSION");
  IElementType UNARY_OP = new SppElementType("UNARY_OP");
  IElementType UPPER_IDENTIFIER = new SppElementType("UPPER_IDENTIFIER");
  IElementType WHERE_BLOCK = new SppElementType("WHERE_BLOCK");
  IElementType WHERE_BLOCK_CONSTRAINTS = new SppElementType("WHERE_BLOCK_CONSTRAINTS");
  IElementType WHERE_BLOCK_CONSTRAINTS_GROUP = new SppElementType("WHERE_BLOCK_CONSTRAINTS_GROUP");
  IElementType WHILE_ELSE_EXPRESSION = new SppElementType("WHILE_ELSE_EXPRESSION");
  IElementType WHILE_EXPRESSION = new SppElementType("WHILE_EXPRESSION");
  IElementType WITH_EXPRESSION = new SppElementType("WITH_EXPRESSION");
  IElementType WITH_EXPRESSION_LHS_ALIAS = new SppElementType("WITH_EXPRESSION_LHS_ALIAS");
  IElementType YIELD_EXPRESSION = new SppElementType("YIELD_EXPRESSION");

  IElementType BLOCK_COMMENT = new SppTokenType("block_comment");
  IElementType KWAS = new SppTokenType("as");
  IElementType KWASYNC = new SppTokenType("async");
  IElementType KWCASE = new SppTokenType("case");
  IElementType KWCLS = new SppTokenType("cls");
  IElementType KWCOR = new SppTokenType("cor");
  IElementType KWELSE = new SppTokenType("else");
  IElementType KWFALSE = new SppTokenType("false");
  IElementType KWFUN = new SppTokenType("fun");
  IElementType KWGEN = new SppTokenType("gen");
  IElementType KWIS = new SppTokenType("is");
  IElementType KWLET = new SppTokenType("let");
  IElementType KWLOOP = new SppTokenType("loop");
  IElementType KWMOD = new SppTokenType("mod");
  IElementType KWMUT = new SppTokenType("mut");
  IElementType KWON = new SppTokenType("on");
  IElementType KWRET = new SppTokenType("ret");
  IElementType KWSELF = new SppTokenType("self");
  IElementType KWSELFTYPE = new SppTokenType("Self");
  IElementType KWSUP = new SppTokenType("sup");
  IElementType KWTHEN = new SppTokenType("then");
  IElementType KWTRUE = new SppTokenType("true");
  IElementType KWUSE = new SppTokenType("use");
  IElementType KWWHERE = new SppTokenType("where");
  IElementType KWWITH = new SppTokenType("with");
  IElementType LINE_COMMENT = new SppTokenType("line_comment");
  IElementType LXBINDIGITS = new SppTokenType("LxBinDigits");
  IElementType LXDECDECIMAL = new SppTokenType("LxDecDecimal");
  IElementType LXDECINTEGER = new SppTokenType("LxDecInteger");
  IElementType LXDOUBLEQUOTESTR = new SppTokenType("LxDoubleQuoteStr");
  IElementType LXHEXDIGITS = new SppTokenType("LxHexDigits");
  IElementType LXIDENTIFIER = new SppTokenType("LxIdentifier");
  IElementType LXPOSTFIXIDENTIFIER = new SppTokenType("LxPostfixIdentifier");
  IElementType LXREGEX = new SppTokenType("LxRegex");
  IElementType LXUPPERIDENTIFIER = new SppTokenType("LxUpperIdentifier");
  IElementType TKADD = new SppTokenType("+");
  IElementType TKADDASSIGN = new SppTokenType("+=");
  IElementType TKARROWR = new SppTokenType("->");
  IElementType TKASSIGN = new SppTokenType("=");
  IElementType TKAT = new SppTokenType("@");
  IElementType TKBITAND = new SppTokenType("&");
  IElementType TKBITANDASSIGN = new SppTokenType("&=");
  IElementType TKBITOR = new SppTokenType("|");
  IElementType TKBITORASSIGN = new SppTokenType("|=");
  IElementType TKBITROTATEL = new SppTokenType("<<<");
  IElementType TKBITROTATELASSIGN = new SppTokenType("<<<=");
  IElementType TKBITROTATER = new SppTokenType(">>>");
  IElementType TKBITROTATERASSIGN = new SppTokenType(">>>=");
  IElementType TKBITSHIFTL = new SppTokenType("<<");
  IElementType TKBITSHIFTLASSIGN = new SppTokenType("<<=");
  IElementType TKBITSHIFTR = new SppTokenType(">>");
  IElementType TKBITSHIFTRASSIGN = new SppTokenType(">>=");
  IElementType TKBITXOR = new SppTokenType("^");
  IElementType TKBITXORASSIGN = new SppTokenType("^=");
  IElementType TKBRACEL = new SppTokenType("{");
  IElementType TKBRACER = new SppTokenType("}");
  IElementType TKBRACKL = new SppTokenType("[");
  IElementType TKBRACKR = new SppTokenType("]");
  IElementType TKCOALESCE = new SppTokenType("??");
  IElementType TKCOLON = new SppTokenType(":");
  IElementType TKCOMMA = new SppTokenType(",");
  IElementType TKDBLCOLON = new SppTokenType("::");
  IElementType TKDIV = new SppTokenType("/");
  IElementType TKDIVASSIGN = new SppTokenType("/=");
  IElementType TKDOT = new SppTokenType(".");
  IElementType TKEQ = new SppTokenType("==");
  IElementType TKEXP = new SppTokenType("**");
  IElementType TKEXPASSIGN = new SppTokenType("**=");
  IElementType TKGE = new SppTokenType(">=");
  IElementType TKGT = new SppTokenType(">");
  IElementType TKIS = new SppTokenType("TkIs");
  IElementType TKLE = new SppTokenType("<=");
  IElementType TKLOGICALAND = new SppTokenType("&&");
  IElementType TKLOGICALANDASSIGN = new SppTokenType("&&=");
  IElementType TKLOGICALOR = new SppTokenType("||");
  IElementType TKLOGICALORASSIGN = new SppTokenType("||=");
  IElementType TKLT = new SppTokenType("<");
  IElementType TKMOD = new SppTokenType("%%");
  IElementType TKMODASSIGN = new SppTokenType("%%=");
  IElementType TKMUL = new SppTokenType("*");
  IElementType TKMULASSIGN = new SppTokenType("*=");
  IElementType TKNE = new SppTokenType("!=");
  IElementType TKPARENL = new SppTokenType("(");
  IElementType TKPARENR = new SppTokenType(")");
  IElementType TKQST = new SppTokenType("?");
  IElementType TKREM = new SppTokenType("%");
  IElementType TKREMASSIGN = new SppTokenType("%=");
  IElementType TKSS = new SppTokenType("<=>");
  IElementType TKSUB = new SppTokenType("-");
  IElementType TKSUBASSIGN = new SppTokenType("-=");
  IElementType TKUNDERSCORE = new SppTokenType("_");
  IElementType TKVARIADIC = new SppTokenType("..");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNOTATION) {
        return new SppAnnotationImpl(node);
      }
      else if (type == ASSIGNMENT_STATEMENT) {
        return new SppAssignmentStatementImpl(node);
      }
      else if (type == BINARY_EXPRESSION_LEVEL_1) {
        return new SppBinaryExpressionLevel1Impl(node);
      }
      else if (type == BINARY_EXPRESSION_LEVEL_2) {
        return new SppBinaryExpressionLevel2Impl(node);
      }
      else if (type == BINARY_EXPRESSION_LEVEL_3) {
        return new SppBinaryExpressionLevel3Impl(node);
      }
      else if (type == BINARY_EXPRESSION_LEVEL_4) {
        return new SppBinaryExpressionLevel4Impl(node);
      }
      else if (type == BINARY_EXPRESSION_LEVEL_5) {
        return new SppBinaryExpressionLevel5Impl(node);
      }
      else if (type == BINARY_EXPRESSION_LEVEL_6) {
        return new SppBinaryExpressionLevel6Impl(node);
      }
      else if (type == BINARY_EXPRESSION_LEVEL_7) {
        return new SppBinaryExpressionLevel7Impl(node);
      }
      else if (type == BINARY_OP_PRECEDENCE_LEVEL_1) {
        return new SppBinaryOpPrecedenceLevel1Impl(node);
      }
      else if (type == BINARY_OP_PRECEDENCE_LEVEL_2) {
        return new SppBinaryOpPrecedenceLevel2Impl(node);
      }
      else if (type == BINARY_OP_PRECEDENCE_LEVEL_3) {
        return new SppBinaryOpPrecedenceLevel3Impl(node);
      }
      else if (type == BINARY_OP_PRECEDENCE_LEVEL_4) {
        return new SppBinaryOpPrecedenceLevel4Impl(node);
      }
      else if (type == BINARY_OP_PRECEDENCE_LEVEL_5) {
        return new SppBinaryOpPrecedenceLevel5Impl(node);
      }
      else if (type == BINARY_OP_PRECEDENCE_LEVEL_6) {
        return new SppBinaryOpPrecedenceLevel6Impl(node);
      }
      else if (type == BINARY_OP_PRECEDENCE_LEVEL_7) {
        return new SppBinaryOpPrecedenceLevel7Impl(node);
      }
      else if (type == CLASS_ATTRIBUTE) {
        return new SppClassAttributeImpl(node);
      }
      else if (type == CLASS_IMPLEMENTATION) {
        return new SppClassImplementationImpl(node);
      }
      else if (type == CLASS_MEMBER) {
        return new SppClassMemberImpl(node);
      }
      else if (type == CLASS_PROTOTYPE) {
        return new SppClassPrototypeImpl(node);
      }
      else if (type == CONVENTION) {
        return new SppConventionImpl(node);
      }
      else if (type == COROUTINE_PROTOTYPE) {
        return new SppCoroutinePrototypeImpl(node);
      }
      else if (type == EXPRESSION) {
        return new SppExpressionImpl(node);
      }
      else if (type == FUNCTION_CALL_ARGUMENT) {
        return new SppFunctionCallArgumentImpl(node);
      }
      else if (type == FUNCTION_CALL_ARGUMENTS) {
        return new SppFunctionCallArgumentsImpl(node);
      }
      else if (type == FUNCTION_CALL_ARGUMENT_NAMED) {
        return new SppFunctionCallArgumentNamedImpl(node);
      }
      else if (type == FUNCTION_CALL_ARGUMENT_NORMAL) {
        return new SppFunctionCallArgumentNormalImpl(node);
      }
      else if (type == FUNCTION_IMPLEMENTATION) {
        return new SppFunctionImplementationImpl(node);
      }
      else if (type == FUNCTION_PARAMETER) {
        return new SppFunctionParameterImpl(node);
      }
      else if (type == FUNCTION_PARAMETERS) {
        return new SppFunctionParametersImpl(node);
      }
      else if (type == FUNCTION_PARAMETER_OPTIONAL) {
        return new SppFunctionParameterOptionalImpl(node);
      }
      else if (type == FUNCTION_PARAMETER_REQUIRED) {
        return new SppFunctionParameterRequiredImpl(node);
      }
      else if (type == FUNCTION_PARAMETER_SELF) {
        return new SppFunctionParameterSelfImpl(node);
      }
      else if (type == FUNCTION_PARAMETER_VARIADIC) {
        return new SppFunctionParameterVariadicImpl(node);
      }
      else if (type == FUNCTION_PROTOTYPE) {
        return new SppFunctionPrototypeImpl(node);
      }
      else if (type == GENERIC_ARGUMENT) {
        return new SppGenericArgumentImpl(node);
      }
      else if (type == GENERIC_ARGUMENTS) {
        return new SppGenericArgumentsImpl(node);
      }
      else if (type == GENERIC_ARGUMENT_NAMED) {
        return new SppGenericArgumentNamedImpl(node);
      }
      else if (type == GENERIC_ARGUMENT_NORMAL) {
        return new SppGenericArgumentNormalImpl(node);
      }
      else if (type == GENERIC_IDENTIFIER) {
        return new SppGenericIdentifierImpl(node);
      }
      else if (type == GENERIC_INLINE_CONSTRAINTS) {
        return new SppGenericInlineConstraintsImpl(node);
      }
      else if (type == GENERIC_PARAMETER) {
        return new SppGenericParameterImpl(node);
      }
      else if (type == GENERIC_PARAMETERS) {
        return new SppGenericParametersImpl(node);
      }
      else if (type == GENERIC_PARAMETER_OPTIONAL) {
        return new SppGenericParameterOptionalImpl(node);
      }
      else if (type == GENERIC_PARAMETER_REQUIRED) {
        return new SppGenericParameterRequiredImpl(node);
      }
      else if (type == GENERIC_PARAMETER_VARIADIC) {
        return new SppGenericParameterVariadicImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new SppIdentifierImpl(node);
      }
      else if (type == IF_EXPRESSION) {
        return new SppIfExpressionImpl(node);
      }
      else if (type == INNER_SCOPE) {
        return new SppInnerScopeImpl(node);
      }
      else if (type == LAMBDA_CAPTURE_BLOCK) {
        return new SppLambdaCaptureBlockImpl(node);
      }
      else if (type == LAMBDA_CAPTURE_ITEM) {
        return new SppLambdaCaptureItemImpl(node);
      }
      else if (type == LAMBDA_CAPTURE_ITEM_NAMED) {
        return new SppLambdaCaptureItemNamedImpl(node);
      }
      else if (type == LAMBDA_CAPTURE_ITEM_NORMAL) {
        return new SppLambdaCaptureItemNormalImpl(node);
      }
      else if (type == LAMBDA_COROUTINE_PROTOTYPE) {
        return new SppLambdaCoroutinePrototypeImpl(node);
      }
      else if (type == LAMBDA_PROTOTYPE) {
        return new SppLambdaPrototypeImpl(node);
      }
      else if (type == LAMBDA_SUBROUTINE_PROTOTYPE) {
        return new SppLambdaSubroutinePrototypeImpl(node);
      }
      else if (type == LET_STATEMENT) {
        return new SppLetStatementImpl(node);
      }
      else if (type == LET_STATEMENT_INITIALIZED) {
        return new SppLetStatementInitializedImpl(node);
      }
      else if (type == LET_STATEMENT_UNINITIALIZED) {
        return new SppLetStatementUninitializedImpl(node);
      }
      else if (type == LITERAL) {
        return new SppLiteralImpl(node);
      }
      else if (type == LITERAL_BOOLEAN) {
        return new SppLiteralBooleanImpl(node);
      }
      else if (type == LITERAL_NUMBER) {
        return new SppLiteralNumberImpl(node);
      }
      else if (type == LITERAL_NUMBER_BASE_10) {
        return new SppLiteralNumberBase10Impl(node);
      }
      else if (type == LITERAL_NUMBER_BASE_10_FLOAT) {
        return new SppLiteralNumberBase10FloatImpl(node);
      }
      else if (type == LITERAL_NUMBER_BASE_10_INTEGER) {
        return new SppLiteralNumberBase10IntegerImpl(node);
      }
      else if (type == LITERAL_NUMBER_BASE_16) {
        return new SppLiteralNumberBase16Impl(node);
      }
      else if (type == LITERAL_NUMBER_BASE_2) {
        return new SppLiteralNumberBase2Impl(node);
      }
      else if (type == LITERAL_REGEX) {
        return new SppLiteralRegexImpl(node);
      }
      else if (type == LITERAL_STRING) {
        return new SppLiteralStringImpl(node);
      }
      else if (type == LITERAL_TUPLE) {
        return new SppLiteralTupleImpl(node);
      }
      else if (type == LITERAL_TUPLE_0_ITEMS) {
        return new SppLiteralTuple0ItemsImpl(node);
      }
      else if (type == LITERAL_TUPLE_1_ITEMS) {
        return new SppLiteralTuple1ItemsImpl(node);
      }
      else if (type == LITERAL_TUPLE_N_ITEMS) {
        return new SppLiteralTupleNItemsImpl(node);
      }
      else if (type == LOCAL_VARIABLE) {
        return new SppLocalVariableImpl(node);
      }
      else if (type == LOCAL_VARIABLE_ASSIGNMENT) {
        return new SppLocalVariableAssignmentImpl(node);
      }
      else if (type == LOCAL_VARIABLE_DESTRUCTURE) {
        return new SppLocalVariableDestructureImpl(node);
      }
      else if (type == LOCAL_VARIABLE_NESTED_FOR_DESTRUCTURE) {
        return new SppLocalVariableNestedForDestructureImpl(node);
      }
      else if (type == LOCAL_VARIABLE_NESTED_FOR_TUPLE) {
        return new SppLocalVariableNestedForTupleImpl(node);
      }
      else if (type == LOCAL_VARIABLE_NON_ASSIGNMENT) {
        return new SppLocalVariableNonAssignmentImpl(node);
      }
      else if (type == LOCAL_VARIABLE_SINGLE) {
        return new SppLocalVariableSingleImpl(node);
      }
      else if (type == LOCAL_VARIABLE_SKIP_ARGUMENT) {
        return new SppLocalVariableSkipArgumentImpl(node);
      }
      else if (type == LOCAL_VARIABLE_TUPLE) {
        return new SppLocalVariableTupleImpl(node);
      }
      else if (type == MODULE_IDENTIFIER) {
        return new SppModuleIdentifierImpl(node);
      }
      else if (type == MODULE_IMPLEMENTATION) {
        return new SppModuleImplementationImpl(node);
      }
      else if (type == MODULE_MEMBER) {
        return new SppModuleMemberImpl(node);
      }
      else if (type == MODULE_PROTOTYPE) {
        return new SppModulePrototypeImpl(node);
      }
      else if (type == NUMERIC_POSTFIX_OP) {
        return new SppNumericPostfixOpImpl(node);
      }
      else if (type == NUMERIC_PREFIX_OP) {
        return new SppNumericPrefixOpImpl(node);
      }
      else if (type == OBJECT_INITIALIZATION) {
        return new SppObjectInitializationImpl(node);
      }
      else if (type == OBJECT_INITIALIZER_ARGUMENT) {
        return new SppObjectInitializerArgumentImpl(node);
      }
      else if (type == OBJECT_INITIALIZER_ARGUMENTS) {
        return new SppObjectInitializerArgumentsImpl(node);
      }
      else if (type == OBJECT_INITIALIZER_ARGUMENT_NAMED) {
        return new SppObjectInitializerArgumentNamedImpl(node);
      }
      else if (type == OBJECT_INITIALIZER_ARGUMENT_NAMED_KEY) {
        return new SppObjectInitializerArgumentNamedKeyImpl(node);
      }
      else if (type == OBJECT_INITIALIZER_ARGUMENT_NORMAL) {
        return new SppObjectInitializerArgumentNormalImpl(node);
      }
      else if (type == PARENTHESIZED_EXPRESSION) {
        return new SppParenthesizedExpressionImpl(node);
      }
      else if (type == PATTERN_COMP_OP) {
        return new SppPatternCompOpImpl(node);
      }
      else if (type == PATTERN_GUARD) {
        return new SppPatternGuardImpl(node);
      }
      else if (type == PATTERN_STATEMENT) {
        return new SppPatternStatementImpl(node);
      }
      else if (type == PATTERN_VARIANT) {
        return new SppPatternVariantImpl(node);
      }
      else if (type == PATTERN_VARIANT_ASSIGNMENT) {
        return new SppPatternVariantAssignmentImpl(node);
      }
      else if (type == PATTERN_VARIANT_DESTRUCTURE) {
        return new SppPatternVariantDestructureImpl(node);
      }
      else if (type == PATTERN_VARIANT_ELSE) {
        return new SppPatternVariantElseImpl(node);
      }
      else if (type == PATTERN_VARIANT_LITERAL) {
        return new SppPatternVariantLiteralImpl(node);
      }
      else if (type == PATTERN_VARIANT_NESTED_FOR_DESTRUCTURE) {
        return new SppPatternVariantNestedForDestructureImpl(node);
      }
      else if (type == PATTERN_VARIANT_NESTED_FOR_NON_ASSIGNMENT) {
        return new SppPatternVariantNestedForNonAssignmentImpl(node);
      }
      else if (type == PATTERN_VARIANT_NESTED_FOR_TUPLE) {
        return new SppPatternVariantNestedForTupleImpl(node);
      }
      else if (type == PATTERN_VARIANT_SKIP_ARGUMENT) {
        return new SppPatternVariantSkipArgumentImpl(node);
      }
      else if (type == PATTERN_VARIANT_TUPLE) {
        return new SppPatternVariantTupleImpl(node);
      }
      else if (type == PATTERN_VARIANT_VARIABLE) {
        return new SppPatternVariantVariableImpl(node);
      }
      else if (type == POSTFIX_EXPRESSION) {
        return new SppPostfixExpressionImpl(node);
      }
      else if (type == POSTFIX_IDENTIFIER) {
        return new SppPostfixIdentifierImpl(node);
      }
      else if (type == POSTFIX_OP) {
        return new SppPostfixOpImpl(node);
      }
      else if (type == POSTFIX_OP_EARLY_RETURN) {
        return new SppPostfixOpEarlyReturnImpl(node);
      }
      else if (type == POSTFIX_OP_FUNCTION_CALL) {
        return new SppPostfixOpFunctionCallImpl(node);
      }
      else if (type == POSTFIX_OP_MEMBER_ACCESS) {
        return new SppPostfixOpMemberAccessImpl(node);
      }
      else if (type == POSTFIX_OP_MEMBER_ACCESS_RUNTIME) {
        return new SppPostfixOpMemberAccessRuntimeImpl(node);
      }
      else if (type == POSTFIX_OP_MEMBER_ACCESS_STATIC) {
        return new SppPostfixOpMemberAccessStaticImpl(node);
      }
      else if (type == PRIMARY_EXPRESSION) {
        return new SppPrimaryExpressionImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new SppReturnStatementImpl(node);
      }
      else if (type == SELF_KEYWORD) {
        return new SppSelfKeywordImpl(node);
      }
      else if (type == SELF_TYPE) {
        return new SppSelfTypeImpl(node);
      }
      else if (type == STATEMENT) {
        return new SppStatementImpl(node);
      }
      else if (type == SUBROUTINE_PROTOTYPE) {
        return new SppSubroutinePrototypeImpl(node);
      }
      else if (type == SUP_IMPLEMENTATION) {
        return new SppSupImplementationImpl(node);
      }
      else if (type == SUP_MEMBER) {
        return new SppSupMemberImpl(node);
      }
      else if (type == SUP_METHOD_PROTOTYPE) {
        return new SppSupMethodPrototypeImpl(node);
      }
      else if (type == SUP_PROTOTYPE_INHERITANCE) {
        return new SppSupPrototypeInheritanceImpl(node);
      }
      else if (type == SUP_PROTOTYPE_NORMAL) {
        return new SppSupPrototypeNormalImpl(node);
      }
      else if (type == SUP_TYPEDEF) {
        return new SppSupTypedefImpl(node);
      }
      else if (type == TYPE) {
        return new SppTypeImpl(node);
      }
      else if (type == TYPEDEF_ITEM) {
        return new SppTypedefItemImpl(node);
      }
      else if (type == TYPEDEF_STATEMENT) {
        return new SppTypedefStatementImpl(node);
      }
      else if (type == TYPEDEF_STATEMENT_ALL_ITEMS) {
        return new SppTypedefStatementAllItemsImpl(node);
      }
      else if (type == TYPEDEF_STATEMENT_SPECIFIC_ITEM) {
        return new SppTypedefStatementSpecificItemImpl(node);
      }
      else if (type == TYPEDEF_STATEMENT_SPECIFIC_ITEMS) {
        return new SppTypedefStatementSpecificItemsImpl(node);
      }
      else if (type == TYPEDEF_STATEMENT_SPECIFIC_ITEM_ALIAS) {
        return new SppTypedefStatementSpecificItemAliasImpl(node);
      }
      else if (type == TYPE_NAMESPACE) {
        return new SppTypeNamespaceImpl(node);
      }
      else if (type == TYPE_NON_UNION) {
        return new SppTypeNonUnionImpl(node);
      }
      else if (type == TYPE_OPTIONAL) {
        return new SppTypeOptionalImpl(node);
      }
      else if (type == TYPE_PART) {
        return new SppTypePartImpl(node);
      }
      else if (type == TYPE_PARTS) {
        return new SppTypePartsImpl(node);
      }
      else if (type == TYPE_PART_FIRST) {
        return new SppTypePartFirstImpl(node);
      }
      else if (type == TYPE_SINGLE) {
        return new SppTypeSingleImpl(node);
      }
      else if (type == TYPE_TUPLE) {
        return new SppTypeTupleImpl(node);
      }
      else if (type == TYPE_UNION) {
        return new SppTypeUnionImpl(node);
      }
      else if (type == UNARY_EXPRESSION) {
        return new SppUnaryExpressionImpl(node);
      }
      else if (type == UNARY_OP) {
        return new SppUnaryOpImpl(node);
      }
      else if (type == UPPER_IDENTIFIER) {
        return new SppUpperIdentifierImpl(node);
      }
      else if (type == WHERE_BLOCK) {
        return new SppWhereBlockImpl(node);
      }
      else if (type == WHERE_BLOCK_CONSTRAINTS) {
        return new SppWhereBlockConstraintsImpl(node);
      }
      else if (type == WHERE_BLOCK_CONSTRAINTS_GROUP) {
        return new SppWhereBlockConstraintsGroupImpl(node);
      }
      else if (type == WHILE_ELSE_EXPRESSION) {
        return new SppWhileElseExpressionImpl(node);
      }
      else if (type == WHILE_EXPRESSION) {
        return new SppWhileExpressionImpl(node);
      }
      else if (type == WITH_EXPRESSION) {
        return new SppWithExpressionImpl(node);
      }
      else if (type == WITH_EXPRESSION_LHS_ALIAS) {
        return new SppWithExpressionLhsAliasImpl(node);
      }
      else if (type == YIELD_EXPRESSION) {
        return new SppYieldExpressionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
