package ChainOfResponsibility;

import java.io.IOException;

//import iterator.*;
import java.util.Iterator;

import ChainOfResponsibility.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Chain of Responsibility*/
		Support seokwon = new HwSupport("seokwon");
		Support alice     = new NoSupport("Alice");
    Support bob     = new LimitSupport("Bob", 100);
    Support charlie   = new SpecialSupport("Charlie", 429);
    Support diana    = new LimitSupport("Diana", 200);
    Support elmo    = new OddSupport("Elmo");
    Support fred     = new LimitSupport("Fred", 300);
  	seokwon.setNext(alice).setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
    for (int i = 0; i < 500; i += 1) { //33의 배수로 반복문을 실행하면 소수가 걸러지지 않습니다.
           seokwon.support(new Trouble(i));//hyeja부터 실행합니다.
    }
	}
}
