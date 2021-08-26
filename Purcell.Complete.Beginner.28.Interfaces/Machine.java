public class Machine implements Info{

  @Override
  public void showInfo() {
    System.out.println("Machine ID is" + id);
    
  }

  private int id = 7;
  
  public void start(){
    System.out.println("Machine Started");
  }
}
