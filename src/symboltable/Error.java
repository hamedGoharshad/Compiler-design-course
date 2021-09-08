package symboltable;

import java.util.List;

public record Error(Type type, int line, int column, List<String> fields) {
    public enum Type {
        CLASS_ALREADY_DEFINED(101),
        METHOD_ALREADY_DEFINED(102),
        FIELD_ALREADY_DEFINED(104),
        CLASS_NOT_FOUND(105),
        METHOD_NOT_FOUND(105),
        VAR_NOT_FOUND(106),
        ;


        final private int code;
        Type(int errorCode) {
            code = errorCode;
        }
    }
    @Override
    public String toString() {

        return "Error" + type.code + " in line " + line + ":" + column + ", " + switch (type) {
            case CLASS_ALREADY_DEFINED -> "class " + fields.get(0) + " has been defined already";
            case METHOD_ALREADY_DEFINED -> "method " + fields.get(0) + " has been defined already";
            case FIELD_ALREADY_DEFINED -> "field " + fields.get(0) + " has been defined already";
            case CLASS_NOT_FOUND -> "cannot find class " + fields.get(0);
            case METHOD_NOT_FOUND -> "cannot find method " + fields.get(0);
            case VAR_NOT_FOUND -> "cannot find variable" + fields.get(0);
        };
    }

}
