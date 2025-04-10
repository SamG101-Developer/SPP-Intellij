package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.TokenSet;


public interface SppTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(
            SppTypes.IDENTIFIER,
            SppTypes.UPPER_IDENTIFIER);

    TokenSet COMMENTS = TokenSet.create(
            SppTypes.LINE_COMMENT,
            SppTypes.BLOCK_COMMENT);

    TokenSet STRINGS = TokenSet.create(
            SppTypes.LXDOUBLEQUOTESTR);

    TokenSet NUMBERS = TokenSet.create(
            SppTypes.LXDECDECIMAL,
            SppTypes.LXDECINTEGER,
            SppTypes.LXHEXDIGITS,
            SppTypes.LXBINDIGITS);

    TokenSet KEYWORDS = TokenSet.create(
            SppTypes.KWCLS,
            SppTypes.KWSUP,
            SppTypes.KWFUN,
            SppTypes.KWCOR,
            SppTypes.KWUSE,
            SppTypes.KWEXT,
            SppTypes.KWCMP,
            SppTypes.KWLET,
            SppTypes.KWMUT,
            SppTypes.KWCASE,
            SppTypes.KWELSE,
            SppTypes.KWLOOP,
            SppTypes.KWWITH,
            SppTypes.KWSKIP,
            SppTypes.KWEXIT,
            SppTypes.KWRET,
            SppTypes.KWGEN,
            SppTypes.KWWHERE,
            SppTypes.KWAS,
            SppTypes.KWIS,
            SppTypes.KWTRUE,
            SppTypes.KWFALSE,
            SppTypes.KWSELF,
            SppTypes.KWSELF,
            SppTypes.KWAND,
            SppTypes.KWOR,
            SppTypes.KWNOT,
            SppTypes.KWOF,
            SppTypes.KWIN,
            SppTypes.KWASYNC);
    TokenSet OPERATORS = TokenSet.create(
            SppTypes.TKADD,
            SppTypes.TKADDASSIGN,
            SppTypes.TKDBLCOLON, SppTypes.TKDOT, SppTypes.TKDIV, SppTypes.TKDIVASSIGN, SppTypes.TKEQ, SppTypes.TKGE,
            SppTypes.TKGE, SppTypes.TKGT, SppTypes.TKLE, SppTypes.TKLT, SppTypes.TKNE, SppTypes.TKSS, SppTypes.TKEXP,
            SppTypes.TKEXPASSIGN, SppTypes.TKMOD, SppTypes.TKMODASSIGN, SppTypes.TKMUL, SppTypes.TKMULASSIGN,
            SppTypes.TKQST, SppTypes.TKREM, SppTypes.TKREMASSIGN, SppTypes.TKSUB, SppTypes.TKSUBASSIGN);
    TokenSet BRACKETS = TokenSet.create(
            SppTypes.TKPARENL, SppTypes.TKPARENR, SppTypes.TKBRACKL, SppTypes.TKBRACKR, SppTypes.TKBRACEL,
            SppTypes.TKBRACER);
}
