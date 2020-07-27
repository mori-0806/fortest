/*
 * 定义一个方法的格式：
 * public static void 方法名称（）{
 *    方法体
 * }
 * 
 * 
方法名称的命名规则和变量一样，
使用小驼峰（第一个单词首字母小写，第二个单词开始，每个单词首字母要大写）：
方法体：大括号当中可以包含任意条语句。

注意事项:
1.方法定义的先后顺序无所谓。
2.方法的定义不能产生嵌套包含关系。（就是一个方法不能放到另一个方法的里面）
3.方法定义好了之后，不会执行，如果想执行，一定要进行方法的【调用】。

如何调用方法，格式：

方法名称();

*/

public class Demo10Method {
	public static void main(String[] args) {
		
		
		cook();//调用厨子的方法：方法名称();
		seller();//调用小商贩的方法
		fammer();//调用农民的方法
		me();//调用我的方法
		
		
		}
	
	public static void fammer() {
		//农民
				System.out.println("播种");
				System.out.println("浇水");
				System.out.println("施肥");
		
	}
	
	public static void seller() {
		//小商贩
				System.out.println("吆喝");
				System.out.println("卖给厨子");
		
	}
	
	public static void cook() {
		//厨子
				System.out.println("装盘");
		
	}
	
	public static void me() {
		//我
				System.out.println("我");
		
	}

	
}
