package classfile;

import classfile.attribute.AttributeInfo;

import java.util.List;

public class MethodInfo {
    private List<AccessFlag> accessFlags;
    private int nameIndex;
    private int descriptorIndex;
    private int attributesCount;
    private AttributeInfo[] attributes;
}
