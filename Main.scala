/**
  * Created by Administrator on 07/06/2017.
  */
        object Main {

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

          }

          def main(args: Array[String]): Unit = {
            println(convertCode(".-"))
          }

        }
