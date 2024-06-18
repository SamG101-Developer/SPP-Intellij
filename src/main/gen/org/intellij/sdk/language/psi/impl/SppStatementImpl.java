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

public class SppStatementImpl extends ASTWrapperPsiElement implements SppStatement {

  public SppStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppAssignmentStatement getAssignmentStatement() {
    return findChildByClass(SppAssignmentStatement.class);
  }

  @Override
  @Nullable
  public SppExpression getExpression() {
    return findChildByClass(SppExpression.class);
  }

  @Override
  @Nullable
  public SppLetStatement getLetStatement() {
    return findChildByClass(SppLetStatement.class);
  }

  @Override
  @Nullable
  public SppReturnStatement getReturnStatement() {
    return findChildByClass(SppReturnStatement.class);
  }

  @Override
  @Nullable
  public SppTypedefStatement getTypedefStatement() {
    return findChildByClass(SppTypedefStatement.class);
  }

}
