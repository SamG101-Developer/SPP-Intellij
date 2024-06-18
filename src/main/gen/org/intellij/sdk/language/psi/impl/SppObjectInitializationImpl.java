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

public class SppObjectInitializationImpl extends ASTWrapperPsiElement implements SppObjectInitialization {

  public SppObjectInitializationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitObjectInitialization(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SppObjectInitializerArguments getObjectInitializerArguments() {
    return findNotNullChildByClass(SppObjectInitializerArguments.class);
  }

  @Override
  @NotNull
  public SppTypeSingle getTypeSingle() {
    return findNotNullChildByClass(SppTypeSingle.class);
  }

}
