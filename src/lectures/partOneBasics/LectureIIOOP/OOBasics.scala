package lectures.partOneBasics.LectureIIOOP

object OOBasics extends App{
val person = new Person("Jimmy", 24)
println(person.age, " ", person.x)
  person.greet("Jackie")
  person.greet()
}
// contructor

class Person(name: String, val age: Int) {
  val x = 23
  // expression evaluates FIRST
  println(5+4)
  def greet(name: String): Unit = println(s"${this.name} says, 'ello govnor ($name)!'")

  // overloading
  def greet():Unit = println(s"$name is $age years old")
}

// add val to make the field a parameter