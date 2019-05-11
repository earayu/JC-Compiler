package type.typetype;

import java.util.List;
import java.util.Objects;

public class FunctionType extends Type {
    private List<Type> parameterTypes;
    private Type returnType;

    @Override
    public String generateFieldDescriptor() {
        return "(" + generateParameterDescriptor() + ")" + returnType.generateFieldDescriptor();
    }

    private String generateParameterDescriptor() {
        StringBuilder sb = new StringBuilder();
        for (Type type: parameterTypes) {
            sb.append(type.generateFieldDescriptor());
        }
        return sb.toString();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FunctionType that = (FunctionType) o;
        return Objects.equals(parameterTypes, that.parameterTypes) &&
                Objects.equals(returnType, that.returnType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameterTypes, returnType);
    }

    FunctionType(List<Type> parameterTypes, Type returnType) {
        this.parameterTypes = parameterTypes;
        this.returnType = returnType;
    }

    public List<Type> getParameterTypes() {
        return parameterTypes;
    }

    public Type getReturnType() {
        return returnType;
    }
}
