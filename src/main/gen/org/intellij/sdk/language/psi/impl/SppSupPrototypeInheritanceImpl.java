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

public class SppSupPrototypeInheritanceImpl extends ASTWrapperPsiElement implements SppSupPrototypeInheritance {

  public SppSupPrototypeInheritanceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitSupPrototypeInheritance(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppGenericParameters getGenericParameters() {
    return findChildByClass(SppGenericParameters.class);
  }

  @Override
  @NotNull
  public SppSupImplementation getSupImplementation() {
    return findNotNullChildByClass(SppSupImplementation.class);
  }

  @Override
  @NotNull
  public List<SppType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppType.class);
  }

  @Override
  @Nullable
  public SppWhereBlock getWhereBlock() {
    return findChildByClass(SppWhereBlock.class);
  }

}
