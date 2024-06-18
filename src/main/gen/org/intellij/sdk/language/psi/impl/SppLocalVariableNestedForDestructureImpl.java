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

public class SppLocalVariableNestedForDestructureImpl extends ASTWrapperPsiElement implements SppLocalVariableNestedForDestructure {

  public SppLocalVariableNestedForDestructureImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitLocalVariableNestedForDestructure(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppLocalVariableAssignment getLocalVariableAssignment() {
    return findChildByClass(SppLocalVariableAssignment.class);
  }

  @Override
  @Nullable
  public SppLocalVariableSingle getLocalVariableSingle() {
    return findChildByClass(SppLocalVariableSingle.class);
  }

  @Override
  @Nullable
  public SppLocalVariableSkipArgument getLocalVariableSkipArgument() {
    return findChildByClass(SppLocalVariableSkipArgument.class);
  }

}
