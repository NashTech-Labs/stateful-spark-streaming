package com.example.implementjoin

import play.api.libs.json.Json

case class Department(id:Int,name:String)
object Department{
  implicit val format = Json.format[Department]
}