public class Triangle {
//Triangle деген класс тузунуз.
//
//Класстын 3 полеси болсун a, b, c.
//
//Класстын "area" деген методу болсун.
//
//"area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)
//
//таянып консолго уч бурчтуктун аянтын чыгарсын.
 double a,b, c;

  public  Triangle( double a, double b, double c){
      this.a=a;
      this.b=b;
      this.c=c;

  }
      public void area() {
      double s =(a+b+c)/2;
      double area=Math.sqrt(s *(s-a)*(s-b)* (s-c));
          System.out.println("S = "+area);
      }

}
