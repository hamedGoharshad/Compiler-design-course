package symboltable.items;

public final class Field extends Variable {
    private final String type;

    public Field(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Field{" +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
