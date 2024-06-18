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

public class SppFunctionParameterImpl extends ASTWrapperPsiElement implements SppFunctionParameter {

  public SppFunctionParameterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitFunctionParameter(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppFunctionParameterOptional getFunctionParameterOptional() {
    return findChildByClass(SppFunctionParameterOptional.class);
  }

  @Override
  @Nullable
  public SppFunctionParameterRequired getFunctionParameterRequired() {
    return findChildByClass(SppFunctionParameterRequired.class);
  }

  @Override
  @Nullable
  public SppFunctionParameterSelf getFunctionParameterSelf() {
    return findChildByClass(SppFunctionParameterSelf.class);
  }

  @Override
  @Nullable
  public SppFunctionParameterVariadic getFunctionParameterVariadic() {
    return findChildByClass(SppFunctionParameterVariadic.class);
  }

}
