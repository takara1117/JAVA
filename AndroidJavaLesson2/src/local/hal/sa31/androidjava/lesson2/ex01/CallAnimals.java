package local.hal.sa31.androidjava.lesson2.ex01;

public class CallAnimals 
{
	 public static void main(String[] args) 
	 {
		 Dog pet0 = new Dog();
         pet0.setName("ポチ");
         String name = pet0.getName();
         String call = pet0.call();
         System.out.println(name + ": " + call);
         System.out.println("---------------");
         pet0.run();
         System.out.println("---------------");

         Cat pet1 = new Cat();
         pet1.setName("たま");
         name = pet1.getName();
         call = pet1.call();
         System.out.println(name + ": " + call);
         System.out.println("---------------");

         Pig pet2 = new Pig();
         pet2.setName("とんこ");
         name = pet2.getName();
         call = pet2.call();
         System.out.println(name + ": " + call);
         System.out.println("---------------");
         pet2.eat();
         System.out.println("---------------");
         pet2.speak();
	 }
}
