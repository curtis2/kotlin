package com.dsl


/**
 * Created by simon on 6/27/23 23:26
 *
 */

fun main(args: Array<String>) {
/*    Tag("html").apply {
        properties["id"]="htmlId"
        children.add(Tag("body"))
    }.render().let(::println)


     html{
        properties["id"]="htmlId"
        children.add(Tag("body"))
    }.render().let(::println)*/

 /*   html{
        "id"("htmlId")
         "head"{
             "id"("headId")
         }
         "body"{
             "a"{
                 "href"("wwww.baidu.com")
                 + "百度首页"
             }

         }
    }.render().let(::println)*/

    html{
        "id"("htmlId")
        head{
            "id"("headId")
        }
        body{
            id="bodyId"
            cclass="class"
            "a"{
                "href"("wwww.baidu.com")
                + "百度首页"
            }

        }
    }.render().let(::println)
}