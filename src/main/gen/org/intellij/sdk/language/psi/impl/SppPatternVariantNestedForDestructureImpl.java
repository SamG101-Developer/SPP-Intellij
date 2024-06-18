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

public class SppPatternVariantNestedForDestructureImpl extends ASTWrapperPsiElement implements SppPatternVariantNestedForDestructure {

  public SppPatternVariantNestedForDestructureImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitPatternVariantNestedForDestructure(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppPatternVariantAssignment getPatternVariantAssignment() {
    return findChildByClass(SppPatternVariantAssignment.class);
  }

  @Override
  @Nullable
  public SppPatternVariantSkipArgument getPatternVariantSkipArgument() {
    return findChildByClass(SppPatternVariantSkipArgument.class);
  }

  @Override
  @Nullable
  public SppPatternVariantVariable getPatternVariantVariable() {
    return findChildByClass(SppPatternVariantVariable.class);
  }

}