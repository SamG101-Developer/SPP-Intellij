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

public class SppLiteralTupleImpl extends ASTWrapperPsiElement implements SppLiteralTuple {

  public SppLiteralTupleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SppVisitor visitor) {
    visitor.visitLiteralTuple(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SppVisitor) accept((SppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SppLiteralTuple0Items getLiteralTuple0Items() {
    return findChildByClass(SppLiteralTuple0Items.class);
  }

  @Override
  @Nullable
  public SppLiteralTuple1Items getLiteralTuple1Items() {
    return findChildByClass(SppLiteralTuple1Items.class);
  }

  @Override
  @Nullable
  public SppLiteralTupleNItems getLiteralTupleNItems() {
    return findChildByClass(SppLiteralTupleNItems.class);
  }

}
