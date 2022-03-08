package local.hal.sa31.androidjava.lesson2.ex04;

import local.hal.sa31.androidjava.lesson2.ex03.TestScoreCon;

public class TestScore5 extends TestScoreCon
{
        private int _science;
        
        private int _social;
    
        public TestScore5(String name, int english, int math, int japanese, int science, int social)
        {
                super(name, english, math, japanese);
                _science = science;
                _social = social;
        }
   
        @Override
        public void print()
        {
                super.print();
                int sum = _english + _math + _japanese + _science + _social;
                System.out.println(_name + "さんの5教科合計点: " + sum);
        }
}