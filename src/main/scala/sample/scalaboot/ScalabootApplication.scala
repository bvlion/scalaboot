package sample.scalaboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ScalabootApplication {}

object ScalabootApplication {
  def main(args: Array[String]): Unit = SpringApplication.run(classOf[ScalabootApplication], args: _*)
}
