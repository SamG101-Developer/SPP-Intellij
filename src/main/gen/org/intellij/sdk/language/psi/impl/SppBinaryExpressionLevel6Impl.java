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

public class SppBinaryExpressionLevel6Impl extends ASTWrapperPsiElement implements SppBinaryExpressionLevel6 {

  public SppBinaryExpressionLevel6Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitBinaryExpressionLevel6(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SppBinaryExpressionLevel6> getBinaryExpressionLevel6List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppBinaryExpressionLevel6.class);
  }

  @Override
  @NotNull
  public SppBinaryExpressionLevel7 getBinaryExpressionLevel7() {
    return findNotNullChildByClass(SppBinaryExpressionLevel7.class);
  }

  @Override
  @NotNull
  public List<SppBinaryOpPrecedenceLevel6> getBinaryOpPrecedenceLevel6List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppBinaryOpPrecedenceLevel6.class);
  }

}
