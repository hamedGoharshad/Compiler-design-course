package symboltable.items;

import java.util.ArrayList;

public final class Class extends Scope implements Item {
    private final String name;
    private final ArrayList<Field> fields = new ArrayList<>();
    private final ArrayList<Method> methods = new ArrayList<>();

    private final String parent;

    public Class(String name, String parent) {
        this.name = name;
        this.parent = parent;
    }

    public void addField(Field field) {
        fields.add(field);
    }

    public void addMethod(Method method) {
        methods.add(method);
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", fields=" + fields +
                ", methods=" + methods +
                ", parent='" + parent + '\'' +
                '}';
    }

    public String getParent() {
        return parent;
    }
}
