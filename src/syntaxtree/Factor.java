//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> Complejo()
 * f1 -> ( OperadorComplejo() Complejo() )*
 */
public class Factor implements Node {
   public Complejo f0;
   public NodeListOptional f1;

   public Factor(Complejo n0, NodeListOptional n1) {
      f0 = n0;
      f1 = n1;
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
