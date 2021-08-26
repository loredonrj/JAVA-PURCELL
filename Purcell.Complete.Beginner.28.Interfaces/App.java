public class App{

 public static void main(String[] args) {
  
Machine machine1 = new Machine();
machine1.start();

Person person1 = new Person("Lily");
person1.greet();

Info info1 = new Machine(); // Illustrate possible usage of Info Interface as a Type, like a Class
info1.showInfo(); // the created object of Type Machine is assigned to a variable of type Info, and the method in Info Interface can be called on it
  // which is really cool
}

}
