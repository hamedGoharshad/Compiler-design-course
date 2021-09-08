package symboltable.items;

public sealed class Variable implements Item permits Field, LocalVariable, Parameter {
    protected final String name;

    public Variable(String name) {
        this.name = name;
    }
}
