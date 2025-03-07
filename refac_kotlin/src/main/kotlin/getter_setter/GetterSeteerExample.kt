package getter_setter

fun main() {

  // 자바 스타일
  val person = Person() // 인스턴스 생성
  person.setName("토니 스타크")
  person.setAge(44)
  person.setAddress("스타크타워")

  println(person.getName())
  println(person.getAge())
  
  // 코틀린 스타일
  val person2 = Person()
  person2.name = "토니스타크2"
  person2.age = 54

  println(person2.name)
  println(person2.age)

  // 프로퍼티가 없음에도 게터 메서드라면 프로퍼티처럼 사용이 가능
  println(person2.uuid)


  // 세터가 있어도 컴파일 오류가 발생
//  person2.address = "" // getter 가 없기 때문에 인식 X

  // address를 가져오는 메서드를 게터가 아닌 my로 했기때문에 세터도 생성되지 않는다.
  person2.myAddress()


}