// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SppPatternVariantNestedForTuple extends PsiElement {

  @Nullable
  SppPatternVariantDestructure getPatternVariantDestructure();

  @Nullable
  SppPatternVariantLiteral getPatternVariantLiteral();

  @Nullable
  SppPatternVariantSkipArgument getPatternVariantSkipArgument();

  @Nullable
  SppPatternVariantTuple getPatternVariantTuple();

  @Nullable
  SppPatternVariantVariable getPatternVariantVariable();

}
