package demo.typelevel

import scala.scalajs.js

case class Model(a: Int)

object ModelApp extends js.JSApp {
  def main(): Unit = {
    println(Model(1))
  }
}