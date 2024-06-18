// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SppStatement extends PsiElement {

  @Nullable
  SppAssignmentStatement getAssignmentStatement();

  @Nullable
  SppExpression getExpression();

  @Nullable
  SppLetStatement getLetStatement();

  @Nullable
  SppReturnStatement getReturnStatement();

  @Nullable
  SppTypedefStatement getTypedefStatement();

}
