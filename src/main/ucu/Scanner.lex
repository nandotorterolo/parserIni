/* JFlex example: partial Java language lexer specification */
package ucu;
import ucu.SFXFactory;
import ucu.sym;
import java_cup.runtime.*;


/**
 * This class is a simple example lexer.
 */
%%

%cup
%public
%unicode
%class Scanner
%implements sym
%line
%column

%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*


%%
\[.*\]       { return symbol(SECCION,yytext()); }
\.*=[^\s].*  { return symbol(ELEMENTO,yytext()); }
[ \r\n\t\f]	 { /* ignorar */ }

.                    {throw new Error("Illegal character <"+yytext()+">"); }
