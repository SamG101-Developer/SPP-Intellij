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

public class SppBinaryExpressionLevel7Impl extends ASTWrapperPsiElement implements SppBinaryExpressionLevel7 {

  public SppBinaryExpressionLevel7Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitBinaryExpressionLevel7(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SppBinaryExpressionLevel7> getBinaryExpressionLevel7List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppBinaryExpressionLevel7.class);
  }

  @Override
  @NotNull
  public List<SppBinaryOpPrecedenceLevel7> getBinaryOpPrecedenceLevel7List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppBinaryOpPrecedenceLevel7.class);
  }

  @Override
  @NotNull
  public SppUnaryExpression getUnaryExpression() {
    return findNotNullChildByClass(SppUnaryExpression.class);
  }

}
