// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SppGenericParameterOptional extends PsiElement {

  @Nullable
  SppGenericInlineConstraints getGenericInlineConstraints();

  @NotNull
  SppType getType();

  @NotNull
  SppUpperIdentifier getUpperIdentifier();

}
