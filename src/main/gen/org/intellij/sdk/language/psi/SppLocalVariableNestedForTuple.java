// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SppLocalVariableNestedForTuple extends PsiElement {

  @Nullable
  SppLocalVariableDestructure getLocalVariableDestructure();

  @Nullable
  SppLocalVariableSingle getLocalVariableSingle();

  @Nullable
  SppLocalVariableSkipArgument getLocalVariableSkipArgument();

  @Nullable
  SppLocalVariableTuple getLocalVariableTuple();

}
