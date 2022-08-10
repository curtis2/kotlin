package com.example.lib

fun main(args: Array<String>) {
    val string="kotlin"
    val int=1314
    val long=1314L

/*    print(string.javaClass.name)
    print(int.javaClass.name)
    print(long.javaClass.name)*/

  /*  fun sum(x:Int,y:Int): Int {return x+y}
    fun sum2(x:Int,y:Int)=x+y
//    print(sum(2,3))
    print(sum2(2,3))*/

//   fun foo(n:Int)=if(n==0)1 else n * foo(n-1)
//   fun foo(n:Int):Int=if(n==0)1 else n * foo(n - 1)


//    val x= intArrayOf(1,2,3)
//    x= intArrayOf(2,3,4)
 /*   val book=Book("java")
    book.name="kotlin"
    book.printName()*/

/*    fun cal(list:List<Int>):Int{
       var res=0
        for (el in list){
            res *=el;
            res+=el
        }
        return res
    }*/
/*    var res=0

    fun cal(list:List<Int>):Int{
        return list.fold(0){res,el -> res *el+el}
    }

    fun foo(x:Int){
        fun double(y:Int):Int{
            return y *2
        }
        println(double(x))
    }*/
    // getBook的类型就是  (name:String)->Book
  /*  val getBook=::Book
    println(getBook("d kotlin").name)
*/
    val bookName= listOf(
        Book("java"),
        Book("kotlin")
    ).map(Book::name)
    //fun sum(x:Int,y:Int): Int {return x+y}
//    val sum={x:Int,y:Int -> x+y}
  /*  val sum:(Int,Int) -> Int={x,y ->x+y}
    println(sum(1,2))*/

  /*  fun foo(int:Int)= {
        print(int)
    }
   listOf(1, 2, 3).forEach { foo(it)() }
*/
/*
    fun isExpression(flag:Boolean){
      val a=if (flag)"dive into kotlin" else ""
      println(a.toUpperCase())
    }
*/
/*
    val res:Int?=try {
        if(result.)
    }catch (){

    }*/
/*
    val maybeInt:Int?=null;
    maybeInt?:1
    println(maybeInt)
*/

}


 /*   class Book(var name:String){
          fun printName(){
              print(this.name)
          }
    }*/


    class CountryApp{
    /*    fun filterCountries(countries:List<Country>):List<Country>{
            val res= mutableListOf<Country>()
            for (c in countries){
               if(c.continent=="EU"){
                   res.add(c)
               }
            }
            return res
        }*/

   /*     fun filterCountries(countries:List<Country>,continent:String):List<Country>{
            val res= mutableListOf<Country>()
            for (c in countries){
                if(c.continent==continent){
                    res.add(c)
                }
            }
            return res
        }*/
    /*    fun filterCountries(countries:List<Country>,continent:String,population: Int):List<Country>{
            val res= mutableListOf<Country>()
            for (c in countries){
                if(c.continent==continent&&c.population>population){
                    res.add(c)
                }
            }
            return res
        }
*/
   private fun filterCountries(countries:List<Country>,test:(Country)->Boolean):List<Country>{
            val res= mutableListOf<Country>()
            for (c in countries){
                if(test(c)){
                    res.add(c)
                }
            }
          return res;
        }

/*    val countryApp=CountryApp()
    val countryType=CountryTest()
    val countries= mutableListOf<Country>();
    val filteredCountries=countryApp.filterCountries(countries,countryType::isBigEuropeanCountry)

*/
        //匿名函数
        val countryApp=CountryApp()
        val countries= mutableListOf<Country>();
      /*  val filteredCountries=countryApp.filterCountries(countries,fun(country:Country):Boolean{
            return country.continent=="EU"&&country.population>10000
        })*/
      val filteredCountries=countryApp.filterCountries(countries) { country
          -> country.continent=="EU"&&country.population>10000
      }

    }

    class Book(val name:String)

    class CountryTest{
        fun isBigEuropeanCountry(country: Country):Boolean{
            return country.continent=="EU"&&country.population>10000
        }
    }

    data class Country(
        val name:String,
        val continent:String,
        val population:Int
    )
