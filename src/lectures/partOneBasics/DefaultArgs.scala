package lectures.partOneBasics

object DefaultArgs extends App{
  def tailRecFac(n: Int, acc:Int = 1): Int = {
    if(n <= 1) acc
    else tailRecFac(n - 1, n * acc)
  }

  val ten = tailRecFac(13)
  println(ten)
}
