// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SppClassPrototype extends PsiElement {

  @NotNull
  List<SppAnnotation> getAnnotationList();

  @NotNull
  SppClassImplementation getClassImplementation();

  @Nullable
  SppGenericParameters getGenericParameters();

  @NotNull
  SppUpperIdentifier getUpperIdentifier();

  @Nullable
  SppWhereBlock getWhereBlock();

}
