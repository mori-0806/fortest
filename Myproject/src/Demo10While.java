/*定义方法的完整格式：
 * 修饰符 返回值类型 方法名称（数据类型 数据名称，，，，）{
 * 方法体
 * return 返回值；
 * }
 * 
 * 修饰符：现阶段的固定写法是public static
 * 返回值类型：也就是方法最终产生的数据结果是什么类型
 * 方法名称：方法的名字，规则和变量一样，小驼峰
 * 参数类型：进入方法的数据是什么类型
 * 参数名称：进入方法的数据对于的变量名称
 * ps：参数如果有多个，使用逗号进行分隔
 * 方法体：方法需要做的事情，若干行代码
 * return：两个作用，第一是停止当前方法，第二是后面的返回值还给调用处
 * 返回值：也就是方法执行后最终的数据结果
 * 
 * 注意：return后面的“返回值”，必须和方法名称前面的“返回值类型”，保持对应。
 * 
 */
public class Demo10While {
 public static void main(String[] args) {
  //单独调用
  sum(10,20);
  minus(30, 40);
  
  System.out.println("===================");
  
  //打印调用
  System.out.println(sum(10,20));
  
  //赋值调用
  int number = sum(50,20);
        System.out.println(number);
        
        int x = minus(44,11);
        System.out.println(x);
  
  
 }
 
 public static int sum(int a,int b) {
  System.out.println("sum方法执行啦");
  int result=a+b;  System.out.println("sum方法执行啦");
  return result; //返回值的数据类型要和方法名称前面的数据类型保持一致。

  
 }
 
 public static int minus(int a,int b) { //public static是修饰符
  System.out.println("minus方法执行啦");
  int result = a-b; //方法体
  return result;
 }
 

}