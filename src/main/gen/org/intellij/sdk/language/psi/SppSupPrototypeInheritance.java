// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SppSupPrototypeInheritance extends PsiElement {

  @Nullable
  SppGenericParameters getGenericParameters();

  @NotNull
  SppSupImplementation getSupImplementation();

  @NotNull
  List<SppType> getTypeList();

  @Nullable
  SppWhereBlock getWhereBlock();

}
