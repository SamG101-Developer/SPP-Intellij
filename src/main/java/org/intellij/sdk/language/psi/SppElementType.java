package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.SppLanguage;


public class SppElementType extends IElementType {
    public SppElementType(String debugName) {
        super(debugName, SppLanguage.INSTANCE);
    }
}
