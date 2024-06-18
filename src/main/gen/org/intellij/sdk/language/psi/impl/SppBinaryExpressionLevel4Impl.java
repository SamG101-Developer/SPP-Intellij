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

public class SppBinaryExpressionLevel4Impl extends ASTWrapperPsiElement implements SppBinaryExpressionLevel4 {

  public SppBinaryExpressionLevel4Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitBinaryExpressionLevel4(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SppBinaryExpressionLevel4> getBinaryExpressionLevel4List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppBinaryExpressionLevel4.class);
  }

  @Override
  @NotNull
  public SppBinaryExpressionLevel5 getBinaryExpressionLevel5() {
    return findNotNullChildByClass(SppBinaryExpressionLevel5.class);
  }

  @Override
  @NotNull
  public List<SppBinaryOpPrecedenceLevel4> getBinaryOpPrecedenceLevel4List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppBinaryOpPrecedenceLevel4.class);
  }

}
