package symboltable.items;

public final class Parameter extends Variable {
    private final String type;

    public Parameter(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
