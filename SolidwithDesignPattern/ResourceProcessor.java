package SoftEng2.SolidwithDesignPattern;

import java.util.Map;

public class ResourceProcessor {
    private final Map<String, ResourceBorrow> resourceType;

    public ResourceProcessor(Map<String, ResourceBorrow> resourceType) {
        this.resourceType = resourceType;
    }

    public void borrowResource(Student student, Resource resource) {
        ResourceBorrow resourceBorrow = getResourceBorrower(resource);
        resourceBorrow.borrowResource(student, resource);
    }

    private ResourceBorrow getResourceBorrower(Resource resource) {
        String resourceType = resource.getResourceType();
        if (!this.resourceType.containsKey(resourceType)) {
            throw new IllegalArgumentException("Invalid resource type: " + resourceType);
        }
        return this.resourceType.get(resourceType);
    }
}
