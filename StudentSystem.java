
import java.util.Scanner;
//test
//import student.Person;
//import student.Student;
public class StudentSystem {
	public static void main(String args[]) {
		Student[] allStudent=new Student[1000];
		Scanner sc=new Scanner(System.in);
		System.out.println("录入信息请输入1");
		System.out.println("修改信息请输入2");
		System.out.println("查询信息请输入3");
		System.out.println("关闭程序请输入4");
		System.out.println("删除学生请输入5");
		int direction=sc.nextInt();
		int numberofstudent=0;
		int truenumber=0;
		while(direction!=4)
		{
			if(direction==1)
			{
				System.out.println("请输入学生姓名");
		    	String name=sc.next();
		    	System.out.println("请输入学生学号");
		        String studentNumber=sc.next();
		    	System.out.println("请输入学生性别");
		    	String sex=sc.next();
		    	System.out.println("请输入学生电话号码");
		    	String telephone=sc.next();
		    	System.out.println("请输入学生专业");
		    	String major=sc.next();
		    	System.out.println("请输入 学生班级如1906");
		    	int hisclass=sc.nextInt();
		    	System.out.println("请输入学生职务如（团员/党员/入党积极分子/预备党员/群众）");
		    	String occupation=sc.next();
		    	allStudent[numberofstudent]=new Student();
				allStudent[numberofstudent].setStudent(name,studentNumber,sex,telephone,major,hisclass,occupation);
				numberofstudent++;
				truenumber++;
				//System.out.println(numberofstudent);
			}
			if(direction==2)
			{
				System.out.println("请输入修改学生姓名");
				String name=sc.next();
				for(int i=0;i<numberofstudent;i++)
				if(name.equals(allStudent[i].name)&&allStudent[i].existence){
				    
					System.out.println("请输入学生学号");
			        String studentNumber=sc.next();
			    	System.out.println("请输入学生性别");
			    	String sex=sc.next();
			    	System.out.println("请输入学生电话号码");
			    	String telephone=sc.next();
			    	System.out.println("请输入学生专业");
			    	String major=sc.next();
			    	System.out.println("请输入 学生班级如1906");
			    	int hisclass=sc.nextInt();
			    	System.out.println("请输入学生职务如（团员/党员/入党积极分子/预备党员/群众）");
			    	String occupation=sc.next();
					allStudent[i].changeStudent(studentNumber,sex,telephone,major,hisclass,occupation);
				}
			}
			if(direction==3)
			{
				System.out.println("请输入查询学生姓名");
				String name=sc.next();
				boolean flag=false;//标记是否有该生
			//	allStudent[0].show();
				for(int i=0;i<numberofstudent;i++)
				{//&& nameequals()
					if(name.equals(allStudent[i].name)&&allStudent[i].existence)
					{
						allStudent[i].show();
					    flag=true;
					}	//System.out.println("jojo");
				}
				if(!flag)
				{
					System.out.println("该生信息未录入");
				}
				
			}
			if(direction==5)
			{
				System.out.println("请输入删除学生姓名");
				String name=sc.next();
				for(int i=0;i<numberofstudent;i++)
				{
					if(name.equals(allStudent[i].name)&&allStudent[i].existence)
					{
						allStudent[i].existence=false;
						truenumber--;
					}
				
				}
			}
			if(direction!=1&&direction!=2&&direction!=3&&direction!=5)
			{
				System.out.println("请重新输入！！！");
			}
			System.out.println("录入信息请输入1");
			System.out.println("修改信息请输入2");
			System.out.println("查询信息请输入3");
			System.out.println("关闭程序请输入4");
			System.out.println("删除学生请输入5");
			direction=sc.nextInt();
		}
		}

}
abstract class Person
{
	String name;
	String sex;
	String telephone;
	
}
class Student extends Person{
	String studentNumber;//学号
    String occupation;//职务
    String major;//专业
    int hisclass;//班级
    boolean existence=true;//标记该人是否存在，有无被删除
    
 /*   String findoccupation(int occupation)
    {
    	if(occupation==1)return "团员";
    	if(occupation==2)return "党员";
    	if(occupation==3)return "入党积极分子";
    	if(occupation==4)return "预备党员";
    	if(occupation==5)return "群众";
    }*/
   public  void setStudent(String name,String studentNumber,String sex,String telephone,String major,int hisclass,String occupation)
    {
    	this.name=name;
    	this.studentNumber=studentNumber;
    	this.sex=sex;
    	this.telephone=telephone;
    	this.major=major;
    	this.hisclass=hisclass;
    	this.occupation=occupation;
    }
 public  void show()
    {
    	System.out.println("姓名 "+this.name);
    	System.out.println("学号 "+this.studentNumber);
    	System.out.println("性别 "+this.sex);
    	System.out.println("电话号码 "+this.telephone);
    	System.out.println("专业 "+this.major);
    	System.out.println("班级 "+this.hisclass);
    	System.out.println("职务 "+this.occupation);
    	
   }
 public   void changeStudent(String studentnumber,String sex,String telephone,String major,int hisclasss,String occupation)
   {
	this.name=name;
   	this.studentNumber=studentNumber;
   	this.sex=sex;
   	this.telephone=telephone;
   	this.major=major;
   	this.hisclass=hisclass;
   	this.occupation=occupation;
   }
}
