package getter_setter

import java.time.LocalDate

class Student {

  @JvmField
  var name: String? = null

  var birthDate: LocalDate? = null

  val age: Int = 10;

  var grade: String? = null
    private set // 외부에서 setter 접근 제한]

  fun changeGrade(grade:String) { // setter와 같은 역할하는 함수
    this.grade = grade
  }

}

