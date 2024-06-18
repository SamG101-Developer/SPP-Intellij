// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.intellij.sdk.language.psi.SppTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SppParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Program(b, l + 1);
  }

  /* ********************************************************** */
  // TkAt Identifier (TkDblColon Identifier)* PostfixOpFunctionCall
  public static boolean Annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Annotation")) return false;
    if (!nextTokenIs(b, TKAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKAT);
    r = r && Identifier(b, l + 1);
    r = r && Annotation_2(b, l + 1);
    r = r && PostfixOpFunctionCall(b, l + 1);
    exit_section_(b, m, ANNOTATION, r);
    return r;
  }

  // (TkDblColon Identifier)*
  private static boolean Annotation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Annotation_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Annotation_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Annotation_2", c)) break;
    }
    return true;
  }

  // TkDblColon Identifier
  private static boolean Annotation_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Annotation_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKDBLCOLON);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression+ TkAssign Expression
  public static boolean AssignmentStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_STATEMENT, "<assignment statement>");
    r = AssignmentStatement_0(b, l + 1);
    r = r && consumeToken(b, TKASSIGN);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Expression+
  private static boolean AssignmentStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssignmentStatement_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BinaryExpressionLevel2 (BinaryOpPrecedenceLevel1 BinaryExpressionLevel1)*
  public static boolean BinaryExpressionLevel1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_EXPRESSION_LEVEL_1, "<binary expression level 1>");
    r = BinaryExpressionLevel2(b, l + 1);
    r = r && BinaryExpressionLevel1_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BinaryOpPrecedenceLevel1 BinaryExpressionLevel1)*
  private static boolean BinaryExpressionLevel1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BinaryExpressionLevel1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BinaryExpressionLevel1_1", c)) break;
    }
    return true;
  }

  // BinaryOpPrecedenceLevel1 BinaryExpressionLevel1
  private static boolean BinaryExpressionLevel1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BinaryOpPrecedenceLevel1(b, l + 1);
    r = r && BinaryExpressionLevel1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BinaryExpressionLevel3 (BinaryOpPrecedenceLevel2 BinaryExpressionLevel2)*
  public static boolean BinaryExpressionLevel2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_EXPRESSION_LEVEL_2, "<binary expression level 2>");
    r = BinaryExpressionLevel3(b, l + 1);
    r = r && BinaryExpressionLevel2_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BinaryOpPrecedenceLevel2 BinaryExpressionLevel2)*
  private static boolean BinaryExpressionLevel2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BinaryExpressionLevel2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BinaryExpressionLevel2_1", c)) break;
    }
    return true;
  }

  // BinaryOpPrecedenceLevel2 BinaryExpressionLevel2
  private static boolean BinaryExpressionLevel2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BinaryOpPrecedenceLevel2(b, l + 1);
    r = r && BinaryExpressionLevel2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BinaryExpressionLevel4 (BinaryOpPrecedenceLevel3 BinaryExpressionLevel3)*
  public static boolean BinaryExpressionLevel3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel3")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_EXPRESSION_LEVEL_3, "<binary expression level 3>");
    r = BinaryExpressionLevel4(b, l + 1);
    r = r && BinaryExpressionLevel3_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BinaryOpPrecedenceLevel3 BinaryExpressionLevel3)*
  private static boolean BinaryExpressionLevel3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BinaryExpressionLevel3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BinaryExpressionLevel3_1", c)) break;
    }
    return true;
  }

  // BinaryOpPrecedenceLevel3 BinaryExpressionLevel3
  private static boolean BinaryExpressionLevel3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BinaryOpPrecedenceLevel3(b, l + 1);
    r = r && BinaryExpressionLevel3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BinaryExpressionLevel5 (BinaryOpPrecedenceLevel4 BinaryExpressionLevel4)*
  public static boolean BinaryExpressionLevel4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel4")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_EXPRESSION_LEVEL_4, "<binary expression level 4>");
    r = BinaryExpressionLevel5(b, l + 1);
    r = r && BinaryExpressionLevel4_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BinaryOpPrecedenceLevel4 BinaryExpressionLevel4)*
  private static boolean BinaryExpressionLevel4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel4_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BinaryExpressionLevel4_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BinaryExpressionLevel4_1", c)) break;
    }
    return true;
  }

  // BinaryOpPrecedenceLevel4 BinaryExpressionLevel4
  private static boolean BinaryExpressionLevel4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel4_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BinaryOpPrecedenceLevel4(b, l + 1);
    r = r && BinaryExpressionLevel4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BinaryExpressionLevel6 (BinaryOpPrecedenceLevel5 BinaryExpressionLevel5)*
  public static boolean BinaryExpressionLevel5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel5")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_EXPRESSION_LEVEL_5, "<binary expression level 5>");
    r = BinaryExpressionLevel6(b, l + 1);
    r = r && BinaryExpressionLevel5_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BinaryOpPrecedenceLevel5 BinaryExpressionLevel5)*
  private static boolean BinaryExpressionLevel5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel5_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BinaryExpressionLevel5_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BinaryExpressionLevel5_1", c)) break;
    }
    return true;
  }

  // BinaryOpPrecedenceLevel5 BinaryExpressionLevel5
  private static boolean BinaryExpressionLevel5_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel5_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BinaryOpPrecedenceLevel5(b, l + 1);
    r = r && BinaryExpressionLevel5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BinaryExpressionLevel7 (BinaryOpPrecedenceLevel6 BinaryExpressionLevel6)*
  public static boolean BinaryExpressionLevel6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel6")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_EXPRESSION_LEVEL_6, "<binary expression level 6>");
    r = BinaryExpressionLevel7(b, l + 1);
    r = r && BinaryExpressionLevel6_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BinaryOpPrecedenceLevel6 BinaryExpressionLevel6)*
  private static boolean BinaryExpressionLevel6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel6_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BinaryExpressionLevel6_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BinaryExpressionLevel6_1", c)) break;
    }
    return true;
  }

  // BinaryOpPrecedenceLevel6 BinaryExpressionLevel6
  private static boolean BinaryExpressionLevel6_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel6_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BinaryOpPrecedenceLevel6(b, l + 1);
    r = r && BinaryExpressionLevel6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UnaryExpression (BinaryOpPrecedenceLevel7 BinaryExpressionLevel7)*
  public static boolean BinaryExpressionLevel7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel7")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_EXPRESSION_LEVEL_7, "<binary expression level 7>");
    r = UnaryExpression(b, l + 1);
    r = r && BinaryExpressionLevel7_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BinaryOpPrecedenceLevel7 BinaryExpressionLevel7)*
  private static boolean BinaryExpressionLevel7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel7_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BinaryExpressionLevel7_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BinaryExpressionLevel7_1", c)) break;
    }
    return true;
  }

  // BinaryOpPrecedenceLevel7 BinaryExpressionLevel7
  private static boolean BinaryExpressionLevel7_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryExpressionLevel7_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BinaryOpPrecedenceLevel7(b, l + 1);
    r = r && BinaryExpressionLevel7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TkCoalesce
  public static boolean BinaryOpPrecedenceLevel1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOpPrecedenceLevel1")) return false;
    if (!nextTokenIs(b, TKCOALESCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOALESCE);
    exit_section_(b, m, BINARY_OP_PRECEDENCE_LEVEL_1, r);
    return r;
  }

  /* ********************************************************** */
  // TkLogicalOr | TkLogicalOrAssign
  public static boolean BinaryOpPrecedenceLevel2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOpPrecedenceLevel2")) return false;
    if (!nextTokenIs(b, "<binary op precedence level 2>", TKLOGICALOR, TKLOGICALORASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OP_PRECEDENCE_LEVEL_2, "<binary op precedence level 2>");
    r = consumeToken(b, TKLOGICALOR);
    if (!r) r = consumeToken(b, TKLOGICALORASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkLogicalAnd | TkLogicalAndAssign
  public static boolean BinaryOpPrecedenceLevel3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOpPrecedenceLevel3")) return false;
    if (!nextTokenIs(b, "<binary op precedence level 3>", TKLOGICALAND, TKLOGICALANDASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OP_PRECEDENCE_LEVEL_3, "<binary op precedence level 3>");
    r = consumeToken(b, TKLOGICALAND);
    if (!r) r = consumeToken(b, TKLOGICALANDASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkEq | TkNe | TkLe | TkGe | TkLt | TkGt | TkSs | TkIs
  public static boolean BinaryOpPrecedenceLevel4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOpPrecedenceLevel4")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OP_PRECEDENCE_LEVEL_4, "<binary op precedence level 4>");
    r = consumeToken(b, TKEQ);
    if (!r) r = consumeToken(b, TKNE);
    if (!r) r = consumeToken(b, TKLE);
    if (!r) r = consumeToken(b, TKGE);
    if (!r) r = consumeToken(b, TKLT);
    if (!r) r = consumeToken(b, TKGT);
    if (!r) r = consumeToken(b, TKSS);
    if (!r) r = consumeToken(b, TKIS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkBitShiftL | TkBitShiftR | TkBitRotateL | TkBitRotateR | TkBitShiftLAssign | TkBitShiftRAssign | TkBitRotateLAssign | TkBitRotateRAssign
  public static boolean BinaryOpPrecedenceLevel5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOpPrecedenceLevel5")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OP_PRECEDENCE_LEVEL_5, "<binary op precedence level 5>");
    r = consumeToken(b, TKBITSHIFTL);
    if (!r) r = consumeToken(b, TKBITSHIFTR);
    if (!r) r = consumeToken(b, TKBITROTATEL);
    if (!r) r = consumeToken(b, TKBITROTATER);
    if (!r) r = consumeToken(b, TKBITSHIFTLASSIGN);
    if (!r) r = consumeToken(b, TKBITSHIFTRASSIGN);
    if (!r) r = consumeToken(b, TKBITROTATELASSIGN);
    if (!r) r = consumeToken(b, TKBITROTATERASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkBitOr | TkBitXor | TkAdd | TkSub | TkBitOrAssign | TkBitXorAssign | TkAddAssign | TkSubAssign
  public static boolean BinaryOpPrecedenceLevel6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOpPrecedenceLevel6")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OP_PRECEDENCE_LEVEL_6, "<binary op precedence level 6>");
    r = consumeToken(b, TKBITOR);
    if (!r) r = consumeToken(b, TKBITXOR);
    if (!r) r = consumeToken(b, TKADD);
    if (!r) r = consumeToken(b, TKSUB);
    if (!r) r = consumeToken(b, TKBITORASSIGN);
    if (!r) r = consumeToken(b, TKBITXORASSIGN);
    if (!r) r = consumeToken(b, TKADDASSIGN);
    if (!r) r = consumeToken(b, TKSUBASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkBitAnd | TkMul | TkDiv | TkRem | TkMod | TkExp | TkBitAndAssign | TkMulAssign | TkDivAssign | TkRemAssign | TkModAssign | TkExpAssign
  public static boolean BinaryOpPrecedenceLevel7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinaryOpPrecedenceLevel7")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OP_PRECEDENCE_LEVEL_7, "<binary op precedence level 7>");
    r = consumeToken(b, TKBITAND);
    if (!r) r = consumeToken(b, TKMUL);
    if (!r) r = consumeToken(b, TKDIV);
    if (!r) r = consumeToken(b, TKREM);
    if (!r) r = consumeToken(b, TKMOD);
    if (!r) r = consumeToken(b, TKEXP);
    if (!r) r = consumeToken(b, TKBITANDASSIGN);
    if (!r) r = consumeToken(b, TKMULASSIGN);
    if (!r) r = consumeToken(b, TKDIVASSIGN);
    if (!r) r = consumeToken(b, TKREMASSIGN);
    if (!r) r = consumeToken(b, TKMODASSIGN);
    if (!r) r = consumeToken(b, TKEXPASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Annotation* Identifier TkColon Type
  public static boolean ClassAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassAttribute")) return false;
    if (!nextTokenIs(b, "<class attribute>", LXIDENTIFIER, TKAT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_ATTRIBUTE, "<class attribute>");
    r = ClassAttribute_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, TKCOLON);
    r = r && Type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Annotation*
  private static boolean ClassAttribute_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassAttribute_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassAttribute_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TkBraceL ClassMember* TkBraceR
  public static boolean ClassImplementation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassImplementation")) return false;
    if (!nextTokenIs(b, TKBRACEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKBRACEL);
    r = r && ClassImplementation_1(b, l + 1);
    r = r && consumeToken(b, TKBRACER);
    exit_section_(b, m, CLASS_IMPLEMENTATION, r);
    return r;
  }

  // ClassMember*
  private static boolean ClassImplementation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassImplementation_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ClassMember(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassImplementation_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ClassAttribute
  public static boolean ClassMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassMember")) return false;
    if (!nextTokenIs(b, "<class member>", LXIDENTIFIER, TKAT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MEMBER, "<class member>");
    r = ClassAttribute(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Annotation* KwCls UpperIdentifier GenericParameters? WhereBlock? ClassImplementation
  public static boolean ClassPrototype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassPrototype")) return false;
    if (!nextTokenIs(b, "<class prototype>", KWCLS, TKAT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_PROTOTYPE, "<class prototype>");
    r = ClassPrototype_0(b, l + 1);
    r = r && consumeToken(b, KWCLS);
    r = r && UpperIdentifier(b, l + 1);
    r = r && ClassPrototype_3(b, l + 1);
    r = r && ClassPrototype_4(b, l + 1);
    r = r && ClassImplementation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Annotation*
  private static boolean ClassPrototype_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassPrototype_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassPrototype_0", c)) break;
    }
    return true;
  }

  // GenericParameters?
  private static boolean ClassPrototype_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassPrototype_3")) return false;
    GenericParameters(b, l + 1);
    return true;
  }

  // WhereBlock?
  private static boolean ClassPrototype_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassPrototype_4")) return false;
    WhereBlock(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (TkBitAnd KwMut?)?
  public static boolean Convention(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Convention")) return false;
    Marker m = enter_section_(b, l, _NONE_, CONVENTION, "<convention>");
    Convention_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // TkBitAnd KwMut?
  private static boolean Convention_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Convention_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKBITAND);
    r = r && Convention_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KwMut?
  private static boolean Convention_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Convention_0_1")) return false;
    consumeToken(b, KWMUT);
    return true;
  }

  /* ********************************************************** */
  // Annotation* KwCor Identifier GenericParameters? FunctionParameters TkArrowR Type WhereBlock? FunctionImplementation
  public static boolean CoroutinePrototype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CoroutinePrototype")) return false;
    if (!nextTokenIs(b, "<coroutine prototype>", KWCOR, TKAT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COROUTINE_PROTOTYPE, "<coroutine prototype>");
    r = CoroutinePrototype_0(b, l + 1);
    r = r && consumeToken(b, KWCOR);
    r = r && Identifier(b, l + 1);
    r = r && CoroutinePrototype_3(b, l + 1);
    r = r && FunctionParameters(b, l + 1);
    r = r && consumeToken(b, TKARROWR);
    r = r && Type(b, l + 1);
    r = r && CoroutinePrototype_7(b, l + 1);
    r = r && FunctionImplementation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Annotation*
  private static boolean CoroutinePrototype_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CoroutinePrototype_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CoroutinePrototype_0", c)) break;
    }
    return true;
  }

  // GenericParameters?
  private static boolean CoroutinePrototype_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CoroutinePrototype_3")) return false;
    GenericParameters(b, l + 1);
    return true;
  }

  // WhereBlock?
  private static boolean CoroutinePrototype_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CoroutinePrototype_7")) return false;
    WhereBlock(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BinaryExpressionLevel1
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = BinaryExpressionLevel1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FunctionCallArgumentNamed | FunctionCallArgumentNormal
  public static boolean FunctionCallArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL_ARGUMENT, "<function call argument>");
    r = FunctionCallArgumentNamed(b, l + 1);
    if (!r) r = FunctionCallArgumentNormal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Identifier TkAssign Convention TkVariadic? Expression
  public static boolean FunctionCallArgumentNamed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArgumentNamed")) return false;
    if (!nextTokenIs(b, LXIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, TKASSIGN);
    r = r && Convention(b, l + 1);
    r = r && FunctionCallArgumentNamed_3(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, FUNCTION_CALL_ARGUMENT_NAMED, r);
    return r;
  }

  // TkVariadic?
  private static boolean FunctionCallArgumentNamed_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArgumentNamed_3")) return false;
    consumeToken(b, TKVARIADIC);
    return true;
  }

  /* ********************************************************** */
  // Convention TkVariadic? Expression
  public static boolean FunctionCallArgumentNormal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArgumentNormal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL_ARGUMENT_NORMAL, "<function call argument normal>");
    r = Convention(b, l + 1);
    r = r && FunctionCallArgumentNormal_1(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TkVariadic?
  private static boolean FunctionCallArgumentNormal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArgumentNormal_1")) return false;
    consumeToken(b, TKVARIADIC);
    return true;
  }

  /* ********************************************************** */
  // TkParenL (FunctionCallArgument (TkComma FunctionCallArgument)*)? TkParenR
  public static boolean FunctionCallArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKPARENL);
    r = r && FunctionCallArguments_1(b, l + 1);
    r = r && consumeToken(b, TKPARENR);
    exit_section_(b, m, FUNCTION_CALL_ARGUMENTS, r);
    return r;
  }

  // (FunctionCallArgument (TkComma FunctionCallArgument)*)?
  private static boolean FunctionCallArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments_1")) return false;
    FunctionCallArguments_1_0(b, l + 1);
    return true;
  }

  // FunctionCallArgument (TkComma FunctionCallArgument)*
  private static boolean FunctionCallArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCallArgument(b, l + 1);
    r = r && FunctionCallArguments_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma FunctionCallArgument)*
  private static boolean FunctionCallArguments_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionCallArguments_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionCallArguments_1_0_1", c)) break;
    }
    return true;
  }

  // TkComma FunctionCallArgument
  private static boolean FunctionCallArguments_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallArguments_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && FunctionCallArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // InnerScope
  public static boolean FunctionImplementation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionImplementation")) return false;
    if (!nextTokenIs(b, TKBRACEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InnerScope(b, l + 1);
    exit_section_(b, m, FUNCTION_IMPLEMENTATION, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionParameterVariadic | FunctionParameterOptional | FunctionParameterRequired | FunctionParameterSelf
  public static boolean FunctionParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETER, "<function parameter>");
    r = FunctionParameterVariadic(b, l + 1);
    if (!r) r = FunctionParameterOptional(b, l + 1);
    if (!r) r = FunctionParameterRequired(b, l + 1);
    if (!r) r = FunctionParameterSelf(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LocalVariable TkColon Convention Type TkAssign Expression
  public static boolean FunctionParameterOptional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameterOptional")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETER_OPTIONAL, "<function parameter optional>");
    r = LocalVariable(b, l + 1);
    r = r && consumeToken(b, TKCOLON);
    r = r && Convention(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, TKASSIGN);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LocalVariable TkColon Convention Type
  public static boolean FunctionParameterRequired(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameterRequired")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETER_REQUIRED, "<function parameter required>");
    r = LocalVariable(b, l + 1);
    r = r && consumeToken(b, TKCOLON);
    r = r && Convention(b, l + 1);
    r = r && Type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KwMut? Convention KwSelf
  public static boolean FunctionParameterSelf(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameterSelf")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETER_SELF, "<function parameter self>");
    r = FunctionParameterSelf_0(b, l + 1);
    r = r && Convention(b, l + 1);
    r = r && consumeToken(b, KWSELF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KwMut?
  private static boolean FunctionParameterSelf_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameterSelf_0")) return false;
    consumeToken(b, KWMUT);
    return true;
  }

  /* ********************************************************** */
  // LocalVariable TkColon Convention TkVariadic Type
  public static boolean FunctionParameterVariadic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameterVariadic")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETER_VARIADIC, "<function parameter variadic>");
    r = LocalVariable(b, l + 1);
    r = r && consumeToken(b, TKCOLON);
    r = r && Convention(b, l + 1);
    r = r && consumeToken(b, TKVARIADIC);
    r = r && Type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkParenL (FunctionParameter (TkComma FunctionParameter)*)? TkParenR
  public static boolean FunctionParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKPARENL);
    r = r && FunctionParameters_1(b, l + 1);
    r = r && consumeToken(b, TKPARENR);
    exit_section_(b, m, FUNCTION_PARAMETERS, r);
    return r;
  }

  // (FunctionParameter (TkComma FunctionParameter)*)?
  private static boolean FunctionParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1")) return false;
    FunctionParameters_1_0(b, l + 1);
    return true;
  }

  // FunctionParameter (TkComma FunctionParameter)*
  private static boolean FunctionParameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionParameter(b, l + 1);
    r = r && FunctionParameters_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma FunctionParameter)*
  private static boolean FunctionParameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionParameters_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionParameters_1_0_1", c)) break;
    }
    return true;
  }

  // TkComma FunctionParameter
  private static boolean FunctionParameters_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionParameters_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && FunctionParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CoroutinePrototype | SubroutinePrototype
  public static boolean FunctionPrototype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionPrototype")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PROTOTYPE, "<function prototype>");
    r = CoroutinePrototype(b, l + 1);
    if (!r) r = SubroutinePrototype(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // GenericArgumentNamed | GenericArgumentNormal
  public static boolean GenericArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_ARGUMENT, "<generic argument>");
    r = GenericArgumentNamed(b, l + 1);
    if (!r) r = GenericArgumentNormal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // UpperIdentifier TkAssign Type
  public static boolean GenericArgumentNamed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericArgumentNamed")) return false;
    if (!nextTokenIs(b, LXUPPERIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UpperIdentifier(b, l + 1);
    r = r && consumeToken(b, TKASSIGN);
    r = r && Type(b, l + 1);
    exit_section_(b, m, GENERIC_ARGUMENT_NAMED, r);
    return r;
  }

  /* ********************************************************** */
  // Type
  public static boolean GenericArgumentNormal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericArgumentNormal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_ARGUMENT_NORMAL, "<generic argument normal>");
    r = Type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkBrackL (GenericArgument (TkComma GenericArgument)*)? TkBrackR
  public static boolean GenericArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericArguments")) return false;
    if (!nextTokenIs(b, TKBRACKL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKBRACKL);
    r = r && GenericArguments_1(b, l + 1);
    r = r && consumeToken(b, TKBRACKR);
    exit_section_(b, m, GENERIC_ARGUMENTS, r);
    return r;
  }

  // (GenericArgument (TkComma GenericArgument)*)?
  private static boolean GenericArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericArguments_1")) return false;
    GenericArguments_1_0(b, l + 1);
    return true;
  }

  // GenericArgument (TkComma GenericArgument)*
  private static boolean GenericArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericArgument(b, l + 1);
    r = r && GenericArguments_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma GenericArgument)*
  private static boolean GenericArguments_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericArguments_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!GenericArguments_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GenericArguments_1_0_1", c)) break;
    }
    return true;
  }

  // TkComma GenericArgument
  private static boolean GenericArguments_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericArguments_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && GenericArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UpperIdentifier GenericArguments?
  public static boolean GenericIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericIdentifier")) return false;
    if (!nextTokenIs(b, LXUPPERIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UpperIdentifier(b, l + 1);
    r = r && GenericIdentifier_1(b, l + 1);
    exit_section_(b, m, GENERIC_IDENTIFIER, r);
    return r;
  }

  // GenericArguments?
  private static boolean GenericIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericIdentifier_1")) return false;
    GenericArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TkColon (Type (TkBitAnd Type)*)?
  public static boolean GenericInlineConstraints(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericInlineConstraints")) return false;
    if (!nextTokenIs(b, TKCOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOLON);
    r = r && GenericInlineConstraints_1(b, l + 1);
    exit_section_(b, m, GENERIC_INLINE_CONSTRAINTS, r);
    return r;
  }

  // (Type (TkBitAnd Type)*)?
  private static boolean GenericInlineConstraints_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericInlineConstraints_1")) return false;
    GenericInlineConstraints_1_0(b, l + 1);
    return true;
  }

  // Type (TkBitAnd Type)*
  private static boolean GenericInlineConstraints_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericInlineConstraints_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    r = r && GenericInlineConstraints_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkBitAnd Type)*
  private static boolean GenericInlineConstraints_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericInlineConstraints_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!GenericInlineConstraints_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GenericInlineConstraints_1_0_1", c)) break;
    }
    return true;
  }

  // TkBitAnd Type
  private static boolean GenericInlineConstraints_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericInlineConstraints_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKBITAND);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GenericParameterVariadic | GenericParameterOptional | GenericParameterRequired
  public static boolean GenericParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameter")) return false;
    if (!nextTokenIs(b, "<generic parameter>", LXUPPERIDENTIFIER, TKVARIADIC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_PARAMETER, "<generic parameter>");
    r = GenericParameterVariadic(b, l + 1);
    if (!r) r = GenericParameterOptional(b, l + 1);
    if (!r) r = GenericParameterRequired(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // UpperIdentifier GenericInlineConstraints? TkAssign Type
  public static boolean GenericParameterOptional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameterOptional")) return false;
    if (!nextTokenIs(b, LXUPPERIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UpperIdentifier(b, l + 1);
    r = r && GenericParameterOptional_1(b, l + 1);
    r = r && consumeToken(b, TKASSIGN);
    r = r && Type(b, l + 1);
    exit_section_(b, m, GENERIC_PARAMETER_OPTIONAL, r);
    return r;
  }

  // GenericInlineConstraints?
  private static boolean GenericParameterOptional_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameterOptional_1")) return false;
    GenericInlineConstraints(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // UpperIdentifier GenericInlineConstraints?
  public static boolean GenericParameterRequired(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameterRequired")) return false;
    if (!nextTokenIs(b, LXUPPERIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UpperIdentifier(b, l + 1);
    r = r && GenericParameterRequired_1(b, l + 1);
    exit_section_(b, m, GENERIC_PARAMETER_REQUIRED, r);
    return r;
  }

  // GenericInlineConstraints?
  private static boolean GenericParameterRequired_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameterRequired_1")) return false;
    GenericInlineConstraints(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TkVariadic UpperIdentifier GenericInlineConstraints?
  public static boolean GenericParameterVariadic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameterVariadic")) return false;
    if (!nextTokenIs(b, TKVARIADIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKVARIADIC);
    r = r && UpperIdentifier(b, l + 1);
    r = r && GenericParameterVariadic_2(b, l + 1);
    exit_section_(b, m, GENERIC_PARAMETER_VARIADIC, r);
    return r;
  }

  // GenericInlineConstraints?
  private static boolean GenericParameterVariadic_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameterVariadic_2")) return false;
    GenericInlineConstraints(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TkBrackL (GenericParameter (TkComma GenericParameter)*)? TkBrackR
  public static boolean GenericParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters")) return false;
    if (!nextTokenIs(b, TKBRACKL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKBRACKL);
    r = r && GenericParameters_1(b, l + 1);
    r = r && consumeToken(b, TKBRACKR);
    exit_section_(b, m, GENERIC_PARAMETERS, r);
    return r;
  }

  // (GenericParameter (TkComma GenericParameter)*)?
  private static boolean GenericParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_1")) return false;
    GenericParameters_1_0(b, l + 1);
    return true;
  }

  // GenericParameter (TkComma GenericParameter)*
  private static boolean GenericParameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameter(b, l + 1);
    r = r && GenericParameters_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma GenericParameter)*
  private static boolean GenericParameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!GenericParameters_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GenericParameters_1_0_1", c)) break;
    }
    return true;
  }

  // TkComma GenericParameter
  private static boolean GenericParameters_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && GenericParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LxIdentifier
  public static boolean Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier")) return false;
    if (!nextTokenIs(b, LXIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LXIDENTIFIER);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // KwCase Expression PatternCompOp KwThen PatternStatement+
  public static boolean IfExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfExpression")) return false;
    if (!nextTokenIs(b, KWCASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWCASE);
    r = r && Expression(b, l + 1);
    r = r && PatternCompOp(b, l + 1);
    r = r && consumeToken(b, KWTHEN);
    r = r && IfExpression_4(b, l + 1);
    exit_section_(b, m, IF_EXPRESSION, r);
    return r;
  }

  // PatternStatement+
  private static boolean IfExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfExpression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PatternStatement(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!PatternStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfExpression_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TkBraceL Statement* TkBraceR
  public static boolean InnerScope(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InnerScope")) return false;
    if (!nextTokenIs(b, TKBRACEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKBRACEL);
    r = r && InnerScope_1(b, l + 1);
    r = r && consumeToken(b, TKBRACER);
    exit_section_(b, m, INNER_SCOPE, r);
    return r;
  }

  // Statement*
  private static boolean InnerScope_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InnerScope_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InnerScope_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KwWith TkBrackL (LambdaCaptureItem (TkComma LambdaCaptureItem)*) TkBrackR
  public static boolean LambdaCaptureBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaCaptureBlock")) return false;
    if (!nextTokenIs(b, KWWITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KWWITH, TKBRACKL);
    r = r && LambdaCaptureBlock_2(b, l + 1);
    r = r && consumeToken(b, TKBRACKR);
    exit_section_(b, m, LAMBDA_CAPTURE_BLOCK, r);
    return r;
  }

  // LambdaCaptureItem (TkComma LambdaCaptureItem)*
  private static boolean LambdaCaptureBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaCaptureBlock_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LambdaCaptureItem(b, l + 1);
    r = r && LambdaCaptureBlock_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma LambdaCaptureItem)*
  private static boolean LambdaCaptureBlock_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaCaptureBlock_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LambdaCaptureBlock_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LambdaCaptureBlock_2_1", c)) break;
    }
    return true;
  }

  // TkComma LambdaCaptureItem
  private static boolean LambdaCaptureBlock_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaCaptureBlock_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && LambdaCaptureItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LambdaCaptureItemNamed | LambdaCaptureItemNormal
  public static boolean LambdaCaptureItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaCaptureItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_CAPTURE_ITEM, "<lambda capture item>");
    r = LambdaCaptureItemNamed(b, l + 1);
    if (!r) r = LambdaCaptureItemNormal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Identifier TkAssign Convention Expression
  public static boolean LambdaCaptureItemNamed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaCaptureItemNamed")) return false;
    if (!nextTokenIs(b, LXIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, TKASSIGN);
    r = r && Convention(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, LAMBDA_CAPTURE_ITEM_NAMED, r);
    return r;
  }

  /* ********************************************************** */
  // Convention Expression
  public static boolean LambdaCaptureItemNormal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaCaptureItemNormal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_CAPTURE_ITEM_NORMAL, "<lambda capture item normal>");
    r = Convention(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KwCor GenericParameters? FunctionParameters TkArrowR Type LambdaCaptureBlock WhereBlock? FunctionImplementation
  public static boolean LambdaCoroutinePrototype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaCoroutinePrototype")) return false;
    if (!nextTokenIs(b, KWCOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWCOR);
    r = r && LambdaCoroutinePrototype_1(b, l + 1);
    r = r && FunctionParameters(b, l + 1);
    r = r && consumeToken(b, TKARROWR);
    r = r && Type(b, l + 1);
    r = r && LambdaCaptureBlock(b, l + 1);
    r = r && LambdaCoroutinePrototype_6(b, l + 1);
    r = r && FunctionImplementation(b, l + 1);
    exit_section_(b, m, LAMBDA_COROUTINE_PROTOTYPE, r);
    return r;
  }

  // GenericParameters?
  private static boolean LambdaCoroutinePrototype_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaCoroutinePrototype_1")) return false;
    GenericParameters(b, l + 1);
    return true;
  }

  // WhereBlock?
  private static boolean LambdaCoroutinePrototype_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaCoroutinePrototype_6")) return false;
    WhereBlock(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LambdaSubroutinePrototype | LambdaCoroutinePrototype
  public static boolean LambdaPrototype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaPrototype")) return false;
    if (!nextTokenIs(b, "<lambda prototype>", KWCOR, KWFUN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_PROTOTYPE, "<lambda prototype>");
    r = LambdaSubroutinePrototype(b, l + 1);
    if (!r) r = LambdaCoroutinePrototype(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KwFun GenericParameters? FunctionParameters TkArrowR Type LambdaCaptureBlock WhereBlock? FunctionImplementation
  public static boolean LambdaSubroutinePrototype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaSubroutinePrototype")) return false;
    if (!nextTokenIs(b, KWFUN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWFUN);
    r = r && LambdaSubroutinePrototype_1(b, l + 1);
    r = r && FunctionParameters(b, l + 1);
    r = r && consumeToken(b, TKARROWR);
    r = r && Type(b, l + 1);
    r = r && LambdaCaptureBlock(b, l + 1);
    r = r && LambdaSubroutinePrototype_6(b, l + 1);
    r = r && FunctionImplementation(b, l + 1);
    exit_section_(b, m, LAMBDA_SUBROUTINE_PROTOTYPE, r);
    return r;
  }

  // GenericParameters?
  private static boolean LambdaSubroutinePrototype_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaSubroutinePrototype_1")) return false;
    GenericParameters(b, l + 1);
    return true;
  }

  // WhereBlock?
  private static boolean LambdaSubroutinePrototype_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaSubroutinePrototype_6")) return false;
    WhereBlock(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LetStatementInitialized | LetStatementUninitialized
  public static boolean LetStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetStatement")) return false;
    if (!nextTokenIs(b, KWLET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LetStatementInitialized(b, l + 1);
    if (!r) r = LetStatementUninitialized(b, l + 1);
    exit_section_(b, m, LET_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KwLet LocalVariable TkAssign Expression
  public static boolean LetStatementInitialized(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetStatementInitialized")) return false;
    if (!nextTokenIs(b, KWLET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWLET);
    r = r && LocalVariable(b, l + 1);
    r = r && consumeToken(b, TKASSIGN);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, LET_STATEMENT_INITIALIZED, r);
    return r;
  }

  /* ********************************************************** */
  // KwLet LocalVariable TkColon Type
  public static boolean LetStatementUninitialized(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetStatementUninitialized")) return false;
    if (!nextTokenIs(b, KWLET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWLET);
    r = r && LocalVariable(b, l + 1);
    r = r && consumeToken(b, TKCOLON);
    r = r && Type(b, l + 1);
    exit_section_(b, m, LET_STATEMENT_UNINITIALIZED, r);
    return r;
  }

  /* ********************************************************** */
  // LiteralNumber | LiteralString | LiteralTuple | LiteralRegex | LiteralBoolean
  public static boolean Literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = LiteralNumber(b, l + 1);
    if (!r) r = LiteralString(b, l + 1);
    if (!r) r = LiteralTuple(b, l + 1);
    if (!r) r = LiteralRegex(b, l + 1);
    if (!r) r = LiteralBoolean(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KwTrue | KwFalse
  public static boolean LiteralBoolean(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralBoolean")) return false;
    if (!nextTokenIs(b, "<literal boolean>", KWFALSE, KWTRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_BOOLEAN, "<literal boolean>");
    r = consumeToken(b, KWTRUE);
    if (!r) r = consumeToken(b, KWFALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LiteralNumberBase10 | LiteralNumberBase2 | LiteralNumberBase16
  public static boolean LiteralNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralNumber")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_NUMBER, "<literal number>");
    r = LiteralNumberBase10(b, l + 1);
    if (!r) r = LiteralNumberBase2(b, l + 1);
    if (!r) r = LiteralNumberBase16(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LiteralNumberBase10Integer | LiteralNumberBase10Float
  public static boolean LiteralNumberBase10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralNumberBase10")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_NUMBER_BASE_10, "<literal number base 10>");
    r = LiteralNumberBase10Integer(b, l + 1);
    if (!r) r = LiteralNumberBase10Float(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NumericPrefixOp? LxDecDecimal NumericPostfixOp?
  public static boolean LiteralNumberBase10Float(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralNumberBase10Float")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_NUMBER_BASE_10_FLOAT, "<literal number base 10 float>");
    r = LiteralNumberBase10Float_0(b, l + 1);
    r = r && consumeToken(b, LXDECDECIMAL);
    r = r && LiteralNumberBase10Float_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NumericPrefixOp?
  private static boolean LiteralNumberBase10Float_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralNumberBase10Float_0")) return false;
    NumericPrefixOp(b, l + 1);
    return true;
  }

  // NumericPostfixOp?
  private static boolean LiteralNumberBase10Float_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralNumberBase10Float_2")) return false;
    NumericPostfixOp(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NumericPrefixOp? LxDecInteger NumericPostfixOp?
  public static boolean LiteralNumberBase10Integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralNumberBase10Integer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_NUMBER_BASE_10_INTEGER, "<literal number base 10 integer>");
    r = LiteralNumberBase10Integer_0(b, l + 1);
    r = r && consumeToken(b, LXDECINTEGER);
    r = r && LiteralNumberBase10Integer_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NumericPrefixOp?
  private static boolean LiteralNumberBase10Integer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralNumberBase10Integer_0")) return false;
    NumericPrefixOp(b, l + 1);
    return true;
  }

  // NumericPostfixOp?
  private static boolean LiteralNumberBase10Integer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralNumberBase10Integer_2")) return false;
    NumericPostfixOp(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LxHexDigits NumericPostfixOp?
  public static boolean LiteralNumberBase16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralNumberBase16")) return false;
    if (!nextTokenIs(b, LXHEXDIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LXHEXDIGITS);
    r = r && LiteralNumberBase16_1(b, l + 1);
    exit_section_(b, m, LITERAL_NUMBER_BASE_16, r);
    return r;
  }

  // NumericPostfixOp?
  private static boolean LiteralNumberBase16_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralNumberBase16_1")) return false;
    NumericPostfixOp(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LxBinDigits NumericPostfixOp?
  public static boolean LiteralNumberBase2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralNumberBase2")) return false;
    if (!nextTokenIs(b, LXBINDIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LXBINDIGITS);
    r = r && LiteralNumberBase2_1(b, l + 1);
    exit_section_(b, m, LITERAL_NUMBER_BASE_2, r);
    return r;
  }

  // NumericPostfixOp?
  private static boolean LiteralNumberBase2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralNumberBase2_1")) return false;
    NumericPostfixOp(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LxRegex
  public static boolean LiteralRegex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralRegex")) return false;
    if (!nextTokenIs(b, LXREGEX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LXREGEX);
    exit_section_(b, m, LITERAL_REGEX, r);
    return r;
  }

  /* ********************************************************** */
  // LxDoubleQuoteStr
  public static boolean LiteralString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralString")) return false;
    if (!nextTokenIs(b, LXDOUBLEQUOTESTR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LXDOUBLEQUOTESTR);
    exit_section_(b, m, LITERAL_STRING, r);
    return r;
  }

  /* ********************************************************** */
  // LiteralTuple0Items | LiteralTuple1Items | LiteralTupleNItems
  public static boolean LiteralTuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralTuple")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LiteralTuple0Items(b, l + 1);
    if (!r) r = LiteralTuple1Items(b, l + 1);
    if (!r) r = LiteralTupleNItems(b, l + 1);
    exit_section_(b, m, LITERAL_TUPLE, r);
    return r;
  }

  /* ********************************************************** */
  // TkParenL TkParenR
  public static boolean LiteralTuple0Items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralTuple0Items")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TKPARENL, TKPARENR);
    exit_section_(b, m, LITERAL_TUPLE_0_ITEMS, r);
    return r;
  }

  /* ********************************************************** */
  // TkParenL Expression TkComma TkParenR
  public static boolean LiteralTuple1Items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralTuple1Items")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKPARENL);
    r = r && Expression(b, l + 1);
    r = r && consumeTokens(b, 0, TKCOMMA, TKPARENR);
    exit_section_(b, m, LITERAL_TUPLE_1_ITEMS, r);
    return r;
  }

  /* ********************************************************** */
  // TkParenL (Expression (TkComma Expression)*) TkParenR
  public static boolean LiteralTupleNItems(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralTupleNItems")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKPARENL);
    r = r && LiteralTupleNItems_1(b, l + 1);
    r = r && consumeToken(b, TKPARENR);
    exit_section_(b, m, LITERAL_TUPLE_N_ITEMS, r);
    return r;
  }

  // Expression (TkComma Expression)*
  private static boolean LiteralTupleNItems_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralTupleNItems_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && LiteralTupleNItems_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma Expression)*
  private static boolean LiteralTupleNItems_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralTupleNItems_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LiteralTupleNItems_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LiteralTupleNItems_1_1", c)) break;
    }
    return true;
  }

  // TkComma Expression
  private static boolean LiteralTupleNItems_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralTupleNItems_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LocalVariableSingle | LocalVariableTuple | LocalVariableDestructure
  public static boolean LocalVariable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE, "<local variable>");
    r = LocalVariableSingle(b, l + 1);
    if (!r) r = LocalVariableTuple(b, l + 1);
    if (!r) r = LocalVariableDestructure(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Identifier TkAssign LocalVariableNonAssignment
  public static boolean LocalVariableAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableAssignment")) return false;
    if (!nextTokenIs(b, LXIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, TKASSIGN);
    r = r && LocalVariableNonAssignment(b, l + 1);
    exit_section_(b, m, LOCAL_VARIABLE_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TkParenL (LocalVariableNestedForDestructure (TkComma LocalVariableNestedForDestructure)*)? TkParenR
  public static boolean LocalVariableDestructure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableDestructure")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKPARENL);
    r = r && LocalVariableDestructure_1(b, l + 1);
    r = r && consumeToken(b, TKPARENR);
    exit_section_(b, m, LOCAL_VARIABLE_DESTRUCTURE, r);
    return r;
  }

  // (LocalVariableNestedForDestructure (TkComma LocalVariableNestedForDestructure)*)?
  private static boolean LocalVariableDestructure_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableDestructure_1")) return false;
    LocalVariableDestructure_1_0(b, l + 1);
    return true;
  }

  // LocalVariableNestedForDestructure (TkComma LocalVariableNestedForDestructure)*
  private static boolean LocalVariableDestructure_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableDestructure_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LocalVariableNestedForDestructure(b, l + 1);
    r = r && LocalVariableDestructure_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma LocalVariableNestedForDestructure)*
  private static boolean LocalVariableDestructure_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableDestructure_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LocalVariableDestructure_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LocalVariableDestructure_1_0_1", c)) break;
    }
    return true;
  }

  // TkComma LocalVariableNestedForDestructure
  private static boolean LocalVariableDestructure_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableDestructure_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && LocalVariableNestedForDestructure(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LocalVariableAssignment | LocalVariableSingle | LocalVariableSkipArgument
  public static boolean LocalVariableNestedForDestructure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableNestedForDestructure")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE_NESTED_FOR_DESTRUCTURE, "<local variable nested for destructure>");
    r = LocalVariableAssignment(b, l + 1);
    if (!r) r = LocalVariableSingle(b, l + 1);
    if (!r) r = LocalVariableSkipArgument(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LocalVariableTuple | LocalVariableDestructure | LocalVariableSingle | LocalVariableSkipArgument
  public static boolean LocalVariableNestedForTuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableNestedForTuple")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE_NESTED_FOR_TUPLE, "<local variable nested for tuple>");
    r = LocalVariableTuple(b, l + 1);
    if (!r) r = LocalVariableDestructure(b, l + 1);
    if (!r) r = LocalVariableSingle(b, l + 1);
    if (!r) r = LocalVariableSkipArgument(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LocalVariableTuple | LocalVariableDestructure | LocalVariableSingle
  public static boolean LocalVariableNonAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableNonAssignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE_NON_ASSIGNMENT, "<local variable non assignment>");
    r = LocalVariableTuple(b, l + 1);
    if (!r) r = LocalVariableDestructure(b, l + 1);
    if (!r) r = LocalVariableSingle(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KwMut? TkVariadic? Identifier
  public static boolean LocalVariableSingle(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableSingle")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE_SINGLE, "<local variable single>");
    r = LocalVariableSingle_0(b, l + 1);
    r = r && LocalVariableSingle_1(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KwMut?
  private static boolean LocalVariableSingle_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableSingle_0")) return false;
    consumeToken(b, KWMUT);
    return true;
  }

  // TkVariadic?
  private static boolean LocalVariableSingle_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableSingle_1")) return false;
    consumeToken(b, TKVARIADIC);
    return true;
  }

  /* ********************************************************** */
  // TkVariadic
  public static boolean LocalVariableSkipArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableSkipArgument")) return false;
    if (!nextTokenIs(b, TKVARIADIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKVARIADIC);
    exit_section_(b, m, LOCAL_VARIABLE_SKIP_ARGUMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TkParenL (LocalVariableNestedForTuple (TkComma LocalVariableNestedForTuple)*)? TkParenR
  public static boolean LocalVariableTuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableTuple")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKPARENL);
    r = r && LocalVariableTuple_1(b, l + 1);
    r = r && consumeToken(b, TKPARENR);
    exit_section_(b, m, LOCAL_VARIABLE_TUPLE, r);
    return r;
  }

  // (LocalVariableNestedForTuple (TkComma LocalVariableNestedForTuple)*)?
  private static boolean LocalVariableTuple_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableTuple_1")) return false;
    LocalVariableTuple_1_0(b, l + 1);
    return true;
  }

  // LocalVariableNestedForTuple (TkComma LocalVariableNestedForTuple)*
  private static boolean LocalVariableTuple_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableTuple_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LocalVariableNestedForTuple(b, l + 1);
    r = r && LocalVariableTuple_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma LocalVariableNestedForTuple)*
  private static boolean LocalVariableTuple_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableTuple_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LocalVariableTuple_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LocalVariableTuple_1_0_1", c)) break;
    }
    return true;
  }

  // TkComma LocalVariableNestedForTuple
  private static boolean LocalVariableTuple_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalVariableTuple_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && LocalVariableNestedForTuple(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier (TkDblColon Identifier)*
  public static boolean ModuleIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleIdentifier")) return false;
    if (!nextTokenIs(b, LXIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && ModuleIdentifier_1(b, l + 1);
    exit_section_(b, m, MODULE_IDENTIFIER, r);
    return r;
  }

  // (TkDblColon Identifier)*
  private static boolean ModuleIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleIdentifier_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ModuleIdentifier_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModuleIdentifier_1", c)) break;
    }
    return true;
  }

  // TkDblColon Identifier
  private static boolean ModuleIdentifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleIdentifier_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKDBLCOLON);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ModuleMember*
  public static boolean ModuleImplementation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleImplementation")) return false;
    Marker m = enter_section_(b, l, _NONE_, MODULE_IMPLEMENTATION, "<module implementation>");
    while (true) {
      int c = current_position_(b);
      if (!ModuleMember(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModuleImplementation", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // FunctionPrototype | ClassPrototype | SupPrototypeNormal | SupPrototypeInheritance | TypedefStatement | LetStatementInitialized
  public static boolean ModuleMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleMember")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_MEMBER, "<module member>");
    r = FunctionPrototype(b, l + 1);
    if (!r) r = ClassPrototype(b, l + 1);
    if (!r) r = SupPrototypeNormal(b, l + 1);
    if (!r) r = SupPrototypeInheritance(b, l + 1);
    if (!r) r = TypedefStatement(b, l + 1);
    if (!r) r = LetStatementInitialized(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Annotation* KwMod ModuleIdentifier ModuleImplementation
  public static boolean ModulePrototype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModulePrototype")) return false;
    if (!nextTokenIs(b, "<module prototype>", KWMOD, TKAT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_PROTOTYPE, "<module prototype>");
    r = ModulePrototype_0(b, l + 1);
    r = r && consumeToken(b, KWMOD);
    r = r && ModuleIdentifier(b, l + 1);
    r = r && ModuleImplementation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Annotation*
  private static boolean ModulePrototype_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModulePrototype_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModulePrototype_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "i8" | "i16" | "i32" | "i64" | "i128" | "i256" | "u8" | "u16" | "u32" | "u64" | "u128" | "u256" | "f8" | "f16" | "f32" | "f64" | "f128" | "f256"
  public static boolean NumericPostfixOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumericPostfixOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_POSTFIX_OP, "<numeric postfix op>");
    r = consumeToken(b, "i8");
    if (!r) r = consumeToken(b, "i16");
    if (!r) r = consumeToken(b, "i32");
    if (!r) r = consumeToken(b, "i64");
    if (!r) r = consumeToken(b, "i128");
    if (!r) r = consumeToken(b, "i256");
    if (!r) r = consumeToken(b, "u8");
    if (!r) r = consumeToken(b, "u16");
    if (!r) r = consumeToken(b, "u32");
    if (!r) r = consumeToken(b, "u64");
    if (!r) r = consumeToken(b, "u128");
    if (!r) r = consumeToken(b, "u256");
    if (!r) r = consumeToken(b, "f8");
    if (!r) r = consumeToken(b, "f16");
    if (!r) r = consumeToken(b, "f32");
    if (!r) r = consumeToken(b, "f64");
    if (!r) r = consumeToken(b, "f128");
    if (!r) r = consumeToken(b, "f256");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkAdd | TkSub
  public static boolean NumericPrefixOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumericPrefixOp")) return false;
    if (!nextTokenIs(b, "<numeric prefix op>", TKADD, TKSUB)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_PREFIX_OP, "<numeric prefix op>");
    r = consumeToken(b, TKADD);
    if (!r) r = consumeToken(b, TKSUB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TypeSingle ObjectInitializerArguments
  public static boolean ObjectInitialization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitialization")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_INITIALIZATION, "<object initialization>");
    r = TypeSingle(b, l + 1);
    r = r && ObjectInitializerArguments(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ObjectInitializerArgumentNamed | ObjectInitializerArgumentNormal
  public static boolean ObjectInitializerArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializerArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_INITIALIZER_ARGUMENT, "<object initializer argument>");
    r = ObjectInitializerArgumentNamed(b, l + 1);
    if (!r) r = ObjectInitializerArgumentNormal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ObjectInitializerArgumentNamedKey TkAssign Expression
  public static boolean ObjectInitializerArgumentNamed(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializerArgumentNamed")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_INITIALIZER_ARGUMENT_NAMED, "<object initializer argument named>");
    r = ObjectInitializerArgumentNamedKey(b, l + 1);
    r = r && consumeToken(b, TKASSIGN);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Identifier | KwSup | KwElse
  public static boolean ObjectInitializerArgumentNamedKey(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializerArgumentNamedKey")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_INITIALIZER_ARGUMENT_NAMED_KEY, "<object initializer argument named key>");
    r = Identifier(b, l + 1);
    if (!r) r = consumeToken(b, KWSUP);
    if (!r) r = consumeToken(b, KWELSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean ObjectInitializerArgumentNormal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializerArgumentNormal")) return false;
    if (!nextTokenIs(b, LXIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    exit_section_(b, m, OBJECT_INITIALIZER_ARGUMENT_NORMAL, r);
    return r;
  }

  /* ********************************************************** */
  // TkParenL (ObjectInitializerArgument (TkComma ObjectInitializerArgument)*)? TkParenR
  public static boolean ObjectInitializerArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializerArguments")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKPARENL);
    r = r && ObjectInitializerArguments_1(b, l + 1);
    r = r && consumeToken(b, TKPARENR);
    exit_section_(b, m, OBJECT_INITIALIZER_ARGUMENTS, r);
    return r;
  }

  // (ObjectInitializerArgument (TkComma ObjectInitializerArgument)*)?
  private static boolean ObjectInitializerArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializerArguments_1")) return false;
    ObjectInitializerArguments_1_0(b, l + 1);
    return true;
  }

  // ObjectInitializerArgument (TkComma ObjectInitializerArgument)*
  private static boolean ObjectInitializerArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializerArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ObjectInitializerArgument(b, l + 1);
    r = r && ObjectInitializerArguments_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma ObjectInitializerArgument)*
  private static boolean ObjectInitializerArguments_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializerArguments_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ObjectInitializerArguments_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectInitializerArguments_1_0_1", c)) break;
    }
    return true;
  }

  // TkComma ObjectInitializerArgument
  private static boolean ObjectInitializerArguments_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectInitializerArguments_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && ObjectInitializerArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TkParenL Expression TkParenR
  public static boolean ParenthesizedExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenthesizedExpression")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKPARENL);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, TKPARENR);
    exit_section_(b, m, PARENTHESIZED_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // TkEq | TkNe | TkLe | TkGe | TkLt | TkGt | TkIs
  public static boolean PatternCompOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternCompOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_COMP_OP, "<pattern comp op>");
    r = consumeToken(b, TKEQ);
    if (!r) r = consumeToken(b, TKNE);
    if (!r) r = consumeToken(b, TKLE);
    if (!r) r = consumeToken(b, TKGE);
    if (!r) r = consumeToken(b, TKLT);
    if (!r) r = consumeToken(b, TKGT);
    if (!r) r = consumeToken(b, TKIS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkLogicalAnd Expression
  public static boolean PatternGuard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternGuard")) return false;
    if (!nextTokenIs(b, TKLOGICALAND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKLOGICALAND);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, PATTERN_GUARD, r);
    return r;
  }

  /* ********************************************************** */
  // PatternCompOp? (PatternVariant (TkBitOr PatternVariant)*) PatternGuard? InnerScope
  public static boolean PatternStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_STATEMENT, "<pattern statement>");
    r = PatternStatement_0(b, l + 1);
    r = r && PatternStatement_1(b, l + 1);
    r = r && PatternStatement_2(b, l + 1);
    r = r && InnerScope(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PatternCompOp?
  private static boolean PatternStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternStatement_0")) return false;
    PatternCompOp(b, l + 1);
    return true;
  }

  // PatternVariant (TkBitOr PatternVariant)*
  private static boolean PatternStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PatternVariant(b, l + 1);
    r = r && PatternStatement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkBitOr PatternVariant)*
  private static boolean PatternStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternStatement_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!PatternStatement_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PatternStatement_1_1", c)) break;
    }
    return true;
  }

  // TkBitOr PatternVariant
  private static boolean PatternStatement_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternStatement_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKBITOR);
    r = r && PatternVariant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PatternGuard?
  private static boolean PatternStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternStatement_2")) return false;
    PatternGuard(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PatternVariantTuple | PatternVariantDestructure | PatternVariantVariable | PatternVariantLiteral | PatternVariantElse
  public static boolean PatternVariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_VARIANT, "<pattern variant>");
    r = PatternVariantTuple(b, l + 1);
    if (!r) r = PatternVariantDestructure(b, l + 1);
    if (!r) r = PatternVariantVariable(b, l + 1);
    if (!r) r = PatternVariantLiteral(b, l + 1);
    if (!r) r = PatternVariantElse(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Identifier TkAssign PatternVariantNestedForNonAssignment
  public static boolean PatternVariantAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantAssignment")) return false;
    if (!nextTokenIs(b, LXIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, TKASSIGN);
    r = r && PatternVariantNestedForNonAssignment(b, l + 1);
    exit_section_(b, m, PATTERN_VARIANT_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TkParenL (PatternVariantNestedForDestructure (TkComma PatternVariantNestedForDestructure)*)? TkParenR
  public static boolean PatternVariantDestructure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantDestructure")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKPARENL);
    r = r && PatternVariantDestructure_1(b, l + 1);
    r = r && consumeToken(b, TKPARENR);
    exit_section_(b, m, PATTERN_VARIANT_DESTRUCTURE, r);
    return r;
  }

  // (PatternVariantNestedForDestructure (TkComma PatternVariantNestedForDestructure)*)?
  private static boolean PatternVariantDestructure_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantDestructure_1")) return false;
    PatternVariantDestructure_1_0(b, l + 1);
    return true;
  }

  // PatternVariantNestedForDestructure (TkComma PatternVariantNestedForDestructure)*
  private static boolean PatternVariantDestructure_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantDestructure_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PatternVariantNestedForDestructure(b, l + 1);
    r = r && PatternVariantDestructure_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma PatternVariantNestedForDestructure)*
  private static boolean PatternVariantDestructure_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantDestructure_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!PatternVariantDestructure_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PatternVariantDestructure_1_0_1", c)) break;
    }
    return true;
  }

  // TkComma PatternVariantNestedForDestructure
  private static boolean PatternVariantDestructure_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantDestructure_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && PatternVariantNestedForDestructure(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KwElse
  public static boolean PatternVariantElse(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantElse")) return false;
    if (!nextTokenIs(b, KWELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWELSE);
    exit_section_(b, m, PATTERN_VARIANT_ELSE, r);
    return r;
  }

  /* ********************************************************** */
  // LiteralNumber | LiteralString | LiteralBoolean
  public static boolean PatternVariantLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_VARIANT_LITERAL, "<pattern variant literal>");
    r = LiteralNumber(b, l + 1);
    if (!r) r = LiteralString(b, l + 1);
    if (!r) r = LiteralBoolean(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PatternVariantAssignment | PatternVariantVariable | PatternVariantSkipArgument
  public static boolean PatternVariantNestedForDestructure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantNestedForDestructure")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_VARIANT_NESTED_FOR_DESTRUCTURE, "<pattern variant nested for destructure>");
    r = PatternVariantAssignment(b, l + 1);
    if (!r) r = PatternVariantVariable(b, l + 1);
    if (!r) r = PatternVariantSkipArgument(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PatternVariantTuple | PatternVariantDestructure | PatternVariantVariable | PatternVariantLiteral
  public static boolean PatternVariantNestedForNonAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantNestedForNonAssignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_VARIANT_NESTED_FOR_NON_ASSIGNMENT, "<pattern variant nested for non assignment>");
    r = PatternVariantTuple(b, l + 1);
    if (!r) r = PatternVariantDestructure(b, l + 1);
    if (!r) r = PatternVariantVariable(b, l + 1);
    if (!r) r = PatternVariantLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PatternVariantTuple | PatternVariantDestructure | PatternVariantVariable | PatternVariantLiteral | PatternVariantSkipArgument
  public static boolean PatternVariantNestedForTuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantNestedForTuple")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_VARIANT_NESTED_FOR_TUPLE, "<pattern variant nested for tuple>");
    r = PatternVariantTuple(b, l + 1);
    if (!r) r = PatternVariantDestructure(b, l + 1);
    if (!r) r = PatternVariantVariable(b, l + 1);
    if (!r) r = PatternVariantLiteral(b, l + 1);
    if (!r) r = PatternVariantSkipArgument(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkVariadic
  public static boolean PatternVariantSkipArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantSkipArgument")) return false;
    if (!nextTokenIs(b, TKVARIADIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKVARIADIC);
    exit_section_(b, m, PATTERN_VARIANT_SKIP_ARGUMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TkParenL (PatternVariantNestedForTuple (TkComma PatternVariantNestedForTuple)*) TkParenR
  public static boolean PatternVariantTuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantTuple")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKPARENL);
    r = r && PatternVariantTuple_1(b, l + 1);
    r = r && consumeToken(b, TKPARENR);
    exit_section_(b, m, PATTERN_VARIANT_TUPLE, r);
    return r;
  }

  // PatternVariantNestedForTuple (TkComma PatternVariantNestedForTuple)*
  private static boolean PatternVariantTuple_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantTuple_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PatternVariantNestedForTuple(b, l + 1);
    r = r && PatternVariantTuple_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma PatternVariantNestedForTuple)*
  private static boolean PatternVariantTuple_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantTuple_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!PatternVariantTuple_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PatternVariantTuple_1_1", c)) break;
    }
    return true;
  }

  // TkComma PatternVariantNestedForTuple
  private static boolean PatternVariantTuple_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantTuple_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && PatternVariantNestedForTuple(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KwMut? TkVariadic? Identifier
  public static boolean PatternVariantVariable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantVariable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_VARIANT_VARIABLE, "<pattern variant variable>");
    r = PatternVariantVariable_0(b, l + 1);
    r = r && PatternVariantVariable_1(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KwMut?
  private static boolean PatternVariantVariable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantVariable_0")) return false;
    consumeToken(b, KWMUT);
    return true;
  }

  // TkVariadic?
  private static boolean PatternVariantVariable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternVariantVariable_1")) return false;
    consumeToken(b, TKVARIADIC);
    return true;
  }

  /* ********************************************************** */
  // PrimaryExpression PostfixOp*
  public static boolean PostfixExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_EXPRESSION, "<postfix expression>");
    r = PrimaryExpression(b, l + 1);
    r = r && PostfixExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PostfixOp*
  private static boolean PostfixExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!PostfixOp(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PostfixExpression_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LxPostfixIdentifier
  public static boolean PostfixIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixIdentifier")) return false;
    if (!nextTokenIs(b, LXPOSTFIXIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LXPOSTFIXIDENTIFIER);
    exit_section_(b, m, POSTFIX_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // PostfixOpMemberAccess | PostfixOpEarlyReturn | PostfixOpFunctionCall
  public static boolean PostfixOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_OP, "<postfix op>");
    r = PostfixOpMemberAccess(b, l + 1);
    if (!r) r = PostfixOpEarlyReturn(b, l + 1);
    if (!r) r = PostfixOpFunctionCall(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkQst
  public static boolean PostfixOpEarlyReturn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixOpEarlyReturn")) return false;
    if (!nextTokenIs(b, TKQST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKQST);
    exit_section_(b, m, POSTFIX_OP_EARLY_RETURN, r);
    return r;
  }

  /* ********************************************************** */
  // TkParenL FunctionCallArguments TkParenR TkVariadic?
  public static boolean PostfixOpFunctionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixOpFunctionCall")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKPARENL);
    r = r && FunctionCallArguments(b, l + 1);
    r = r && consumeToken(b, TKPARENR);
    r = r && PostfixOpFunctionCall_3(b, l + 1);
    exit_section_(b, m, POSTFIX_OP_FUNCTION_CALL, r);
    return r;
  }

  // TkVariadic?
  private static boolean PostfixOpFunctionCall_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixOpFunctionCall_3")) return false;
    consumeToken(b, TKVARIADIC);
    return true;
  }

  /* ********************************************************** */
  // PostfixOpMemberAccessRuntime | PostfixOpMemberAccessStatic
  public static boolean PostfixOpMemberAccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixOpMemberAccess")) return false;
    if (!nextTokenIs(b, "<postfix op member access>", TKDBLCOLON, TKDOT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_OP_MEMBER_ACCESS, "<postfix op member access>");
    r = PostfixOpMemberAccessRuntime(b, l + 1);
    if (!r) r = PostfixOpMemberAccessStatic(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkDot (PostfixIdentifier | LxDecInteger)
  public static boolean PostfixOpMemberAccessRuntime(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixOpMemberAccessRuntime")) return false;
    if (!nextTokenIs(b, TKDOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKDOT);
    r = r && PostfixOpMemberAccessRuntime_1(b, l + 1);
    exit_section_(b, m, POSTFIX_OP_MEMBER_ACCESS_RUNTIME, r);
    return r;
  }

  // PostfixIdentifier | LxDecInteger
  private static boolean PostfixOpMemberAccessRuntime_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixOpMemberAccessRuntime_1")) return false;
    boolean r;
    r = PostfixIdentifier(b, l + 1);
    if (!r) r = consumeToken(b, LXDECINTEGER);
    return r;
  }

  /* ********************************************************** */
  // TkDblColon PostfixIdentifier
  public static boolean PostfixOpMemberAccessStatic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixOpMemberAccessStatic")) return false;
    if (!nextTokenIs(b, TKDBLCOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKDBLCOLON);
    r = r && PostfixIdentifier(b, l + 1);
    exit_section_(b, m, POSTFIX_OP_MEMBER_ACCESS_STATIC, r);
    return r;
  }

  /* ********************************************************** */
  // Literal | ObjectInitialization | LambdaPrototype | ParenthesizedExpression | Identifier | IfExpression | WhileExpression | YieldExpression | WithExpression | InnerScope | SelfKeyword | TkVariadic
  public static boolean PrimaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPRESSION, "<primary expression>");
    r = Literal(b, l + 1);
    if (!r) r = ObjectInitialization(b, l + 1);
    if (!r) r = LambdaPrototype(b, l + 1);
    if (!r) r = ParenthesizedExpression(b, l + 1);
    if (!r) r = Identifier(b, l + 1);
    if (!r) r = IfExpression(b, l + 1);
    if (!r) r = WhileExpression(b, l + 1);
    if (!r) r = YieldExpression(b, l + 1);
    if (!r) r = WithExpression(b, l + 1);
    if (!r) r = InnerScope(b, l + 1);
    if (!r) r = SelfKeyword(b, l + 1);
    if (!r) r = consumeToken(b, TKVARIADIC);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ModulePrototype <<eof>>
  static boolean Program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Program")) return false;
    if (!nextTokenIs(b, "", KWMOD, TKAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModulePrototype(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KwRet Expression?
  public static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, KWRET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWRET);
    r = r && ReturnStatement_1(b, l + 1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // Expression?
  private static boolean ReturnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_1")) return false;
    Expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KwSelf
  public static boolean SelfKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelfKeyword")) return false;
    if (!nextTokenIs(b, KWSELF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWSELF);
    exit_section_(b, m, SELF_KEYWORD, r);
    return r;
  }

  /* ********************************************************** */
  // KwSelfType
  public static boolean SelfType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelfType")) return false;
    if (!nextTokenIs(b, KWSELFTYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWSELFTYPE);
    exit_section_(b, m, SELF_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // TypedefStatement | LetStatement | ReturnStatement | AssignmentStatement | Expression
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = TypedefStatement(b, l + 1);
    if (!r) r = LetStatement(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = AssignmentStatement(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Annotation* KwFun Identifier GenericParameters? FunctionParameters TkArrowR Type WhereBlock? FunctionImplementation
  public static boolean SubroutinePrototype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubroutinePrototype")) return false;
    if (!nextTokenIs(b, "<subroutine prototype>", KWFUN, TKAT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBROUTINE_PROTOTYPE, "<subroutine prototype>");
    r = SubroutinePrototype_0(b, l + 1);
    r = r && consumeToken(b, KWFUN);
    r = r && Identifier(b, l + 1);
    r = r && SubroutinePrototype_3(b, l + 1);
    r = r && FunctionParameters(b, l + 1);
    r = r && consumeToken(b, TKARROWR);
    r = r && Type(b, l + 1);
    r = r && SubroutinePrototype_7(b, l + 1);
    r = r && FunctionImplementation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Annotation*
  private static boolean SubroutinePrototype_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubroutinePrototype_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SubroutinePrototype_0", c)) break;
    }
    return true;
  }

  // GenericParameters?
  private static boolean SubroutinePrototype_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubroutinePrototype_3")) return false;
    GenericParameters(b, l + 1);
    return true;
  }

  // WhereBlock?
  private static boolean SubroutinePrototype_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubroutinePrototype_7")) return false;
    WhereBlock(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TkBraceL SupMember* TkBraceR
  public static boolean SupImplementation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupImplementation")) return false;
    if (!nextTokenIs(b, TKBRACEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKBRACEL);
    r = r && SupImplementation_1(b, l + 1);
    r = r && consumeToken(b, TKBRACER);
    exit_section_(b, m, SUP_IMPLEMENTATION, r);
    return r;
  }

  // SupMember*
  private static boolean SupImplementation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupImplementation_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SupMember(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SupImplementation_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SupMethodPrototype | SupTypedef
  public static boolean SupMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupMember")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUP_MEMBER, "<sup member>");
    r = SupMethodPrototype(b, l + 1);
    if (!r) r = SupTypedef(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FunctionPrototype
  public static boolean SupMethodPrototype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupMethodPrototype")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUP_METHOD_PROTOTYPE, "<sup method prototype>");
    r = FunctionPrototype(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KwSup GenericParameters? Type KwOn Type WhereBlock? SupImplementation
  public static boolean SupPrototypeInheritance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupPrototypeInheritance")) return false;
    if (!nextTokenIs(b, KWSUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWSUP);
    r = r && SupPrototypeInheritance_1(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && consumeToken(b, KWON);
    r = r && Type(b, l + 1);
    r = r && SupPrototypeInheritance_5(b, l + 1);
    r = r && SupImplementation(b, l + 1);
    exit_section_(b, m, SUP_PROTOTYPE_INHERITANCE, r);
    return r;
  }

  // GenericParameters?
  private static boolean SupPrototypeInheritance_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupPrototypeInheritance_1")) return false;
    GenericParameters(b, l + 1);
    return true;
  }

  // WhereBlock?
  private static boolean SupPrototypeInheritance_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupPrototypeInheritance_5")) return false;
    WhereBlock(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KwSup GenericParameters? Type WhereBlock? SupImplementation
  public static boolean SupPrototypeNormal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupPrototypeNormal")) return false;
    if (!nextTokenIs(b, KWSUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWSUP);
    r = r && SupPrototypeNormal_1(b, l + 1);
    r = r && Type(b, l + 1);
    r = r && SupPrototypeNormal_3(b, l + 1);
    r = r && SupImplementation(b, l + 1);
    exit_section_(b, m, SUP_PROTOTYPE_NORMAL, r);
    return r;
  }

  // GenericParameters?
  private static boolean SupPrototypeNormal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupPrototypeNormal_1")) return false;
    GenericParameters(b, l + 1);
    return true;
  }

  // WhereBlock?
  private static boolean SupPrototypeNormal_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupPrototypeNormal_3")) return false;
    WhereBlock(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Annotation* TypedefStatement
  public static boolean SupTypedef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupTypedef")) return false;
    if (!nextTokenIs(b, "<sup typedef>", KWUSE, TKAT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUP_TYPEDEF, "<sup typedef>");
    r = SupTypedef_0(b, l + 1);
    r = r && TypedefStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Annotation*
  private static boolean SupTypedef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SupTypedef_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SupTypedef_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TypeOptional | TypeUnion | TypeTuple | TypeSingle
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = TypeOptional(b, l + 1);
    if (!r) r = TypeUnion(b, l + 1);
    if (!r) r = TypeTuple(b, l + 1);
    if (!r) r = TypeSingle(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (Identifier TkDblColon)+
  public static boolean TypeNamespace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeNamespace")) return false;
    if (!nextTokenIs(b, LXIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeNamespace_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!TypeNamespace_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeNamespace", c)) break;
    }
    exit_section_(b, m, TYPE_NAMESPACE, r);
    return r;
  }

  // Identifier TkDblColon
  private static boolean TypeNamespace_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeNamespace_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, TKDBLCOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeSingle | TypeTuple | TypeOptional
  public static boolean TypeNonUnion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeNonUnion")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_NON_UNION, "<type non union>");
    r = TypeSingle(b, l + 1);
    if (!r) r = TypeTuple(b, l + 1);
    if (!r) r = TypeOptional(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TkQst Type
  public static boolean TypeOptional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeOptional")) return false;
    if (!nextTokenIs(b, TKQST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKQST);
    r = r && Type(b, l + 1);
    exit_section_(b, m, TYPE_OPTIONAL, r);
    return r;
  }

  /* ********************************************************** */
  // TkDblColon (GenericIdentifier | LxDecInteger)
  public static boolean TypePart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypePart")) return false;
    if (!nextTokenIs(b, TKDBLCOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKDBLCOLON);
    r = r && TypePart_1(b, l + 1);
    exit_section_(b, m, TYPE_PART, r);
    return r;
  }

  // GenericIdentifier | LxDecInteger
  private static boolean TypePart_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypePart_1")) return false;
    boolean r;
    r = GenericIdentifier(b, l + 1);
    if (!r) r = consumeToken(b, LXDECINTEGER);
    return r;
  }

  /* ********************************************************** */
  // GenericIdentifier | SelfType
  public static boolean TypePartFirst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypePartFirst")) return false;
    if (!nextTokenIs(b, "<type part first>", KWSELFTYPE, LXUPPERIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_PART_FIRST, "<type part first>");
    r = GenericIdentifier(b, l + 1);
    if (!r) r = SelfType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TypePartFirst (TkDblColon TypePart)*
  public static boolean TypeParts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParts")) return false;
    if (!nextTokenIs(b, "<type parts>", KWSELFTYPE, LXUPPERIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_PARTS, "<type parts>");
    r = TypePartFirst(b, l + 1);
    r = r && TypeParts_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (TkDblColon TypePart)*
  private static boolean TypeParts_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParts_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeParts_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeParts_1", c)) break;
    }
    return true;
  }

  // TkDblColon TypePart
  private static boolean TypeParts_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParts_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKDBLCOLON);
    r = r && TypePart(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeNamespace? TypeParts
  public static boolean TypeSingle(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSingle")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SINGLE, "<type single>");
    r = TypeSingle_0(b, l + 1);
    r = r && TypeParts(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TypeNamespace?
  private static boolean TypeSingle_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSingle_0")) return false;
    TypeNamespace(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TkParenL (Type (TkComma Type)*)? TkParenR
  public static boolean TypeTuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeTuple")) return false;
    if (!nextTokenIs(b, TKPARENL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKPARENL);
    r = r && TypeTuple_1(b, l + 1);
    r = r && consumeToken(b, TKPARENR);
    exit_section_(b, m, TYPE_TUPLE, r);
    return r;
  }

  // (Type (TkComma Type)*)?
  private static boolean TypeTuple_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeTuple_1")) return false;
    TypeTuple_1_0(b, l + 1);
    return true;
  }

  // Type (TkComma Type)*
  private static boolean TypeTuple_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeTuple_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1);
    r = r && TypeTuple_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma Type)*
  private static boolean TypeTuple_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeTuple_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeTuple_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeTuple_1_0_1", c)) break;
    }
    return true;
  }

  // TkComma Type
  private static boolean TypeTuple_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeTuple_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeNonUnion (TkBitOr Type)*
  public static boolean TypeUnion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeUnion")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_UNION, "<type union>");
    r = TypeNonUnion(b, l + 1);
    r = r && TypeUnion_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (TkBitOr Type)*
  private static boolean TypeUnion_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeUnion_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeUnion_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeUnion_1", c)) break;
    }
    return true;
  }

  // TkBitOr Type
  private static boolean TypeUnion_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeUnion_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKBITOR);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypedefStatementSpecificItem | TypedefStatementSpecificItems | TypedefStatementAllItems
  public static boolean TypedefItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPEDEF_ITEM, "<typedef item>");
    r = TypedefStatementSpecificItem(b, l + 1);
    if (!r) r = TypedefStatementSpecificItems(b, l + 1);
    if (!r) r = TypedefStatementAllItems(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KwUse GenericParameters? TypeNamespace? TypedefItem
  public static boolean TypedefStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefStatement")) return false;
    if (!nextTokenIs(b, KWUSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWUSE);
    r = r && TypedefStatement_1(b, l + 1);
    r = r && TypedefStatement_2(b, l + 1);
    r = r && TypedefItem(b, l + 1);
    exit_section_(b, m, TYPEDEF_STATEMENT, r);
    return r;
  }

  // GenericParameters?
  private static boolean TypedefStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefStatement_1")) return false;
    GenericParameters(b, l + 1);
    return true;
  }

  // TypeNamespace?
  private static boolean TypedefStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefStatement_2")) return false;
    TypeNamespace(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TkBraceL TkMul TkBraceR
  public static boolean TypedefStatementAllItems(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefStatementAllItems")) return false;
    if (!nextTokenIs(b, TKBRACEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TKBRACEL, TKMUL, TKBRACER);
    exit_section_(b, m, TYPEDEF_STATEMENT_ALL_ITEMS, r);
    return r;
  }

  /* ********************************************************** */
  // TypeSingle TypedefStatementSpecificItemAlias?
  public static boolean TypedefStatementSpecificItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefStatementSpecificItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPEDEF_STATEMENT_SPECIFIC_ITEM, "<typedef statement specific item>");
    r = TypeSingle(b, l + 1);
    r = r && TypedefStatementSpecificItem_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TypedefStatementSpecificItemAlias?
  private static boolean TypedefStatementSpecificItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefStatementSpecificItem_1")) return false;
    TypedefStatementSpecificItemAlias(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KwAs GenericIdentifier
  public static boolean TypedefStatementSpecificItemAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefStatementSpecificItemAlias")) return false;
    if (!nextTokenIs(b, KWAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWAS);
    r = r && GenericIdentifier(b, l + 1);
    exit_section_(b, m, TYPEDEF_STATEMENT_SPECIFIC_ITEM_ALIAS, r);
    return r;
  }

  /* ********************************************************** */
  // TkBraceL (TypedefStatementSpecificItem (TkComma TypedefStatementSpecificItem)*)? TkBraceR
  public static boolean TypedefStatementSpecificItems(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefStatementSpecificItems")) return false;
    if (!nextTokenIs(b, TKBRACEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKBRACEL);
    r = r && TypedefStatementSpecificItems_1(b, l + 1);
    r = r && consumeToken(b, TKBRACER);
    exit_section_(b, m, TYPEDEF_STATEMENT_SPECIFIC_ITEMS, r);
    return r;
  }

  // (TypedefStatementSpecificItem (TkComma TypedefStatementSpecificItem)*)?
  private static boolean TypedefStatementSpecificItems_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefStatementSpecificItems_1")) return false;
    TypedefStatementSpecificItems_1_0(b, l + 1);
    return true;
  }

  // TypedefStatementSpecificItem (TkComma TypedefStatementSpecificItem)*
  private static boolean TypedefStatementSpecificItems_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefStatementSpecificItems_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypedefStatementSpecificItem(b, l + 1);
    r = r && TypedefStatementSpecificItems_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma TypedefStatementSpecificItem)*
  private static boolean TypedefStatementSpecificItems_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefStatementSpecificItems_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypedefStatementSpecificItems_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypedefStatementSpecificItems_1_0_1", c)) break;
    }
    return true;
  }

  // TkComma TypedefStatementSpecificItem
  private static boolean TypedefStatementSpecificItems_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypedefStatementSpecificItems_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && TypedefStatementSpecificItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UnaryOp* PostfixExpression
  public static boolean UnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXPRESSION, "<unary expression>");
    r = UnaryExpression_0(b, l + 1);
    r = r && PostfixExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // UnaryOp*
  private static boolean UnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UnaryOp(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnaryExpression_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KwAsync
  public static boolean UnaryOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryOp")) return false;
    if (!nextTokenIs(b, KWASYNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWASYNC);
    exit_section_(b, m, UNARY_OP, r);
    return r;
  }

  /* ********************************************************** */
  // LxUpperIdentifier
  public static boolean UpperIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpperIdentifier")) return false;
    if (!nextTokenIs(b, LXUPPERIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LXUPPERIDENTIFIER);
    exit_section_(b, m, UPPER_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // KwWhere WhereBlockConstraintsGroup
  public static boolean WhereBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereBlock")) return false;
    if (!nextTokenIs(b, KWWHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWWHERE);
    r = r && WhereBlockConstraintsGroup(b, l + 1);
    exit_section_(b, m, WHERE_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // Type (TkComma Type)* TkColon Type (TkBitAnd Type)*
  public static boolean WhereBlockConstraints(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereBlockConstraints")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHERE_BLOCK_CONSTRAINTS, "<where block constraints>");
    r = Type(b, l + 1);
    r = r && WhereBlockConstraints_1(b, l + 1);
    r = r && consumeToken(b, TKCOLON);
    r = r && Type(b, l + 1);
    r = r && WhereBlockConstraints_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (TkComma Type)*
  private static boolean WhereBlockConstraints_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereBlockConstraints_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WhereBlockConstraints_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WhereBlockConstraints_1", c)) break;
    }
    return true;
  }

  // TkComma Type
  private static boolean WhereBlockConstraints_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereBlockConstraints_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkBitAnd Type)*
  private static boolean WhereBlockConstraints_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereBlockConstraints_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WhereBlockConstraints_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WhereBlockConstraints_4", c)) break;
    }
    return true;
  }

  // TkBitAnd Type
  private static boolean WhereBlockConstraints_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereBlockConstraints_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKBITAND);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TkBrackL (WhereBlockConstraints (TkComma WhereBlockConstraints)*)? TkBrackR
  public static boolean WhereBlockConstraintsGroup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereBlockConstraintsGroup")) return false;
    if (!nextTokenIs(b, TKBRACKL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKBRACKL);
    r = r && WhereBlockConstraintsGroup_1(b, l + 1);
    r = r && consumeToken(b, TKBRACKR);
    exit_section_(b, m, WHERE_BLOCK_CONSTRAINTS_GROUP, r);
    return r;
  }

  // (WhereBlockConstraints (TkComma WhereBlockConstraints)*)?
  private static boolean WhereBlockConstraintsGroup_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereBlockConstraintsGroup_1")) return false;
    WhereBlockConstraintsGroup_1_0(b, l + 1);
    return true;
  }

  // WhereBlockConstraints (TkComma WhereBlockConstraints)*
  private static boolean WhereBlockConstraintsGroup_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereBlockConstraintsGroup_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WhereBlockConstraints(b, l + 1);
    r = r && WhereBlockConstraintsGroup_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TkComma WhereBlockConstraints)*
  private static boolean WhereBlockConstraintsGroup_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereBlockConstraintsGroup_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WhereBlockConstraintsGroup_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WhereBlockConstraintsGroup_1_0_1", c)) break;
    }
    return true;
  }

  // TkComma WhereBlockConstraints
  private static boolean WhereBlockConstraintsGroup_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereBlockConstraintsGroup_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TKCOMMA);
    r = r && WhereBlockConstraints(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KwElse InnerScope
  public static boolean WhileElseExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileElseExpression")) return false;
    if (!nextTokenIs(b, KWELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWELSE);
    r = r && InnerScope(b, l + 1);
    exit_section_(b, m, WHILE_ELSE_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // KwLoop Expression InnerScope WhileElseExpression?
  public static boolean WhileExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileExpression")) return false;
    if (!nextTokenIs(b, KWLOOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWLOOP);
    r = r && Expression(b, l + 1);
    r = r && InnerScope(b, l + 1);
    r = r && WhileExpression_3(b, l + 1);
    exit_section_(b, m, WHILE_EXPRESSION, r);
    return r;
  }

  // WhileElseExpression?
  private static boolean WhileExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileExpression_3")) return false;
    WhileElseExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KwWith WithExpressionLhsAlias? Expression InnerScope
  public static boolean WithExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithExpression")) return false;
    if (!nextTokenIs(b, KWWITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWWITH);
    r = r && WithExpression_1(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && InnerScope(b, l + 1);
    exit_section_(b, m, WITH_EXPRESSION, r);
    return r;
  }

  // WithExpressionLhsAlias?
  private static boolean WithExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithExpression_1")) return false;
    WithExpressionLhsAlias(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LocalVariable TkAssign
  public static boolean WithExpressionLhsAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithExpressionLhsAlias")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WITH_EXPRESSION_LHS_ALIAS, "<with expression lhs alias>");
    r = LocalVariable(b, l + 1);
    r = r && consumeToken(b, TKASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KwGen KwWith? (Convention Expression)?
  public static boolean YieldExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldExpression")) return false;
    if (!nextTokenIs(b, KWGEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KWGEN);
    r = r && YieldExpression_1(b, l + 1);
    r = r && YieldExpression_2(b, l + 1);
    exit_section_(b, m, YIELD_EXPRESSION, r);
    return r;
  }

  // KwWith?
  private static boolean YieldExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldExpression_1")) return false;
    consumeToken(b, KWWITH);
    return true;
  }

  // (Convention Expression)?
  private static boolean YieldExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldExpression_2")) return false;
    YieldExpression_2_0(b, l + 1);
    return true;
  }

  // Convention Expression
  private static boolean YieldExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YieldExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Convention(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
