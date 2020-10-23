package com.hx.learn.scalaBasic

import java.util.Scanner

object test {


  def main(args: Array[String]): Unit = {

    var name:String ="张三"
    var age =22
    var sex ="male"
    var info =s"name=$name,age=$age,sex=$sex"
    println(info)
    val longStr=""" select
                  |	*
                  |from
                  |    t_user
                  |where
                  |    name = "zhangsan"
                  |""".stripMargin
    print(longStr)

   lazy val monthDay=""" select
                        |	*
                        |from
                        |    t_user
                        |where
                        |    name = "zhangsan"
                        |""".stripMargin
  }
}
