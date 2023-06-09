//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> <VARIABLE>
 * f1 -> <ASIGNACION>
 * f2 -> Expresion()
 */
public class AsignarValor implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public Expresion f2;

   public AsignarValor(NodeToken n0, NodeToken n1, Expresion n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

