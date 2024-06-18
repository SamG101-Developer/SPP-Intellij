package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.TokenSet;


public interface SppTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(SppTypes.IDENTIFIER, SppTypes.UPPER_IDENTIFIER);
    TokenSet COMMENTS = TokenSet.create(SppTypes.LINE_COMMENT, SppTypes.BLOCK_COMMENT);
    TokenSet STRINGS = TokenSet.create(SppTypes.LXDOUBLEQUOTESTR);
    TokenSet NUMBERS = TokenSet.create(
            SppTypes.LXDECDECIMAL, SppTypes.LXDECINTEGER, SppTypes.LXHEXDIGITS, SppTypes.LXBINDIGITS);
    TokenSet KEYWORDS = TokenSet.create(
            SppTypes.KWAS, SppTypes.KWASYNC, SppTypes.KWCASE, SppTypes.KWCLS, SppTypes.KWCOR, SppTypes.KWELSE,
            SppTypes.KWFALSE, SppTypes.KWFUN, SppTypes.KWGEN, SppTypes.KWIS, SppTypes.KWLET, SppTypes.KWLOOP,
            SppTypes.KWMOD, SppTypes.KWMUT, SppTypes.KWON, SppTypes.KWRET, SppTypes.KWSELF, SppTypes.KWSELFTYPE,
            SppTypes.KWSUP, SppTypes.KWTHEN, SppTypes.KWTRUE, SppTypes.KWUSE, SppTypes.KWWHERE, SppTypes.KWWITH);
    TokenSet OPERATORS = TokenSet.create(
            SppTypes.TKADD, SppTypes.TKADDASSIGN, SppTypes.TKBITAND, SppTypes.TKBITANDASSIGN, SppTypes.TKBITOR,
            SppTypes.TKBITORASSIGN, SppTypes.TKBITXOR, SppTypes.TKBITXORASSIGN, SppTypes.TKBITROTATEL,
            SppTypes.TKBITROTATER, SppTypes.TKBITROTATELASSIGN, SppTypes.TKBITROTATERASSIGN, SppTypes.TKBITSHIFTL,
            SppTypes.TKBITSHIFTR, SppTypes.TKBITSHIFTLASSIGN, SppTypes.TKBITSHIFTRASSIGN, SppTypes.TKCOALESCE,
            SppTypes.TKDBLCOLON, SppTypes.TKDOT, SppTypes.TKDIV, SppTypes.TKDIVASSIGN, SppTypes.TKEQ, SppTypes.TKGE,
            SppTypes.TKGE, SppTypes.TKGT, SppTypes.TKLE, SppTypes.TKLT, SppTypes.TKNE, SppTypes.TKSS, SppTypes.TKEXP,
            SppTypes.TKEXPASSIGN, SppTypes.TKMOD, SppTypes.TKMODASSIGN, SppTypes.TKMUL, SppTypes.TKMULASSIGN,
            SppTypes.TKLOGICALAND, SppTypes.TKLOGICALANDASSIGN, SppTypes.TKLOGICALOR, SppTypes.TKLOGICALORASSIGN,
            SppTypes.TKQST, SppTypes.TKREM, SppTypes.TKREMASSIGN, SppTypes.TKSUB, SppTypes.TKSUBASSIGN);
    TokenSet BRACKETS = TokenSet.create(
            SppTypes.TKPARENL, SppTypes.TKPARENR, SppTypes.TKBRACKL, SppTypes.TKBRACKR, SppTypes.TKBRACEL,
            SppTypes.TKBRACER);
}
