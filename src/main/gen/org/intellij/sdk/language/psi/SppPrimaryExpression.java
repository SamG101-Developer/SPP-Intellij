// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SppPrimaryExpression extends PsiElement {

  @Nullable
  SppIdentifier getIdentifier();

  @Nullable
  SppIfExpression getIfExpression();

  @Nullable
  SppInnerScope getInnerScope();

  @Nullable
  SppLambdaPrototype getLambdaPrototype();

  @Nullable
  SppLiteral getLiteral();

  @Nullable
  SppObjectInitialization getObjectInitialization();

  @Nullable
  SppParenthesizedExpression getParenthesizedExpression();

  @Nullable
  SppSelfKeyword getSelfKeyword();

  @Nullable
  SppWhileExpression getWhileExpression();

  @Nullable
  SppWithExpression getWithExpression();

  @Nullable
  SppYieldExpression getYieldExpression();

}
