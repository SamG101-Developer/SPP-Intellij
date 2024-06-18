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

public class SppGenericParameterOptionalImpl extends ASTWrapperPsiElement implements SppGenericParameterOptional {

  public SppGenericParameterOptionalImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitGenericParameterOptional(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppGenericInlineConstraints getGenericInlineConstraints() {
    return findChildByClass(SppGenericInlineConstraints.class);
  }

  @Override
  @NotNull
  public SppType getType() {
    return findNotNullChildByClass(SppType.class);
  }

  @Override
  @NotNull
  public SppUpperIdentifier getUpperIdentifier() {
    return findNotNullChildByClass(SppUpperIdentifier.class);
  }

}
