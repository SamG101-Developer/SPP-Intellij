// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.SppTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class SppPrimaryExpressionImpl extends ASTWrapperPsiElement implements SppPrimaryExpression {

  public SppPrimaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitPrimaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppIdentifier getIdentifier() {
    return findChildByClass(SppIdentifier.class);
  }

  @Override
  @Nullable
  public SppIfExpression getIfExpression() {
    return findChildByClass(SppIfExpression.class);
  }

  @Override
  @Nullable
  public SppInnerScope getInnerScope() {
    return findChildByClass(SppInnerScope.class);
  }

  @Override
  @Nullable
  public SppLambdaPrototype getLambdaPrototype() {
    return findChildByClass(SppLambdaPrototype.class);
  }

  @Override
  @Nullable
  public SppLiteral getLiteral() {
    return findChildByClass(SppLiteral.class);
  }

  @Override
  @Nullable
  public SppObjectInitialization getObjectInitialization() {
    return findChildByClass(SppObjectInitialization.class);
  }

  @Override
  @Nullable
  public SppParenthesizedExpression getParenthesizedExpression() {
    return findChildByClass(SppParenthesizedExpression.class);
  }

  @Override
  @Nullable
  public SppSelfKeyword getSelfKeyword() {
    return findChildByClass(SppSelfKeyword.class);
  }

  @Override
  @Nullable
  public SppWhileExpression getWhileExpression() {
    return findChildByClass(SppWhileExpression.class);
  }

  @Override
  @Nullable
  public SppWithExpression getWithExpression() {
    return findChildByClass(SppWithExpression.class);
  }

  @Override
  @Nullable
  public SppYieldExpression getYieldExpression() {
    return findChildByClass(SppYieldExpression.class);
  }

}
