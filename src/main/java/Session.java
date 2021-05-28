import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Session {

  private String name;
  private String subject;
  private List<Student> roster;
  private List<String> directory;
  private List<Computer> computers;

  public Session(String name, String subject) {
    this.name = name;
    this.subject = subject;
    this.roster = new ArrayList<Student>();
    this.directory = new ArrayList<String>();
    this.computers = new ArrayList<Computer>();
  }

  public String getName() {
    return name;
  }

  public String getSubject() {
    return subject;
  }

  public List<Student> getStudentRoster() {
    return this.roster;
  }

  public void enroll(Student student) {
    if (!this.roster.contains(student)) {
      this.roster.add(student);
      this.directory.add(student.getDirectoryEntry());
    }
  }

  public void enroll(StudentAssistant studentAssistant) {
    this.roster.add(studentAssistant);
    this.directory.add(studentAssistant.getDirectoryEntry());
  }

  public String getDirectory() {
    return this.directory.toString();
  }



  public void getComputers(Computer computers) {
    for (int i = 1; i < 11 ; i++) {
      i = new Computer();
    }
  }

  public List<Computer> getComputers() {

  }
}
