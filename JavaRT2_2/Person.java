package JavaRT2_2;

public class Person{
	private String Name;
	private Communication commu;
	
	public Person(String name,String type) throws IllegalStateException{
		Name=name;
		setCommunicationType(type);
	}
	public void setCommunicationType(String type) throws IllegalStateException{
		if(type.equals("家族"))
			commu = new FamilyCommunication(Name);
		else if(type.equals("仕事"))
			commu = new WorkCommunication(Name);
		else if(type.equals("クラブ"))
			commu = new ClubCommunication(Name);
		else
			throw new IllegalStateException();
	}
	public void greet(PersonType type) throws ClubCommuException, AlienException, WorkCommuException, FamilyCommuException {
		System.out.println(commu.greet(type));
	}
}