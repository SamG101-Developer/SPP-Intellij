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
  "."                       { return TKDOT; }
  ".."                      { return TKDBLDOT; }
  ":"                       { return TKCOLON; }
  "::"                      { return TKDBLCOLON; }
  "&"                       { return TKBORROW; }
  "|"                       { return TKUNION; }
  ","                       { return TKCOMMA; }
  "="                       { return TKASSIGN; }
  "->"                      { return TKARROWR; }
  "@"                       { return TKAT; }
  "_"                       { return TKUNDERSCORE; }
  "<EOF>"                   { return TKEOF; }
  " "                       { return TKWHITESPACE; }
  "\\n"                     { return TKNEWLINE; }
  "$"                       { return TKDOLLAR; }
  "cls"                     { return KWCLS; }
  "sup"                     { return KWSUP; }
  "fun"                     { return KWFUN; }
  "cor"                     { return KWCOR; }
  "use"                     { return KWUSE; }
  "ext"                     { return KWEXT; }
  "cmp"                     { return KWCMP; }
  "let"                     { return KWLET; }
  "mut"                     { return KWMUT; }
  "ret"                     { return KWRET; }
  "gen"                     { return KWGEN; }
  "case"                    { return KWCASE; }
  "else"                    { return KWELSE; }
  "loop"                    { return KWLOOP; }
  "skip"                    { return KWSKIP; }
  "exit"                    { return KWEXIT; }
  "with"                    { return KWWITH; }
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
  "of"                      { return KWOF; }
  "in"                      { return KWIN; }
  "async"                   { return KWASYNC; }
  "WithExpression"          { return WITHEXPRESSION; }
  "TkSs"                    { return TKSS; }

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
