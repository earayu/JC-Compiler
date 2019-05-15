package type.typetype;

import java.util.List;
import java.util.Objects;

public abstract class Type {
    abstract public String generateDescriptor();

    public String visualInfo() {
        return this.getClass().getSimpleName();
    }

    public String getSimpleName() {
        return visualInfo();
    }

    abstract public Object generateDefaultValue();
}
