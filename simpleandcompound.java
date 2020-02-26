package Logging.epam;
import java.util.*;
import java.io.*;
public class simpleandcompound {
       public double findSimpleInterest(double Principle,double time,double rate)
       {
      return (Principle*time*rate)/100;
       }
       public double findCompoundInterest(double Principle,double time,double rate,boolean yearly)
       {
      if(yearly)
      {
      return Principle*(Math.pow(1+(rate/100),time)-1);
     
      }
      else
      {
      return Principle*(Math.pow(1+((rate/2)/100),2*time)-1);
      }
       }
}