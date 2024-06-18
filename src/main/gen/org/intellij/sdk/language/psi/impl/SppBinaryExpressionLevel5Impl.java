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

public class SppBinaryExpressionLevel5Impl extends ASTWrapperPsiElement implements SppBinaryExpressionLevel5 {

  public SppBinaryExpressionLevel5Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitBinaryExpressionLevel5(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SppBinaryExpressionLevel5> getBinaryExpressionLevel5List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppBinaryExpressionLevel5.class);
  }

  @Override
  @NotNull
  public SppBinaryExpressionLevel6 getBinaryExpressionLevel6() {
    return findNotNullChildByClass(SppBinaryExpressionLevel6.class);
  }

  @Override
  @NotNull
  public List<SppBinaryOpPrecedenceLevel5> getBinaryOpPrecedenceLevel5List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppBinaryOpPrecedenceLevel5.class);
  }

}
