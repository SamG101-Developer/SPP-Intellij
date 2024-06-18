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

public class SppCoroutinePrototypeImpl extends ASTWrapperPsiElement implements SppCoroutinePrototype {

  public SppCoroutinePrototypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitCoroutinePrototype(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SppAnnotation> getAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SppAnnotation.class);
  }

  @Override
  @NotNull
  public SppFunctionImplementation getFunctionImplementation() {
    return findNotNullChildByClass(SppFunctionImplementation.class);
  }

  @Override
  @NotNull
  public SppFunctionParameters getFunctionParameters() {
    return findNotNullChildByClass(SppFunctionParameters.class);
  }

  @Override
  @Nullable
  public SppGenericParameters getGenericParameters() {
    return findChildByClass(SppGenericParameters.class);
  }

  @Override
  @NotNull
  public SppIdentifier getIdentifier() {
    return findNotNullChildByClass(SppIdentifier.class);
  }

  @Override
  @NotNull
  public SppType getType() {
    return findNotNullChildByClass(SppType.class);
  }

  @Override
  @Nullable
  public SppWhereBlock getWhereBlock() {
    return findChildByClass(SppWhereBlock.class);
  }

}
