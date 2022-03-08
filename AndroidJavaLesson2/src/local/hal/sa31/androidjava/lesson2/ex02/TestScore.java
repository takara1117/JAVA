package local.hal.sa31.androidjava.lesson2.ex02;

public class TestScore 
{
        private String _name;
      
        private int _english;
       
        private int _math;
    
        private int _japanese;
    
        public void setData(String name, int english, int math, int japanese) 
        {
                _name = name;
                _english = english;
                _math = math;
                _japanese = japanese;
        }
     
        public void setData(String name) 
        {
                setData(name, 0, 0, 0);
        }
    
        public void print()
        {
                int sum = _english + _math + _japanese;
                System.out.println(_name + "さんの3教科合計点: " + sum);
        }
}
