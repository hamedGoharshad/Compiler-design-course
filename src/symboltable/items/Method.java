package symboltable.items;

import java.util.ArrayList;

public final class Method extends Scope implements Item {
    private final String name;
    private final String returnType;
    private final ArrayList<Parameter> parameters = new ArrayList<>();

    public Method(String name, String returnType) {
        this.name = name;
        this.returnType = returnType;
    }

    public void addParameter(Parameter parameter) {
        parameters.add(parameter);
    }

    @Override
    public String toString() {
        return "Method{" +
                "name='" + name + '\'' +
                ", returnType='" + returnType + '\'' +
                ", parameters=" + parameters +
                ", accessModifier=" + accessModifier +
                '}';
    }
}
