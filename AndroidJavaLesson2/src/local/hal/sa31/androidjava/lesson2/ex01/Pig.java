package local.hal.sa31.androidjava.lesson2.ex01;

public class Pig extends Animal
{
        @Override
        public String call()
        {
                return "ぶうぶう";
        }
    
        @Override
        public void speak()
        {
                super.speak(); //super.メソッドで親クラスの呼び出し
                System.out.println("すばらしい!");
        }

        public void eat()
        {
                System.out.println("うまい!");
        }
}