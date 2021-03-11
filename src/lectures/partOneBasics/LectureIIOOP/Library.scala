package lectures.partOneBasics.LectureIIOOP

object Library extends App{
  class Book(firstName:String = "", lastName:String="", val age:Int = 0){
    def fullName():String = s"$firstName $lastName"
  }

  class Novel(title:String,year:Int,book:Book){
     val newRelease = year
     def authorAge():Int = book.age
     def isWrittenBy():String = book.fullName()



  }
class Counter(val count:Int = 0){
  def inc: Counter = {
    println("count INC " , count)
    new Counter(count + 1)
  } //immutable!!!!! RETURN a NEW OBJECT!!!!
  def dec: Counter = {
    println("count DEC " , count)
    new Counter(count - 1)
  }

  //overloading
  def inc(n:Int=0): Counter = {
    if(n <=0 ) this
    else inc.inc(n - 1)
  }

  def dec(n:Int=0): Counter = {
    if(n <=0 ) this
    else dec.dec(n - 1)
  }
  def print = {
    println("COUNT ", count)
  }
}
  val counter = new Counter
  counter.inc(12).print




}

