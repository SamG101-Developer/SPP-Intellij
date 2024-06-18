package org.intellij.sdk.language;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import org.intellij.sdk.language.psi.*;
import org.jetbrains.annotations.NotNull;


final class SppAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (element instanceof SppConvention convention && convention.getTextRange().getLength() > 0) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION).range(element).textAttributes(SppSyntaxHighlighter.CONVENTION).create();
        }
        else if (element instanceof SppIdentifier && element.getParent() instanceof SppSubroutinePrototype) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION).range(element).textAttributes(SppSyntaxHighlighter.ATTRIBUTE).create();
        }
        else if (element instanceof SppIdentifier && element.getParent() instanceof SppCoroutinePrototype) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION).range(element).textAttributes(SppSyntaxHighlighter.ATTRIBUTE).create();
        }
        else if (element instanceof SppIdentifier && element.getParent() instanceof SppClassAttribute) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION).range(element).textAttributes(SppSyntaxHighlighter.ATTRIBUTE).create();
        }
        else if (element instanceof SppIdentifier && element.getParent() instanceof SppPostfixOpMemberAccessRuntime) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION).range(element).textAttributes(SppSyntaxHighlighter.ATTRIBUTE).create();
        }
        else if (element instanceof SppIdentifier && element.getParent() instanceof SppPostfixOpMemberAccessStatic) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION).range(element).textAttributes(SppSyntaxHighlighter.TYPE).create();
        }
    }
}
