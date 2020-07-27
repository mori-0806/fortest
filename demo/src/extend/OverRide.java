package extend;

/*方法覆盖重写的注意事项
 * 1.必须保证父子类之间的方法的名称相同，参数列表也相同
 * @override，写在方法的前面，用来检测是不是有效的正确覆盖重写
  * 就算不写只要满足也可
 *
 * 2.子类的返回值必须【小于等于】父类的返回值类型范围
  * 小提示扩展；java.lang.Object是所有类的最高
 * 
 * 3.子类方法的权限必须【大于等于】父类方法的权限修饰符
 *小提示扩展；public> protected > (default) > private 
  * 备注;default不是关键字default，而是什么都不写，留空
 * 
 * */

public class OverRide {
public static void main(String[] args) {
	Fu fu = new Fu();
	fu.call();
	fu.sendmsg();
	fu.show();
	
	System.out.println("-------------------");
	
	Zi zi = new Zi();	
    zi.call();
    zi.sendmsg();
    zi.show();
    zi.net();

}
	
}
