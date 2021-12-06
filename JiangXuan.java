package 我类;

public class JiangXuan {
public String Name;
public int Age;
public String Gender;
public char BloodType;
public String Birthday;
public Friend[] FriendList;
public Family[] FamilyList;
public School MySchool;
public Entertainments[] Entertainments;

JiangXuan(){}

JiangXuan(String name,int age,String gender,char bloodtype,String birthday)
{
	setName(name);
	setAge(age);
	setGender(gender);
	setBloodType(bloodtype);
	setBirthday(birthday);
}
public void setName(String name)
{
	Name=name;
}

public void setAge(int age)
{
	Age=age;
}
public void setGender(String gender)
{
	Gender=gender;
}

public void setBloodType(char bloodtype)
{
	BloodType=bloodtype;
}
public void setBirthday(String birthday)
{
	Birthday=birthday;
}

public String getName()
{
	return Name;
}

public int getAge()
{
	return Age;
}
public String getGender()
{
	return Gender;
}
public char getBloodType()
{
	return BloodType;
}
public String getBirthday()
{
	return Birthday;
}
}





class Friend
{
	public String Name;
	public String Gender;
	public String Description;
	Friend(){}

	Friend(String name,String gender,String description)
	{
		setName(name);
		setGender(gender);
		setDescription(description);
	}
	
	public void setName(String name)
	{
		Name=name;
	}
	public void setGender(String gender)
	{
		Gender=gender;
	}
	public void setDescription(String description)
	{
		Description=description;
	}
	public String getName()
	{
		return Name;
	}

	public String getGender()
	{
		return Gender;
	}
	
	public String getDescription()
	{
		return Description;
	}
}

class Family
{
	public String Name;
	public String Gender;
	public String Description;
	Family(){}

	Family(String name,String gender,String description)
	{
		setName(name);
		setGender(gender);
		setDescription(description);
	}
	
	public void setName(String name)
	{
		Name=name;
	}
	public void setGender(String gender)
	{
		Gender=gender;
	}
	public void setDescription(String description)
	{
		Description=description;
	}
	public String getName()
	{
		return Name;
	}

	public String getGender()
	{
		return Gender;
	}
	
	public String getDescription()
	{
		return Description;
	}
}


class School
{
	public String Name;
	public String Location;
	public Course[] CourseList;
	School(){}

	School(String name,String location)
	{
		setName(name);
		setLocation(location);
	}
	public void setName(String name)
	{
		Name=name;
	}
	public void setLocation(String location)
	{
		Location=location;
	}
	public String getName()
	{
		return Name;
	}

	public String getLocation()
	{
		return Location;
	}
	
	public void Description()
	{
		System.out.print(getName());
		System.out.print("是一所以工为主，特色鲜明，优势突出，理、工、文、经、管、法、艺术、教育等多学科协调发展的省属重点建设大学。学校坐落于“上有天堂，下有苏杭”的历史文化名城。");
		System.out.println(getLocation());
	}
	
}
class Course
{
	public String Name;
	public String Teacher;
	public String Description;
	public String HomeWork;
	Course(){}

	Course(String name,String teacher,String description,String homework)
	{
		setName(name);
		setTeacher(teacher);
		setDescription(description);
		setHomeWork(homework);
	}
	
	public void setName(String name)
	{
		Name=name;
	}
	public void setTeacher(String teacher)
	{
		Teacher=teacher;
	}
	public void setDescription(String description)
	{
		Description=description;
	}
	public void setHomeWork(String homework)
	{
		HomeWork=homework;
	}
	public String getName()
	{
		return Name;
	}

	public String setDescription()
	{
		return Description;
	}
	
	public String getDescription()
	{
		return Description;
	}
	
}
class Entertainments
{
	public String Name;
	public String Description;
	Entertainments(){}

	Entertainments(String name,String description)
	{
		setName(name);
		setDescription(description);
	}
	
	public void setName(String name)
	{
		Name=name;
	}
	public void setDescription(String description)
	{
		Description=description;
	}
	public String getName()
	{
		return Name;
	}
	
	public String getDescription()
	{
		return Description;
	}
}

class Main
{
	public static void main(String[] args)  
	{
		JiangXuan me=new JiangXuan("JiangXuan",19,"女",'B',"2001.08.21");
		School school=new School("浙江理工大学","浙江杭州");
	}
}
