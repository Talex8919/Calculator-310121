package ClassOf;


import InterfWithMathods.MathI;

public class MathimCalc implements MathI {
    public double rintsj() {// this   Math  return  the number  which was  given in double data
        // and return  to nearest or closest Math integer  double
        double xs= 89.35214; // the data  should be  only double
        return Math.rint(xs); //result
    }
public int floorDivs(){
        int press= 125;// initialise and titled
        int devideds= 32;// initialised  and  titled
        return Math.floorDiv(press,devideds);//this math  function devided  press/devideds and the result equalize  to neares  integer (alowed data type  int and  long)
}
public  int addExactds(){
        int oneNumber= 365;
        int  secondNumber= 582; //allowed  data  type   only it and long
        return Math.addExact(oneNumber,secondNumber); // this  math  arithmetic   function is   sum  both int   and  print  out the result
}
public double getExponentsda (){
  double getExponentss= 456.25;
  return Math.getExponent(getExponentss); // this math arithmetic function is giving the exponent  of  exponent of  it  (exception  only  double or float )
}
public  long toIntExactsd(){
        long toIntExactsdd= 2546;
        return Math.toIntExact(toIntExactsdd);//this math arithmetic function is giving returns  integer (Will throw the  error if  it  put MAX_VALUE or Long.MIN_VALUE )
}

    @Override
    public void rintsj(double xs) {

    }

    @Override
    public void floorDivs(int press, int devideds) {

    }

    @Override
    public void addExactd(int oneNumber, int secondNumber) {

    }

    @Override
    public void getExponentsd(double getExponentss) {

    }

    @Override
    public void toIntExactes(long toIntExactsdd) {

    }
}
