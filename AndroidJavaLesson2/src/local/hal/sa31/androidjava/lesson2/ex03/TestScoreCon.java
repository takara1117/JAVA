package local.hal.sa31.androidjava.lesson2.ex03;

public class TestScoreCon
{
        protected String _name;
        
        protected int _english;
       
        protected int _math;
       
        protected int _japanese;
    
        public TestScoreCon(String name, int english, int math, int japanese)
        {
                _name = name;
                _english = english;
                _math = math;
                _japanese = japanese;
        }
    
        public TestScoreCon(String name)
        {
                this(name, 0, 0, 0);
        }
    
    
        public void print()
        {
                int sum = _english + _math + _japanese;
                System.out.println(_name + "さんの3教科合計点: " + sum);
        }
}