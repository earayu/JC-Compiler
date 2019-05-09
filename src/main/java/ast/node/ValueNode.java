package ast.node;

import type.Type;

public class ValueNode extends Node {
    //TODO: delete??
    protected Node reference;
    protected Type type;

    public Node getReference() {
        return reference;
    }

    public Type getType() {
        return type;
    }
}
