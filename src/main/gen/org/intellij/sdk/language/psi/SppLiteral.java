// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SppLiteral extends PsiElement {

  @Nullable
  SppLiteralBoolean getLiteralBoolean();

  @Nullable
  SppLiteralNumber getLiteralNumber();

  @Nullable
  SppLiteralRegex getLiteralRegex();

  @Nullable
  SppLiteralString getLiteralString();

  @Nullable
  SppLiteralTuple getLiteralTuple();

}
