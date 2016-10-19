object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n
    //Declares a singleton object, which
    //simultaneously declares a class and
    //its only instance.

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
}

  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
}

