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

public class SppPatternVariantImpl extends ASTWrapperPsiElement implements SppPatternVariant {

  public SppPatternVariantImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitPatternVariant(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppPatternVariantDestructure getPatternVariantDestructure() {
    return findChildByClass(SppPatternVariantDestructure.class);
  }

  @Override
  @Nullable
  public SppPatternVariantElse getPatternVariantElse() {
    return findChildByClass(SppPatternVariantElse.class);
  }

  @Override
  @Nullable
  public SppPatternVariantLiteral getPatternVariantLiteral() {
    return findChildByClass(SppPatternVariantLiteral.class);
  }

  @Override
  @Nullable
  public SppPatternVariantTuple getPatternVariantTuple() {
    return findChildByClass(SppPatternVariantTuple.class);
  }

  @Override
  @Nullable
  public SppPatternVariantVariable getPatternVariantVariable() {
    return findChildByClass(SppPatternVariantVariable.class);
  }

}
