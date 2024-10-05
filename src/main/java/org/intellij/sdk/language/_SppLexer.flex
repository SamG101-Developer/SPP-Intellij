package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.intellij.sdk.language.psi.SppTypes.*;

%%

%{
  public _SppLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _SppLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

LINE_COMMENT=#.*
BLOCK_COMMENT=##[^#]*##
LXREGEX=r\".*\"
LXIDENTIFIER=[a-z][_a-zA-Z0-9]*
LXUPPERIDENTIFIER=[A-Z][_a-zA-Z0-9]*
LXBINDIGITS=0b[01]+
LXHEXDIGITS=0x[0-9a-fA-F]+
LXDECINTEGER=[0-9]([0-9_]*[0-9])?
LXDECDECIMAL=[0-9]([0-9_]*[0-9])?\.[0-9]([0-9_]*[0-9])?
LXDOUBLEQUOTESTR=\"[^\"]*\"

%%
<YYINITIAL> {
  {WHITE_SPACE}             { return WHITE_SPACE; }

  "=="                      { return TKEQ; }
  "!="                      { return TKNE; }
  "<="                      { return TKLE; }
  ">="                      { return TKGE; }
  "<"                       { return TKLT; }
  ">"                       { return TKGT; }
  "<=>"                     { return TKSS; }
  "+"                       { return TKADD; }
  "-"                       { return TKSUB; }
  "*"                       { return TKMUL; }
  "/"                       { return TKDIV; }
  "%"                       { return TKREM; }
  "%%"                      { return TKMOD; }
  "**"                      { return TKEXP; }
  "+="                      { return TKADDASSIGN; }
  "-="                      { return TKSUBASSIGN; }
  "*="                      { return TKMULASSIGN; }
  "/="                      { return TKDIVASSIGN; }
  "%="                      { return TKREMASSIGN; }
  "%%="                     { return TKMODASSIGN; }
  "**="                     { return TKEXPASSIGN; }
  "("                       { return TKPARENL; }
  ")"                       { return TKPARENR; }
  "["                       { return TKBRACKL; }
  "]"                       { return TKBRACKR; }
  "{"                       { return TKBRACEL; }
  "}"                       { return TKBRACER; }
  "?"                       { return TKQST; }
  ".."                      { return TKVARIADIC; }
  ":"                       { return TKCOLON; }
  "&"                       { return TKBORROW; }
  "|"                       { return TKUNION; }
  "."                       { return TKDOT; }
  "::"                      { return TKDBLCOLON; }
  ","                       { return TKCOMMA; }
  "="                       { return TKASSIGN; }
  "->"                      { return TKARROWR; }
  "@"                       { return TKAT; }
  "_"                       { return TKUNDERSCORE; }
  "cls"                     { return KWCLS; }
  "sup"                     { return KWSUP; }
  "fun"                     { return KWFUN; }
  "cor"                     { return KWCOR; }
  "use"                     { return KWUSE; }
  "ext"                     { return KWEXT; }
  "let"                     { return KWLET; }
  "mut"                     { return KWMUT; }
  "pin"                     { return KWPIN; }
  "rel"                     { return KWREL; }
  "case"                    { return KWCASE; }
  "else"                    { return KWELSE; }
  "loop"                    { return KWLOOP; }
  "with"                    { return KWWITH; }
  "skip"                    { return KWSKIP; }
  "exit"                    { return KWEXIT; }
  "ret"                     { return KWRET; }
  "gen"                     { return KWGEN; }
  "where"                   { return KWWHERE; }
  "as"                      { return KWAS; }
  "is"                      { return KWIS; }
  "true"                    { return KWTRUE; }
  "false"                   { return KWFALSE; }
  "self"                    { return KWSELF; }
  "Self"                    { return KWSELFTYPE; }
  "and"                     { return KWAND; }
  "or"                      { return KWOR; }
  "not"                     { return KWNOT; }
  "in"                      { return KWIN; }
  "async"                   { return KWASYNC; }
  "then"                    { return KWTHEN; }
  "TkIn"                    { return TKIN; }

  {LINE_COMMENT}            { return LINE_COMMENT; }
  {BLOCK_COMMENT}           { return BLOCK_COMMENT; }
  {LXREGEX}                 { return LXREGEX; }
  {LXIDENTIFIER}            { return LXIDENTIFIER; }
  {LXUPPERIDENTIFIER}       { return LXUPPERIDENTIFIER; }
  {LXBINDIGITS}             { return LXBINDIGITS; }
  {LXHEXDIGITS}             { return LXHEXDIGITS; }
  {LXDECINTEGER}            { return LXDECINTEGER; }
  {LXDECDECIMAL}            { return LXDECDECIMAL; }
  {LXDOUBLEQUOTESTR}        { return LXDOUBLEQUOTESTR; }

}

[^] { return BAD_CHARACTER; }
