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

public class SppBinaryExpressionLevel3Impl extends ASTWrapperPsiElement implements SppBinaryExpressionLevel3 {

  public SppBinaryExpressionLevel3Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitBinaryExpressionLevel3(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SppBinaryExpressionLevel3> getBinaryExpressionLevel3List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppBinaryExpressionLevel3.class);
  }

  @Override
  @NotNull
  public SppBinaryExpressionLevel4 getBinaryExpressionLevel4() {
    return findNotNullChildByClass(SppBinaryExpressionLevel4.class);
  }

  @Override
  @NotNull
  public List<SppBinaryOpPrecedenceLevel3> getBinaryOpPrecedenceLevel3List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppBinaryOpPrecedenceLevel3.class);
  }

}
