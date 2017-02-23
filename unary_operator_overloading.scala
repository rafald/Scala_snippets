class Complex(val real : Double, val imag : Double) {
    // ...
    def unary_~ = Math.sqrt(real * real + imag * imag)
}
 
object Complex {
  def main(args : Array[String]) : Unit = {
     var b = new Complex(2.0,3.0)
     prinln(~b) //  3.60555
   }
}

