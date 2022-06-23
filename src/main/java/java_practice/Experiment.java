package java_practice;


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Experiment {



	public static class A{


		static int age=40;
		public  A getInstance(){

			return this;

		}








	}

	public static void main(String[] args) {


		A a=new A();
		System.out.println(a.age);
		System.out.println(a.getInstance());



		

	}

}



