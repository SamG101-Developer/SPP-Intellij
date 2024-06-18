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

public class SppPatternVariantLiteralImpl extends ASTWrapperPsiElement implements SppPatternVariantLiteral {

  public SppPatternVariantLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitPatternVariantLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppLiteralBoolean getLiteralBoolean() {
    return findChildByClass(SppLiteralBoolean.class);
  }

  @Override
  @Nullable
  public SppLiteralNumber getLiteralNumber() {
    return findChildByClass(SppLiteralNumber.class);
  }

  @Override
  @Nullable
  public SppLiteralString getLiteralString() {
    return findChildByClass(SppLiteralString.class);
  }

}
