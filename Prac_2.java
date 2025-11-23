import java.awt.*;
import java.applet.*;

/*
<applet code=List width=600 height=600 >
</applet>
*/
public class List extends Applet{

public void init()
{

   Choice c=new Choice();
   c.add("dpl");
   c.add("rtn");
   c.add("str");
   c.add("pune");
  // c.remove(0);
   add(c);
   
   List l=new List(5,true);
   l.add("marathi");   
   l.add("eng");   
   l.add("gujrati");   
   l.add("hindi");
   l.add("kannd");

  // l.remove(2);
   add(l);
   


}	
	
}