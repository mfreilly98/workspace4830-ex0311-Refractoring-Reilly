package q1.extract_method.refactored;

import java.util.List;
class Graph
{
	String name;
	boolean conatins(String p)
	{
		return name.contains(p);
	}
}

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
	   ex(nodes,p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
	   ex(edgs,p);
      // other implementation
      return null;
   }

   // TODO: Your answer
   // ? extractedMethod(?) {
   //
   // }
   <T extends Graph> void ex(List<t> objs, String p)
   {
	   for (T obj : objs)
	   {
		   if(obj.contains(p))
		   {
			   System.out.println(obj);
		   }
	   }
	   return null;
   }
}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}