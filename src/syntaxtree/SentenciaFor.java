//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> <FOR>
 * f1 -> <PAR_IZQ>
 * f2 -> <ENTERO>
 * f3 -> <VARIABLE>
 * f4 -> <ASIGNACION>
 * f5 -> <NUM_ENTERO>
 * f6 -> <PUNTO_COMA>
 * f7 -> <VARIABLE>
 * f8 -> OperadorComparacion()
 * f9 -> <NUM_ENTERO>
 * f10 -> <PUNTO_COMA>
 * f11 -> <VARIABLE>
 * f12 -> OperadorAumento()
 * f13 -> <PAR_DER>
 * f14 -> <CUR_IZQ>
 * f15 -> ( Sentencia() )+
 * f16 -> <CUR_DER>
 */
public class SentenciaFor implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public NodeToken f2;
   public NodeToken f3;
   public NodeToken f4;
   public NodeToken f5;
   public NodeToken f6;
   public NodeToken f7;
   public OperadorComparacion f8;
   public NodeToken f9;
   public NodeToken f10;
   public NodeToken f11;
   public OperadorAumento f12;
   public NodeToken f13;
   public NodeToken f14;
   public NodeList f15;
   public NodeToken f16;

   public SentenciaFor(NodeToken n0, NodeToken n1, NodeToken n2, NodeToken n3, NodeToken n4, NodeToken n5, NodeToken n6, NodeToken n7, OperadorComparacion n8, NodeToken n9, NodeToken n10, NodeToken n11, OperadorAumento n12, NodeToken n13, NodeToken n14, NodeList n15, NodeToken n16) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
      f7 = n7;
      f8 = n8;
      f9 = n9;
      f10 = n10;
      f11 = n11;
      f12 = n12;
      f13 = n13;
      f14 = n14;
      f15 = n15;
      f16 = n16;
   }

   public SentenciaFor(NodeToken n0, NodeToken n1, NodeToken n2, NodeToken n3, NodeToken n4, NodeToken n5, OperadorComparacion n6, NodeToken n7, NodeToken n8, NodeToken n9, OperadorAumento n10, NodeToken n11, NodeToken n12, NodeList n13, NodeToken n14) {
      f0 = new NodeToken("for");
      f1 = n0;
      f2 = new NodeToken("int");
      f3 = n1;
      f4 = n2;
      f5 = n3;
      f6 = n4;
      f7 = n5;
      f8 = n6;
      f9 = n7;
      f10 = n8;
      f11 = n9;
      f12 = n10;
      f13 = n11;
      f14 = n12;
      f15 = n13;
      f16 = n14;
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

