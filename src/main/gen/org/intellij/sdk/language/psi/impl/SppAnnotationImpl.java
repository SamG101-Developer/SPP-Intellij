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

public class SppAnnotationImpl extends ASTWrapperPsiElement implements SppAnnotation {

  public SppAnnotationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitAnnotation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SppIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppIdentifier.class);
  }

  @Override
  @NotNull
  public SppPostfixOpFunctionCall getPostfixOpFunctionCall() {
    return findNotNullChildByClass(SppPostfixOpFunctionCall.class);
  }

}
