package compiler;

import gen.CoolLexer;
import gen.CoolParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import symboltable.SymbolTableMaker;

import java.io.IOException;

public class Compiler {
    public static void main(String[] args) throws IOException {
        var stream = CharStreams.fromFileName("res/phase1.cl");
        var lexer = new CoolLexer(stream);
        var token = new CommonTokenStream(lexer);
        var parser = new CoolParser(token);
        parser.setBuildParseTree(true);
        var tree = parser.program();
        var walker = new ParseTreeWalker();
        var listener = new SymbolTableMaker();
        walker.walk(listener, tree);

    }
}
