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
            SppTypes.KWAND,
            SppTypes.KWAS,
            SppTypes.KWASYNC,
            SppTypes.KWCASE,
            SppTypes.KWCLS,
            SppTypes.KWCOR,
            SppTypes.KWELSE,
            SppTypes.KWEXIT,
            SppTypes.KWEXT,
            SppTypes.KWFALSE,
            SppTypes.KWFUN,
            SppTypes.KWGEN,
            SppTypes.KWIN,
            SppTypes.KWIS,
            SppTypes.KWLET,
            SppTypes.KWLOOP,
            SppTypes.KWMUT,
            SppTypes.KWNOT,
            SppTypes.KWOR,
            SppTypes.KWPIN,
            SppTypes.KWREL,
            SppTypes.KWRET,
            SppTypes.KWSELF,
            SppTypes.KWSELFTYPE,
            SppTypes.KWSKIP,
            SppTypes.KWSUP,
            SppTypes.KWTHEN,
            SppTypes.KWTRUE,
            SppTypes.KWUSE,
            SppTypes.KWWHERE,
            SppTypes.KWWITH);
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
