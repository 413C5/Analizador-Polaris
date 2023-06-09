//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors with no argument must implement this interface.
 */

public interface GJNoArguVisitor<R> {

   //
   // GJ Auto class visitors with no argument
   //

   public R visit(NodeList n);
   public R visit(NodeListOptional n);
   public R visit(NodeOptional n);
   public R visit(NodeSequence n);
   public R visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Sentencia() )+
    */
   public R visit(Programa n);

   /**
    * f0 -> DeclararVariable() <PUNTO_COMA>
    *       | SentenciaLeer() <PUNTO_COMA>
    *       | SentenciaImprimir() <PUNTO_COMA>
    *       | AsignarValor() <PUNTO_COMA>
    *       | SentenciaIf()
    *       | SentenciaFor()
    *       | SentenciaWhile()
    */
   public R visit(Sentencia n);

   /**
    * f0 -> TipoDato()
    * f1 -> <VARIABLE>
    */
   public R visit(DeclararVariable n);

   /**
    * f0 -> <ENTERO>
    *       | <FLOTANTE>
    *       | <STRING>
    */
   public R visit(TipoDato n);

   /**
    * f0 -> <LECTURA>
    * f1 -> <PAR_IZQ>
    * f2 -> <VARIABLE>
    * f3 -> <PAR_DER>
    */
   public R visit(SentenciaLeer n);

   /**
    * f0 -> <IMPRIMIR>
    * f1 -> <PAR_IZQ>
    * f2 -> Expresion()
    * f3 -> <PAR_DER>
    */
   public R visit(SentenciaImprimir n);

   /**
    * f0 -> <VARIABLE>
    * f1 -> <ASIGNACION>
    * f2 -> Expresion()
    */
   public R visit(AsignarValor n);

   /**
    * f0 -> ExpresionSimple()
    * f1 -> ( OperadorComparacion() ExpresionSimple() )?
    */
   public R visit(Expresion n);

   /**
    * f0 -> <COMPARACION>
    *       | <MENOR_QUE>
    *       | <MAYOR_QUE>
    *       | <MENOR_IGUAL>
    *       | <MAYOR_IGUAL>
    */
   public R visit(OperadorComparacion n);

   /**
    * f0 -> Termino()
    * f1 -> ( OperadorTermino() Termino() )*
    */
   public R visit(ExpresionSimple n);

   /**
    * f0 -> <SUMA>
    *       | <RESTA>
    */
   public R visit(OperadorTermino n);

   /**
    * f0 -> Factor()
    * f1 -> ( OperadorFactor() Factor() )*
    */
   public R visit(Termino n);

   /**
    * f0 -> <MULTIPLICACION>
    *       | <DIVISION>
    *       | <MODULO>
    */
   public R visit(OperadorFactor n);

   /**
    * f0 -> Complejo()
    * f1 -> ( OperadorComplejo() Complejo() )*
    */
   public R visit(Factor n);

   /**
    * f0 -> <POTENCIA>
    *       | <RAIZ_CUADRADA>
    */
   public R visit(OperadorComplejo n);

   /**
    * f0 -> <PAR_IZQ> Expresion() <PAR_DER>
    *       | Valor()
    *       | <VARIABLE>
    */
   public R visit(Complejo n);

   /**
    * f0 -> <NUM_ENTERO>
    *       | <NUM_FLOTANTE>
    *       | <CADENA>
    */
   public R visit(Valor n);

   /**
    * f0 -> <AND>
    *       | <OR>
    *       | <NOT>
    */
   public R visit(OperadorLogico n);

   /**
    * f0 -> <IF>
    * f1 -> <PAR_IZQ>
    * f2 -> ExpresionCondicional()
    * f3 -> <PAR_DER>
    * f4 -> <CUR_IZQ>
    * f5 -> ( Sentencia() )+
    * f6 -> <CUR_DER>
    * f7 -> ( ExpresionElse() )?
    */
   public R visit(SentenciaIf n);

   /**
    * f0 -> <ELSE>
    * f1 -> <CUR_IZQ>
    * f2 -> ( Sentencia() )+
    * f3 -> <CUR_DER>
    */
   public R visit(ExpresionElse n);

   /**
    * f0 -> Expresion()
    * f1 -> ( OperadorLogico() Expresion() )*
    */
   public R visit(ExpresionCondicional n);

   /**
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
   public R visit(SentenciaFor n);

   /**
    * f0 -> "++"
    *       | "--"
    */
   public R visit(OperadorAumento n);

   /**
    * f0 -> <WHILE>
    * f1 -> <PAR_IZQ>
    * f2 -> ExpresionCondicional()
    * f3 -> <PAR_DER>
    * f4 -> <CUR_IZQ>
    * f5 -> ( Sentencia() )+
    * f6 -> <CUR_DER>
    */
   public R visit(SentenciaWhile n);

}

