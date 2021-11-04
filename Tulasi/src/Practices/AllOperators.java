package Practices;

public class AllOperators {
    public static void main(String[] args) {
        arithmeticoperators();
        unaryoneoperand();
        unarytwooperands();
        unarybitornegation();
        shiftoperators();
        assignmentOperator();
        comparsionorrelational();
        logicalandornot();
        bitwiseandor();
        ternaryoperator();
        precedence();
        concatenation();
        //Instanceof();
    }
        public static void arithmeticoperators(){//Arithmetic Operators
            int a = 20, b = 10, sum = a + b, c = 30, d = 20, sub = c - d, mul = d / c, rem = b % a;
            System.out.println(sum);
            System.out.println(sub);
            System.out.println(mul);
            System.out.println(rem);
        }
        public static void unaryoneoperand(){//Unaryoneoperand
        int z= 120;
            System.out.println(-z);//shows positive
            System.out.println(+z);//shows negative
            System.out.println(++z);//+prefix
            System.out.println(z++);//+postfix
            System.out.println(--z);//-prefix
            System.out.println(z--);//-postfix
                }
        public static void unarytwooperands() {//Unarytwooperands-++,--
            int uv1 = 111;
            int uv2 = 100;
            System.out.println(uv1++ + ++uv2);
            System.out.println(++uv1 - uv1++);
            System.out.println(uv1++ - uv2);
            System.out.println((uv2++ + uv1) - (uv1 - uv2++));
        }
       public static void unarybitornegation(){//Unary bitwise or negation- ~(opposites),!(Boolean)
            int ubn1=145;
            int ubn2=-146;
            boolean neg1=true;
            boolean neg2=false;
           System.out.println(~ubn1);//Unarybitwise
           System.out.println(~ubn2);
           System.out.println(!neg1);//unary negation
           System.out.println(!neg2);
       }
       public static void shiftoperators(){//Shiftoperators
           int sop1=12;
           byte sop2=3;
           System.out.println(sop1<<sop2);//Lefttshift operators-12*2^3=12*(2*2*2)=12*8=192
           System.out.println(sop1>>sop2);//rightshift operators-12/2^3=12/(2*2*2)=12/8=0.75=0
           System.out.println(sop1>>>-13);//unsigned rightshift operators-12/2^3=12/(2*2*2)=12/8=0.75=0
      }
      public static void assignmentOperator(){//AssignmentOperator
         short ao1=15;
         short ao2=5;
         ao1+=15;//ao1=ao1+15=15+15=30
         ao2-=5;//a02=ao2-5=5-5=0
          ao1=(short)(ao1+ao2);//After adding the total is 'int'.so convert to short as we assigned datatype as 'short'
          System.out.println(ao1);
          System.out.println(ao2);
      }
      public static void comparsionorrelational(){//Comparsion or relational operators -Its shows result in true/false
        int co1=6;
        int co2=8;
        int co3=10;
          System.out.println(co1==co2);//== : equalto
          System.out.println(co1!=co2);//!= : not equalto
          System.out.println(co1>co2);//> : greaterthan
          System.out.println(co1<co2);//< : lessthan
          System.out.println((co1<co3)!=(co3>co2));
          System.out.println(co1>=co3);//>= : greaterthan equalto
          System.out.println(co2<=co3);//<= :lessthan equalto
      }
      public static void logicalandornot(){ //logical && ,||,!
        int log1=4;
        int log2=6;
        int log3=8;
          System.out.println((log1<log2)&&(log2<log3));// &&-If first one true than only check second statement-if first one true and second is false ,it prints false
          System.out.println((log1==log2)||(log3>=log1));// ||-If first is true,than operator doesnot check second statement
          System.out.println(!(log1<log3));// ! - Its shows,if the condition is false, the operation returns true and when the condition is true, the operation returns false
      }
      public static void bitwiseandor(){// Bitwise operators-&,|
          int bit1=2;
          int bit2=8;
          int bit3=6;
          System.out.println(bit1<bit2&bit2--<bit3);// &-It check both conditions,whether first condition is true or false.If one is false it gives false
          System.out.println(bit2==bit1|bit3>=bit1);// |-It check both conditions,whether first condition is true or false.If one is true it gives true
      }
      public static void ternaryoperator(){// Ternary operator -? :- 3 operands-if :then :else -It is only the coditional operators which contains three operands
        int to1=15;
        int to2=20;
        int min=(to1>=to2)?to2:to1;// If (to1<to2) is ture ,it goes to to2,if (to1<to2) is false ,it goes to to1
        int max=(to2==to1)?to1:to2;
          System.out.println(min);
          System.out.println(max);
      }
      public static void  precedence(){// Precedence
          int p = 20, p1 = 10, p2 = 0, p3 = 10; //p=(p1+p2),p1=p1+1
          // precedence rules for arithmetic operators-(* = / = %) > (+ = -)
          p= p1++ + p2;
          System.out.println("p+p1/p3 = " + ( p + p1 / p3));
          System.out.println("Value of p(p1+p2)," + " p2(p2+1), p3 = " + p + ", " + p1 + ", " + p3);
      }
      public static void concatenation(){//Concatenation
        int co1=9,  co2= 8;
          System.out.println("Concatenation=" + co1 + co2);//If u won't use parenthesis it will take as concatenation
          System.out.println("Addition=" + (co1 + co2));//using + operator inside system.out.println() make sure to do addition using parenthesis
      }
    /* public static void Instanceof(){//Instanceof operator}*/
}
