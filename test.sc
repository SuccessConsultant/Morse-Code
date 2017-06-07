import scala.util.matching.Regex.Match

/**
  * Created by Administrator on 07/06/2017.
  */
  def convertCode (code: String): String = code match {

    case ".-" => "A"
    case "-..." => "B"
    case "-.-." => "C"
    case "-.." => "D"
    case "." => "E"
    case "..-." => "F"
    case "--." => "G"
    case "...." => "H"
    case ".." => "I"
    case ".---" => "J"
    case "-.-" => "K"
    case ".-.." => "L"
    case "--" => "M"
    case "-." => "N"
    case "---" => "O"
    case ".--." => "P"
    case "--.-" => "Q"
    case ".-." => "R"
    case "..." => "S"
    case "-" => "T"
    case "..-" => "U"
    case "...-" => "V"
    case ".--" => "W"
    case "-..-" => "X"
    case "-.--" => "Y"
    case "--.." => "Z"
    case _ => ""

  }

  println(convertCode(".-")) //just to do a simple test





def convertMorseLanguage (morse: String) = {  //created another function

  var temp: String = ""

  for (i <- 0 to morse.length -1) //we add -1 to end stop at the end of the string to prevent outbound error
  {
    morse(i) match {
      case '.' => temp += "."
      case '-' => temp += "-"
      case ' '=> print( convertCode(temp)); temp = ""
      case '/' => print(" ")
      case _ => println()

    }
  }
}

convertMorseLanguage(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.—")

