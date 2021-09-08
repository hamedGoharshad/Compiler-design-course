package symboltable.items;

import java.util.*;

public class Scope {
    protected final Hashtable<String, Item> symbolTable = new Hashtable<>();

    public void insert(String id, Item item) {
        symbolTable.put(id, item);
    }

    public Optional<Item> lookup(String id) {
        return symbolTable.keySet().stream().filter(s -> s.matches(id + "_\\d+_\\d+")).map(symbolTable::get).findFirst();
    }

    public void print() {
        var scopes = new LinkedList<Scope>();
        scopes.push(this);
        System.out.println();
        while (!scopes.isEmpty()) {
            var scope = scopes.pop();
            scope.symbolTable.forEach((k, item) -> {
                System.out.println(item);
                if (item instanceof Scope newScope)
                    scopes.add(newScope);
            });
            System.out.println();
        }

    }

    public int getSize() {
        return symbolTable.size();
    }
}
