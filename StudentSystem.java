
import java.util.Scanner;

//import student.Person;
//import student.Student;
public class StudentSystem {
	public static void main(String args[]) {
		Student[] allStudent=new Student[1000];
		Scanner sc=new Scanner(System.in);
		System.out.println("¼����Ϣ������1");
		System.out.println("�޸���Ϣ������2");
		System.out.println("��ѯ��Ϣ������3");
		System.out.println("�رճ���������4");
		System.out.println("ɾ��ѧ��������5");
		int direction=sc.nextInt();
		int numberofstudent=0;
		int truenumber=0;
		while(direction!=4)
		{
			if(direction==1)
			{
				System.out.println("������ѧ������");
		    	String name=sc.next();
		    	System.out.println("������ѧ��ѧ��");
		        String studentNumber=sc.next();
		    	System.out.println("������ѧ���Ա�");
		    	String sex=sc.next();
		    	System.out.println("������ѧ���绰����");
		    	String telephone=sc.next();
		    	System.out.println("������ѧ��רҵ");
		    	String major=sc.next();
		    	System.out.println("������ ѧ���༶��1906");
		    	int hisclass=sc.nextInt();
		    	System.out.println("������ѧ��ְ���磨��Ա/��Ա/�뵳��������/Ԥ����Ա/Ⱥ�ڣ�");
		    	String occupation=sc.next();
		    	allStudent[numberofstudent]=new Student();
				allStudent[numberofstudent].setStudent(name,studentNumber,sex,telephone,major,hisclass,occupation);
				numberofstudent++;
				truenumber++;
				//System.out.println(numberofstudent);
			}
			if(direction==2)
			{
				System.out.println("�������޸�ѧ������");
				String name=sc.next();
				for(int i=0;i<numberofstudent;i++)
				if(name.equals(allStudent[i].name)&&allStudent[i].existence){
				    
					System.out.println("������ѧ��ѧ��");
			        String studentNumber=sc.next();
			    	System.out.println("������ѧ���Ա�");
			    	String sex=sc.next();
			    	System.out.println("������ѧ���绰����");
			    	String telephone=sc.next();
			    	System.out.println("������ѧ��רҵ");
			    	String major=sc.next();
			    	System.out.println("������ ѧ���༶��1906");
			    	int hisclass=sc.nextInt();
			    	System.out.println("������ѧ��ְ���磨��Ա/��Ա/�뵳��������/Ԥ����Ա/Ⱥ�ڣ�");
			    	String occupation=sc.next();
					allStudent[i].changeStudent(studentNumber,sex,telephone,major,hisclass,occupation);
				}
			}
			if(direction==3)
			{
				System.out.println("�������ѯѧ������");
				String name=sc.next();
				boolean flag=false;//����Ƿ��и���
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
					System.out.println("������Ϣδ¼��");
				}
				
			}
			if(direction==5)
			{
				System.out.println("������ɾ��ѧ������");
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
				System.out.println("���������룡����");
			}
			System.out.println("¼����Ϣ������1");
			System.out.println("�޸���Ϣ������2");
			System.out.println("��ѯ��Ϣ������3");
			System.out.println("�رճ���������4");
			System.out.println("ɾ��ѧ��������5");
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
	String studentNumber;//ѧ��
    String occupation;//ְ��
    String major;//רҵ
    int hisclass;//�༶
    boolean existence=true;//��Ǹ����Ƿ���ڣ����ޱ�ɾ��
    
 /*   String findoccupation(int occupation)
    {
    	if(occupation==1)return "��Ա";
    	if(occupation==2)return "��Ա";
    	if(occupation==3)return "�뵳��������";
    	if(occupation==4)return "Ԥ����Ա";
    	if(occupation==5)return "Ⱥ��";
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
    	System.out.println("���� "+this.name);
    	System.out.println("ѧ�� "+this.studentNumber);
    	System.out.println("�Ա� "+this.sex);
    	System.out.println("�绰���� "+this.telephone);
    	System.out.println("רҵ "+this.major);
    	System.out.println("�༶ "+this.hisclass);
    	System.out.println("ְ�� "+this.occupation);
    	
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
