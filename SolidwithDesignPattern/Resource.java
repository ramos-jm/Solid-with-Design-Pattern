package SoftEng2.SolidwithDesignPattern;

public class Resource {
    private final String title;
    private final String resourceType;

    public Resource(String resourceType, String title) {
        this.title = title;
        this.resourceType = resourceType;
    }

    public String getTitle() {
        return title;
    }

    public String getResourceType() {
        return resourceType;
    }
}
