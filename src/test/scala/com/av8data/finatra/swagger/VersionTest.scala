package com.av8data.finatra.swagger

import com.twitter.inject.Test

class VersionTest extends Test{

test("some string") {
  val versionRegex = "v([0-9]+.[0-9]+.[0-9]+)+[0-9]-?(.*)".r
  val versionString = "0.1.1+5-dff66cd0-SNAPSHOT"


//  versionString match {
//    case versionRegex(s,v) => println(s"$s  and $v")
//  }

  println(versionRegex.matches(versionString))


}

}
