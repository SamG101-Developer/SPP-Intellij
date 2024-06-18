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

public class SppPostfixOpImpl extends ASTWrapperPsiElement implements SppPostfixOp {

  public SppPostfixOpImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitPostfixOp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppPostfixOpEarlyReturn getPostfixOpEarlyReturn() {
    return findChildByClass(SppPostfixOpEarlyReturn.class);
  }

  @Override
  @Nullable
  public SppPostfixOpFunctionCall getPostfixOpFunctionCall() {
    return findChildByClass(SppPostfixOpFunctionCall.class);
  }

  @Override
  @Nullable
  public SppPostfixOpMemberAccess getPostfixOpMemberAccess() {
    return findChildByClass(SppPostfixOpMemberAccess.class);
  }

}
