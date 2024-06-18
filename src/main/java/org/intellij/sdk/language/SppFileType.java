package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;


public class SppFileType extends LanguageFileType {
    public static final SppFileType INSTANCE = new SppFileType();

    private SppFileType() {
        super(SppLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "S++ File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "S++ language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "spp";
    }

    @Override
    public Icon getIcon() {
        return SppIcons.FILE;
    }
}
