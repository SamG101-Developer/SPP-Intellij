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

public class SppLambdaSubroutinePrototypeImpl extends ASTWrapperPsiElement implements SppLambdaSubroutinePrototype {

  public SppLambdaSubroutinePrototypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitLambdaSubroutinePrototype(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
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
  public SppLambdaCaptureBlock getLambdaCaptureBlock() {
    return findNotNullChildByClass(SppLambdaCaptureBlock.class);
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
