package SoftEng2.SolidwithDesignPattern;
import java.util.*;

public class ResourceTest {
    public static void main(String[] args){

        Map<String, ResourceBorrow> resourceFactory = new HashMap<>();

        resourceFactory.put("book", new ResourceType());
        resourceFactory.put("thesis", new ResourceType());
        resourceFactory.put("journal", new ResourceType());
        resourceFactory.put("audio book", new ResourceType());
        resourceFactory.put("e-journal", new ResourceType());

        ResourceProcessor resourceProcessor = new ResourceProcessor(resourceFactory);

        Student student1 = new Student("John Michael");
        Student student2 = new Student("Chuwunator");
        Student student3 = new Student("Gelo");
        Student student4 = new Student("Noy noy");
        Student student5 = new Student("Red the Man");

        Resource book = new Resource("book", "Echoes of Eternity: A Tale of Time and Space");
        Resource audioBook = new Resource("audio book", "The Power of Now: Embracing the Present Moment");
        Resource thesis = new Resource("thesis", "Understanding Cyber-security Threats in the Age of Digital Transformation");
        Resource journal = new Resource("journal", "Perspectives in Computer Science: Advances in Technology and Innovation");
        Resource e_journal = new Resource("e-journal", "TechTalk: A Digital Forum for Innovation and Collaboration");


        System.out.println("------Library System------\n");
        resourceProcessor.borrowResource(student1, book);
        System.out.println();

        resourceProcessor.borrowResource(student2, thesis);
        System.out.println();

        resourceProcessor.borrowResource(student3, journal);
        System.out.println();

        resourceProcessor.borrowResource(student4, audioBook);
        System.out.println();

        resourceProcessor.borrowResource(student5, e_journal);
        System.out.println();


    }
}
