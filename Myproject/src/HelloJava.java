
public abstract class HelloJava {	
	public static void main(String[] args) {
//		/*int a = 64;
//	    int b = 8;
//		a /= b;*/
//	    int a = 12;
//		System.out.println(a+"��ż����?"+(a%2==0));
//		System.out.println(a+"��������?"+(a%2==1));
//		
		   int arry[]= {1,2,3,4,5};
		   int sum = 0;
		   for(int i = 0; i<arry.length;i++) {
			sum+=arry[i];									
			}
			
		   System.out.println("�ܺ���"+sum);	   
		   System.out.println("----------------------------");
		   
		   int max =0;
		   for(int i = 0; i<arry.length;i++) {
				if (max < arry[i]) {
					max = arry[i];
				}
							
				}
			  System.out.println("���ֵ��" + max);
			  System.out.println("----------------------------");
			  
		   int min = 0;
			  for(int i = 0; i<arry.length;i++) {
				  if (min > arry[i]) {
					  min = arry[i];
				  }
				  
			  }
			  
			  System.out.println("��Сֵ��" + min);
			  System.out.println(arry[0]);

			for(int left = 0, right = arry.length-1; left < right;left++,right--) {
			
				  int temp = arry[left];
				  arry[left] = arry[right];
				  arry[right] = temp;
				  
				  }
				  
			  for(int i = 0;i < arry.length;i++) {
				  
//				  System.out.println(arry[i]);
				  
				  
				  System.out.println(arry[0]);
				  
				  
				  
				  
				}  
		  }
	
	
			  
			  
			  
			  }
	

