fun main() {
  val dataUser = DataUser("Gracia", 19)
  val name = dataUser.component1()
  val age = dataUser.component2()

  println(dataUser)
  println("Halo Everyone! My name is $name, and I $age years old!")
}

data class DataUser (val nama : String, val age : Int)