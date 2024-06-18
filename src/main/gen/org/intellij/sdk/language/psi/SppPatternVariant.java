// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SppPatternVariant extends PsiElement {

  @Nullable
  SppPatternVariantDestructure getPatternVariantDestructure();

  @Nullable
  SppPatternVariantElse getPatternVariantElse();

  @Nullable
  SppPatternVariantLiteral getPatternVariantLiteral();

  @Nullable
  SppPatternVariantTuple getPatternVariantTuple();

  @Nullable
  SppPatternVariantVariable getPatternVariantVariable();

}
