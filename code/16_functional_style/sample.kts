val double = { e: Int -> e * 2 }
println(double(2))
                         
println("----")

listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  .filter { it % 2 == 0}
  .map(double)
  .forEach { println(it) }