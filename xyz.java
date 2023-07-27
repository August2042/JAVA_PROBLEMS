import java.util.*;

import java.text.*;

public class xyz {

public static void main(String args[]) {

double val=522013.50;

Locale loc=new Locale("it");

NumberFormat obj=NumberFormat.getInstance(loc);

String b;

b = obj.format( val);

System.out.print(b);

}

}