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

public class SppModuleMemberImpl extends ASTWrapperPsiElement implements SppModuleMember {

  public SppModuleMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitModuleMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppClassPrototype getClassPrototype() {
    return findChildByClass(SppClassPrototype.class);
  }

  @Override
  @Nullable
  public SppFunctionPrototype getFunctionPrototype() {
    return findChildByClass(SppFunctionPrototype.class);
  }

  @Override
  @Nullable
  public SppLetStatementInitialized getLetStatementInitialized() {
    return findChildByClass(SppLetStatementInitialized.class);
  }

  @Override
  @Nullable
  public SppSupPrototypeInheritance getSupPrototypeInheritance() {
    return findChildByClass(SppSupPrototypeInheritance.class);
  }

  @Override
  @Nullable
  public SppSupPrototypeNormal getSupPrototypeNormal() {
    return findChildByClass(SppSupPrototypeNormal.class);
  }

  @Override
  @Nullable
  public SppTypedefStatement getTypedefStatement() {
    return findChildByClass(SppTypedefStatement.class);
  }

}
