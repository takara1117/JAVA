package local.hal.sa31.androidjava.lesson2.ex02;

public class UseTestScore
{
        public static void main(String[] args)
        {
                TestScore student = new TestScore();
                student.setData("太郎");
                student.print();
                student.setData("花子", 92, 78, 89);
                student.print();
        }
}
