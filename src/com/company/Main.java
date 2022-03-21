package com.company;
public class Main {
    public static void main(String[] args) {
	    A x = new A(7,4,2);
        System.out.println("max="+x.maxA());
          x = new A(4,7,2);
        System.out.println("max="+x.maxA());
          x = new A(2,4,7);
        System.out.println("max="+x.maxA());
        B y = new B(8,4,2,1);
        System.out.println("max="+y.maxB());
            y = new B(4,8,2,1);
        System.out.println("max="+y.maxB());
            y = new B(4,2,8,1);
        System.out.println("max="+y.maxB());
            y = new B(4,2,1,8);
        System.out.println("max="+y.maxB());
    }
}
// суперклас
class A{
    int a1,a2,a3;
    A(){}
    A(int a1, int a2, int a3){
        this.a1=a1; this.a2=a2; this.a3=a3;
    }
    int maxA(){     // пошук max
        int[] arr= {this.a1,this.a2,this.a3};
        int max=this.a1;
        for(int s:arr) if (s>max) max=s;
        /* 2-й спосіб:
        if (max>this.a2){
            if (max<this.a3)
                max=this.a3;
        }
        else if (this.a2>this.a3)
            max=this.a2;
        else max=this.a3;*/
        return max;
    }
}
class B extends A{
    int a4;
    B(int a1, int a2, int a3, int a4){
        super(a1, a2, a3);
        this.a4=a4;
    }
    int maxB(){     // пошук max
        //int max=this.maxA();
        //max=max>this.a4?max:this.a4;
        return Math.max(this.maxA(),this.a4);
    }
}
