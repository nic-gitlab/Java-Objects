import java.util.ArrayList;
import java.util.List;

public class Computer {

  private int availableMemory;
  private int availableDiskSpace;
  private Object currentStudent;

  public Computer(int availableMemory, int availableDiskSpace) {
    this.availableMemory = availableMemory;
    this.availableDiskSpace = availableDiskSpace;
    this.currentStudent = null;
  }


  public int getAvailableMemoryMb() {
    return this.availableMemory;
  }

  public int getAvailableDiskSpaceMb() {
    return this.availableDiskSpace;
  }

  public Object getCurrentStudent() {
    return this.currentStudent;
  }


  public Object assignTo(Student student) {
    return this.currentStudent = student;
  }
}
