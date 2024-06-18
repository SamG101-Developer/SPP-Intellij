// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SppCoroutinePrototype extends PsiElement {

  @NotNull
  List<SppAnnotation> getAnnotationList();

  @NotNull
  SppFunctionImplementation getFunctionImplementation();

  @NotNull
  SppFunctionParameters getFunctionParameters();

  @Nullable
  SppGenericParameters getGenericParameters();

  @NotNull
  SppIdentifier getIdentifier();

  @NotNull
  SppType getType();

  @Nullable
  SppWhereBlock getWhereBlock();

}
