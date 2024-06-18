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

public class SppBinaryExpressionLevel1Impl extends ASTWrapperPsiElement implements SppBinaryExpressionLevel1 {

  public SppBinaryExpressionLevel1Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitBinaryExpressionLevel1(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SppBinaryExpressionLevel1> getBinaryExpressionLevel1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppBinaryExpressionLevel1.class);
  }

  @Override
  @NotNull
  public SppBinaryExpressionLevel2 getBinaryExpressionLevel2() {
    return findNotNullChildByClass(SppBinaryExpressionLevel2.class);
  }

  @Override
  @NotNull
  public List<SppBinaryOpPrecedenceLevel1> getBinaryOpPrecedenceLevel1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppBinaryOpPrecedenceLevel1.class);
  }

}
