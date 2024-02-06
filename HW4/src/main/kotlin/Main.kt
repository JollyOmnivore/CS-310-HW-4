import java.util.concurrent.TimeUnit

class Main(){
}

fun main(args: Array<String>){
   var exit = false

   while(exit == false) {
      promptUser()
      var input = readLine()
      println(input)



      if (input.equals("Q")){
         exit = true
      }
      if (input.equals("L")){
         println("Please Enter Length in miles")
         var x = readLine()
         var y = x!!.toDouble()
         println("%.3f Miles => %.3f Kilometers, %.3f Feet, %.3f Yards".format(y,Length(y).LengthInKilo,Length(y).LenthInFeet,Length(y).LenthInyards))
      }
      if (input.equals("T")) {
         println("Please Enter Temperature in Fahrenheit")
         var x = readLine()
         var y = x!!.toDouble()
         println("%.3f Fahrenheit => %.3f Celsius , %.3f Kelvin".format(y,Temp(y).TempToCelsius,Temp(y).TempToKelvin))
      }
      if (input.equals("V")) {
         println("Please Enter Volume in gallons")
         var x = readLine()
         var y = x!!.toDouble()
         println("%.3f gallons => %.3f liters , %.3f ounces, %.3f quarts ".format(y,Volume(y).VolumeToLiters,Volume(y).VolumeToOunce,Volume(y).VolumeToQuarts))
      }
      if (input.equals("W")) {
         println("Please Enter Weight in pounds")
         var x = readLine()
         var y = x!!.toDouble()
         println("%.3f pounds => %.3f kilograms , %.3f ounces, %.3f grams ".format(y,Weight(y).WeightToKilo,Weight(y).WeightToOunce,Weight(y).WeightToGrams))
      }
   }
   println("Thanks for using my converter")
}



fun promptUser(boolean: Boolean = true){
   print("Welcome to my Kotlin conversion program \n =================================== \n")
   print("Please select from these options \n")
   print("'L' to convert length")
   print("\n")
   print("'T' to convert Temperature")
   print("\n")
   print("'V' to convert Volume")
   print("\n")
   print("'W' to convert Weight")
   print("\n")
   print("'Q' to Quit")
   print("\n")
   print("ENTER OPTION ")
}

class Length(val Length: Double) {
   var testedLength: Double
      init{
         if(Length < 0.0 ){
            testedLength = 0.0
         }
         else {
            testedLength = Length
         }
      }
   val LengthInKilo: Double get() = testedLength * 1.609344
   val LenthInFeet: Double get() = testedLength * 5280
   val LenthInyards: Double get() = testedLength * 1760
}

class Temp(val Temp: Double) {
   val TempToCelsius: Double get() = (Temp - 32) * 5 / 9
   val TempToKelvin: Double get() = TempToCelsius + 273.15
}



class Volume(val Volume: Double) {
   var testedVolume: Double
   init{
      if(Volume < 0.0 ){
         testedVolume = 0.0
      }
      else {
         testedVolume = Volume
      }
   }
   val VolumeToLiters: Double get() = Volume * 3.78541
   val VolumeToOunce: Double get() = Volume * 128
   val VolumeToQuarts: Double get() = Volume * 4


}

class Weight(val Weight: Double) {
   var testedWeight: Double
   init{
      if(Weight < 0.0 ){
         testedWeight = 0.0
      }
      else {
         testedWeight = Weight
      }
   }
   val WeightToKilo: Double get() = Weight / 2.205

   val WeightToOunce: Double get() = Weight * 16
   val WeightToGrams: Double get() = Weight * 453.6

}