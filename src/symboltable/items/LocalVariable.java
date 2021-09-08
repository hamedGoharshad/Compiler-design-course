package symboltable.items;

public final class LocalVariable extends Variable {
    private final String initialValue;

    public LocalVariable(String name, String initialValue) {
        super(name);
        this.initialValue = initialValue;
    }

    @Override
    public String toString() {
        return "LocalVariable{" +
                "initialValue='" + initialValue + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
