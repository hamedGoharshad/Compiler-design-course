package symboltable.items;

public final class Block extends Scope implements Item {
    @Override
    public String toString() {
        return "Block{" +
                "symbolTable=" + symbolTable +
                '}';
    }
}
