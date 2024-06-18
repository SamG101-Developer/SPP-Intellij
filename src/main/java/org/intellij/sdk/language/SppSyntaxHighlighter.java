package org.intellij.sdk.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.SppTokenSets;
import org.intellij.sdk.language.psi.SppTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.HighlighterColors.BAD_CHARACTER;


public class SppSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey IDENTIFIER = TextAttributesKey.createTextAttributesKey("SPP_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey TYPE = TextAttributesKey.createTextAttributesKey("SPP_TYPE", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("SPP_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey("SPP_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey("SPP_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey("SPP_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey OPERATOR = TextAttributesKey.createTextAttributesKey("SPP_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey ATTRIBUTE = TextAttributesKey.createTextAttributesKey("SPP_ATTRIBUTE", DefaultLanguageHighlighterColors.METADATA);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] TYPE_KEYS = new TextAttributesKey[]{TYPE};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] ATTRIBUTE_KEYS = new TextAttributesKey[]{ATTRIBUTE};

    @Override
    @NotNull
    public Lexer getHighlightingLexer() {
        return new SppLexerAdapter();
    }

    @Override
    @NotNull
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (SppTokenSets.KEYWORDS.contains(tokenType)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(SppTypes.LXIDENTIFIER)) {
            return IDENTIFIER_KEYS;
        } else if (tokenType.equals(SppTypes.LXUPPERIDENTIFIER)) {
            return TYPE_KEYS;
        } else if (tokenType.equals(SppTypes.LXPOSTFIXIDENTIFIER)) {
            return ATTRIBUTE_KEYS;
        } else if (SppTokenSets.OPERATORS.contains(tokenType)) {
            return OPERATOR_KEYS;
        } else if (SppTokenSets.STRINGS.contains(tokenType)) {
            return STRING_KEYS;
        } else if (SppTokenSets.NUMBERS.contains(tokenType)) {
            return NUMBER_KEYS;
        } else if (SppTokenSets.COMMENTS.contains(tokenType)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return TextAttributesKey.EMPTY_ARRAY;
    }
}
