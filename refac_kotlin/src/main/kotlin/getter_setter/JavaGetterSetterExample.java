package getter_setter;

import java.time.LocalDate;

public class JavaGetterSetterExample {
  public static void main(String[] args) {

    Student student = new Student(); // student = 코틀린 클래스
    
//    student.setName("스티브로저스"); // @JvmField를 사용하면 컴파일 오류가 일어난다.
    student.name = "스티브로저스"; // 코틀린의 프로퍼티 형식처럼 접근이 가능하다.
    student.setBirthDate(LocalDate.of(1918, 7, 4));

    System.out.println(student.name);
    System.out.println(student.getBirthDate());

//    student.setAge(10); // 불변객체라 컴파일 오류
    System.out.println(student.getAge());

//    student.setGrade(""); // 컴파일 오류
    student.changeGrade("A");
    System.out.println(student.getGrade());

    /*
      코틀린에서 val로 되어있는 프로퍼티들은 자바에서는 setter로 사용할 수 없다.

      jvm 필드 어노테이션을 사용하면 getter setter를 만들지 않고
      프로퍼티를 통해서만 접근 할 수있다고 보면 된다.

     */
  }
}
