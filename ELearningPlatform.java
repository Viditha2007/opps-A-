package scenarioBasedPrograms;
abstract class Course {
 String courseName;

 Course(String courseName) {
     this.courseName = courseName;
 }
 abstract void startCourse();
 abstract void endCourse();

 void getCourseDetails() {
     System.out.println("Course: " + courseName);
 }

 void giveCertificate() {
     System.out.println("Certificate granted for: " + courseName);
 }
}

class ProgrammingCourse extends Course {
 ProgrammingCourse(String courseName) {
     super(courseName);
 }

 @Override
 void startCourse() {
     System.out.println("Programming course started with coding exercises.");
 }

 @Override
 void endCourse() {
     System.out.println("Programming course ended with a project submission.");
 }
}

//Subclass 2
class LanguageCourse extends Course {
 LanguageCourse(String courseName) {
     super(courseName);
 }

 @Override
 void startCourse() {
     System.out.println("Language course started with vocabulary lessons.");
 }

 @Override
 void endCourse() {
     System.out.println("Language course ended with an oral exam.");
 }
}
public class ELearningPlatform {
 public static void main(String[] args) {
     Course c1 = new ProgrammingCourse("Java Programming");
     c1.getCourseDetails();
     c1.startCourse();
     c1.endCourse();
     c1.giveCertificate();

     Course c2 = new LanguageCourse("German Language");
     c2.getCourseDetails();
     c2.startCourse();
     c2.endCourse();
     c2.giveCertificate();
 }
}
