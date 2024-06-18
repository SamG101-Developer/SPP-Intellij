// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SppGenericParameter extends PsiElement {

  @Nullable
  SppGenericParameterOptional getGenericParameterOptional();

  @Nullable
  SppGenericParameterRequired getGenericParameterRequired();

  @Nullable
  SppGenericParameterVariadic getGenericParameterVariadic();

}
