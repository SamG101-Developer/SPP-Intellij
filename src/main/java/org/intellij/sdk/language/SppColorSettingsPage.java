package org.intellij.sdk.language;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;


public class SppColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Identifier", SppSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("Type", SppSyntaxHighlighter.TYPE),
            new AttributesDescriptor("Keyword", SppSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("String", SppSyntaxHighlighter.STRING),
            new AttributesDescriptor("Number", SppSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("Comment", SppSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Operator", SppSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("Attribute", SppSyntaxHighlighter.ATTRIBUTE),
    };

    @Override
    @Nullable
    public Icon getIcon() {
        return SppIcons.FILE;
    }

    @Override
    @NotNull
    public SyntaxHighlighter getHighlighter() {
        return new SppSyntaxHighlighter();
    }

    @Override
    @NonNls
    @NotNull
    public String getDemoText() {
        return "Demo text";
    }

    @Override
    @Nullable
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    @NotNull
    public AttributesDescriptor [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    @NotNull
    public ColorDescriptor [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @Override
    @NotNull
    @NlsContexts.ConfigurableName
    public String getDisplayName() {
        return "S++";
    }
}
