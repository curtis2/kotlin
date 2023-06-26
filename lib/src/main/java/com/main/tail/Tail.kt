package com.main.tail


/**
 * Created by simon on 6/26/23 20:26
 *
 * 尾递👻优化
 * 1.递归的一种特殊形式
 * 2.调用自身后无其他操作
 * 3.tailrec 关键字提示编译器进行尾递归优化
 */
data class ListNode(val value:Int,var next:ListNode? = null) {
}

tailrec fun findListNode(head:ListNode?,value:Int):ListNode?{
    head?:return null
    if(head.value==value) return head
    return findListNode(head.next,value)
}

fun factorial(n:Int):Long{
  return n * factorial(n-1)
}


/**
 * 遍历树节点
 */
data class TreeNode(val value: Int){
    var left: TreeNode? = null
    var right:TreeNode? =null
}


fun findTreeNode(root:TreeNode?,value:Int):TreeNode?{
    root?:return null
    if(root.value==value) return root
    return findTreeNode(root.left,value)?: findTreeNode(root.right,value)
}


fun main(args: Array<String>) {
    val MAX_NODE_COUNT=100000
    var head=ListNode(0)
    var p=head
    for (i in 1..MAX_NODE_COUNT){
      /*  var subNode=ListNode(i)
        p.next=subNode*/
        p.next= ListNode(i)
        p=p.next!!
    }

    println(findListNode(head,MAX_NODE_COUNT-2)?.value)

}
