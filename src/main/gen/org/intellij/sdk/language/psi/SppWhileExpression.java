// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SppWhileExpression extends PsiElement {

  @NotNull
  SppExpression getExpression();

  @NotNull
  SppInnerScope getInnerScope();

  @Nullable
  SppWhileElseExpression getWhileElseExpression();

}