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

public class SppLocalVariableNestedForTupleImpl extends ASTWrapperPsiElement implements SppLocalVariableNestedForTuple {

  public SppLocalVariableNestedForTupleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitLocalVariableNestedForTuple(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppLocalVariableDestructure getLocalVariableDestructure() {
    return findChildByClass(SppLocalVariableDestructure.class);
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

  @Override
  @Nullable
  public SppLocalVariableTuple getLocalVariableTuple() {
    return findChildByClass(SppLocalVariableTuple.class);
  }

}
