package SoftEng2.SolidwithDesignPattern;

public class ResourceType implements ResourceBorrow {
    public void borrowResource(Student student, Resource resource) {
        System.out.println("Student Name: "+student.getName() + " \nBorrowed Resource: " + resource.getResourceType() + "\nTitle: " + resource.getTitle());
    }
}
