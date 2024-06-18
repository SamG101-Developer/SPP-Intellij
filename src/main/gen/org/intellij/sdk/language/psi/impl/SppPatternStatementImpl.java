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

public class SppPatternStatementImpl extends ASTWrapperPsiElement implements SppPatternStatement {

  public SppPatternStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitPatternStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SppInnerScope getInnerScope() {
    return findNotNullChildByClass(SppInnerScope.class);
  }

  @Override
  @Nullable
  public SppPatternCompOp getPatternCompOp() {
    return findChildByClass(SppPatternCompOp.class);
  }

  @Override
  @Nullable
  public SppPatternGuard getPatternGuard() {
    return findChildByClass(SppPatternGuard.class);
  }

  @Override
  @NotNull
  public List<SppPatternVariant> getPatternVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppPatternVariant.class);
  }

}
